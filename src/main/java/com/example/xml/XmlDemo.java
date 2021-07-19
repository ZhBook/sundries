package com.example.xml;

import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: zhd
 * @Description
 * @Date: 2021/5/31 13:52
 * @Version: 1.0.0
 **/
@Slf4j
public class XmlDemo {

    private Document document;
    @Test
    public void createXml(){
        document = DocumentHelper.createDocument();
        Element root = document.addElement("root");
        Element element = root
                .addElement("author")
                .addAttribute("name", "Bob")
                .addAttribute("location", "US")
                .addText("Bob");
    }
    @Test
    public void createFile(){
        createXml();
        try(FileWriter fileWriter = new FileWriter("/Users/zhd/dev/source/logs/foo.xml")){
            document.write(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
