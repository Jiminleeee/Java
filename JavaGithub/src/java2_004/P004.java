package java2_004;

public class P004 {
// for���� while���� �ܼ���, 20220415, k32_������, for�� ��� while�� break�� ���, �ʱ�ȭ �� ������ġ Ȯ��! / �ּ����� k32_�� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iA, k32_iB;		// ������ ���� iA�� iB�� ����

		k32_iA = 0;		// iA�� 0���� �ʱ�ȭ

		while (true) {	// while(true)�� ���� �ݺ���(1)
			k32_iB = 0;		// iB�� 0���� �ʱ�ȭ
			
			while (true) {	// while(true)�� ���� �ݺ���(2)
				System.out.printf("*");		// iB�� 0�� ��, * ���
				
				if (k32_iA == k32_iB)	// iA�� iB�� ������ (if��)
					break;		// break; > �ݺ��� ���߰� �Ѿ��. ������ ������ �������� �ʴ´� (while(2) ����)
				k32_iB++;	// iA�� iB�� ���� �������� iB�� 1 �����Ѵ�. 
			}
			System.out.printf("\n");	// �� �ٲٱ�
			k32_iA++;	// iA�� 1 �����Ѵ�
			if (k32_iA == 30)	// iA�� 30�� �Ǹ� (if��)
				break;	//�ݺ����� ���߰� �������� �Ѿ��. > while(1) ����
		}
	}

}
