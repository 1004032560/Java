package com.looper.work0401.work01;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 自定义的SAX处理
 */
public class MySAXHandle extends DefaultHandler {
    StringBuilder sb = new StringBuilder();//保存标签中的字符串内容

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //得到当前文本内容
        sb.append(new String(ch,start,length));
    }

    /**
     * 结束标签时调用
     * @param qName: 结束标签的标签名称
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(!"note".equals(qName)){
            //System.out.println(qName+":"+sb);
            System.out.println("标签名："+qName+"，文本内容:"+sb);
        }
    }

    /**
     * 开始标签时调用
     * @param qName: 表示开始标签的标签名
     * @param attributes: 表示开始标签内包含的属性列表
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        sb = new StringBuilder();
    }

}
