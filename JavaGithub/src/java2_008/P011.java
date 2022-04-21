package java2_008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P011 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\�ǽ�������\\day_data\\THTSKS010H00.dat");
		BufferedReader k32_br = new BufferedReader(new FileReader(k32_f));	// ���� �ҷ�����
		
		File k32_f1 = new File("C:\\Users\\501-21\\\\Desktop\\kopo32\\Java\\��ȭ\\�ǽ�������\\day_data\\Samsung_2015.csv");
		BufferedWriter k32_bw1 = new BufferedWriter(new FileWriter(k32_f1)); // ���� �����
		
		String k32_readtxt;	// ���ڿ� �ؽ�Ʈ�б� ���� ����
		int k32_cnt = 0; int k32_wcnt = 0;	// cnt = ���� ������ ���� ������ ���� ���� �� 0���� �ʱ�ȭ
											// wcnt = ���� ���� ������ ���� ������ ���� ���� �� 0���� �ʱ�ȭ
		int k32_max = 0, k32_min = 0;
		String k32_maxDate = "", k32_minDate = "";
		
		//�ð� ���� �����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// �ð� ���� �����ϱ�
		long k32_startTime = System.currentTimeMillis();	// �ڵ� ���� ���� �ð� �޾ƿ��� (���� �ð�)
		Date k32_startInDate = new Date(k32_startTime);	// ���� ��¥�� ��ȯ
		String k32_startFormat = sdf.format(k32_startInDate);	// ���ڿ� ������ ���� ��ȯ
		
		while ((k32_readtxt = k32_br.readLine()) != null) {	// ���Ͽ� ������ ���� �� �ݺ� ����
			StringBuffer k32_s = new StringBuffer();	// StringBuffer ����
			String [] k32_field = k32_readtxt.split("%_%");	// ������ �������� ���� ���ڿ� �迭�� ����
			
			// ���ڿ� �迭 ���̰� 2���� ũ��, �ʵ��� 2��° ĭ�� ^�� ���ְ�(replace), �翷 ���� �ڸ���(trim)
			// ���ڿ��� 2015�̸�(substring, equals)
			if (k32_field.length > 2 && k32_field[1].replace("^", "").trim().substring(0,4).equals("2015") 
					&& k32_field[2].replace("^", "").trim().substring(0,7).equals("A005930")) {
				k32_s.append(k32_field[0].replace("^", "").trim());	// �ʵ��� ù��° ĭ�� ^�� ���ְ�(replace) �翷�� ������ �ڸ� ��(trim) �߰�
				for (int k32_j = 1; k32_j < k32_field.length; k32_j++) {	// ������ ������ �ʵ��� ���̸�ŭ 1�� �����ϸ� �ݺ�(for��)
					k32_s.append("," + k32_field[k32_j].replace("^", "").trim());	// ,�� �ʵ�[j]�� ^�� ���ְ�(replace), �翷�� ������ �ڸ� ��(trim) �߰�
				}
				k32_bw1.write(k32_s.toString()); // ���� ���� ���Ͽ� ���� �߰�
				k32_bw1.newLine();	// ���� ���� ���Ͽ� �� �ٲٱ�
				
				if (k32_wcnt == 0) {	// ���� ���� ������ ������ ��
					k32_max = Integer.parseInt(k32_field[3].replace("^", "").trim());	// �ִ밪�� ������ �����ڸ� ���ְ� ������ �ڸ� ���� ����
					k32_min = Integer.parseInt(k32_field[3].replace("^", "").trim());	// �ּҰ��� ������ �����ڸ� ���ְ� ������ �ڸ� ���� ����
					k32_maxDate = k32_field[1].replace("^", "").trim();	// �ִ밪�� ��¥�� ��¥�� �����ڸ� ���ְ� ������ �ڸ� ���� ����
					k32_minDate = k32_field[1].replace("^", "").trim();	// �ּҰ��� ��¥�� ��¥�� �����ڸ� ���ְ� ������ �ڸ� ���� ����
				} else {	// ���Ŀ�
					if (k32_max < Integer.parseInt(k32_field[3].replace("^", "").trim())) {	// �ִ밪�� �������� ������
						k32_max = Integer.parseInt(k32_field[3].replace("^", "").trim());	// �ִ밪�� ���ο� ������ ����
						k32_maxDate = k32_field[1].replace("^", "").trim();	// �ִ밪�� ��¥�� ���ο� ��¥�� ����
					}
					if (k32_min > Integer.parseInt(k32_field[3].replace("^", "").trim())) {	// �ּҰ��� �������� ũ��
						k32_min = Integer.parseInt(k32_field[3].replace("^", "").trim());	// �ּҰ��� ���ο� ������ ����
						k32_minDate = k32_field[1].replace("^", "").trim();	// �ּҰ��� ��¥�� ���ο� ��¥�� ����
					}
				}
				
				k32_wcnt++;	// ���� ���� ������ �� 1 ����
			}
			
			k32_cnt++;	// ���� ������ �� 1 ����
		}
		
		k32_br.close();	// ���� ���� �ݱ�
		k32_bw1.close();	// ���� ���� ���� �ݱ�
		long k32_finishTime = System.currentTimeMillis();	// �ڵ� ���� �Ŀ� �ð� �޾ƿ���
		Date k32_finishInDate = new Date(k32_finishTime);	// ���� ��¥�� ��ȯ
		String k32_finishFormat = sdf.format(k32_finishInDate);	// ���ڿ� ������ ���� ��ȯ
		
		long k32_diffTime = (k32_finishTime - k32_startTime); // �ð� ���� ��� 
		long k32_diffTimeMin = (k32_diffTime / 1000 / 60);	// �� ���ϱ�
		long k32_diffTimeSec = (k32_diffTime / 1000 % 60);	// �� ���ϱ�
		
		System.out.println("���� �ð� : " + k32_startFormat);	// ���� �ð� ���
		System.out.println("���� �ð� : " + k32_finishFormat);	// ���� �ð� ���
		System.out.println("�ð� ���� : " + k32_diffTimeMin + "�� " + k32_diffTimeSec + "��");	// �ð� ���� ���
		System.out.printf("Program End[%d][%d]records\n", k32_wcnt, k32_cnt);	//	��� ���
		System.out.println("�� �׸� ���� : "  + k32_cnt);	// �� �׸� ���� ���
		System.out.println("2015�� �Ｚ���� �ְ� ���� : " + k32_wcnt);	// �ش� ��¥�� ��� ���� ���� ���
		System.out.println("2015�� �Ｚ���� �ְ� ���� �ִ밪 : " + k32_max + "(" + k32_maxDate + ")");	// 2015 �Ｚ���� �ְ� ���� �ִ밪(��¥) ���
		System.out.println("2015�� �Ｚ���� �ְ� ���� �ּҰ� : " + k32_min + "(" + k32_minDate + ")");	// 2015 �Ｚ ���� �ְ� ���� �ּҰ� (��¥) ���
		
	}

}
