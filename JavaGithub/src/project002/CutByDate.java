package project002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CutByDate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ReadFile();

	}

	public static void ReadFile() throws IOException {
		File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\����Ʈ(�Ÿ�)_�ǰŷ���_5��.csv"); // ���� �ҷ�����
		BufferedReader br = new BufferedReader(new FileReader(file)); // ���� �б�
		String readtxt;
		readtxt = br.readLine();

		String[] fieldName = readtxt.split(",");

		String[] year = { "2017", "2018", "2019", "2020", "2021", "2022" };
		String[] month = { "00","01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };

		
		File file1 = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\��å��\\����Ʈ(�Ÿ�)_�ǰŷ���_5��_��å27.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1)); // ���� �����

		while ((readtxt = br.readLine()) != null) { // ���Ͽ� ������ ���� �� �ݺ� ����
			StringBuffer s = new StringBuffer(); // StringBuffer ����
			String[] field = readtxt.split(","); // ������ �������� ���� ���ڿ� �迭�� ����
			String yearList = field[2].substring(0, 4);
			String monthList = field[2].substring(4);

			if ((yearList.equals(year[4]) && monthList.equals(month[2])) &&	Integer.parseInt(field[3]) >= 4
					|| (yearList.equals(year[5]) && monthList.equals(month[4]) && Integer.parseInt(field[3]) <= 30)) {

				s.append(readtxt);

				bw1.write(s.toString()); // ���� ���� ���Ͽ� ���� �߰�
				bw1.newLine(); // ���� ���� ���Ͽ� �� �ٲٱ�

			}

		}
		bw1.close();
	}

}
