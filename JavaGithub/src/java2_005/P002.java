package java2_005;

public class P002 {
//������ �μ�(2) / 20220418 / k32_������ / �ּ��� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k32_i = 1; k32_i < 4; k32_i++) {	// ���� ���� i�� 1���� 3���� 1�� �����ϸ� �ݺ�(for��), ���η� ����ϱ� ����
			System.out.println("*******************\t*******************\t*******************");
			System.out.printf("   ������ %d �� \t\t    ������ %d �� \t     ������%d�� \n", k32_i, k32_i+3, k32_i+6);	// ���ηδ� 3�� �߰��� ���
			System.out.println("*******************\t*******************\t*******************");
			for (int k32_j =1; k32_j < 10; k32_j++) {	// ���� ���� j�� 1���� 9���� 1�� �����ϸ� �ݺ� (for��) > ���ϱ� �޺κ�
				for (int k32_t = k32_i; k32_t < 10 + k32_i; k32_t=k32_t+3) {	// ���� ���� t�� 1���� i+9���� t+3�� �����ϸ� �ݺ� (for��) > ���ϱ� �պκ� 
				System.out.printf("  %d * %d = %d   \t\t", k32_t, k32_j, k32_t * k32_j);	// ���ϱ� ���Ŀ� �°� ���
				
			}
				System.out.println();	// �� �ٲٱ�
		}
	}
	}

}
