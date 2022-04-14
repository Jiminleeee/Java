package java2_003;

public class P006 {
//#2. ���ݰ�� 1) �ܼ� ���� ���, 20220414, k32_������, ������ ������ �ø��� �Ѵ�!

	public static int k32_taxcal(int k32_val, int k32_rate) {	// �Լ� k32_taxcal ����, int k32_val(���� ����), int k32_rate(����%)
		int k32_ret;	// ������ ���� ret ����

		if (((double) k32_val * (double) k32_rate / 100.0) == k32_val * k32_rate / 100) { //(�Ǽ�) ������ (����) ���ݰ� ������
			k32_ret = k32_val * k32_rate / 100;		// �Ҽ��� ������ �ڸ��� ���� ������ ������ ���� ���� * ����(%) / 100
		} else {	// (�Ǽ�) ������ (����) ���ݰ� �ٸ��� 
			k32_ret = k32_val * k32_rate / 100 + 1;		// �Ҽ��� ���ϰ� �ִ� �� > ������ �ø��� �ؾ��ϹǷ� +1
		}
		return k32_ret;		// ����� ���ݰ��� return �Ѵ�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_val = 271;		// ���� ������ 271��
		int k32_rate = 5;		// ���� 5�ۼ�Ʈ

		int k32_tax = k32_taxcal(k32_val, k32_rate);	// tax(����)�� ��� < �Լ� k32_taxcal ���

		System.out.printf("*********************************************\n");
		System.out.printf("*           �ܼ� ���� ���                  *\n");
		System.out.printf("���� ���ݰ�� : %f\n", k32_val * k32_rate / 100.0);		// �ܼ� ���� ��� ��� ��� (�Ǽ�)

		System.out.printf("��������: %d ����: %d �����԰���: %d\n", k32_val, k32_tax, k32_val + k32_tax);	// ���� ����, ����, ������ ���� ���
		System.out.printf("*********************************************\n");
	}

}
