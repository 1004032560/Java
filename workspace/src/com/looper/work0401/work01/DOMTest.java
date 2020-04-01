package com.looper.work0401.work01;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class DOMTest {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        File file = new File("E:\\1.soft\\JavaSE\\practice\\0303\\workspace\\src\\student.xml");

        //创建字节输入流对象
        FileInputStream fis = new FileInputStream(file);

        //1.构建解析器
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();

        //2.将文件输入流转换成文档类型  变成树结构
        Document document = db.parse(file);

        //3.获取根节点
        Node node = document.getDocumentElement();

        //4.获取子节点
        NodeList nodeList = node.getChildNodes();

        //遍历元素
        for (int i = 0; i < nodeList.getLength(); i++) {
            //遍历第i个元素
            Node nodeElement = nodeList.item(i);
            //继续获取子节点
            NodeList nodeList1 = nodeElement.getChildNodes();

            /*if (nodeElement!=null && nodeElement.getNodeType()==Node.TEXT_NODE){
                System.out.println("标签名："+nodeElement.getNodeName()+"；值："+nodeElement.getNodeValue());
            }*/

            for (int j = 0; j < nodeList1.getLength(); j++) {
                //遍历第i个元素
                Node nodeElement1 = nodeList1.item(j);
                //判断元素是不是为空，类型是不是文本类型
                if (nodeElement1!=null && nodeElement1.getNodeType()==Node.TEXT_NODE){
                    System.out.println("标签名："+nodeElement.getNodeName()+"；值："+nodeElement1.getNodeValue());
                }
            }
        }

    }

}
