package java2_005;

public class P001 {
//������ �μ�(1) / 20220418 / k32_������ / �ּ��� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k32_i = 1; k32_i < 10; k32_i=k32_i+3) {	//���� ���� i�� 1���� 9���� 3�� �����ϸ� �ݺ�(for��)
			System.out.println("*******************\t*******************\t*******************");	
			System.out.printf("   ������ %d �� \t\t    ������ %d �� \t     ������%d�� \n", k32_i, k32_i+1, k32_i+2);	// i�� 1�� �����ϸ� ���η� ���
			System.out.println("*******************\t*******************\t*******************");
			for (int k32_j =1; k32_j < 10; k32_j++) {	// ���� ���� j�� 1���� 9���� 1�� �����ϸ� �ݺ�(for��) > ���ϱ� ���� �κ�
				for (int k32_t = k32_i; k32_t < 3 + k32_i; k32_t++) {	// ���� ���� t�� ���� ���� i���� i+2���� 1�� �����ϸ� �ݺ� (for��) > ���ϱ� ���� �κ� 
				System.out.printf("  %d * %d = %d   \t\t", k32_t, k32_j, k32_t * k32_j);	// ���ϱ��� ���¿� �°� ���
				
			}
				System.out.println();	// �� �ٲٱ�
		}
	}
	}
}
