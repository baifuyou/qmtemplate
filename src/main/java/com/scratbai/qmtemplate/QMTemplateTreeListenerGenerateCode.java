package com.scratbai.qmtemplate;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by baifuyou on 16-5-2.
 */
public class QMTemplateTreeListenerGenerateCode extends QMTemplateParserBaseListener {

    private ParseTreeProperty<String> codes = new ParseTreeProperty<>();

    private static final String RESULT_BUF_NAME = "resultBuilder";

    private static final String EACH_TARGET_PERFIX = "qqqiiimmmiiinnngggTtt";

    private static final String EACH_TARGET_KYES_PERFIX = "qqqiiimmmiiinnngggTttKKKeeeyyyss";

    private static final String EACH_INDEX_VAR = "qqqiiimmmiiinnngggTttIIIdddeeexxx";

    private static final String EACH_INDEX_VAR_END_PERFIX = "qqqiiimmmiiinnngggTttIIIdddeeexxxEEEnnnddd";

    private final static Map<String, String> operatorMapToMethod = new HashMap<>();

    {
        operatorMapToMethod.put(">", "greaterThan");
        operatorMapToMethod.put("<", "lessThan");
        operatorMapToMethod.put("==", "objEqual");
        operatorMapToMethod.put("!=", "objNotEqual");
        operatorMapToMethod.put(">=", "greaterThanOrEqual");
        operatorMapToMethod.put("<=", "lessThanOrEqual");
        operatorMapToMethod.put("&&", "logicAnd");
        operatorMapToMethod.put("||", "logicOr");
        operatorMapToMethod.put("!", "logicNot");
    }

    ParseTreeProperty<String> getCodes() {
        return codes;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        //System.out.println(ctx.getText() + ", " + ctx.getClass().getName());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterTemplate(QMTemplateParser.TemplateContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitTemplate(QMTemplateParser.TemplateContext ctx) {
        int childCount = ctx.getChildCount();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            String childCode = codes.get(child);
            code.append(childCode);
        }
        codes.put(ctx, code.toString());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterOriginText(QMTemplateParser.OriginTextContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitOriginText(QMTemplateParser.OriginTextContext ctx) {
        String text = ctx.getText().replace("\\{", "{").replace("\\}", "}").replace("\\", "\\\\").replace("\n",
                "\\n").replace("\"",
                "\\\"").trim();
        if (text.startsWith("\\n")) {
            text = text.substring(2);
        }
        if (text.endsWith("\\n")) {
            text = text.substring(0, text.length() - 2);
        }
        text = text.trim();
        String code = String.format("%s.append(\"%s\");\n", RESULT_BUF_NAME, text);
        codes.put(ctx, code);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterRenderExpr(QMTemplateParser.RenderExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitRenderExpr(QMTemplateParser.RenderExprContext ctx) {
        String code = String.format("%s.append(%s);\n", RESULT_BUF_NAME, codes.get(ctx.evlExpr()));
        codes.put(ctx, code);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterEvlExpr(QMTemplateParser.EvlExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitEvlExpr(QMTemplateParser.EvlExprContext ctx) {
        QMTemplateParser.MethodInvokeContext methodInvoke = ctx.methodInvoke();
        if (methodInvoke != null) {
            codes.put(ctx, generateMethodInvokeCode(methodInvoke, ctx));
            return;
        }
        String firstToken = "";
        if (ctx.getChild(0) != null) {
            firstToken = ctx.getChild(0).getText();
        }
        if (firstToken.equals("(")) {
            codes.put(ctx, codes.get(ctx.evlExpr(0)));
            return;
        }
        if (firstToken.equals("!")) {
            String code = String.format("logicNot(%s)", codes.get(ctx.evlExpr(0)));
            codes.put(ctx, code);
            return;
        }
        String secondToken = "";
        if (ctx.getChild(1) != null) {
            secondToken = ctx.getChild(1).getText();
        }
        //如果是evlExpr.evlExpr或者evlExpr[evlExpr]，调用getAttributeValue方法处理
        if (secondToken.equals("[") || secondToken.equals(".")) {
            List<QMTemplateParser.EvlExprContext> evlExprContexts = ctx.evlExpr();
            String expr1Code = codes.get(evlExprContexts.get(0));
            String expr2Code = codes.get(evlExprContexts.get(1));
            String code;
            if (secondToken.equals(".")) {
                code = String.format("getAttributeValue(%s, \"%s\")", expr1Code, expr2Code);
            } else {
                code = String.format("getAttributeValue(%s, %s)", expr1Code, expr2Code);
            }
            codes.put(ctx, code);
            return;
        }
        if (secondToken.equals("==") || secondToken.equals("!=") || secondToken.equals("&&") || secondToken.equals
                ("||") || secondToken.equals(">") || secondToken.equals("<") || secondToken.equals("<=") ||
                secondToken.equals(">=")) {
            List<QMTemplateParser.EvlExprContext> evlExprContexts = ctx.evlExpr();
            String expr1Code = codes.get(evlExprContexts.get(0));
            String expr2Code = codes.get(evlExprContexts.get(1));
            String code = String.format("%s(%s,%s)", operatorMapToMethod.get(secondToken), expr1Code, expr2Code);
            codes.put(ctx, code);
            return;
        }
        if (ctx.getChild(0) != null && ctx.getChild(0).getText().equals("!")) {
            List<QMTemplateParser.EvlExprContext> evlExprContexts = ctx.evlExpr();
            String expr1Code = codes.get(evlExprContexts.get(0));
            String code = String.format("! %s", expr1Code);
            codes.put(ctx, code);
            return;
        }
        //剩下的情况只有可能是字面量，变量
        codes.put(ctx, codes.get(ctx.getChild(0)));
    }

    private String generateMethodInvokeCode(QMTemplateParser.MethodInvokeContext methodInvoke, QMTemplateParser
            .EvlExprContext ctx) {
        String invokeObj = codes.get(ctx.getChild(0));
        String methodName = methodInvoke.getChild(0).getText();
        List<QMTemplateParser.EvlExprContext> argsCtx = methodInvoke.evlExpr();
        int argsSize = argsCtx.size();
        String[] args = new String[argsSize];
        for (int i = 0; i < argsSize; i++) {
            args[i] = codes.get(argsCtx.get(i));
        }
        if (args == null || args.length == 0) {
            return String.format("invokeMethod(%s, \"%s\", null)", invokeObj, methodName);
        }
        String argsStr = String.join(", ", args);
        return String.format("invokeMethod(%s, \"%s\", %s)", invokeObj, methodName, argsStr);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterMethodInvoke(QMTemplateParser.MethodInvokeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitMethodInvoke(QMTemplateParser.MethodInvokeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterValue(QMTemplateParser.ValueContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitValue(QMTemplateParser.ValueContext ctx) {
        codes.put(ctx, codes.get(ctx.getChild(0)));
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterIntLiteral(QMTemplateParser.IntLiteralContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitIntLiteral(QMTemplateParser.IntLiteralContext ctx) {
        codes.put(ctx, String.format("Long.valueOf(%sl)", ctx.getText()));
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterFloatLiteral(QMTemplateParser.FloatLiteralContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitFloatLiteral(QMTemplateParser.FloatLiteralContext ctx) {
        codes.put(ctx, String.format("Double.valueOf(%s)", ctx.getText()));
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterStringLiteral(QMTemplateParser.StringLiteralContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitStringLiteral(QMTemplateParser.StringLiteralContext ctx) {
        codes.put(ctx, ctx.getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterIfExpr(QMTemplateParser.IfExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitIfExpr(QMTemplateParser.IfExprContext ctx) {
        String blockCode = codes.get(ctx.template());
        List<QMTemplateParser.ElseIfExprContext> elseIfExpr = ctx.elseIfExpr();
        List<String> elseIfCodes = elseIfExpr.stream().map(x -> codes.get(x)).collect(Collectors.toList());
        String elseIfCodeStr = String.join("\n", elseIfCodes);
        String elseCodeStr = "";
        if (ctx.elseExpr() != null) {
            elseCodeStr = codes.get(ctx.elseExpr());
        }
        String code = String.format("if (toBoolean(%s).booleanValue()) {\n %s}\n %s \n %s", codes.get(ctx.evlExpr()),
                blockCode, elseIfCodeStr, elseCodeStr);
        codes.put(ctx, code);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterIfKey(QMTemplateParser.IfKeyContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitIfKey(QMTemplateParser.IfKeyContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterBooleanLiteral(QMTemplateParser.BooleanLiteralContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitBooleanLiteral(QMTemplateParser.BooleanLiteralContext ctx) {
        codes.put(ctx, String.format("Boolean.valueOf(%s)", ctx.getText()));
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterEachExpr(QMTemplateParser.EachExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitEachExpr(QMTemplateParser.EachExprContext ctx) {
        String iterationItemVarName = codes.get(ctx.id());
        String blockCode = codes.get(ctx.template());
        String iterationSetCode = codes.get(ctx.evlExpr());
        String iterationSetVarName = EACH_TARGET_PERFIX + iterationItemVarName;
        String iterationSetVarDefineCode = String.format("Object[] %s = toArray(%s);\n", iterationSetVarName,
                iterationSetCode);
        String iterationItemVarDefineCode = String.format("Object %s = %s[%s];\n", iterationItemVarName,
                iterationSetVarName, EACH_INDEX_VAR);
        String iterationIndexEndVarName = EACH_INDEX_VAR_END_PERFIX + iterationItemVarName;
        String iterationIndexEndVarDefineCode = String.format("long %s = %s.length;\n", iterationIndexEndVarName,
                iterationSetVarName);
        String code = String.format("%s %s for (int %s = 0; %s < %s; %s++) {\n %s %s }\n", iterationSetVarDefineCode,
                iterationIndexEndVarDefineCode, EACH_INDEX_VAR, EACH_INDEX_VAR, iterationIndexEndVarName,
                EACH_INDEX_VAR,
                iterationItemVarDefineCode, blockCode);
        codes.put(ctx, code);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterEach(QMTemplateParser.EachContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitEach(QMTemplateParser.EachContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterId(QMTemplateParser.IdContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitId(QMTemplateParser.IdContext ctx) {
        codes.put(ctx, ctx.getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterIn(QMTemplateParser.InContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitIn(QMTemplateParser.InContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterEachIndexExpr(QMTemplateParser.EachIndexExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void exitEachIndexExpr(QMTemplateParser.EachIndexExprContext ctx) {
        String iterationKeyVarName = codes.get(ctx.getChild(2));
        String iterationValueVarName = codes.get(ctx.getChild(4));
        String blockCode = codes.get(ctx.template());
        String iterationSetCode = codes.get(ctx.evlExpr());
        String iterationSetVarName = EACH_TARGET_PERFIX + iterationValueVarName;
        String iterationKeysVarName = EACH_TARGET_KYES_PERFIX + iterationKeyVarName;
        String iterationKeysVarDefineCode = String.format("Object[] %s = getIterationKeys(%s);\n",
                iterationKeysVarName, iterationSetVarName);
        String iterationKeyIndexEndVarName = EACH_INDEX_VAR_END_PERFIX + iterationKeyVarName;
        String iterationKeyIndexEndVarDefineCode = String.format("long %s = %s.length;\n", iterationKeyIndexEndVarName,
                iterationKeysVarName);
        String iterationKeyItemVarDefineCode = String.format("Object %s = %s[%s];\n", iterationKeyVarName,
                iterationKeysVarName, EACH_INDEX_VAR);
        String iterationValueVarDefineCode = String.format("Object %s = getAttributeValue(%s,%s);\n",
                iterationValueVarName,
                iterationSetVarName, iterationKeyVarName);
        String iterationSetVarDefineCode = String.format("Object %s = %s;\n", iterationSetVarName,
                iterationSetCode);
        String code = String.format("%s %s %s for (int %s = 0; %s < %s; %s++) {\n %s\n %s\n %s }\n",
                iterationSetVarDefineCode, iterationKeysVarDefineCode, iterationKeyIndexEndVarDefineCode,
                EACH_INDEX_VAR, EACH_INDEX_VAR, iterationKeyIndexEndVarName, EACH_INDEX_VAR,
                iterationKeyItemVarDefineCode, iterationValueVarDefineCode, blockCode);
        codes.put(ctx, code);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p></p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void enterElseIfExpr(QMTemplateParser.ElseIfExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void exitElseIfExpr(QMTemplateParser.ElseIfExprContext ctx) {
        String blockCode = codes.get(ctx.template());
        String code = String.format("else if (toBoolean(%s).booleanValue()) {\n %s}\n", codes.get(ctx.evlExpr()),
                blockCode);
        codes.put(ctx, code);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void enterElseExpr(QMTemplateParser.ElseExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void exitElseExpr(QMTemplateParser.ElseExprContext ctx) {
        String blockCode = codes.get(ctx.template());
        String code = String.format("else  {\n %s}\n", blockCode);
        codes.put(ctx, code);
    }
}
