package java2_008;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P001 {
// �����ϰ� �а� ���� / 20220421 / k32_������ / �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\����_��ȭ\\8��\\Mytest.txt");	// ���� ���� �����
			FileWriter k32_fw = new FileWriter(k32_f);	// ���Ͽ� ���� �߰�
			// �Ʒ��� ������ ���Ͽ� �߰��Ѵ�
			k32_fw.write("�ȳ� ����\n");
			k32_fw.write("hello ���\n");

			k32_fw.close();	// ������ �ݴ´� 

			FileReader k32_fr = new FileReader(k32_f);	// ������ �д´�
			

			int k32_n = -1;	// ������ ���� ���� �� -1�� �ʱ�ȭ
			char[] k32_ch;	// ������ �迭 ����
			
			while (true) {	// ���� ���� ����
				k32_ch = new char[100];	// ������ �迭 ������ 100���� �ʱ�ȭ
				k32_n = k32_fr.read(k32_ch);	// ������ ���� ������ ������ ����

				if (k32_n == -1)	// ���Ͽ� �ƹ� ������ ������
					break;	// ���� �б⸦ �ߴ��Ѵ�

				for (int k32_i = 0; k32_i < k32_n; k32_i++) {	// n�� ��ŭ 1�� �����ϸ� �ݺ� (for��)
					System.out.printf("%c", k32_ch[k32_i]);	// ������ ���� ���
				}
			}

			k32_fr.close();	// ������ �ݴ´�	

			System.out.printf("\n FILE READ END ");	// ���� �б⸦ ���ƴٴ� ���� ���

		} catch (Exception e) {	// ���� ���
			System.out.printf("�� ����[%s]\n", e); // ���� �߻� �� ������ ����� ���� �߻��� �˸��� ���� ���
		}
	}

}
