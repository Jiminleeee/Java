package java2_009;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
public class P003 {
//JSON ����� / 20220421 /  k32_������ / �ּ����� k32_����
		// �ϴ� ���� �ݺ��ǹǷ� �Լ��� ����
		public static JSONObject k32_oneRec(String name, int studentid, int kor, int eng, int mat) {	// �޼ҵ� ����(�Ű����� 5��)
			JSONObject k32_dataObject = new JSONObject();	// JSONObject ����
			k32_dataObject.put("name", name);	// �̸� �߰�
			k32_dataObject.put("studentid", studentid);	// �й� �߰�
			
			JSONArray k32_score = new JSONArray();	//Json Array ����
			k32_score.add(kor); k32_score.add(eng); k32_score.add(mat);	// ����, ����, ���� ���� ������� �߰�
			k32_dataObject.put("score", k32_score);	// score array�� JSONObject�� �߰�
			
			return k32_dataObject;	// ���ϰ� : dataObject
		}
		
		public static void main(String[] args) {
			//���� �ϼ��� JSONObject ����(��ü)
			JSONObject k32_jsonObject = new JSONObject();
			//�Ѹ� ������ JSON������ ���� Array ����
			JSONArray k32_datasArray = new JSONArray();
			
			
			JSONObject k32_dataObject = new JSONObject();	//�Ѹ� ������ �� JSONObject ����
			k32_dataObject.put("name", "����");	// �̸��� ���� �߰�
			k32_dataObject.put("studentid", "209901");	// �й��� 209901 �߰�
			
			JSONArray k32_score = new JSONArray();	//JSON Array ����
			k32_score.add(90); k32_score.add(100); k32_score.add(95);	// ����, ����, ���� ���� array�� �߰�
			k32_dataObject.put("score", k32_score);	// object ������ array �߰�
			k32_datasArray.add(k32_dataObject);	// array�� object �߰�
			
			//�Լ� ó��, �̸�, �й�, ���� �ֱ�
			k32_datasArray.add(k32_oneRec("����", 209902, 100, 85, 75));	
			k32_datasArray.add(k32_oneRec("���", 209903, 90, 75, 85));
			k32_datasArray.add(k32_oneRec("�糪", 209904, 90, 85, 75));
			k32_datasArray.add(k32_oneRec("��ȿ", 209905, 80, 75, 85));
			k32_datasArray.add(k32_oneRec("�̳�", 209906, 90, 85, 55));
			k32_datasArray.add(k32_oneRec("����", 209907, 70, 75, 65));
			k32_datasArray.add(k32_oneRec("ä��", 209908, 100, 75, 95));
			k32_datasArray.add(k32_oneRec("����", 209909, 80, 65, 95));
			
			
			try { //JSON ���� ����� / ���� ����
				FileWriter k32_file = new FileWriter("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\����_��ȭ\\9��\\test.json");
				k32_file.write(k32_datasArray.toJSONString());	// JSON ���Ͽ� ���� �ű��
				k32_file.flush();	//flush >�޸𸮿��� �۾��� ���� ���� ����̽��� �ű�
				k32_file.close();	// ���� �ݱ� 
			} catch(IOException e) {	// ���� ���
				e.printStackTrace();	// ���� ���� ���
			}
			System.out.println("JSON ���� �� : " + k32_datasArray);	// ��� ���
			
		}
	}

