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
		File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\부동산정책\\아파트(매매)_실거래가_5년.csv"); // 파일 불러오기
		BufferedReader br = new BufferedReader(new FileReader(file)); // 파일 읽기
		String readtxt;
		readtxt = br.readLine();

		String[] fieldName = readtxt.split(",");

		String[] year = { "2017", "2018", "2019", "2020", "2021", "2022" };
		String[] month = { "00","01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };

		
		File file1 = new File("C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\부동산정책\\정책별\\아파트(매매)_실거래가_5년_정책27.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1)); // 파일 만들기

		while ((readtxt = br.readLine()) != null) { // 파일에 내용이 있을 때 반복 수행
			StringBuffer s = new StringBuffer(); // StringBuffer 선언
			String[] field = readtxt.split(","); // 구분자 기준으로 나눠 문자열 배열로 선언
			String yearList = field[2].substring(0, 4);
			String monthList = field[2].substring(4);

			if ((yearList.equals(year[4]) && monthList.equals(month[2])) &&	Integer.parseInt(field[3]) >= 4
					|| (yearList.equals(year[5]) && monthList.equals(month[4]) && Integer.parseInt(field[3]) <= 30)) {

				s.append(readtxt);

				bw1.write(s.toString()); // 새로 만든 파일에 내용 추가
				bw1.newLine(); // 새로 만든 파일에 줄 바꾸기

			}

		}
		bw1.close();
	}

}
