package java2_008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class P004 {
// �Ÿ���� / 20220421 / k32_������ / �ּ����� k32_���� / ��Ÿ����� ���� Ȱ��
	public static void main(String[] args) throws IOException {	// IOException ��� Ư�̻����� ����������(throw)
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\����_��ȭ\\8��\\12_04_07_E_���������������_��⵵_��.txt");	// ���� �ҷ�����
		BufferedReader k32_br = new BufferedReader (new FileReader(k32_f));	// ���� �б�
		
		String k32_readtxt;	// ���ڿ� ���� (���� ���� ����) ����
		
		if ((k32_readtxt = k32_br.readLine()) == null) {	// ���Ͽ� �� �ٵ� ������ ������ (null)
			System.out.println("�� �����Դϴ�");	// ���� ���
			return;
		}
		
		String[] k32_field_name = k32_readtxt.split("\t");	// ���ڿ� �迭 �ʵ���� �����ϰ� ���� ������ ��ĭ ������ �ڸ���
		
		double k32_lat = 37.3859;	// ������ ����
		double k32_lng = 127.1214;	// ������ �浵
		
		int k32_LineCount = 0;	// ������ ���� �� ī��Ʈ�� �����ϰ� 0���� �ʱ�ȭ
		while ((k32_readtxt = k32_br.readLine()) != null) {	// ���Ͽ� ������ �����ϸ� (null�� �ƴϸ�)
			String[] k32_field = k32_readtxt.split("\t");	// ���ڿ� �迭 �ʵ� ������ �����ϰ� ���� ������ ��ĭ ������ �ڸ���
			System.out.printf("**[%d��° �׸�]********************************\n",k32_LineCount);	// �� ��° �׸����� ���
			System.out.printf(" %s : %s\n", k32_field_name[9], k32_field[9]);	// ���θ� �ּ� ���
			System.out.printf(" %s : %s\n", k32_field_name[13], k32_field[13]);	// ���� ���
			System.out.printf(" %s : %s\n", k32_field_name[14], k32_field[14]);	// �浵 ���
			double k32_distance = Math.sqrt(Math.pow(Double.parseDouble(k32_field[13])-k32_lat, 2)) + Math.pow(Double.parseDouble(k32_field[14])-k32_lng, 2);	
			// �츮������������ �Ÿ� ���ϱ� > �Ÿ��� ��Ÿ����� ������ Ȱ���� ���Ѵ�
			System.out.printf(" ���������� �Ÿ� : %f\n", k32_distance);	
			System.out.println("**********************************************");
			k32_LineCount++;	// ���� �ٷ� �Ѿ�� (1 ����)
		}
		
		k32_br.close();	// ������ �ݴ´�
	}

}
