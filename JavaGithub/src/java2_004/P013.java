package java2_004;

public class P013 {
// sin �Լ� �׷��� / 20220415 / k32_������ / �ﰢ�Լ� �׷��� / �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double k32_fSin;	// �Ǽ��� ���� fSin�� ����
		
		for (int k32_i = 0; k32_i < 360; k32_i++) {		// ������ ���� i�� 0���� 359���� 1�� ������ �� (for��)
			k32_fSin = Math.sin( k32_i * 3.141592 / 180);	// fSin�� i * ���Ȱ� ���� (1���� = 180 / ����)
			System.out.printf("%d sin ==>%f\n", k32_i, k32_fSin);	// ���� �� ���(360������ ���� �ľ�)
		}
		
		for (int k32_i = 0; k32_i <360; k32_i++) {	// ������ ���� i�� 0���� 359���� 1�� ������ �� (for��)
			k32_fSin = Math.sin(k32_i * 3.141592 / 180);	// fSin�� i * ���Ȱ� ���� (1���� = 180 / ����)
			
			int k32_iSpace = (int) ((1.0 - k32_fSin) * 50); // ������ ���� iSpace ���� �� �ʱ�ȭ 
			// sin�Լ��� -1���� 1���� ���� ���´� �̸� ���ȭ �ϰ� 50�� ���Ͽ� 0 ~ 100���� ������ �����
			for (int k32_j = 0; k32_j < k32_iSpace; k32_j++) {	// ������ ���� j�� 0���� iSpace-1(99)���� 1�� ������ �� (for��)
				System.out.printf(" ");		// ���๮ ��� > ��ĭ ���
			}
			System.out.printf("*[%f][%d]\n", k32_fSin, k32_iSpace);	//���๮ ��� > ���� �׷����� ��µȴ�
		}
	}

}
