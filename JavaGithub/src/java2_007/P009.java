package java2_007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Ŭ������ ArrayList
public class P009 {
	static ArrayList<P009_OneRec> k32_ArrayOneRec = new ArrayList <P009_OneRec>();
	
	static int k32_sumkor = 0;	// ���� ���� ������ ���� ���� ���� �� 0���� �ʱ�ȭ > �������� ���
	static int k32_sumeng = 0;	// ������ ���� ���� ���� ���� ���� �� 0���� �ʱ�ȭ > �������� ���
	static int k32_summath = 0;	// ������ ���� ���� ���� ���� ���� �� 0���� �ʱ�ȭ > �������� ���
	static int k32_sumsum = 0;	// ������ ���� ���� ���� �� ���� �� 0���� �ʱ�ȭ > �������� ���
	static int k32_sumavg = 0;	// ������ ���� ���� ����� �� ���� �� 0���� �ʱ�ȭ > �������� ���
	static final int k32_iPerson = 20;
	
	public static void main(String[] args) {
		k32_dataSet();	// ������ ����
		k32_dataSort();
		k32_HeaderPrint();	// ��� �μ�
		for (int k32_i = 0; k32_i < k32_ArrayOneRec.size(); k32_i++) {	// ���� �μ�
			k32_ItemPrint(k32_i);
		}
		k32_TailPrint();	// ���� �μ�
	}
	//������ �����
	public static void k32_dataSet() {
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {
			String k32_name = String.format("����%02d", k32_i);	// �̸� �����
			int k32_kor = (int)(Math.random() * 100);	// ���� ���� �����
			int k32_eng = (int)(Math.random() * 100);	// ���� ���� �����
			int k32_math = (int)(Math.random() * 100);	// ���� ���� �����
			k32_ArrayOneRec.add(new P009_OneRec(k32_i, k32_name, k32_kor, k32_eng, k32_math)); 
			// �ϳ��� OneRec Ŭ������ ���� �� array�� ���� ����
		}
	}
	
	
	//��� �μ�
	public static void k32_HeaderPrint() {	// ĭ ���� ��� �μ�
		System.out.println("************************************************");
		System.out.printf("%2s %4s %2s %2s %2s %2s      %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.println("************************************************");
	}
	
	//���� �μ�
	public static void k32_ItemPrint(int k32_i) {
		P009_OneRec rec; // oneRec Ŭ���� �ҷ� ���� 
		
		rec = k32_ArrayOneRec.get(k32_i);	// ���� �ҷ�����
		System.out.printf("%4d %4s %3d %3d %3d      %3d   %6.2f\n", rec.k32_getStudent_id(), rec.k32_getName(), rec.k32_getKor(), 
				rec.k32_getEng(), rec.k32_getMath(), rec.k32_getSum(), rec.k32_getAvg());	// ���¿� ���� ����ϱ�
		
		k32_sumkor += rec.k32_getKor();	// ���� ������ �ҷ��� ���� ���� ������
		k32_sumeng += rec.k32_getEng();	// ���� ������ �ҷ��� ���� ���� ������
		k32_summath += rec.k32_getMath();	// ���� ������ �ҷ��� ���� ���� ������
		k32_sumsum += rec.k32_getSum();	// ���� ������ �ҷ��� ���� �� ������
		k32_sumavg += rec.k32_getAvg();	// ���� ������ �ҷ��� ����� �� ������
	}
	
	//���� �μ�
	public static void k32_TailPrint() {	// �հ� �� ��� ���¿� ���� ����ϱ�
		System.out.println("************************************************");
		System.out.printf("  �����հ� %d	        ������� : %6.2f\n", k32_sumkor, k32_sumkor/(double)k32_ArrayOneRec.size());
		System.out.printf("  �����հ� %d	        ������� : %6.2f\n", k32_sumeng, k32_sumeng/(double)k32_ArrayOneRec.size());
		System.out.printf("  �����հ� %d	        ������� : %6.2f\n", k32_sumkor, k32_summath/(double)k32_ArrayOneRec.size());
		System.out.println("************************************************");
		System.out.printf("  ������հ� %d	����� : %6.2f\n",k32_sumavg, k32_sumavg/(double)k32_ArrayOneRec.size());
	}
	
	public static void k32_dataSort() {
		Comparator<P009_OneRec> k32_bikyeokijun = new Comparator<P009_OneRec>() {
			public int compare(P009_OneRec a1, P009_OneRec a2) {
				return ( a2.k32_getSum() - a1.k32_getSum());
			}
		};
		Collections.sort(k32_ArrayOneRec, k32_bikyeokijun);
	}
}
