package java2_005;
// ����� import ���
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P004 {
//������ ���(1) / 20220418 / k32_������ / �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_Price = 33000;	// �ֹ� �հ� ���� ���� ������ ���� , 33000������ �ʱ�ȭ
		int k32_netPrice, k32_taxPrice;		// ��������, ���� ���� ������ ����
		double k32_taxRate = 0.1;	// �Ǽ��� ���� ���� ���� �� 0.1�� �ʱ�ȭ (10%)
		
		k32_netPrice = k32_netPrice(k32_Price, k32_taxRate);	// ���� ������ �Լ��� ȣ���� ���Ѵ�. 
		k32_taxPrice = k32_Price - k32_netPrice; 	// ������ �Һ��ڰ��� - ���� ����
				
		DecimalFormat k32_df = new DecimalFormat("###,###,###,###,###");	// DecimalFormat Ŭ���� ��������, ���� �����ϱ�
		Calendar k32_calt = Calendar.getInstance();		// Calendar Ŭ������ ���� �ð��� ������
		SimpleDateFormat k32_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");		// SimpleDateFormat Ŭ������ ��� ���� ���� 
		//������ ��� (������ ���� ����), ĭ�� ���� ����ϱ�
		System.out.println("�ſ����");
		System.out.println("�ܸ��� : 2N68665898             ��ǥ��ȣ : 041218"); 
		System.out.println("������ : �Ѿ��ġ�");
		System.out.println("��  �� : ��� ������ �д籸 Ȳ�����351���� 10 ,");
		System.out.println("1��");
		System.out.println("��ǥ�� : ��â��");
		System.out.println("����� : 752-53-00558                TEL :7055695");
		System.out.println("---------------------------------------------------");
		System.out.printf("��  �� : 		 		 "+k32_df.format(k32_netPrice)+"��\n");	// ���� ������ �޸� ��� ĭ�� ���� ���
		System.out.printf("�ΰ��� : 		 		  "+k32_df.format(k32_taxPrice)+"��\n");	// ������ �޸� ��� ĭ�� ���� ���
		System.out.printf("��  �� : 				 "+k32_df.format(k32_Price)+"��\n");	// �Һ��ڰ����� �޸� ��� ĭ�� ���� ���
		System.out.println("---------------------------------------------------");
		System.out.println("�츮ī��");
		System.out.println("ī���ȣ : 5387-20**-****-4613(S)          �Ͻú�");
		System.out.println("�ŷ��Ͻ� : " + k32_sdt.format(k32_calt.getTime()));		// ���� �ð��� ���¿� �°� ĭ�� ���� ���
		System.out.println("���ι�ȣ : 70404427");
		System.out.println("�ŷ���ȣ : 357734873739");
		System.out.println("���� : ��ī���      ���� : 720068568");
		System.out.println("�˸� : EDC����ǥ");
		System.out.println("���� : TEL)1544-4700");
		System.out.println("---------------------------------------------------");
		System.out.println("                 * �����մϴ� *");
		System.out.println("                              ǥ��V2.08_20200212");
	}
	
	public static int k32_netPrice(int k32_Price, double k32_taxRate) { // ���� ������ ���ϴ� �Լ� ����(�Ű����� 2�� > ������ �Һ��ڰ���, �Ǽ��� ����)
		return (int) (k32_Price * 10 / (1 + k32_taxRate) /10);	// ���ϰ� : �Һ��ڰ��� * 10 / (1+����) / 10 > ������ ������ �ø�
		
	}

}
