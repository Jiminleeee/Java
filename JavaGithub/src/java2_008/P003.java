package java2_008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P003 {
// ���� ���Ͽ� ���� / 20220421 / k32_������ / �ּ����� k32_����
	public static void main(String[] args) throws IOException {	// IOException ��� Ư�̻����� ����������(throw)
		// TODO Auto-generated method stub
		// \�� Ư�������̹Ƿ� \\�� 2���� ��� �Ѵ�
		File k32_f = new File ("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\����_��ȭ\\8��\\12_04_07_E_���������������_����.csv");	// ���� ����
		BufferedReader k32_br = new BufferedReader (new FileReader(k32_f));	// ���� �б�
		
		String k32_readtxt;	// ���ڿ� ���� (���� ���� ����) ����
		
		//�� ���� ���� �о�� �ʵ���� �� �� �ִ�
		if ((k32_readtxt = k32_br.readLine()) == null) {	// ���� ������ �� �ٵ� ������
			System.out.println("�� �����Դϴ�");	// ���� ���
			return;	
		}
		
		String[] k32_field_name = k32_readtxt.split(",");	// �ʵ���� ��ǥ ������ �߶� ���ڿ� �迭�� ����
		
		int k32_LineCount = 0;	// ������ ���� ���� ������ ���� ���� �� 0���� �ʱ�ȭ
		while ((k32_readtxt = k32_br.readLine()) != null) {	// ���� ������ 0�� �ƴϸ� > ���� ������ ������
			String[] k32_field = k32_readtxt.split(",");	// ������ �ʵ� ������ ��ǥ ������ �߶� ���ڿ� �迭�� ����
			System.out.printf("**[%d��° �׸�]**********************\n", k32_LineCount);	// ��� ���
			for (int k32_j = 0; k32_j < k32_field_name.length; k32_j++) {	// ������ ������ �ʵ���� �׸�ŭ 1�� �����ϸ� �ݺ� (for��)
				System.out.printf(" %s : %s\n", k32_field_name[k32_j], k32_field[k32_j]);	// �ʵ��� �ʵ� ������ ���
			}
			System.out.println("************************************");
			if (k32_LineCount == 100) break;	// ���� lineCount�� 100�� �Ǹ� ����
			k32_LineCount++;	// ���� lineCount�� 1 ����
		}
		
		k32_br.close();	// ������ �ݴ´�
	}

}
