package com.scratbai.qmtemplate.com.scratbai.qmtemplate.demo;

import com.scratbai.qmtemplate.QMTemplate;
import com.scratbai.qmtemplate.QMTemplates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by baifuyou on 16-5-2.
 */
public class App {
    public static void main(String[] args) {
        String temp1 = "hello {world},\n \" \\\\''' {each name, gender in people}我是{name}, {gender}\n{/end}";
        String temp2 = "hello {world}, {((people.size() == 2.0) && false)}, {people.size()}";
        String temp3 = "this is a demo for each expr, {each name in names}{if !yes} {name} {else if false} xxxx  {else} yyyy{/end}{/end}";
        String temp4 = "this is a demo for each expr, {each index, name in names}{if yes}{index}, {name}{/end}{/end}";
        String temp5 = "this is a demo for each bean, {bean[\"hello\"]},\n{each key, end in bean} {key}, {end}\n{/end}";
        long startCompileTime = System.currentTimeMillis();
        QMTemplate qmTemplate = QMTemplates.compileFromFile("/home/baifuyou/tmp/test.tem");
        long endCompileTime = System.currentTimeMillis();
        System.out.println((endCompileTime - startCompileTime) + " ms");

        HashMap<String, String> nameMapGender = new HashMap<>();
        nameMapGender.put("小红", "女");
        nameMapGender.put("小明", "男");
        HashMap<String, Object> params = new HashMap();

        List<String> names = new ArrayList<>();
        names.add("小红");
        names.add("小明");

        params.put("world", "world");
        params.put("people", nameMapGender);
        params.put("names", names);
        params.put("bean", new DemoBean());
        params.put("yes", true);

        System.out.println("render result1: ");
        String result = "";
        long startRenderTime = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            result = qmTemplate.render(params);
        }
        long endRenderTime = System.currentTimeMillis();
        System.out.println((endRenderTime - startRenderTime) + " ms");
        System.out.println(result);

//        QMTemplate qmTemplate2 = QMTemplates.compileFromString(temp3);
//
//        System.out.println("render result2: ");
//        System.out.println(qmTemplate2.render(params));
    }
}
