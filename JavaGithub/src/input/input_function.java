package input;

import java.util.Scanner;

public class input_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the 1st number!");
		int input1 = scan.nextInt();		//int이므로 nextInt로 받는다.
		
		System.out.println("Input the 2nd number!");
		int input2 = scan.nextInt();
		
		int sum = input1 + input2;
		
		System.out.printf("Result : %d + %d = %d", input1, input2, sum);
	}

}
