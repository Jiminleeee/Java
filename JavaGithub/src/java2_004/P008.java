package java2_004;

public class P008 {
// ������ ��2, 3 / 20220415 / k32_������ / ���Ⱑ ���� �ʴ� > �������� �ڵ��� �߿伺!/ �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// ������ �� 2
		for (int k32_i = 1; k32_i < 13; k32_i++) {	 // ������ ���� i�� 1���� 12���� 1�� ������ �� (for��)
			System.out.printf(" %d�� =>", k32_i); 	// ��� ��� (�ϳ��� �����ϸ� ��µ�)
			for (int k32_j = 1; k32_j < 32; k32_j++) { 	// ������ ���� j�� 1���� 31���� 1�� ������ �� (for��)
				System.out.printf("%d, ", k32_j); 	// ��� ��� (�ϳ��� �����ϸ� ��µ�)

				if (k32_i == 4 || k32_i == 6 || k32_i == 9 || k32_i == 11) {	// ���� i�� 4, 6, 9, 11�̸� (if��)
					if (k32_j == 30)	// ���� j�� 30�� �� (if��) 				// ||�� or�� �ǹ�(�Ǵ�)
						break;	// �ߴ��ϰ� �������� �Ѿ
				}

				if (k32_i == 2) {	// ���� i�� 2�̸� (if��)
					if (k32_j == 28)	// ���� j�� 28�� �� (if��)
						break;	// �ߴ��ϰ� �������� �Ѿ
				}
			}
			System.out.printf("\n");	// �� �� ����
		}
	
			System.out.println("************************************************"); 	// ���� ���� �� �� �߰�
			
			
	// ������ �� 3 / �ּ����� k32_����
		for (int k32_i = 1; k32_i < 13; k32_i++) {	// ������ ���� i�� 1���� 12���� 1�� ������ �� (for��)
			System.out.printf(" %d�� =>", k32_i);	// ��� ��� (�ϳ��� �����ϸ� ��µ�)
			for (int k32_j = 1; k32_j < 32; k32_j++) {	// ������ ���� j�� 1���� 31���� 1�� ������ �� (for��)
				System.out.printf("%d, ", k32_j);	// ��� ��� (�ϳ��� �����ϸ� ��µ�)

				if ((k32_i == 4 || k32_i == 6 || k32_i == 9 || k32_i == 11) && (k32_j == 30))
					break;	// ���� i�� 4,6,9,11�̸�, ���� j�� 30�� �� �ߴ��ϰ� �������� �Ѿ
				if (k32_i == 2 && k32_j == 28)
					break;	// ���� i�� 2�̸�, ���� j�� 28�� �� �ߴ��ϰ� �������� �Ѿ
			}
			System.out.printf("\n");	// �� �� ����

		}
	}
}