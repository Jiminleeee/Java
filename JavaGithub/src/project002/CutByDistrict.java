package project002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CutByDistrict {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadFile();

	}

	public static void ReadFile() throws IOException {
		for (int i = 1; i < 28; i++) {
			File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\��å��\\����Ʈ(�Ÿ�)_�ǰŷ���_5��_��å" + i + ".csv"); // ���� �ҷ�����
			BufferedReader br = new BufferedReader(new FileReader(file)); // ���� �б�
			String readtxt;
			readtxt = br.readLine();
			String[] fieldName = readtxt.split(",");

			//String[] district = { "������", "������", "���ϱ�", "������", "���Ǳ�", "������", "���α�", "��õ��", "�����", "������", "���빮��", "���۱�",
					//"������", "���빮��", "���ʱ�", "������", "���ϱ�", "���ı�", "��õ��", "��������", "��걸", "����", "���α�", "�߱�", "�߶���" };

			//for (int j = 0; j < district.length; j++) {
				File file1 = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\�ε�����å\\����\\����Ʈ(�Ÿ�)_�ǰŷ���_5��_�߶���.csv");
				BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1,true)); // ���� �����

				while ((readtxt = br.readLine()) != null) { // ���Ͽ� ������ �����ϸ� (null�� �ƴϸ�)
					String[] field = readtxt.split(","); // ���ڿ� �迭 �ʵ� ������ �����ϰ� ���� ������ ��ĭ ������ �ڸ���
					if (field[0].contains("�߶���")) {
						StringBuffer s = new StringBuffer();
						s.append(readtxt);
						bw1.write(s.toString()); // ���� ���� ���Ͽ� ���� �߰�
						bw1.newLine(); // ���� ���� ���Ͽ� �� �ٲٱ�

					}
				}
				bw1.newLine();
				bw1.close();
			}
		}

	//}
}
