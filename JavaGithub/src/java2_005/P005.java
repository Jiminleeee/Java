package java2_005;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P005 {
//������ ���(2) / 20220418 / k32_������ / �ּ������� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k32_itemName1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";	// ��ǰ��1�� ���ڿ� ������ ���� �� �ʱ�ȭ
		String k32_itemCode1 = "1031615";	// ��ǰ�ڵ�1�� ���ڿ� ������ ���� �� �ʱ�ȭ
		int k32_price1 = 30000;	// price1�� ������ ������ ���� �� �ʱ�ȭ
		int k32_amount1 = 8;	// amount1�� ������ ������ ���� �� �ʱ�ȭ
		int k32_total1 = k32_price1 * k32_amount1;	// ��ǰ1�� �հ踦 ������ ������ ���� 

		String k32_itemName2 = "�����̵�ĸ���(������)(100ȣ)";	// ��ǰ��2�� ���ڿ� ������ ���� �� �ʱ�ȭ
		String k32_itemCode2 = "1008152";	// ��ǰ�ڵ�2�� ���ڿ� ������ ���� �� �ʱ�ȭ
		int k32_price2 = 1000;	// price2�� ������ ������ ���� �� �ʱ�ȭ
		int k32_amount2 = 10;	// amount2�� ������ ������ ���� �� �ʱ�ȭ
		int k32_total2 = k32_price2 * k32_amount2;	// ��ǰ2�� �հ踦 ������ ������ ����

		String k32_itemName3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)"; // ��ǰ��3�� ���ڿ� ������ ���� �� �ʱ�ȭ
		String k32_itemCode3 = "1020800";	// ��ǰ�ڵ�3�� ���ڿ� ������ ���� �� �ʱ�ȭ
		int k32_price3 = 2000;	// price3�� ������ ������ ���� �� �ʱ�ȭ
		int k32_amount3 = 50;	// amount3�� ������ ������ ���� �� �ʱ�ȭ
		int k32_total3 = k32_price3 * k32_amount3;	// ��ǰ3�� �հ踦 ������ ������ ���� 

		int k32_totalSum = k32_total1 + k32_total2 + k32_total3;	// �� ���� ������ ������ ���� (��ǰ1, 2, 3�� �հ踦 ����)
		int k32_netPrice, k32_taxPrice;	// ������ ������ ���� ����, ������ ����
		double k32_taxRate = 0.1;	// �Ǽ��� ������ ������ ���� �� 0.1�� �ʱ�ȭ (10%)

		k32_netPrice = k32_netPrice(k32_totalSum, k32_taxRate);	// ���� ������ ���������� ���ϴ� �Լ��� ����
		k32_taxPrice = k32_totalSum - k32_netPrice;	// ������ �� �հ迡�� ���� ������ �� ������ ����

		DecimalFormat k32_df = new DecimalFormat("###,###,###,###,###");	// DecimalFormat Ŭ���� ��������, ���� �����ϱ�
		Calendar k32_calt = Calendar.getInstance();		// Calendar Ŭ������ ���� �ð��� ������
		SimpleDateFormat k32_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");		// SimpleDateFormat Ŭ������ ��� ���� ���� 
		//������ ��� , ĭ�� ���߱�
		System.out.println("               \"���ΰ���, ���̼�\"");
		System.out.println("(��)�Ƽ����̼�_�д缭����");
		System.out.println("��ȭ:031-702-6016");
		System.out.println("����:���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.println("��ǥ:������,��ȣ�� 213-81-52063");
		System.out.println("����:��⵵ ������ �д籸 �д��53���� 11 (����");
		System.out.println("��)");
		System.out.println("================================================");
		System.out.println("          �Һ����߽ɰ濵(CCM) �������");
		System.out.println("        ISO 9001 ǰ���濵�ý��� �������");
		System.out.println("================================================");
		System.out.printf("          ��ȯ/ȯ�� 14��(%s)�̳�,\n", k32_returnDate());	// returnDate�� ���ϴ� �Լ��� 14�� �ĸ� ���� ���
		System.out.println("(����)������, ����ī�� ���� �� ���Ը��忡�� ����");
		System.out.println("        ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.println("          üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.println("================================================");
		System.out.printf("[POS 1058231]               %8s\n", k32_sdt.format(k32_calt.getTime()));	// ���� �ð��� ������ ���·� ���
		System.out.println("================================================");
		System.out.printf("%s%8s%5s%8s\n", k32_subStrByte(k32_itemName1, 26), k32_df.format(k32_price1), 
				k32_df.format(k32_amount1), k32_df.format(k32_total1)); // ĭ�� ���¿� �°� ��ǰ��, �ܰ�, ����, �հ� ���
		System.out.printf("[%s]\n", k32_itemCode1);	// ��ǰ �ڵ� ���
		System.out.printf("%s%8s%5s%8s\n", k32_subStrByte(k32_itemName2, 26), k32_df.format(k32_price2),
				k32_df.format(k32_amount2), k32_df.format(k32_total2));	// ĭ�� ���¿� �°� ��ǰ��, �ܰ�, ����, �հ� ���
		System.out.printf("[%s]\n", k32_itemCode2);	// ��ǰ �ڵ� ���
		System.out.printf("%s%8s%5s%8s\n", k32_subStrByte(k32_itemName3, 26), k32_df.format(k32_price3),
				k32_df.format(k32_amount3), k32_df.format(k32_total3));	// ĭ�� ���¿� �°� ��ǰ��, �ܰ�, ����, �հ� ���
		System.out.printf("[%s]\n", k32_itemCode3);	// ��ǰ �ڵ� ���
		System.out.printf("              �����հ�            %13s\n", k32_df.format(k32_netPrice));	// ���������� ���¿� �°� ���
		System.out.printf("                �ΰ���            %13s\n", k32_df.format(k32_taxPrice));	// ������ ���¿� �°� ���
		System.out.println("------------------------------------------------");
		System.out.printf("�Ǹ��հ�                          %13s\n", k32_df.format(k32_totalSum));	// �� �� (�Һ��ڰ���)�� ���¿� �°� ���
		System.out.println("================================================");
		System.out.printf("�ſ�ī��                          %13s\n", k32_df.format(k32_totalSum));	// �� �� (�Һ��ڰ���)�� ���¿� �°� ���	
		System.out.println("------------------------------------------------");
		System.out.println("�츮ī��                       538720**********");	
		System.out.printf("���ι�ȣ 77982843(0)          ���αݾ� %8s\n", k32_df.format(k32_totalSum));	// �� �� (�Һ��ڰ���)�� ���¿� �°� ���
		System.out.println("================================================");
		System.out.printf("         %10s �д缭����\n", k32_sdt.format(k32_calt.getTime()));	// ���� �ð��� ������ ���·� ���
		System.out.println("��ǰ �� ��Ÿ ���� : 1522-4400");
		System.out.println("����� �� �����̼� ���� ���� : 1599-2211");
		System.out.println("       ||||||||||||||||||||||||||||||||||");
		System.out.println("               2112820610158231");
		System.out.println("------------------------------------------------");
		System.out.println("�� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�");
		System.out.println("  ȸ������ �� �پ��� ������ ����������! ��");

	}
	
	public static String k32_subStrByte(String k32_str, int k32_cutlength) { // ����Ʈ ������ �ڸ��� �Լ��� ����(�Ű�����2>���ڿ� ����(������ ���ڿ�), ������ ����(����Ʈ ũ��)
		StringBuffer k32_subStr = new StringBuffer(k32_cutlength);	//StringBuffer ���� (���ڿ��� �߰��ϰų� ������ �� �ַ� ����ϴ� �ڷ���) 
		for (int k32_i = k32_cutlength - k32_str.getBytes().length; k32_i <= k32_cutlength; k32_i++) {	// ������ ���� i�� cutlength - str.getBytes().length���� cutlength����
			k32_str = k32_str + " ";	// ���� ĭ��ŭ blank �߰�										// 1�� �����ϸ� �ݺ�(for��)
		}

		int k32_nCount = 0;		// ������ ���� nCount ���� �� 0���� �ʱ�ȭ
		for (char k32_ch : k32_str.toCharArray()) {	// ���ڿ� str�� char�� �迭�� �ٲٸ鼭
			k32_nCount += String.valueOf(k32_ch).getBytes().length;	// nCount�� ch�� ���ڿ��� �ٲ� �� ����Ʈ�� ũ�⸦ ���� �� ������
			if (k32_nCount > k32_cutlength)	// nCount�� cutlength���� ũ�� 
				break;	// �׸��Ѵ� (����)
			k32_subStr.append(k32_ch);	// ũ�� ������ subStr�� ch�� �߰��Ѵ�(add)

		}
		  if(k32_subStr.toString().getBytes().length == 19) {	//subStr�� ����Ʈ ũ�Ⱑ 19�� ��
			  k32_subStr.append(" ");	// blank�� �߰��Ѵ�
           }
		return k32_subStr.toString();	// ���ϰ� : subStr
	}

	public static int k32_netPrice(int k32_totalSum, double k32_taxRate) {	//���� ������ ���ϴ� �Լ� ����(�Ű����� 2�� > ������ �Һ��ڰ���, �Ǽ��� ����)
		return (int) (k32_totalSum / (1 + k32_taxRate));	// ���ϰ� : �Һ��ڰ��� / (1+����) > ������ ������ �ø�

	}

	public static String k32_returnDate() {	// ��ȯ/ȯ�� �������ڸ� ���ϴ� �޼ҵ带 ����
		Calendar k32_cal = Calendar.getInstance();	// Calendar Ŭ������ ���� �ð��� ������
		k32_cal.setTime(new Date());	// ���� �ð� setTime �������� ����
		SimpleDateFormat k32_df = new SimpleDateFormat("MM��dd��"); 	// SimpleDateFormat Ŭ������ ��� ���� ���� 
		k32_cal.add(Calendar.DATE, 14);	// ���� �ð��� ��¥�� 14�� ���Ѵ�
		String k32_returnDate = k32_df.format(k32_cal.getTime());	// 14���� ���� ��¥�� returnDate���ڿ��� ���� �� �ʱ�ȭ
		return k32_returnDate;	// ���ϰ� : returnDate

	}
}
