package java011;

import java.util.Arrays;
import java.util.Scanner;

public class P001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� ���ڿ��� �Է��ϼ��� (��ҹ��� ����)");
		String text1 = sc.next();
		System.out.println("�� ��° ���� ���ڿ��� �Է��ϼ��� (��ҹ��� ����)");
		String text2 = sc.next();
		
		StringtoChar(text1);
		StringtoChar(text2);
		
		StringCompare(StringtoChar(text1), StringtoChar(text2));
		
	}
	
	public static String StringtoChar(String text) {
		char[] stringtoChar = text.toCharArray();
		Arrays.sort(stringtoChar);
		String sortedString = new String (stringtoChar);
		return sortedString;
	}
	
	public static void StringCompare(String textOne, String textTwo) {
		if (textOne.equals(textTwo)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
