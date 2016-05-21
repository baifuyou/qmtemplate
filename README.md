# QMTemplate
###### 一个基于Java的模板引擎，使用Antlr解析语法
--------


### 模板语法

这里引用一个变量`{aVar}`

引用map中值,可以`{map.key}`,也可以`{map["key"]}`

引用bean中的值和map一样，可以`{bean.attrName}`,也可以`{bean["attrBean"]}`

引用数组和list中的值，`array[0]`

if表达式

    {if isDemo}
        if expr
    {else if false}
        else if
    {else}
        esle
    {/end}
    
each表达式

    {each obj in objs}
        each obj
    {/end}
    
objs可以是数组和List，Set

each kv表达式

    {each index, value in array}
        下标:{index}, 值: {value}
    {/end}

    {each key, value in kv}
        key: {key}, value: {value}
    {/end}
    
这里kv可以是map，bean

### 使用方法

    QMTemplate qmTemplate1 = QMTemplates.compileFromString(tempStr);        //从字符串中编译模板
    QMTemplate qmTemplate2 = QMTemplates.compileFromFile(tempFilePath);     //从文件中编译模板
    Map<String, Object> context = new HashMap<>();                          //定义context
    context.put("hello", "world");                                          //在context中添加变量，在模板中可以用{hello}的形式使用这个变量
    System.out.println(qmTempalte1.render(context));                        //渲染模板并输出到控制台
    