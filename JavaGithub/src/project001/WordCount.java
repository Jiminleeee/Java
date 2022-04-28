package project001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\����\\�λ�ܾ�.csv");		
		FileReader filereader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(filereader);
		
		File f1 = new File("C:\\Users\\501-21\\Desktop\\kopo32\\������Ʈ\\����\\�λ�ܾ��.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1)); // ���� �����
		
		String readtxt;
		ArrayList<String> list = new ArrayList<>();
		
		while ((readtxt = bufReader.readLine()) != null) {	// ���Ͽ� ������ �����ϸ� (null�� �ƴϸ�)
			String[] field = readtxt.split("\n");
			for (int i = 0; i < field.length; i++) {
				list.add(field[i]);
			}
		}
		
		Set<String> set = new HashSet<String>(list);
		for (String str : set) {
			StringBuffer s = new StringBuffer();
			s.append(str + " \t " + Collections.frequency(list, str));
			System.out.println(str + " : " + Collections.frequency(list, str));
			bw1.write(s.toString()); // ���� ���� ���Ͽ� ���� �߰�
			bw1.newLine();	// ���� ���� ���Ͽ� �� �ٲٱ�
		}
		bw1.close();
	}

}
