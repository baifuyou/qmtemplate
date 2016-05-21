package com.scratbai.qmtemplate;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

/**
 * Created by baifuyou on 16-5-4.
 */
public class QMTemplates {
    /**
     * 从字符串中编译编译模板
     * @param template
     * @return
     */
    public static QMTemplate compileFromString(String template) {
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(template);
        QMTemplateLexer qmTemplateLexer = new QMTemplateLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(qmTemplateLexer);
        QMTemplateParser qmTemplateParser = new QMTemplateParser(commonTokenStream);
        ParseTree parseTree = qmTemplateParser.template();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();

        QMTemplateTreeListenerDefineVar defineVarListener = new QMTemplateTreeListenerDefineVar();
        parseTreeWalker.walk(defineVarListener, parseTree);
        String defineVarCode = defineVarListener.getDefineCodes();

        QMTemplateTreeListenerGenerateCode generateCodeListener = new QMTemplateTreeListenerGenerateCode();
        parseTreeWalker.walk(generateCodeListener, parseTree);
        String renderCode = generateCodeListener.getCodes().get(parseTree);
        String allCode = String.format("{%s%s}", defineVarCode, renderCode);

        ClassPool classPool = ClassPool.getDefault();
        try {
            String classNameSuffix = UUID.randomUUID().toString();
            CtClass ctClass = classPool.makeClass("com.scratbai.qmtemplate.QMTemplateImpl" + classNameSuffix);

            ctClass.setSuperclass(classPool.getCtClass("com.scratbai.qmtemplate.QMTemplateAbstractImpl"));
            System.out.println(allCode);
            CtMethod ctMethod = CtNewMethod.make(CtClass.voidType, "renderInline", null, null, allCode, ctClass);

            ctClass.addMethod(ctMethod);
            Class clazz = ctClass.toClass();
            QMTemplate qmTemplate = (QMTemplate)clazz.newInstance();
            return qmTemplate;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 从path指定的文件中编译模板
     * @param path
     * @return
     */
    public static QMTemplate compileFromFile(String path) {
        try {
            FileInputStream fis  = new FileInputStream(path);
            Scanner scanner = new Scanner(fis);
            StringBuilder stringBuilder = new StringBuilder();
            while(scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
            fis.close();
            scanner.close();
            return compileFromString(stringBuilder.toString());
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
}
