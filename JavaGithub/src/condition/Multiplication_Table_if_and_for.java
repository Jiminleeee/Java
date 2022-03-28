package condition;

import java.util.Scanner;

public class Multiplication_Table_if_and_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (i < 10) {
					System.out.println(i + "*" + j + "=" + i * j);
				}
			}
		}
	}
}
