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

public class P002 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		// ���ڿ� ���� ���� �� �ʱ�ȭ (����� �̸����)
		String k32_seq = "", k32_hour = "", k32_day = "";
		String k32_temp = "", k32_tmx = "", k32_tmn = "";
		String k32_sky = "", k32_pty = "";
		String k32_wfKor = "", k32_wfEn = "";
		String k32_pop = "", k32_r12 = "", k32_s12 = "";
		String k32_ws = "", k32_wd = "", k32_wdKor = "", k32_wdEn = ""; 
		String k32_reh = "", k32_r06 = "", k32_s06 = "";
		
		DocumentBuilder k32_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();	// �Ľ��� ���� �غ�
		//xml ���� ó��, ��ü ��η� ����, xml �Ľ� ó��
		Document k32_doc = k32_docBuilder.parse(new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\����_��ȭ\\9��\\queryDFS.xml"));
		
		Element k32_root = k32_doc.getDocumentElement();	// root �±� ��������
		
		NodeList k32_tag_001 = k32_doc.getElementsByTagName("data");	// "data" �������� ��������
		
		for (int k32_i = 0; k32_i < k32_tag_001.getLength(); k32_i++) {	// ������ ������ŭ 1�� �����ϸ� �ݺ� (for��)
			Element k32_elemnt = (Element) k32_tag_001.item(k32_i);	// ������Ʈ�� ��������
			// �Ʒ��� ���� ������Ʈ���� �����´�
			k32_seq = k32_tag_001.item(k32_i).getAttributes().getNamedItem("seq").getNodeValue();
			k32_hour = k32_elemnt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			k32_day = k32_elemnt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			k32_temp = k32_elemnt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			k32_tmx = k32_elemnt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			k32_tmn = k32_elemnt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			k32_sky = k32_elemnt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			k32_pty = k32_elemnt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			k32_wfKor = k32_elemnt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			k32_wfEn = k32_elemnt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			k32_pop = k32_elemnt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			k32_r12 = k32_elemnt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			k32_s12 = k32_elemnt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			k32_ws = k32_elemnt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			k32_wd = k32_elemnt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			k32_wdKor = k32_elemnt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			k32_wdEn = k32_elemnt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			k32_reh = k32_elemnt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			k32_r06 = k32_elemnt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			k32_s06 = k32_elemnt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			
			
			// ���˿� �°� ��� ���
			System.out.printf("** %s��° **  (48�ð� ��)\n", k32_seq);
			System.out.printf("�ð�         : %s��\n", k32_hour);
			System.out.printf("��¥         : %s��°��  (���� : 0)\n", k32_day);
			System.out.printf("���� �µ�    : %s��\n", k32_temp);
			System.out.printf("�ְ� �µ�    : %s��\n", k32_tmx);
			System.out.printf("���� �µ�    : %s��\n", k32_tmn);
			System.out.printf("�ϴ� ����    : %s        (1: ����, 2: ���� ����, 3: ���� ����, 4: �帲)\n", k32_sky);
			System.out.printf("���� ����    : %s        (0: ����, 1: ��, 2: ��/��, 3: ��/��, 4: ��)\n", k32_pty);
			System.out.printf("����(�ѱ���) : %s\n", k32_wfKor);
			System.out.printf("����(����)   : %s\n", k32_wfEn);
			System.out.printf("���� Ȯ��    : %s%%\n", k32_pop);
			System.out.printf("���� ������  : %s (12�ð�)\n", k32_r12);
			System.out.printf("���� ������  : %s (12�ð�)\n", k32_s12);
			System.out.printf("ǳ��         : %s (m/s)\n", k32_ws);
			System.out.printf("ǳ��         : %s        (0~7: ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)\n", k32_wd);
			System.out.printf("ǳ��(�ѱ���) : %s\n", k32_wdKor);
			System.out.printf("ǳ��(����)   : %s\n", k32_wdEn);
			System.out.printf("����         : %s%%\n", k32_reh);
			System.out.printf("���� ������  : %s (6�ð�)\n", k32_r06);
			System.out.printf("���� ������  : %s (6�ð�)\n", k32_s06);
			System.out.println("***************************************************************************");
			
		}	
		
	}

}
