package java2_007;

import java.text.DecimalFormat;

public class P002 {
//�������̿��� �ʵ� ���� ���� / 20220420 / k32_������ / �ּ����� k32_���� / substring Ȱ�� / ��������, ���Ϸν�, �������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] k32_OneRec = {
				  "  ����Ȩ SAFE365  1,500,000   2 3,000,000",
				  "  (G)LH��������ȭ     6,900   1     6,900",
				  "  ��������E           5,980   1     6,200",
				  "  ������ ���Ϸ�       3,300   1     3,300",
				  "  ����Ȩ SAFE ��      5,500   2    11,000",
				  "  ��� �Ŷ��120g     3,360   1     3,360",
				  "* (��)��������      6,610   1     6,610",
				  "  ���ѱ� �������     2,750   1     2,750",
				  "* GAP ������ 4-    10,800   1    10,800",
				  "* �� ����� �ٳ�      4,980   1     4,980",
				  "  ����ũ ź�θ�     248,000  10 2,480,000",
				  "  (����)����߰�      7,920   1     7,920",
				  "  DZ�ִϾ�縻3��     4,980   1     4,980",
				  "  DZ�ִϾ�縻3��     4,980   1     4,980",
				  "  �����̾�������      7,130   1     7,130",
				  "  ����ũ ����̿�     3,980   1     3,980",
				  "* ���� ���ִ¿���     4,480   1     4,480",
				  "  ���������÷�1     4,980   1     4,980",
				  "  ��������(��)6     3,210   1     3,210",
				  "  �ɶ�ý� ����       6,950   1     6,950",
				  "  Ǫ���� �̼�����     2,980   2     5,960",
				  "  ���Ϸν�������      1,990   1     3,000",
				  "  CJ ����Ĩ 20G     1,980   1     1,980",
				  "  ����ũ ����̿�     3,980   1     3,980",
				  "  ����� ���� ��      4,480   1     4,480",
				  "* 1+ ��޶� 10��      9,480   2    18,960",
				  "  ������ݺ�����      7,980   1     5,000",
				  "  [Ʈ����]����300       850 500   425,000",
				  "  ��� �𷰽�      15,200   1    15,200",
				  "* �ĸӽ��� �� ��     10,980   1    10,980",
				  "  [���̿��ۺ���]     98,000 100 9,800,000",
				  "* [�õ�][�±�]��     12,800   1    12,800"};
		
		DecimalFormat k32_df = new DecimalFormat("###,###,###,###");
		
		for (int k32_i = 0; k32_i < k32_OneRec.length; k32_i++) {
			//System.out.print(k32_OneRec[k32_i].length() + " ");
			String k32_sumstr = k32_OneRec[k32_i].substring(k32_OneRec[k32_i].length()-10, k32_OneRec[k32_i].length()) + " ";			
			String k32_numberstr = k32_OneRec[k32_i].substring(k32_OneRec[k32_i].length()-14, k32_OneRec[k32_i].length()-10) + " ";
			String k32_pricestr = k32_OneRec[k32_i].substring(k32_OneRec[k32_i].length()-24, k32_OneRec[k32_i].length()-14) + " ";
			String k32_errorstr = k32_OneRec[k32_i].substring(0, k32_OneRec[k32_i].length()-10) + " ";
			int k32_sum = Integer.parseInt(k32_sumstr.replaceAll(",","").trim());
			int k32_number = Integer.parseInt(k32_numberstr.trim());
			int k32_price = Integer.parseInt(k32_pricestr.replaceAll(",", "").trim());
			
			if (k32_sum != k32_price * k32_number) {
				System.out.println("******************************************");
				System.out.printf("����[%s]\n", k32_OneRec[k32_i]);
				System.out.printf("����[%s%9s]\n", k32_errorstr, k32_df.format(k32_price * k32_number));
				System.out.println("******************************************");
				
				
			}
		}
		
		
	}
	
	
		
}
