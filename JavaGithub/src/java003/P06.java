package java003;

import java.util.Calendar;
import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);
		int inputYear = scanner.nextInt();
		int inputMonth = scanner.nextInt();

		calendar.set(inputYear, inputMonth - 1, 1); // �Է¹��� ���� 1�Ϸ� ����
													// month�� 0�� 1���̹Ƿ� -1�� ���ش�

		int end = calendar.getActualMaximum(Calendar.DATE); // �ش� �� ������ ��¥
		int day = calendar.get(Calendar.DAY_OF_WEEK); // �ش� ��¥�� ����(1:sun ~ 7:sat)

		System.out.println();
		System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat");

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < day; j++) {
					System.out.print("     ");
				}
			}
			if (i < 10) { // ���ڸ����� ��� ���� �߰��� �� ���߱�
				System.out.print(" ");
			}
			System.out.print("  " + i + " ");
			if (day % 7 == 0) { // �� �ٿ� 7�Ͼ� ���
				System.out.println();
			}
			day++;
		}

	}
}
