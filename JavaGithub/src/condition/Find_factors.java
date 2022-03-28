package condition;
import java.util.Scanner;

public class Find_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int inputnumber = scanner.nextInt();
		int i = 2;

		System.out.println("1");
		while (i <= inputnumber) {
			if (inputnumber % i == 0) {
				System.out.println(i);
				inputnumber /= i;
			} else {
				i++;
			}
		}
	}

}
