package project002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PriceAverage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\��å��\\����Ʈ(�Ÿ�)_�ǰŷ���_5��_��å1_����.csv"); // ����
																													// �ҷ�����
		BufferedReader br = new BufferedReader(new FileReader(file)); // ���� �б�
		String readtxt;
		readtxt = br.readLine();

		String[] fieldName = readtxt.split(",");
		int sum = 0;
		int count = 0;
		double average = 0;
		
		File file1 = new File(
				"C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\��å��\\����Ʈ(�Ÿ�)_�ǰŷ���_5��_��å1_��հ���(������).csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1)); // ���� �����
		
		while ((readtxt = br.readLine()) != null) { // ���Ͽ� ������ �����ϸ� (null�� �ƴϸ�)
			String[] field = readtxt.split(","); // ���ڿ� �迭 �ʵ� ������ �����ϰ� ���� ������ ��ĭ ������ �ڸ���
			if (field[0].contains("������")) {
				StringBuffer s = new StringBuffer();
				sum += Integer.parseInt(field[6]);
				count++;
				s.append(readtxt);

				bw1.write(s.toString()); // ���� ���� ���Ͽ� ���� �߰�
				bw1.newLine(); // ���� ���� ���Ͽ� �� �ٲٱ�

			}

		}
		average = sum / count;
		bw1.write(String.valueOf(average));
		bw1.close();
	}
}
