package com.xml.demo;

import java.io.File;
import java.util.stream.IntStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Xmlreader {

	public Xmlreader()throws Exception{
		
		File xmlFile=new File("/home/djax/Documents/MyFolder/java-xml/output.xml");
		
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		
		Document document=builder.parse(xmlFile);
		
		NodeList nodeList=document.getElementsByTagName("Programming");
		
		for(int i=0;i<nodeList.getLength();i++) {
			Node node=nodeList.item(i);
			 System.out.println("Element Content: " + node.getTextContent()); 
			System.out.println("Element in xml: "+node.getTextContent());
		}
	}
}
