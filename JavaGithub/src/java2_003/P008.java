package java2_003;

public class P008 {
//#2. ���ݰ��  3) ������ ���� ����ϱ�, 20220414, k32_������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] k32_item = {"���ϸ�", "���ڼ���", "ġ�佺", "��īĨ", "��ũ�ٽ�"};	// ���ڿ� �迭�� ���� �����ϴ� ���� ����
		int[] k32_price = {1000, 2000, 3000, 2500, 1450};	// ������ �迭�� ������ �ܰ� ����
		int[] k32_amount = {10, 2, 1, 3, 5};	// ������ �迭�� ���� ���� ���� ����
		double k32_taxRate = 0.1;	// �Ǽ��� ������ ����rate ����
		int k32_totalSum = 0;	// ������ ������ ����(���� �ݾ�) ����
		
		System.out.printf("*************************************************\n");	// �Ʒ����� ����� ����Ѵ�. (ĭ�� ���߱�!)
		System.out.printf("                 <���� �� ���ڵ�>               \n");	
		System.out.printf(" �׸�              �ܰ�         ����      �հ�\n");
		for (int k32_i = 0; k32_i < k32_item.length; k32_i++) {	// k32_i�� 0���� ������ �迭 k32_item�� ����(������)���� 1�� ������ �� (for �ݺ���)
			int k32_sum = k32_price[k32_i] * k32_amount[k32_i];		// ������ ���� �հ�, ������ �ܰ� �迭�� ���� ���� ���� �迭���� ���� �����ϴ� ���� ���Ѵ�. 
			k32_totalSum = k32_totalSum + k32_sum;		// ����(���ұݾ�)�� �հ踦 �����Ѵ�. 
			System.out.printf("%-5s\t   %3d\t\t %2d\t %5d\n", k32_item[k32_i], k32_price[k32_i], k32_amount[k32_i], k32_sum);	// ĭ�� ���߸鼭 ����� ����Ѵ�
		}																									// ���� ����, �ܰ�, ����, �հ� �迭 ������ �°� ��� 
		System.out.printf("*************************************************\n");
		System.out.printf("��  ��  ��  �� : \t%22d\n", k32_totalSum);		// ���ұݾ��� ����Ѵ�. (ĭ ���߱�)
		
		int k32_totalNetPrice = (int) (k32_totalSum / (1+k32_taxRate));		// �����ݾ��� ������ ������ ����, ���ұݾ׿��� (1+����)�� ������ (������ �ø�!)(�� ��ȯ�� ����)
		System.out.printf("��  ��  ��  �� : \t%22d\n", k32_totalNetPrice);	// �����ݾ��� ����Ѵ�
		int k32_tax = k32_totalSum - k32_totalNetPrice;		// ������ ������ ������ ����, ���� = ���ұݾ� - �����ݾ�
		System.out.printf("��          �� : \t%22d\n", k32_tax);	// ������ ����Ѵ�
	}

}
