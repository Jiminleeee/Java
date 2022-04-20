package java2_005;
// ����� import ���
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P006 {
//������ ���(3) / 20220418 / k32_������ / �ּ������� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ǰ���� ���ڿ� �迭�� ���� �� �ʱ�ȭ
		String[] k32_itemName = { "����Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 100cm", "��������E", "���� ���Ϸ� �� �ѷ�", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ��120g*5", "(��)������������", "���ѱ� ������� 156g*4", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��D_WH", "�����̾��������ʹ�", "����ũ ����̿���500g", "���� ���ִ¿���GT ������",
				"���������÷�10��", "��������(��)65*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
				"����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ", "[Ʈ����]����300ml", "��� �𷰽� ��ī���� AAA 24��",
				"�ĸӽ��� �� ���� (2kg/�ڽ�)", "[���̿��ۺ�]����� 50��", "[�õ�][�±�]��귣�� �õ� ����� (31-40) (450g)" };
		int[] k32_price = { 1500000, 6900, 5980, 3300, 5500, 3360, 6610, 2750, 10800, 4980, 248000, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 9480, 7980, 850, 15200, 10980, 98000,
				12800 };	// ������ ������ �迭�� ���� �� �ʱ�ȭ
		int[] k32_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 500, 1, 1, 100, 1 };	// ������ ������ �迭�� ���� �� �ʱ�ȭ
		boolean[] k32_taxFree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				false, false, true, false, true };	// ����� ���θ� ���� �ڷ����� boolean�� �迭�� ���� �� �ʱ�ȭ
		int k32_taxFreeTotal = 0, k32_totalSum = 0, k32_netPrice, k32_taxPrice;	// ������ ���� �鼼��ǰ �հ�, ������ǰ �հ�, �� �հ踦 ���� �� 0���� �ʱ�ȭ
		double k32_taxRate = 0.1;	// �Ǽ��� ���� ������ ���� �� 0.1�� �ʱ�ȭ (10%)				// �������� �� ������ ����

		DecimalFormat k32_df = new DecimalFormat("###,###,###,###,###");	// DecimalFormat Ŭ���� ��������, ���� �����ϱ�
		Calendar k32_calt = Calendar.getInstance();	// Calendar Ŭ������ ���� �ð��� ������
		SimpleDateFormat k32_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");	// SimpleDateFormat Ŭ������ ��� ���� ���� 
		// ������ ���, ĭ ���߱�
		System.out.println("           �̸�Ʈ ������ (031)888-1234");
		System.out.println("   emart   206-86-50913 ����");
		System.out.println("           ���� ������ ������� 552");
		System.out.println();
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.println("���Ϻ� �귣����� ����(���� ����������)");
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.println();
		System.out.printf("[����]%9s      POS:0011-9861\n", k32_sdt.format(k32_calt.getTime()));	// ���� �ð��� ������ ���·� ���
		System.out.println("-----------------------------------------");
		System.out.printf("%7s%14s%5s%5s\n" , "�� ǰ ��", "�� ��", "����", "�� ��");
		System.out.println("-----------------------------------------");
		for (int k32_i = 0; k32_i < k32_itemName.length; k32_i++) {	// ������ ���� i�� 0���� ��ǰ�� ����-1 ��ŭ 1�� �����ϸ� �ݺ� (for��)
			if (k32_taxFree[k32_i] == true) {	// ����� ���ΰ� true ���
				System.out.printf("%-2s", "*");	// �׸� �տ� * ���
			} else {	// false���
				System.out.printf("%-2s", " ");	// ��ĭ
			}
			System.out.printf("%s%10s%4s%10s\n", k32_subStrByte(k32_itemName[k32_i], 15),
				k32_df.format(k32_price[k32_i]), k32_df.format(k32_num[k32_i]),
				k32_df.format(k32_price[k32_i] * k32_num[k32_i]));	// ��ǰ���� �Լ��� ����� 15����Ʈ�� �ڸ���, �ܰ�, ����, �ݾ��� ���Ŀ� �°� ���
						
			if ((k32_i + 1) % 5 == 0) {	// ������ ���� i+1�� 5�� ���� �������� 0�̶�� (5�� ����) 
				System.out.println("-----------------------------------------");	// ���м� ���
			} 
		}

		for (int k32_i = 0; k32_i < k32_itemName.length; k32_i++) {	// ������ ���� i�� 0���� ��ǰ�� ����-1 ��ŭ 1�� �����ϸ� �ݺ� (for��)
			if (k32_taxFree[k32_i] == true) {	// ����� ���ΰ� true ���
				k32_taxFreeTotal += k32_price[k32_i] * k32_num[k32_i];	// ����� ��ǰ���� �հ�
			}
		}

		for (int k32_i = 0; k32_i < k32_itemName.length; k32_i++) {	// ������ ���� i�� 0���� ��ǰ�� ����-1 ��ŭ 1�� �����ϸ� �ݺ� (for��)
			k32_totalSum += k32_price[k32_i] * k32_num[k32_i];	// �� �հ�
		}

		k32_netPrice = k32_netPrice(k32_totalSum, k32_taxFreeTotal, k32_taxRate);	// �Һ��� ������ �Լ��� ����� ���Ѵ�. 
		k32_taxPrice = k32_totalSum - k32_netPrice - k32_taxFreeTotal;	// ������ �� �հ迡�� �Һ��ڰ��ݰ� �鼼 ��ǰ�� ������ �� ��

		System.out.println();
		System.out.printf("               �� ǰ�� ����  %12s\n", k32_itemName.length);	// ������ ���¿� �°� ���
		System.out.printf("            (*)�� ��  �� ǰ  %12s\n", k32_df.format(k32_taxFreeTotal));	// �鼼 ��ǰ�� ������ ���¿� �°� ���
		System.out.printf("               �� ��  �� ǰ  %12s\n", k32_df.format(k32_netPrice));	// ���� ��ǰ�� ������ ���¿� �°� ���
		System.out.printf("               ��   ��   ��  %12s\n", k32_df.format(k32_taxPrice));	// ������ ���¿� �°� ���
		System.out.printf("               ��        ��  %12s\n", k32_df.format(k32_totalSum));	// �� �հ踦 ���¿� �°� ���
		System.out.printf("�� �� �� �� �� ��            %12s\n", k32_df.format(k32_totalSum));	// �� �հ踦 ���¿� �°� ���
		System.out.println("-----------------------------------------");
		System.out.println("0012 KEB �ϳ�       541707**0484/35860658");
		System.out.printf("ī�����(IC)          �Ͻú� / %10s\n", k32_df.format(k32_totalSum));	// �� �հ踦 ���¿� �°� ���
		System.out.println("-----------------------------------------");
		System.out.println("             [�ż�������Ʈ ����]");
		System.out.println("��*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("��ȸ�߻�����Ʈ     %12s%10s\n", "9350**9995", k32_df.format(k32_thisPoint(k32_totalSum)));
		System.out.printf("����(����)����Ʈ      %8s%s\n", k32_df.format(k32_totalPoint(k32_totalSum)), "(    5,473)");
		System.out.println("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.println("-----------------------------------------");
		System.out.println("    ���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("������ȣ                %16s\n", "32��****");
		System.out.printf("�����ð�              %5s\n", k32_parkingTime());	// ���� �ð��� ���ϴ� �Լ��� ���� �ð��� ���� ���
		System.out.println("-----------------------------------------");
		System.out.printf("ĳ��:084599 ��00         %16d\n", 1150);
		System.out.println("     ||||||||||||||||||||||||||||||||||");
		System.out.println("     ||||||||||||||||||||||||||||||||||");
		System.out.println("        20220419/00119861/00164980/31");

	}

	public static String k32_subStrByte(String k32_str, int k32_cutlength) { // ����Ʈ ������ �ڸ��� �Լ��� ����(�Ű�����2>���ڿ� ����(������ ���ڿ�), ������ ����(����Ʈ ũ��)
		StringBuffer k32_subStr = new StringBuffer(k32_cutlength);	//StringBuffer ���� (���ڿ��� �߰��ϰų� ������ �� �ַ� ����ϴ� �ڷ���) 
		for (int k32_i = k32_cutlength - k32_str.getBytes().length; k32_i <= k32_cutlength; k32_i++) {	// ������ ���� i�� cutlength - str.getBytes().length���� cutlength����
			k32_str = k32_str + " ";	// ���� ĭ��ŭ blank �߰�										// 1�� �����ϸ� �ݺ�(for��)
		}

		int k32_nCount = 0;		// ������ ���� nCount ���� �� 0���� �ʱ�ȭ
		for (char k32_ch : k32_str.toCharArray()) {	// ���ڿ� str�� char�� �迭�� �ٲ㼭 �ϳ��� �߰�(for��)
			k32_nCount += String.valueOf(k32_ch).getBytes().length;	// nCount�� ch�� ���ڿ��� �ٲ� �� ����Ʈ�� ũ�⸦ ���� > �������� ����
			if (k32_nCount > k32_cutlength)	// nCount�� cutlength���� ũ�� 
				break;	// �׸��Ѵ� (����)
			k32_subStr.append(k32_ch);	// ũ�� ������ subStr�� ch�� �߰��Ѵ�(add)

		}
		  if(k32_subStr.toString().getBytes().length == (k32_cutlength - 1)) {	//subStr�� ����Ʈ ũ�Ⱑ �ڸ� ũ�� ���� 1 ���� ��
			  k32_subStr.append(" ");	// blank�� �߰��Ѵ�
           }
		return k32_subStr.toString();	// ���ϰ� : subStr (���ڿ��� �� ��
	}

	public static int k32_netPrice(int k32_totalSum, int k32_taxFreeTotal, double k32_taxRate) {	//���� ������ ���ϴ� �Լ� ����(�Ű����� 3�� > ������ �� �հ� �� �鼼��ǰ ����, �Ǽ��� ����)
		return (int) ((k32_totalSum - k32_taxFreeTotal) / (1 + k32_taxRate));	// ���ϰ� : (����-�鼼��ǰ ����) / (1+����) > ������ ������ �ø�

	}

	public static String k32_parkingTime() {	// ���� �ð��� ���ϴ� �Լ��� ���� (���Ƿ� 1�ð� ������ ���Ѵ�)
		Calendar k32_cal = Calendar.getInstance();	// Calendar Ŭ������ ���� �ð��� ������
		k32_cal.setTime(new Date());	// ���� �ð� setTime �������� ����
		SimpleDateFormat k32_df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");	// SimpleDateFormat Ŭ������ ��� ���� ���� 
		k32_cal.add(Calendar.HOUR, -1);	// ����ð����� 1�ð��� ����
		String k32_parkingTime = k32_df.format(k32_cal.getTime());	// 1�ð��� �� �ð��� ���ڿ��� ���� �� �ʱ�ȭ
		return k32_parkingTime;	//���ϰ� : parkingTime

	}
	
	public static int k32_thisPoint(int k32_totalSum) {
		return (int) (k32_totalSum * 0.001);
	}
	
	public static int k32_totalPoint (int k32_totalSum) {
		return (int) (k32_totalSum * 0.001) + 5473;
	}

}
