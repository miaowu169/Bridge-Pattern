package com.practice.Client;

import java.io.File;

import javax.xml.parsers.*;
import org.w3c.dom.*;


public class XMLUtilGame {
	//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getBean(String args) {
		try {
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src\\com\\practice\\Client\\config.xml"));
			
			//��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = null;
			String cName = null;
			
			if(args.equals("skill")) {
				//��ȡ�����������ı��ڵ�
				classNode = nl.item(0).getFirstChild();
				cName ="com.practice.Skill." + classNode.getNodeValue();
			}else if(args.equals("hero")) {
				//��ȡ�����������ı��ڵ�
				classNode = nl.item(1).getFirstChild();
				cName = "com.practice.Hero." + classNode.getNodeValue();
			}
			//ͨ����������ʵ�����󲢽��䷵��
			Class<?> c = Class.forName(cName);
			@SuppressWarnings("deprecation")
			Object obj = c.newInstance();			
			return obj;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
