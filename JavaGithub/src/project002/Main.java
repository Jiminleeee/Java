package project002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ReadFile();

	}

	public static void ReadFile() throws IOException {
		File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\����Ʈ(�Ÿ�)_�ǰŷ���_5��.txt"); // ���� �ҷ�����
		BufferedReader br = new BufferedReader(new FileReader(file)); // ���� �б�
		String readtxt;
		readtxt = br.readLine();

		String[] fieldName = readtxt.split("\t");

		String[] year = { "2017", "2018", "2019", "2020", "2021", "2022" };
		String[] month = { "01", "02", "03", "04", "05", "06", "08", "09", "10", "11", "12" };
		

		File file1 = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\����Ʈ(�Ÿ�)_�ǰŷ���_5��_��å1.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1)); // ���� �����

		while ((readtxt = br.readLine()) != null) { // ���Ͽ� ������ ���� �� �ݺ� ����
			StringBuffer s = new StringBuffer(); // StringBuffer ����
			String[] field = readtxt.split("\t"); // ������ �������� ���� ���ڿ� �迭�� ����
			String yearList = field[2].substring(0, 4);
			String monthList = field[2].substring(4);

			if ((yearList.equals(year[0]) && monthList.equals(month[4]))
					|| (yearList.equals(year[0]) && monthList.equals(month[5]) && Integer.parseInt(field[3]) >= 1
							&& Integer.parseInt(field[3]) <= 18)) {

				s.append(readtxt);

				bw1.write(s.toString()); // ���� ���� ���Ͽ� ���� �߰�
				bw1.newLine(); // ���� ���� ���Ͽ� �� �ٲٱ�

			}

			
		}
		bw1.close();
	}

	

	
}
