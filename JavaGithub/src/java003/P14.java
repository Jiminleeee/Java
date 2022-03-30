package java003;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String lowerSen = sentence.toLowerCase();
		String target = " a";
		int targetNum = lowerSen.indexOf(target);
		String back = lowerSen.substring(targetNum);
	
		char[] vowel = {'a','e','i','o','u'};
		int i = 0;
		
			if (back.charAt(2) == 'n') {
				// 
	
			}
		
		System.out.println(back);	
		}
	}

