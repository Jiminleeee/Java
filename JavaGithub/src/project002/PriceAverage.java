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
		File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\부동산정책\\정책별\\아파트(매매)_실거래가_5년_정책1_가격.csv"); // 파일
																													// 불러오기
		BufferedReader br = new BufferedReader(new FileReader(file)); // 파일 읽기
		String readtxt;
		readtxt = br.readLine();

		String[] fieldName = readtxt.split(",");
		int sum = 0;
		int count = 0;
		double average = 0;
		
		File file1 = new File(
				"C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\부동산정책\\정책별\\아파트(매매)_실거래가_5년_정책1_평균가격(강남구).csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1)); // 파일 만들기
		
		while ((readtxt = br.readLine()) != null) { // 파일에 내용이 존재하면 (null이 아니면)
			String[] field = readtxt.split(","); // 문자열 배열 필드 내용을 선언하고 읽은 내용을 빈칸 단위로 자른다
			if (field[0].contains("강남구")) {
				StringBuffer s = new StringBuffer();
				sum += Integer.parseInt(field[6]);
				count++;
				s.append(readtxt);

				bw1.write(s.toString()); // 새로 만든 파일에 내용 추가
				bw1.newLine(); // 새로 만든 파일에 줄 바꾸기

			}

		}
		average = sum / count;
		bw1.write(String.valueOf(average));
		bw1.close();
	}
}
