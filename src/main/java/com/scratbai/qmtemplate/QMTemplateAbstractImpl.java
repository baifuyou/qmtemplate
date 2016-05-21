package com.scratbai.qmtemplate;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by baifuyou on 16-5-7.
 */
public abstract class QMTemplateAbstractImpl implements QMTemplate {

    protected Map<String, Object> qmtemplateGlobalVar;
    protected StringBuilder resultBuilder;

    @Override
    public String render(Map<String, Object> param) {
        qmtemplateGlobalVar = param;
        resultBuilder = new StringBuilder();
        renderInline();
        return resultBuilder.toString();
    }

    protected abstract void renderInline();

    /**
     * 获取待迭代对象的迭代集合，
     * 如何obj的类型是Map，则返回keys；
     * 如果obj是Object，则返attribute names
     * 如果obj是数组或者List，则返回index数组
     */
    protected Object[] getIterationKeys(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).keySet().toArray();
        }
        if (obj instanceof Object[]) {
            return IntStream.range(0, ((Object[]) obj).length).boxed().toArray();
        }
        if (obj instanceof List) {
            return IntStream.range(0, ((List) obj).size()).boxed().toArray();
        }
        if (obj instanceof Object) {
            return getAttributeNames(obj);
        }
        return null;
    }

    protected Object[] getAttributeNames(Object obj) {
        Class clazz = obj.getClass();
        try {
            PropertyDescriptor[] properties = Introspector.getBeanInfo(clazz).getPropertyDescriptors();
            List<String> getterName = Arrays.stream(properties).map(p -> p.getName()).filter(name -> !name.equals
                    ("class")).collect(Collectors.toList());
            return getterName.toArray();
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    protected Object getAttributeValue(Object obj, Object key) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(key);
        }
        if (obj instanceof Object[] && key instanceof Integer) {
            return ((Object[]) obj)[(Integer) key];
        }
        if (obj instanceof List && key instanceof Integer) {
            return ((List) obj).get((Integer) key);
        }
        if (obj instanceof Object && key instanceof String) {
            try {
                String keyStr = (String) key;
                Class clazz = obj.getClass();
                Field field = getField(clazz, keyStr);
                if (field != null) {
                    return field.get(obj);
                }
                String attributeFirstLetter = keyStr.substring(0, 1).toUpperCase();
                String getMethodName = "get" + attributeFirstLetter + keyStr.substring(1);
                return clazz.getMethod(getMethodName).invoke(obj);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    protected Field getField(Class clazz, String name) {
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            if (field.getName() == name) {
                return field;
            }
        }
        return null;
    }

    protected Object invokeMethod(Object obj, String method, Object... args) {
        try {
            if (args == null || args.length == 0) {
                return obj.getClass().getMethod(method).invoke(obj);
            }
            Class[] argsType = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                argsType[i] = args[i].getClass();
            }
            return obj.getClass().getMethod(method, argsType).invoke(obj, args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected Boolean toBoolean(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return true;
    }

    protected Boolean greaterThan(Object obj1, Object obj2) {
        if (obj1 == null || obj2 == null) {
            throw new IllegalArgumentException("compare operation args can not null object");
        }
        if (obj1 instanceof Float || obj1 instanceof Double) {
            double val1 = obj1 instanceof Float ? (Float) obj1 : (Double) obj1;
            if (obj2 instanceof Integer) {
                return val1 > (Integer) obj2;
            }
            if (obj2 instanceof Long) {
                return val1 > (Long) obj2;
            }
            if (obj2 instanceof Float) {
                return val1 > (Float) obj2;
            }
            if (obj2 instanceof Double) {
                return val1 > (Double) obj2;
            }
        }
        if (obj1 instanceof Integer || obj1 instanceof Long) {
            long val1 = obj1 instanceof Integer ? (Integer) obj1 : (Long) obj2;
            if (obj2 instanceof Integer) {
                return val1 > (Integer) obj2;
            }
            if (obj2 instanceof Long) {
                return val1 > (Long) obj2;
            }
            if (obj2 instanceof Float) {
                return val1 > (Float) obj2;
            }
            if (obj2 instanceof Double) {
                return val1 > (Double) obj2;
            }
        }
        throw new IllegalArgumentException("compare operation args must is comparable");
    }

    protected Boolean objEqual(Object obj1, Object obj2) {
        if (obj1 == null && obj2 == null) {
            return true;
        }
        if (obj1 == null || obj2 == null) {
            return false;
        }
        if (obj1 instanceof Integer) {
            obj1 = Long.valueOf((Integer) obj1);
        }
        if (obj2 instanceof Integer) {
            obj2 = Long.valueOf((Integer) obj2);
        }
        if (obj1 instanceof Float) {
            obj1 = Double.valueOf((Float) obj1);
        }
        if (obj2 instanceof Float) {
            obj2 = Double.valueOf((Float) obj2);
        }
        if (obj1 instanceof Long && obj2 instanceof Double) {
            obj1 = Double.valueOf(obj1.toString());
        }
        if (obj2 instanceof Long && obj1 instanceof Double) {
            obj2 = Double.valueOf(obj2.toString());
        }
        return obj1.equals(obj2);
    }

    protected Boolean lessThan(Object obj1, Object obj2) {
        return greaterThan(obj2, obj1);
    }

    protected Boolean lessThanOrEqual(Object obj1, Object obj2) {
        return lessThan(obj1, obj2) || objEqual(obj1, obj2);
    }

    protected Boolean greaterThanOrEqual(Object obj1, Object obj2) {
        return greaterThan(obj1, obj2) || objEqual(obj1, obj2);
    }

    protected Boolean objNotEqual(Object obj1, Object obj2) {
        return !objEqual(obj1, obj2);
    }

    protected Boolean logicAnd(Object obj1, Object obj2) {
        return toBoolean(obj1) && toBoolean(obj2);
    }

    protected Boolean logicOr(Object obj1, Object obj2) {
        return toBoolean(obj1) || toBoolean(obj2);
    }

    protected Boolean logicNot(Object obj1) {
        return !toBoolean(obj1);
    }

    protected Object[] toArray(Object objs) {
        if (objs == null) {
            return new Object[0];
        }
        if (objs instanceof Object[]) {
            return (Object[]) objs;
        }
        if (objs instanceof List) {
            return ((List) objs).toArray();
        }
        if (objs instanceof Set) {
            return ((Set) objs).toArray();
        }
        return new Object[0];
    }
}
