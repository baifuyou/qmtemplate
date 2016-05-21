package com.scratbai.qmtemplate;


import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by baifuyou on 16-5-7.
 */
public class QMTemplateTreeListenerDefineVar extends QMTemplateParserBaseListener {

    //render方法的入参名字
    private static final String ARG_NAME = "qmtemplateGlobalVar";

    public String getDefineCodes() {
        return defineCode.toString();
    }

    private StringBuilder defineCode = new StringBuilder();
    private Set<String> ids = new HashSet<>();

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitId(QMTemplateParser.IdContext ctx) {
        String text = ctx.getText();
        ParseTree parentCtx = ctx.getParent();
        if (!(parentCtx instanceof QMTemplateParser.EachExprContext) && !(parentCtx instanceof QMTemplateParser.EachIndexExprContext) && !ids.contains(text)) {
            defineCode.append(String.format("Object %s = %s.get(\"%s\");\n", text, ARG_NAME, text));
            ids.add(text);
        }
        if (parentCtx instanceof QMTemplateParser.EachExprContext || parentCtx instanceof QMTemplateParser.EachIndexExprContext) {
            ids.add(text);
        }
    }
}
