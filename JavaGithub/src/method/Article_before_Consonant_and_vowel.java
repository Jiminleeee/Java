package method;

import java.util.Scanner;

public class Article_before_Consonant_and_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String lowerSen = sentence.toLowerCase();
		String target = " a";
		int targetNum = lowerSen.indexOf(target);
		String back = lowerSen.substring(targetNum);
		char[] arr = back.toCharArray();
		char[] vowel = {'a','e','i','o','u'};
		int i = 0;
		
			if (back.contains("an")) {
				//arr[4] = 
	
			}
		
		//System.out.println(back);	
		}
	}

