package java2_004;

public class P005 {
// ������, ������ �� / 20220415 / k32_������ / ���ڴ� ������, �Ǽ��� ����, String�� .equal()�� �� / �ּ����� k32_�� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// ������ ��
		int k32_il; 	// ������ ���� il ����
		double k32_iD;	// �Ǽ��� ���� iD ����

		k32_il = 10 / 3;	// il�� 10 / 3���� �ʱ�ȭ > �������̹Ƿ� 3
		k32_iD = 10 / 3.0;	// iD�� 10 / 3.0���� �ʱ�ȭ > �Ǽ����̹Ƿ� 3.3333

		if (k32_il == k32_iD) System.out.printf("equal\n");  // int�� double�� ������ ����� �Ǽ��� �����̴�
		else System.out.printf("Not equal [%f][%f]\n", (double) k32_il, k32_iD); // ���� �� ������ �ٸ���

		if (k32_iD == 3.333333)	System.out.printf("equal\n");	// ���� ��ȿ���ڱ��� ǥ�õ� �� ������ �ٸ���
		else System.out.printf("Not equal [3.333333][%f]\n", k32_iD);	// not equal�� ��µȴ�

		k32_iD = (int) k32_iD;	// �Ǽ��� ���� iD�� ���������� ��ȯ 
		if (k32_il == k32_iD) System.out.printf("equal\n");		// ���������� ��ȯ�����Ƿ� il�� iD�� ����
		else System.out.printf("Not equal [%f][%f]\n", (double) k32_il, k32_iD); // �ٸ� ��� ���

		System.out.printf("int�� �μ� [%d][%f]\n", k32_il, k32_iD);	// int���� (������)���� �μ�
		System.out.printf("double�� �μ� [%f][%f]\n", (double) k32_il, k32_iD); // double���� (�Ǽ���)���� �μ�

		
	// ������ �� / �ּ����� k32_�� ����
		char k32_a = 'c';	// ������ ���� a�� 'c'�� ����

		if (k32_a == 'b')	// ���� a�� 'b'�̸� (if��)
			System.out.printf("a�� b�̴�\n");	// a�� b�̴� ���
		if (k32_a == 'c')	// ���� a�� 'c'�̸� (if��)
			System.out.printf("a�� c�̴�\n");	// a�� c�̴� ���
		if (k32_a == 'd')	// ���� a�� 'd'�̸� (if��)
			System.out.printf("a�� d�̴�\n");	// // a�� d�̴� ���

		String k32_aa = "abcd";		// ���ڿ� ���� aa�� "abcd"�� ����

		if (k32_aa.equals("abcd"))	// ���� aa�� "abcd"�̸� (if��)
			System.out.printf("aa�� abcd�̴�\n");	// ���� ���� ���
		else	// ���� aa�� "abcd"�� �ƴϸ�
			System.out.printf("aa�� abcd�� �ƴϴ�\n");	// ���� ���� ���

		boolean k32_bb = true;		// ��, ���� ���� bb�� true�� ����

		if (!!k32_bb)	// ���� bb�� ���ߺ����ϸ� (if��) > !�� ����(�ƴϴ�)
			System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�\n");	// ���๮�� ���
		else	// ���ǽĿ� ���� �ʴ� ���
			System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�\n");		// ���� ���� ���
	}

}
