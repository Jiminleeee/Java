package condition;
import java.util.Scanner;

public class distinguish_input_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int inputnumber = scan.nextInt();

		if (inputnumber == 1) {
			System.out.println("One!");
		} else {
			System.out.println("Not One!");
		}
	}

}
