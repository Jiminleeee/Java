package project002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PriceSquare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\��å��\\����Ʈ(�Ÿ�)_�ǰŷ���_5��_��å1.csv"); // ����
		// �ҷ�����
		BufferedReader br = new BufferedReader(new FileReader(file)); // ���� �б�
		String readtxt;
		readtxt = br.readLine();

		String[] fieldName = readtxt.split(",");

		float square = 0, average = 0;
		int cost = 0;

		//String[] district = { "������", "������", "���ϱ�", "������", "���Ǳ�", "������", "���α�", "��õ��", "�����", "������", "���빮��", "���۱�",
				//"������", "���빮��", "���ʱ�", "������", "���ϱ�", "���ı�", "��õ��", "��������", "��걸", "����", "���α�", "�߱�", "�߶���" };

		File file1 = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\��å��\\����Ʈ(�Ÿ�)_�ǰŷ���_5��_��հ���.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1, true)); // ���� �����
		
		while ((readtxt = br.readLine()) != null) { // ���Ͽ� ������ �����ϸ� (null�� �ƴϸ�)

			String[] field = readtxt.split(","); // ���ڿ� �迭 �ʵ� ������ �����ϰ� ���� ������ ��ĭ ������ �ڸ���
			
				if (field[0].contains("������")) {
					square += Float.parseFloat(field[1]);
					cost += Integer.parseInt(field[4]);

				}

			}
			StringBuffer s = new StringBuffer();
			average = Math.round((cost / square / 3.3000));
			s.append(average);
			bw1.write(s.toString()); // ���� ���� ���Ͽ� ���� �߰�
			bw1.newLine(); // ���� ���� ���Ͽ� �� �ٲٱ�
			bw1.close();
		}
		
	}
