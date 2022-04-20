package java2_007;

import java.util.Arrays;
//�ѱ� ��� / 20220420 / k32_������ / �ּ����� k32_���� / getBytes().length�� length Ȱ���ϱ�
public class P001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("HanBlankForeword[%s]\n", k32_HanBlankForeword("�ѱ�abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", k32_HanBlankForeword("�ѱ��ѱ�aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", k32_HanBlankBackword("�ѱ�aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", k32_HanBlankBackword("�ѱ��ѱ�aa", 15));
		System.out.printf("�ѱ��� [%d]��\n", k32_HanCount("�ѱ��ѱ�aa"));
	}

	public static String k32_HanBlankForeword(String k32_str, int k32_number) { // String �޼ҵ� ����
		String k32_strBlank = "";	// blank ���ڿ��� ���� �� �ʱ�ȭ
		for (int k32_i = 0; k32_i < k32_number; k32_i++) {	// number��ŭ ���� ���� i�� 1�� �����ϸ� �ݺ� (for��) > number�� ���ڿ��� �� ���̸� �ǹ�
			if (k32_i < k32_number - k32_str.getBytes().length) {	// �� ���̿��� str�� ����Ʈ�� ���̸� �� ��ŭ
				k32_strBlank += " ";	// ������ �߰��Ѵ�
			}
		}
		return k32_strBlank + k32_str;	// ���� �� : ���� + �־��� ���ڿ�

	}

	public static String k32_HanBlankBackword(String k32_str, int k32_number) {	// String �޼ҵ� ����
		String k32_strBlank = "";	// blank ���ڿ��� ���� �� �ʱ�ȭ
		for (int k32_i = 0; k32_i < k32_number; k32_i++) {	// number��ŭ ���� ���� i�� 1�� �����ϸ� �ݺ� (for��) > number�� ���ڿ��� �� ���̸� �ǹ�
			if (k32_i < k32_number - k32_str.getBytes().length) {	// �� ���̿��� str�� ����Ʈ�� ���̸� �� ��ŭ
				k32_strBlank += " ";	// ������ �߰��Ѵ�
			}
		}
		return k32_str + k32_strBlank;	// ���ϰ� : �־��� ���ڿ� + ����
	}

	public static int k32_HanCount(String k32_str) {	// �ѱ��� ������ ���� int �޼ҵ� ����
		return k32_str.getBytes().length - k32_str.length();	// ���ϰ� : ���ڿ��� ����Ʈ�� ���̿��� ���ڿ��� ���̸� �� �� > �ѱ��� �ѱ��ڰ� 2����Ʈ
	}
}
