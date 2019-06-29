package com.yangbin1.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) throws IOException, TemplateException {
        //1.创建模板文件first.ftl
        //2.基于模板创建配置对象
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);

        //3.配置模板文件路径
        configuration.setDirectoryForTemplateLoading(new File("D:\\springboot\\freemarkerdemo\\src\\main\\webapp\\WEB-INF\\ftl"));

        //4.配置模板使用的编码
        configuration.setDefaultEncoding("UTF-8");

        //5.得到模板文件的对象
        Template template = configuration.getTemplate("first.ftl");

        //6.构建模板使用的数据
        Map map = new HashMap();
        map.put("name","yangbin1");

        //7.设置最终生成的静态页面路径和名称
        FileWriter fileWriter = new FileWriter("D:\\html\\first.html");

        //8.生成
        template.process(map,fileWriter);

        fileWriter.close();

    }
}
