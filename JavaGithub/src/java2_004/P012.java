package java2_004;

public class P012 {
// ���� / 20220415 / k32_������ / �̷��� ���� / �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// ������ ���� i�� 0���� 9���� 1�� ������ �� (for��)
			for (int k32_j = 0; k32_j < k32_i; k32_j++) {	// ������ ���� j�� 0���� i-1���� 1�� ������ �� (for��)
				System.out.printf(" ");		// ���๮ ��� > ��ĭ�� ���
			}
			System.out.printf("%d\n", k32_i);	// ���๮ ��� > ���� i�� 1�� �����ϸ� ���
		}
	}
}
