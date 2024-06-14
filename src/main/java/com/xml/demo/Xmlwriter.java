package com.xml.demo;


import javax.swing.RootPaneContainer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Xmlwriter {
	
	DocumentBuilder builder;
	
	
	public Xmlwriter() throws Exception {
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		builder=builderFactory.newDocumentBuilder();	
		Document document=builder.newDocument();
		Element root=document.createElement("Programming");
		document.appendChild(root);
		
		Element element1=document.createElement("Language1");
		element1.appendChild(document.createTextNode("JAVA"));
		Element element2=document.createElement("Language2");
		element2.appendChild(document.createTextNode("GO"));
		Element element3=document.createElement("Language3");
		element3.appendChild(document.createTextNode("Python"));
		root.appendChild(element1);
		root.appendChild(element2);
		root.appendChild(element3);
		
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		DOMSource domSource=new DOMSource(document);
		
		StreamResult result=new StreamResult("/home/djax/Documents/MyFolder/java-xml/output.xml");
		transformer.transform(domSource, result);
		
		System.out.println("Xml created Successfully");
	}
	

}
