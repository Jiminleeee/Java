package java2_008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P002 {
//Buffered �а� ���� / 20220421 / k32_������ / �ּ����� k32_����

	public static void FileWrite() throws IOException { // IOException ��� Ư�̻����� ����������(throw)
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\����_��ȭ\\8��\\Mytest.txt"); // ���� ����
		BufferedWriter k32_bw = new BufferedWriter(new FileWriter(k32_f));	// ���� ���� �߰�
		// �Ʒ��� ���� ������ ������ �߰��Ѵ�
		k32_bw.write("�ȳ� ����");	
		k32_bw.newLine();	// �� �� ����
		k32_bw.write("hello ���");
		k32_bw.newLine();

		k32_bw.close();	// ������ �ݴ´�. > close�� ���ϸ� ��� ������ ���� �־� ���� �Ұ���

	}

	public static void FileRead() throws IOException { // IOException ��� Ư�̻����� ����������(throw)
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\��ȭ\\����_��ȭ\\8��\\Mytest.txt");	// ���� ����
		BufferedReader k32_br = new BufferedReader(new FileReader(k32_f));	// ������ �б�

		String k32_readtxt;	// ���� ������ ���� ���� ������ ���ڿ� ���� ����

		while ((k32_readtxt = k32_br.readLine()) != null) {	// ���� ������ ��� �����ϸ� (null�� �ƴϸ�) > readLine�� �� �� ������ �д´�
			System.out.printf("%s\n", k32_readtxt);	// ���� ������ ���
		}

		k32_br.close();	// ������ �ݴ´�. > close�� ���ϸ� ��� ������ ���� �־� ���� �Ұ���
	}

	public static void main(String[] args) throws IOException {	// IOException ��� Ư�̻����� ����������(throw)
		// TODO Auto-generated method stub
		FileWrite();	// ������ ����� �Լ�
		FileRead();		// ������ �д� �Լ� 
	}

}
