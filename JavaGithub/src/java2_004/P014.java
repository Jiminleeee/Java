package java2_004;

public class P014 {
// �Ƕ�̵� ��� / 20220415 / k32_������ / ��Ģ�� ã�� ���� ���̱�/ �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_n, k32_m;	// ������ ���� n, m�� ����
		
		k32_m = 20; 	// ���� m�� 20���� �ʱ�ȭ
		k32_n = 1;		// ���� n�� 1�� �ʱ�ȭ
		
		while (true) {	// ���� �ݺ��� 
			for (int k32_i = 0; k32_i < k32_m; k32_i++) {	// ������ ���� i�� 0���� m-1���� 1�� ������ �� (for��)
				System.out.printf(" ");		// ���๮ ��� > ��ĭ ���
			}
			for (int k32_i = 0; k32_i < k32_n; k32_i++) {	// ������ ���� i�� 0���� n���� 1�� ������ �� (for��)
				System.out.printf("*");		// ���๮ ��� > �� ���
			}
			System.out.printf("\n");	// �� �� ����
			
			k32_m = k32_m - 1;		// ���� m�� m-1 ����
			k32_n = k32_n + 2;		// ���� n�� n+2 ����
			
			if (k32_m < 0) break;	// ���� m�� 0���� ������ �ݺ������� ������. > ����
		}
	}
}
