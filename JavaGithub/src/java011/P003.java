package java011;

import java.util.Scanner;

public class P003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("1ȸ ���Ծ��� �Է��ϼ��� (����:��)");
		int pmt = sc.nextInt();
		System.out.println("�� ���� Ƚ���� �Է��ϼ���");
		int nper = sc.nextInt();
		System.out.println("������ �Է��ϼ��� (���� %)");
		double rate = sc.nextDouble();
		System.out.println("Ÿ���� �Է��ϼ��� : 1");
		int type = sc.nextInt();
		
		double sum = 0;

		for (; nper > 0; nper--) {
			sum += Math.pow((1 + rate / 100), nper) * pmt;

		}

		System.out.println("fv(�̷���ġ) : " + sum + "��");
	}

}
