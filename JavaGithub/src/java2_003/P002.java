package java2_003;

public class P002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #1. 3) �����ϱ�, 20220414, k32_������, �����հ� ������ ���

		int k32_sum; 	// ������ ���� k32_sum�� ����

		k32_sum = 0; 	// ���� k32_sum�� 0���� �ʱ�ȭ

		for (int k32_i = 1; k32_i < 101; k32_i++) { 	// k32_i�� 1���� 100���� 1�� �����ϸ鼭 (for �ݺ���)
			k32_sum = k32_sum + k32_i; 		// k32_sum�� k32_sum + k32_i�� ������
		}
		System.out.printf("#2-1 : %d\n", k32_sum); 	// k32_sum �� ���
		System.out.printf("#2-2 : %d\n", k32_sum / 100); 	// k32_sum/100�� ���

		int[] k32_v = { 1, 2, 3, 4, 5 }; 	// ���� �迭 k32_v�� ����
		int k32_vSum; 	// ���� ���� k32_vSum�� ����

		k32_vSum = 0; 	// ���� k32_vSum�� 0���� �ʱ�ȭ

		for (int k32_i = 0; k32_i < 5; k32_i++) { 	// k32_i�� 0���� 4���� 1�� �����ϸ鼭 (for �ݺ���)
			k32_vSum = k32_vSum + k32_v[k32_i];	 // k32_vSum�� k32_vSum + k32_v[k32_i]�� ������
		}

		System.out.printf("#2-3 : %d\n", k32_vSum); 	// k32_vSum�� ���
	}

}
