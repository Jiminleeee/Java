package java2_009;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class P004 {
//JSON �Ľ� / 20220421 /  k32_������ / �ּ����� k32_����
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser k32_parser = new JSONParser();
		Object k32_obj = k32_parser.parse(new FileReader("C:\\\\Users\\\\501-21\\\\Desktop\\\\kopo32\\\\Java\\\\��ȭ\\\\����_��ȭ\\\\9��\\\\test.json"));
		
		//JSONObject jsonObject = (JSONObject) obj;
		JSONArray k32_array = (JSONArray) k32_obj; // ���� Ű�� ���� array�̶� �̷� ������ ����
		
		System.out.println("*******************************************");
		for (int k32_i = 0; k32_i < k32_array.size(); k32_i++) {	// array��ŭ 1�� �����ϸ� �ݺ� (for��)
			JSONObject k32_result = (JSONObject) k32_array.get(k32_i);	// array���� �ϳ��� ���´�
			System.out.println("�̸� : " + k32_result.get("name"));		// �̸��� ������ ���
			System.out.println("�й� : " + k32_result.get("studentid"));	// �й��� ������ ���
			
			JSONArray k32_score = (JSONArray) k32_result.get("score");	// ������ �����´� (�迭��)
			long k32_kor = (long)k32_score.get(0);	// �迭 �� ù��° �� : ����
			long k32_eng = (long)k32_score.get(1);	// �迭 �� �ι�° �� : ����
			long k32_mat = (long)k32_score.get(2);	// �迭 �� ����° �� : ����
			
			// ��� ���¿� �°� ���
			System.out.println("���� : " + k32_kor);
			System.out.println("���� : " + k32_eng);
			System.out.println("���� : " + k32_mat);
			System.out.println("���� : " + (k32_kor + k32_eng + k32_mat));	// ���� ���ϱ�
			System.out.println("��� : " + ((k32_kor + k32_eng + k32_mat) / 3.0));	// �Ǽ������� ��� ���ϱ�
			System.out.println("*******************************************");
		}
	}

}
