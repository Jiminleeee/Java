package project002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PricePerSquare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\��å��\\����Ʈ(�Ÿ�)_�ǰŷ���_5��_��å1.csv"); // ���� �ҷ�����
		BufferedReader br = new BufferedReader(new FileReader(file)); // ���� �б�
		String readtxt;
		readtxt = br.readLine();

		String[] fieldName = readtxt.split(",");

		File file1 = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\��å��\\����Ʈ(�Ÿ�)_�ǰŷ���_5��_��å1_����.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1)); // ���� �����

		while ((readtxt = br.readLine()) != null) { // ���Ͽ� ������ ���� �� �ݺ� ����
			StringBuffer s = new StringBuffer(); // StringBuffer ����
			String[] field = readtxt.split(","); // ������ �������� ���� ���ڿ� �迭�� ����
			double price =   (Double.parseDouble(field[4]) / Double.parseDouble(field[1]) / 3.3 * 10000);
			s.append(readtxt + price);

			bw1.write(s.toString()); // ���� ���� ���Ͽ� ���� �߰�
			bw1.newLine(); // ���� ���� ���Ͽ� �� �ٲٱ�

		}
		bw1.close();

	}

}
