package java2_008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P007 {
//���� �Ⱦ�� ����� / 20220421 / k32_������ / �ּ����� k32_����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\�ǽ�������\\day_data\\THTSKS010H00.dat");
		BufferedReader k32_br = new BufferedReader(new FileReader(k32_f));	// ���� �ҷ��ͼ� �б�
		
		String k32_readtxt;	// ���ڿ� ���� text �б� ����
		int k32_LineCnt = 0;	// ������ ���� line count ���� �� 0���� �ʱ�ȭ
		int k32_n = 1;	// ������ ���� n�� ���� �� 1�� �ʱ�ȭ
		
		//�ð� ���� �����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// �ð� ���� �����ϱ�
		long k32_startTime = System.currentTimeMillis();	// �ڵ� ���� ���� �ð� �޾ƿ��� (���� �ð�)
		Date k32_startInDate = new Date(k32_startTime);	// ���� ��¥�� ��ȯ
		String k32_startFormat = sdf.format(k32_startInDate);	// ���ڿ� ������ ���� ��ȯ
		
		StringBuffer k32_s = new StringBuffer();	// stringbuffer ����
		while (true) {	// ���� ���� 
			char[] k32_ch = new char[1000];	// ���� �迭 ���� �� 1000���� �ʱ�ȭ
			
			k32_n = k32_br.read(k32_ch);	// ���� �迭�� �߰��� n�� ���� > ���� ���� �ľ� ����
			
			if (k32_n == -1) break;	// ������ �ϳ��� ������ break
			
			for (char k32_c : k32_ch) {	// ���� �迭�� ������ ���� c�� �� ��
				if (k32_c == '\n') {	// �� �ٲٱ���
					System.out.printf("[%s]***\n", k32_s.toString());	// �� �ٲٴ� ���·� ���
					k32_s.delete(0, k32_s.length());	// s�� ���̸�ŭ s���� ����� > reset
					} else {	// �� �ٲٴ� ���� �ƴ� �����̶��
					k32_s.append(k32_c);	// c�� s(stringbuffer)�� �߰�
				}
			}
			k32_LineCnt++;	// linecount�� 1 ����
		}
		System.out.printf("[%s]***\n", k32_s.toString());	// ���ڿ� ���·� ���
		k32_br.close();	// ���� �ݱ�
		
		long k32_finishTime = System.currentTimeMillis();	// �ڵ� ���� �Ŀ� �ð� �޾ƿ���
		Date k32_finishInDate = new Date(k32_finishTime);	// ���� ��¥�� ��ȯ
		String k32_finishFormat = sdf.format(k32_finishInDate);	// ���ڿ� ������ ���� ��ȯ
		
		long k32_diffTime = (k32_finishTime - k32_startTime); // �ð� ���� ��� 
		long k32_diffTimeMin = (k32_diffTime / 1000 / 60);	// �� ���ϱ�
		long k32_diffTimeSec = (k32_diffTime / 1000 % 60);	// �� ���ϱ�
		
		System.out.println("���� �ð� : " + k32_startFormat);	// ���� �ð� ���
		System.out.println("���� �ð� : " + k32_finishFormat);	// ���� �ð� ���
		System.out.println("�ð� ���� : " + k32_diffTimeMin + "�� " + k32_diffTimeSec + "��");	// �ð� ���� ���
		System.out.println("�� �׸� ���� : " + k32_LineCnt);	// �� �׸� ���� ���
	}

}
