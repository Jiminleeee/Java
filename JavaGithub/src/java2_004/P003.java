package java2_004;

public class P003 {
// �⺻ for���� ���� for��, 20220415, k32_������, for���� ������ / �ּ����� k32_�� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// �⺻ for��
		int k32_sum = 0;	// ������ ���� sum ���� �� 0���� �ʱ�ȭ
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// ������ ���� i�� 0���� 9���� 1�� ������ ��
			k32_sum = k32_sum + k32_i;		// ������ ���� sum�� ���� i�� ������
		}
		System.out.printf("sum %d\n", k32_sum);		// ������ �� sum�� ���

	// ���� for��  
		for (int k32_i = 1; k32_i < 10; k32_i++) {		// ������ ���� i�� 1���� 9���� 1�� ������ ��
			System.out.printf("************************************\n", k32_i);
			System.out.printf("	  ������ %d ��\n", k32_i);		// ���� i�� 1���� 9���� 1�� �����ϸ� ���
			System.out.printf("************************************\n", k32_i);
			for (int k32_j = 1; k32_j < 10; k32_j++) {		// ������ ���� j�� 1���� 9���� 1�� ������ ��
				System.out.printf(" %d * %d = %d \n", k32_i, k32_j, k32_i * k32_j);	// i * j = i * j �� ���·� ���
			}																		// ������ ���
		}
	}

}
