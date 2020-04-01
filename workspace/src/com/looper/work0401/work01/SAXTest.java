package com.looper.work0401.work01;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SAXTest {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, SAXException {
        File file = new File("E:\\1.soft\\JavaSE\\practice\\0303\\workspace\\src\\student.xml");

        System.out.println(file.exists());

        //创建文件的字节流输入对象
        FileInputStream fis = new FileInputStream(file);

        //1.获取SAX解析器
        XMLReader reader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();

        //2.注册事件的处理器
        reader.setContentHandler(new MySAXHandle());

        //3.完成转换
        reader.parse(new InputSource(fis));

        System.out.println("读取完毕！");

    }

}
