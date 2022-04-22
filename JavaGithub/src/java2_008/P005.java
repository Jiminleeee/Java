package java2_008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P005 {
//�Ÿ����(�ּ�, �ִ�) / 20220421 /  k32_������ / �ּ����� k32_����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\����_��ȭ\\8��\\12_04_07_E_���������������_��⵵_��.txt"); // ���� �ҷ�����																									
		BufferedReader k32_br = new BufferedReader(new FileReader(k32_f)); // ���� �б�

		String k32_readtxt; // ���ڿ� ���� (���� ���� ����) ����

		if ((k32_readtxt = k32_br.readLine()) == null) { // ���Ͽ� �� �ٵ� ������ ������ (null)
			System.out.println("�� �����Դϴ�"); // ���� ���
			return;
		}

		String[] k32_field_name = k32_readtxt.split("\t"); // ���ڿ� �迭 �ʵ���� �����ϰ� ���� ������ ��ĭ ������ �ڸ���

		double k32_lat = 37.3859; // ������ ����
		double k32_lng = 127.1214; // ������ �浵
		
		
		int k32_LineCount = 1;	// ������ ���� �� ī��Ʈ�� �����ϰ� 1�� �ʱ�ȭ
		double k32_distanceMax = 0;	// �Ǽ��� ���� �ִ� �Ÿ� �����ϰ� 0���� �ʱ�ȭ
		double k32_distanceMin = 0;	// �Ǽ��� ���� �ּ� �Ÿ� �����ϰ� 0���� �ʱ�ȭ
		int k32_LineCountCheckMax = 0;	// �ִ밡 ���°���� Ȯ���ϴ� ������ ���� �����ϰ� 0���� �ʱ�ȭ
		int k32_LineCountCheckMin = 0;	// �ּҰ� ���°���� Ȯ���ϴ� ������ ���� �����ϰ� 0���� �ʱ�ȭ
		String k32_maxSpot = "";
		String k32_minSpot = "";
		
		while ((k32_readtxt = k32_br.readLine()) != null) {	// ���Ͽ� ������ �����ϸ� (null�� �ƴϸ�)
			String[] k32_field = k32_readtxt.split("\t");	// ���ڿ� �迭 �ʵ� ������ �����ϰ� ���� ������ ��ĭ ������ �ڸ���
			
			double k32_distance = Math.sqrt(Math.pow(Double.parseDouble(k32_field[13])-k32_lat, 2)) + Math.pow(Double.parseDouble(k32_field[14])-k32_lng, 2);	
			// �츮������������ �Ÿ� ���ϱ� > �Ÿ��� ��Ÿ����� ������ Ȱ���� ���Ѵ�
			
			if (k32_LineCount == 1) {	// 1��° ���� ��
				k32_distanceMax = k32_distance;	// �ִ�Ÿ��� �Ÿ� ����
				k32_distanceMin = k32_distance;	// �ּҰŸ��� �Ÿ� ����
				k32_LineCountCheckMax = k32_LineCount;	// �ִ����Ȯ�ο� ���� ���� ����
				k32_LineCountCheckMin = k32_LineCount;	// �ּҶ��� Ȯ�ο� ���� ���� ����
				k32_maxSpot = k32_field[1];
				k32_minSpot = k32_field[1];
				
			} else {	// �����Ͱ� ���̻� ���� ������
				if (k32_distance > k32_distanceMax) {	// �Ÿ��� �ִ�Ÿ����� ũ�ٸ�
					k32_distanceMax = k32_distance;	// �ִ�Ÿ��� �Ÿ��� ����
					k32_LineCountCheckMax = k32_LineCount;	// �ִ� ���� Ȯ�ο� ���� ���� ����
					k32_maxSpot = k32_field[1];
				}
				if (k32_distance < k32_distanceMin) {	// �Ÿ��� �ּҰŸ� ���� �۴ٸ�
					k32_distanceMin = k32_distance;	// �ּҰŸ��� �Ÿ��� ����
					k32_LineCountCheckMin = k32_LineCount;	// �ּ� ���� Ȯ�ο� ���� ���� ����
					k32_minSpot = k32_field[1];
				}
			}
						
			k32_LineCount++;	// ���� �ٷ� �Ѿ�� (1 ����)
					
		}
		
		System.out.printf(" �ִ� : [%d��° �׸�] - %s : %f\n", k32_LineCountCheckMax, k32_maxSpot, k32_distanceMax);	// ���¿� �°� �ִ� �Ÿ� ���
		System.out.printf(" �ּ� : [%d��° �׸�] - %s : %f\n", k32_LineCountCheckMin, k32_minSpot, k32_distanceMin);	// ���¿� �°� �ּ� �Ÿ� ���
		System.out.println("**********************************************");
		
		k32_br.close();	// ������ �ݴ´�
		
		
	}

}
