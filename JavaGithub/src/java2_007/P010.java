package java2_007;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class P010 {
// �� ������ ���� ����ǥ /
	static ArrayList<P009_OneRec> k32_ArrayOneRec = new ArrayList <P009_OneRec>();	// ArrayList ����
	static int k32_sumKorCurrent = 0;	// ���� �������� ���� ������ ��
	static int k32_sumEngCurrent = 0;	// ���� �������� ���� ������ ��
	static int k32_sumMathCurrent = 0;	// ���� �������� ���� ������ ��
	static int k32_sumSumCurrent = 0;	// ���� �������� ���� ������ ��
	static double k32_sumAvgCurrent = 0;	// ���� �������� ���� ����� ���� �� 
	static int k32_sumKorTotal = 0;		// ���� ������ ���� ������ ��
	static int k32_sumEngTotal = 0;		// ���� ������ ���� ������ ��
	static int k32_sumMathTotal = 0;	// ���� ������ ���� ������ ��
	static int k32_sumSumTotal = 0;		// ���� ������ ���� ������ ��
	static double k32_sumAvgTotal = 0;	// ���� ������ ����� ���� ��
	
	static int k32_count = 0; // �ο� �� ���� ī����
	
	static final int k32_iPerson = 200;	// �� �ο� �� 
	static final int k32_pgPerson = 30;	// ������ �ο� �� 
	static int k32_currentPgPerson = 0; //���� ������ �ο� ��
	static int k32_currentStackpgPerson = 0; // ���� �������� ���� �ο� ��
	
	static int k32_totalPg = 0; 	// ��ü ������ ��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k32_dataSet();	// ������ ����� �Լ�
		k32_dataSort();	// ������ ���� �Լ� 
		for (int k32_i = 0; k32_i < k32_totalPg; k32_i++) {	// ��ü ������ ����ŭ 1�� �����ϸ� �ݺ�
			k32_Header(k32_i);	// ��� �κ� �Լ� 
			
			for (int k32_j = 0; k32_j < k32_currentPgPerson; k32_j ++) {	// ���� ������ ��� �� ��ŭ 1�� �����ϸ� �ݺ�
				k32_ItemPrint(k32_j);	// ���� �Լ� 
			}	
			k32_TailPrint();	// ������ �κ� �Լ� 
		}
		
		
	}
	
	public static void k32_dataSet() {
		for (int k32_i = 1; k32_i <= k32_iPerson; k32_i++) {	// ��ü �ο�����ŭ 1�� �����ϸ� �ݺ� (for��)
			String k32_name = String.format("����%03d", k32_i);	//���ڿ� �̸�����, 1������ �����̶� + 1
			//���� �Լ��� 0�̻� ~ 1�̸��� double�� ���� �������� ����, 0���� 100���̸� ��������� ���ϱ� 100�ǽ�
			int k32_kor = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			int k32_eng = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			int k32_math = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			// ������ ������ ������ �޴� �ٸ� Ŭ������ �޼ҵ�� ����, ���ڿ� 1���� ������ 1������ �����̱� �����̴�.
			k32_ArrayOneRec.add(new P009_OneRec(k32_i, k32_name, k32_kor, k32_eng, k32_math)); 
			// �ϳ��� OneRec Ŭ������ ���� �� array�� ���� ����
			// �� ������ ���
			if (k32_iPerson % k32_pgPerson == 0) {	// ��ü �ο� �� % ������ �ο��� = 0 �̸�
				k32_totalPg = k32_iPerson / k32_pgPerson;	// ��ü ������ = ��ü �ο��� / ������ �ο� �� 
			} else {	// 0�� �ƴϸ�
				k32_totalPg = (k32_iPerson / k32_pgPerson) + 1;	// ��ü ������ = ��ü �ο��� / ������ �ο� �� +1
			}
			
		}
	}
	
	public static void k32_Header(int k32_i) {	// ��� �κ� �Լ� ����
		SimpleDateFormat k32_format1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");	// ��¥ ���� ����
		Date k32_time = new Date();	// ���� ��¥ �ҷ�����
		String k32_time1 = k32_format1.format(k32_time);	// ���� ��¥ ���¿� �°� ���ڿ� ����
		
		System.out.printf("PAGE: %d             ������� :"  + k32_time1 + "\n", k32_i + 1);	//���� ������(0�̶� + 1)�� ��¥�� ����Ѵ�.
		System.out.println("=================================================");
		System.out.printf("%-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s\n","��ȣ","�̸�","����","����","����","����","���");	//���� ���
		System.out.println("=================================================");
		
		//�������� �ο� �� ����
		if (k32_i +1 == k32_totalPg) {	//������ ���������
			if (k32_iPerson % k32_pgPerson == 0) {	// ��ü �ο� �� % ������ �ο��� = 0 �̸�
				k32_currentPgPerson = k32_pgPerson;	// ���� ������  = ������ �ο� �� 
			} else { // 0�� �ƴ϶��
				k32_currentPgPerson = k32_iPerson % k32_pgPerson;	// ���� ������ = ��ü �ο� �� % ������ �ο� �� 
			}
		} else {	// ������ �������� �ƴ϶��
			k32_currentPgPerson = k32_pgPerson;	// ���� ������ �ο� �� = ������ �ο� �� 
		}
		
		//�������� ���� �ο� ���
		k32_currentStackpgPerson +=  k32_currentPgPerson;
	}

	public static void k32_ItemPrint(int k32_i) {	// ���� �Լ� 
		P009_OneRec k32_rec;	// Ŭ���� �ҷ����� 
		
		k32_rec = k32_ArrayOneRec.get(k32_i);	// ���� �ҷ�����
		System.out.printf("%03d %5.5s  %3d     %3d    %3d    %3d    %.2f\n", 	// ���¿� �°� ���
				k32_rec.k32_getStudent_id(), k32_rec.k32_getName(), k32_rec.k32_getKor(),
				k32_rec.k32_getEng(), k32_rec.k32_getMath(), k32_rec.k32_getSum(), k32_rec.k32_getAvg());
		
		// ���������� ������ ��� ���Ѵ�
		k32_sumKorCurrent += k32_rec.k32_getKor();	k32_sumKorTotal += k32_rec.k32_getKor();
		k32_sumEngCurrent += k32_rec.k32_getEng();	k32_sumEngTotal += k32_rec.k32_getEng();
		k32_sumMathCurrent += k32_rec.k32_getMath();	k32_sumMathTotal += k32_rec.k32_getMath();
		k32_sumSumCurrent += k32_rec.k32_getSum();	k32_sumSumTotal += k32_rec.k32_getSum();
		k32_sumAvgCurrent += k32_rec.k32_getAvg();	k32_sumAvgTotal += k32_rec.k32_getAvg();
		
		k32_count++;	// �ο� �� ī��Ʈ 1 ����
	}
	
	public static void k32_TailPrint() {	// �հ� �κ�, ������ �κ� �Լ� 
		System.out.println("=================================================");
		
		System.out.println("����������");
		//���� �������� ���� �������� �����ش�. 
		System.out.printf("%-2.2s         %4d   %4d   %4d   %4d   %.2f\n", "�հ�",k32_sumKorCurrent,
				k32_sumEngCurrent, k32_sumMathCurrent, k32_sumSumCurrent, k32_sumAvgCurrent);
		
		//���� �������� ���� ����� �����ش�. 
		System.out.printf("%-2.2s        %4.2f  %4.2f  %4.2f  %4.2f   %.2f\n", "���",(double) k32_sumKorCurrent / k32_currentPgPerson,
				(double) k32_sumEngCurrent / k32_currentPgPerson, (double) k32_sumMathCurrent / k32_currentPgPerson,
				(double) k32_sumSumCurrent / k32_currentPgPerson, (double) k32_sumAvgCurrent / k32_currentPgPerson);
		
		System.out.println("=================================================");
		
		//���ݱ��� �������� ���� �������� �����ش�. 
		System.out.println("����������");
		System.out.printf("%-2.2s        %4d    %4d   %4d   %4d   %.2f\n", "�հ�",k32_sumKorTotal,
				k32_sumEngTotal, k32_sumMathTotal, k32_sumSumTotal, k32_sumAvgTotal);
		
		//���ݱ��� �������� ���� ����� �����ش�. 
		System.out.printf("%-2.2s       %4.2f   %4.2f   %4.2f  %4.2f  %.2f\n\n\n", "���",(double) k32_sumKorTotal / k32_currentStackpgPerson,
				(double) k32_sumEngTotal / k32_currentStackpgPerson, (double) k32_sumMathTotal / k32_currentStackpgPerson,
				(double) k32_sumSumTotal / k32_currentStackpgPerson, (double) k32_sumAvgTotal / k32_currentStackpgPerson);
		
		// ���� ������ �հ� �ʱ�ȭ
		k32_sumKorCurrent = 0;
		k32_sumEngCurrent = 0;
		k32_sumMathCurrent = 0;
		k32_sumSumCurrent = 0;
		k32_sumAvgCurrent = 0;
		
		
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

