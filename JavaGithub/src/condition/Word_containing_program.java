package condition;
import java.util.Scanner;

public class Word_containing_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		if (text.contains("car") == true) {
			System.out.println("car is included in the input string");
		} else {
			System.out.println("car is not included in the input string");
		}

		System.out.println(text);

	}

}
