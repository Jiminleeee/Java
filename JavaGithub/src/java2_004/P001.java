package java2_004;

public class P001 {
// if�� / 20220415 / k32_������ / if���� �⺻ ���� ������ // �ּ����� k32_�� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_score = 93;	// ������ ���� score ���� �� 0���� �ʱ�ȭ
		int k32_num = 0;	// ������ ���� num ���� �� 0���� �ʱ�ȭ
		
		if (k32_score > 60) {	// score�� 60���� Ŭ ��, 
			System.out.println("�հ��Դϴ�.");	// ���๮ ���
		}
		
		if (k32_score > 60) {	// score�� 60���� Ŭ ��, 
			System.out.println("�հ��Դϴ�.");	// ���๮ ���
		} else {	// score�� 60���� �� ��
			System.out.println("���հ��Դϴ�.");	// ���๮ ���
		}
		
		if (k32_num > 0) {	// num�� 0���� Ŭ ��, 
			System.out.println("����Դϴ�.");	// ���๮ ���
		} else if (k32_num < 0) {	// num�� 0���� ���� ��
			System.out.println("�����Դϴ�");	// ���๮ ���
		} else {	// ���� �� ���ǽ��� �������� ���� ��
			System.out.println("���Դϴ�.");	// ���๮ ���
		}
		
		if (k32_score >= 90) {	// score�� 90 �̻� �� �� 
			System.out.println("A���");	// ���๮ ���
		} else if (k32_score >= 80 && k32_score < 90) {	// score�� 80�̻� 90�̸��� ��
			System.out.println("B���");	// ���๮ ���
		} else if (k32_score >= 70 && k32_score < 80) {	// score�� 70�̻� 80�̸��� ��
			System.out.println("C���");	// ���๮ ���
		} else {	// ���� 4 ���ǽ��� ��� �������� ���� �� (score�� 69������ ��)
			System.out.println("F���");	// ���๮ ���
		}
	}

}
