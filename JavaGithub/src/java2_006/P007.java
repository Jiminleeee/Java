package java2_006;
// �޼ҵ� �����ε� / 20220417 / k32_������ / �ּ��� k32_����
public class P007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P007_Calc1 k32_cc = new P007_Calc1();	// P007_Calc1 Ŭ���� cc ����
		
		System.out.printf("2�� ������ ȣ��� [%d]\n", k32_cc.k32_sum(1, 2));		// 2�� ���� ��� ���
		System.out.printf("3�� ������ ȣ��� [%d]\n", k32_cc.k32_sum(1, 2, 3));	// 3�� ���� ��� ���
		System.out.printf("4�� ������ ȣ��� [%d]\n", k32_cc.k32_sum(1, 2, 3, 4));	// 4�� ���� ��� ���
		System.out.printf("������ ������ ȣ��� [%f]\n", k32_cc.k32_sum(1.3, 2.4));	// �Ǽ��� ���� ��� ���
	}

}
