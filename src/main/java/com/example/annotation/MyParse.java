package com.example.annotation;


import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;


public class MyParse {
  public static void parse() throws Exception{
	  //1 加载配置文件
	  SAXReader saxReader=new SAXReader();
	  Document document=saxReader.read(MyParse.class.getResourceAsStream("myConfig.xml"));
     //2 读取根节点
	  Element rootNode=document.getRootElement();
	  if(rootNode!=null){
		List<Element> elements=rootNode.elements("bean");
		for (Element element : elements) {
			String attrClass=element.attributeValue("class");
			if(attrClass==null){
				throw new RuntimeException("属性的class不能为空");
			}
			Class clzz=Class.forName(attrClass);
			Object obj=clzz.newInstance();
			
		}
	  }
  }
  
  @Test
  public void testParse(){
	  try {
		MyParse.parse();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
