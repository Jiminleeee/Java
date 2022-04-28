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
		File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\빵집\\부산단어.csv");		
		FileReader filereader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(filereader);
		
		File f1 = new File("C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\빵집\\부산단어개수.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1)); // 파일 만들기
		
		String readtxt;
		ArrayList<String> list = new ArrayList<>();
		
		while ((readtxt = bufReader.readLine()) != null) {	// 파일에 내용이 존재하면 (null이 아니면)
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
			bw1.write(s.toString()); // 새로 만든 파일에 내용 추가
			bw1.newLine();	// 새로 만든 파일에 줄 바꾸기
		}
		bw1.close();
	}

}
