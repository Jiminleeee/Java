package java2_003;

public class P007 { 
//#2. ���ݰ�� 2) �Һ��ڰ� ���� ���, 20220414, k32_������, �������� = �Һ��ڰ��� / (1 + ����)
	public static int k32_netprice(int k32_price, double k32_rate) {	// k32_netprice �Լ� ����(���� ����)
		return (int) (k32_price / (1 + k32_rate)); //������ ���� ���� �� ���� (�Һ��ڰ��� / (1+����))
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_price = 1234;	// �Һ��ڰ��� ������ ���� ����
		double k32_taxRate = 0.1;	// ���� �Ǽ��� ���� ����(0.1)
		
		int k32_netprice = k32_netprice(k32_price, k32_taxRate);	// ���� ���� ������ ���� < �Լ� ���
		int k32_tax = k32_price - k32_netprice;		// ���� = �Һ��ڰ� -  ���� ����
		
		System.out.printf("*******************************************************\n");
		System.out.printf("*            �Һ��ڰ�, ��������, ���� ���            *\n");
		System.out.printf(" �Һ��ڰ���: %d, ��������: %d, ����: %d\n", k32_price, k32_netprice, k32_tax);	// �Һ��ڰ�, ��������, ���� ��� ���
		System.out.printf("*******************************************************\n");
	}

}
