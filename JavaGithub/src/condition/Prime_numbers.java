package condition;
import java.util.Scanner;

public class Prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int count = 0;

		for (int i = 2; i <= number; i++) {
			for (int j = 2; j <= number; j++) {	
				if (i % j == 0) {		//�Ҽ� : 1�� �ڱ��ڽŸ��� ����� ���´� 
					count++;		// true > count + 1
				}
			}
			if (count == 1) {		// count=1 > prime number
				System.out.println(i + " ");
			}
			count = 0;		// reset count 
		}

	}

}