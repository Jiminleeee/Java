package java2_005;

public class P003 {
// �޷� �μ� / 20220418 / k32_������ / �ּ��� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iWeekday = 5;	// �־��� ���� : 1�� 1���� �ݿ���
		int[] k32_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	// �� ���� ������ ���� �迭�� ���� �� �ʱ�ȭ, �־��� ���� : ���ش� ����

		for (int k32_iMon = 0; k32_iMon < 12; k32_iMon++) {	// ���� ���� iMon�� 0���� 11���� 1�� �����ϸ� �ݺ� (for��), �� ���� ������ ���� �迭�� ���� > 0���� ����
			System.out.printf("\n\t         %d��\t\n", k32_iMon+1);	// ���๮ ���(iMon + 1)
			System.out.println("========================================");
			System.out.printf("%3s %3s %3s %3s %3s %3s %3s\n", "��", "��", "ȭ", "��", "��", "��", "��");	// ���� ���
			// ��ĭ�����
			for (int k32_index = 0; k32_index < k32_iWeekday; k32_index++) {	// ���� ���� index�� 0���� iWeekday-1���� 1�� �����ϸ� �ݺ� (for��)
				System.out.printf("%5s","");	//5s��ŭ ����(��ĭ �����)
			}

			for (int k32_i = 1; k32_i <= k32_iEnd[k32_iMon]; k32_i++, k32_iWeekday++) {	// ���� ���� i�� 1���� �ش� ��(i)�� ������ ������ 1�� �����ϸ� �ݺ�(for��), iWeekday�� 1�� ����
				if (k32_iWeekday % 7 == 6) {	//iWeekday�� 7�� ���� �������� 6�� �� (if��) 
					System.out.printf("%5d\n", k32_i);	// ���� i ��� �� �� �ٲ�, ��~�� (0~6)
					k32_iWeekday = k32_iWeekday - 7;	// iWeekday�� -7 >  0���� �����
				} else {	// iWeekday�� 7�� ���� �������� 6�� �ƴ� ��(if��)
					System.out.printf("%5d", k32_i);	// ���� i ���
				}
			}

		}
	}
}
