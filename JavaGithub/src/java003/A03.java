package java003;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int cnt[] = new int[26];	// ���ĺ��� ��� 26��(�빮�� only)
			Scanner scan = new Scanner(System.in); 
			String str = scan.nextLine(); // String(���ڿ�)���� �޴´�.
			for (int i = 0; i < str.length(); i++) {	
				char ch = str.toUpperCase().charAt(i);	// ���ڿ��� ��� ���ڸ� �빮�ڷ� ��ȯ
				if (Character.isLetter(ch))	// ch�� letter������ �Ǵ��ϴ� �Լ�
					cnt[ch - 'A']++;	// �빮�ڷ� �ٲ� ���ĺ��� cnt[]�� �ٽ� ����
			}
			for (int i = 0; i < 26; i++) {
				if (cnt[i] > 0) {	// ���ĺ��� �ִ� �͸� ���
					System.out.println((char) (65 + i) + " - " + cnt[i]);
				}
			}
	}

}
