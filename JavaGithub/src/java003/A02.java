package java003;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int positive = 0, negative = 0, odd = 0, even = 0;
		while (true) {
			int inputNumber = scanner.nextInt();
			if (inputNumber > 0) { // ���
				positive++;
			} else if (inputNumber < 0) { // ���� (0�� ����� ������ �ƴϴ�.)
				negative++;
			}
			if (inputNumber % 2 == 0) { // ¦��
				even++;
			} else { // Ȧ��
				odd++;
			}
			System.out.println("P - " + positive + ", N - " + negative + ", O - " + odd + ", E - " + even);
		}
	}

}
