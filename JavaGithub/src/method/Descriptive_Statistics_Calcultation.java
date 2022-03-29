package objective;

import java.util.Scanner;

public class Descriptive_Statistics_Calcultation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int mean = 0, max = 0, min = 0;
		int count = 1;

		while (true) {
			int inputNumber = scanner.nextInt(); // ���� �Է��� ������ �޴´� > while�� ������

			if (count == 1) { // ó�� ���ڸ� �Է�

				mean = (mean + inputNumber) / 1;
				max = Math.max(inputNumber, inputNumber);
				min = Math.min(inputNumber, inputNumber);

			} else { // �ι�° �Էº��ʹ� ���� ����� �ݿ��Ѵ�.
				mean = (mean * (count - 1) + inputNumber) / count;
				max = Math.max(max, inputNumber);
				min = Math.min(min, inputNumber);
			}
			System.out
					.println("Result : " + count + " - " + "Mean " + mean + ", " + "Max " + max + ", " + "Min " + min);
			count++;
		}

	}

}
