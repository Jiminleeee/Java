package java2_009;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class P001 {
//XML �Ľ� �⺻ / 20220421 /  k32_������ / �ּ����� k32_����
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {	//throw�� Ư�� ���� ����������
		// TODO Auto-generated method stub
		DocumentBuilder k32_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();	// �Ľ��� ���� �غ�
		// xml ���� ó�� , ��ü ��� ����, xml �Ľ� ó��
		Document k32_doc = k32_docBuilder.parse(new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\����_��ȭ\\9��\\score.xml"));
		
		Element k32_root = k32_doc.getDocumentElement();	// root �±׸� �������⵵ ������ ������ ���̴� ���� ����
		
		NodeList k32_tag_name = k32_doc.getElementsByTagName("name");	// �̸� ��������
		NodeList k32_tag_studentid = k32_doc.getElementsByTagName("studentid");	// �й� ��������
		NodeList k32_tag_kor = k32_doc.getElementsByTagName("kor");	// ���� ���� ��������
		NodeList k32_tag_eng = k32_doc.getElementsByTagName("eng");	// ���� ���� ��������
		NodeList k32_tag_mat = k32_doc.getElementsByTagName("mat");	// ���� ���� ��������
		
		System.out.println("****************************************************************");
		
		for (int k32_i = 0; k32_i < k32_tag_name.getLength(); k32_i++) {	// �̸��� ������ŭ 1�� �����ϸ� �ݺ� (for��)
			// ��� ��� , string ����!
			System.out.printf("�̸� : %s\n", k32_tag_name.item(k32_i).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n", k32_tag_studentid.item(k32_i).getFirstChild().getNodeValue());	
			System.out.printf("���� : %s\n", k32_tag_kor.item(k32_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", k32_tag_eng.item(k32_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", k32_tag_mat.item(k32_i).getFirstChild().getNodeValue());
			System.out.println("****************************************************************");
			
		}
	}

}
