package java2_007;

import java.util.ArrayList;
//Ŭ������ ArrayList
public class P009 {
	static ArrayList<P009_OneRec> k32_ArrayOneRec = new ArrayList <P009_OneRec>();
	
	static int k32_sumkor = 0;
	static int k32_sumeng = 0;
	static int k32_summath = 0;
	static int k32_sumsum = 0;
	static int k32_sumavg = 0;
	static final int k32_iPerson = 20;
	
	public static void main(String[] args) {
		k32_dataSet();
		k32_HeaderPrint();
		for (int k32_i = 0; k32_i < k32_ArrayOneRec.size(); k32_i++) {
			k32_ItemPrint(k32_i);
		}
		k32_TailPrint();
	}
	//������ �����
	public static void k32_dataSet() {
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {
			String k32_name = String.format("����%02d", k32_i);	// �̸� �����
			int k32_kor = (int)(Math.random() * 100);	// ���� ���� �����
			int k32_eng = (int)(Math.random() * 100);	// ���� ���� �����
			int k32_math = (int)(Math.random() * 100);	// ���� ���� �����
			k32_ArrayOneRec.add(new P009_OneRec(k32_i, k32_name, k32_kor, k32_eng, k32_math));
			
		}
	}
	
	
	//��� �μ�
	public static void k32_HeaderPrint() {
		System.out.println("************************************************");
		System.out.printf("%2s %4s %2s %2s %2s %2s      %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.println("************************************************");
	}
	
	//���� �μ�
	public static void k32_ItemPrint(int k32_i) {
		P009_OneRec rec;
		
		rec = k32_ArrayOneRec.get(k32_i);
		System.out.printf("%4d %4s %3d %3d %3d      %3d   %6.2f\n", rec.k32_getStudent_id(), rec.k32_getName(), rec.k32_getKor(), rec.k32_getEng(), rec.k32_getMath(), rec.k32_getSum(), rec.k32_getAvg());
		
		k32_sumkor += rec.k32_getKor();
		k32_sumeng += rec.k32_getEng();
		k32_summath += rec.k32_getMath();
		k32_sumsum += rec.k32_getSum();
		k32_sumavg += rec.k32_getAvg();
	}
	
	//���� �μ�
	public static void k32_TailPrint() {
		System.out.println("************************************************");
		System.out.printf("  �����հ� %d	        ������� : %6.2f\n", k32_sumkor, k32_sumkor/(double)k32_ArrayOneRec.size());
		System.out.printf("  �����հ� %d	        ������� : %6.2f\n", k32_sumeng, k32_sumeng/(double)k32_ArrayOneRec.size());
		System.out.printf("  �����հ� %d	        ������� : %6.2f\n", k32_sumkor, k32_summath/(double)k32_ArrayOneRec.size());
		System.out.println("************************************************");
		System.out.printf("  ������հ� %d	����� : %6.2f\n",k32_sumavg, k32_sumavg/(double)k32_ArrayOneRec.size());
	}
}
