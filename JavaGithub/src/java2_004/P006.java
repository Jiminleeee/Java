package java2_004;

public class P006 {
// ������ �־ ã�� / 20220415 / k32_������ / �ּ����� k32_�� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iVal; // ������ ���� iVal ����

		for (int k32_i = 0; k32_i < 300; k32_i++) { // ������ ���� i�� 0���� 299���� 1�� ������ �� (for��)
			k32_iVal = 5 * k32_i; // iVal�� 5 * i ���� (i�� 1�� ����)
			if (k32_iVal >= 0 && k32_iVal < 10)		// iVal�� 0 �̻� 10 �̸��̸� (if��), &&�� and�� �ǹ�
				System.out.printf("�� %d\n", k32_iVal);		// ���๮ ��� > ���ǿ� �ش��ϴ� iVal ���
			else if (k32_iVal >= 10 && k32_iVal < 100)		// iVal�� 10 �̻� 100 �̸��̸� (if��)
				System.out.printf("�� %d\n", k32_iVal); 	// ���๮ ��� > ���ǿ� �ش��ϴ� iVal ���
			else if (k32_iVal >= 100 && k32_iVal < 1000)	// iVal�� 100 �̻� 1000 �̸��̸� (if��)
				System.out.printf("�� %d\n", k32_iVal);		// ���๮ ��� > ���ǿ� �ش��ϴ� iVal ���
			else		// ���� ���ǵ鿡 �ش� ���� ������
				System.out.printf("õ %d\n", k32_iVal);		// ���๮ ��� > ���ǿ� �ش����� �ʴ� iVal ���
		}
	}

}
