package java004;

import java.util.Arrays;
import java.util.Scanner;

public class P01 {
	
	static int N, wantSum;
	static int[] result;
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input dice number");
		N = sc.nextInt();
		System.out.println("Please input sum");
		wantSum = sc.nextInt();
		result = new int[N]; // ������� ������ �迭
		int diceNum = 0;

		Calculate(diceNum);

	}

	public static void Calculate(int diceNum) {
		if (diceNum == N) { // N��° �ֻ����� ����
			for (int i = 0; i < N; i++) { // ��� �ֻ����� ���� ����
				sum += result[i];
			}
			if (sum == wantSum) { // �ֻ����� ���� ���� ���ϴ� �հ� ���� �� ���
				System.out.println(Arrays.toString(result));
				return;
			} else {
				sum = 0;
			}
		} else {
			for (int i = 1; i <= 6; i++) {
				result[diceNum] = i; // n�� �ֻ����� i �� �ο�
				diceNum = diceNum + 1; // n+1�� �ֻ����� �Ѿ

				Calculate(diceNum); // n+1�� �ֻ����� ���Ͽ� ���ȣ��

				diceNum = diceNum - 1; // �ٽ� n�� �ֻ����� ���ƿ�
				result[diceNum] = 0; // ���������� �ǵ���
			}
		}
	}
}
