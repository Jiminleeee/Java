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

public class P008 {
//�� ���� �������� ���� ���� / 20220421 / k32_������ / �ּ����� k32_����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\�ǽ�������\\day_data\\THTSKS010H00.dat");
		BufferedReader k32_br = new BufferedReader(new FileReader(k32_f));	// ���� �ҷ�����
		
		File k32_f1 = new File("C:\\Users\\501-21\\\\Desktop\\kopo32\\Java\\��ȭ\\�ǽ�������\\day_data\\StockDailyPrice.csv");
		BufferedWriter k32_bw1 = new BufferedWriter(new FileWriter(k32_f1));	// StockDailyPrice ���� �����
		
		String k32_readtxt;	// ���ڿ� �ؽ�Ʈ�б� ���� ����
		int k32_cnt = 0; int k32_wcnt = 0;	// cnt = ���� ������ ���� ������ ���� ���� �� 0���� �ʱ�ȭ
											// wcnt = ���� ���� ������ ���� ������ ���� ���� �� 0���� �ʱ�ȭ
		// �ð� ���� �����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// �ð� ���� �����ϱ�
		long k32_startTime = System.currentTimeMillis();	// �ڵ� ���� ���� �ð� �޾ƿ��� (���� �ð�)
		Date k32_startInDate = new Date(k32_startTime);	// ���� ��¥�� ��ȯ
		String k32_startFormat = sdf.format(k32_startInDate);	// ���ڿ� ������ ���� ��ȯ
		
		while ((k32_readtxt = k32_br.readLine()) != null) {	// ���Ͽ� ������ ���� �� �ݺ� ����
			StringBuffer k32_s = new StringBuffer();	// StringBuffer ����
			String [] k32_field = k32_readtxt.split("%_%");	// ������ �������� ���� ���ڿ� �迭�� ����
			
			// ���ڿ� �迭 ���̰� 2���� ũ��, �ʵ��� 3��° ĭ�� ^�� ���ְ�(replace), �翷 ���� �ڸ���(trim)
			// ���ڿ��� A�� �����ϸ�(substring, equals)
			if (k32_field.length > 2 && k32_field[2].replace("^", "").trim().substring(0,1).equals("A")) {
				k32_s.append(k32_field[0].replace("^", "").trim());	// �ʵ��� ù��° ĭ�� ^�� ���ְ�(replace) �翷�� ������ �ڸ� ��(trim) �߰�
				for (int k32_j = 1; k32_j < k32_field.length; k32_j++) {	// ������ ������ �ʵ��� ���̸�ŭ 1�� �����ϸ� �ݺ�(for��)
					k32_s.append("," + k32_field[k32_j].replace("^", "").trim());	// ,�� �ʵ�[j]�� ^�� ���ְ�(replace), �翷�� ������ �ڸ� ��(trim) �߰�
				}
				k32_bw1.write(k32_s.toString()); // ���� ���� ���Ͽ� ���� �߰�
				k32_bw1.newLine();	// ���� ���� ���Ͽ� �� �ٲٱ�
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
		System.out.println("�ð� ���� : " + k32_diffTimeMin + "��" + k32_diffTimeSec + "��");	// �ð� ���� ���
		System.out.printf("Program End[%d][%d]records\n", k32_wcnt, k32_cnt);	//	��� ���
	}
	
	

}
