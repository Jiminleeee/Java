package java2_004;

// �ڹ� ���� �Լ��� �ҷ����� ���� import ���
import java.text.DecimalFormat;

public class P015 {
// ĭ ���� �μ� / 20220415 / k32_������ / �ѱ۰� ���� ĭ ���߱� / �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k32_item = "���"; // ���ڿ� ���� item�� �����ϰ� "���"�� �ʱ�ȭ
		int k32_unitPrice = 5000; // ������ ���� unitPrice�� �����ϰ� 5000���� �ʱ�ȭ
		int k32_num = 500; // ������ ���� num�� �����ϰ� 500���� �ʱ�ȭ
		int k32_total = 0; // ������ ���� total�� �����ϰ� 0���� �ʱ�ȭ

		DecimalFormat k32_df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat Ŭ���� �����ͼ� ������� ����

		System.out.printf("==========================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%10.10s\n", "ǰ��", "�ܰ�", "����", "�հ�"); // ������ ĭ�� ��� ����ϱ�
		System.out.printf("==========================================================\n");

		System.out.printf("%20.20s%10.10s%10.10s%12.12s\n", k32_item, k32_df.format(k32_unitPrice),
				k32_df.format(k32_num), k32_df.format(k32_unitPrice * k32_num));	// ������ ĭ�� ��� ����ϱ�
				//DecimalFormat�� Ȱ���� ��� ���� ����(�޸� ���)
		System.out.printf("==========================================================\n"); 
	}

}
