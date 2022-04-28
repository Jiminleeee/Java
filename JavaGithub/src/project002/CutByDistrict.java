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
			File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\부동산정책\\정책별\\아파트(매매)_실거래가_5년_정책" + i + ".csv"); // 파일 불러오기
			BufferedReader br = new BufferedReader(new FileReader(file)); // 파일 읽기
			String readtxt;
			readtxt = br.readLine();
			String[] fieldName = readtxt.split(",");

			//String[] district = { "강남구", "강동구", "강북구", "강서구", "관악구", "광진구", "구로구", "금천구", "노원구", "도봉구", "동대문구", "동작구",
					//"마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "양천구", "영등포구", "용산구", "은평구", "종로구", "중구", "중랑구" };

			//for (int j = 0; j < district.length; j++) {
				File file1 = new File("C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\부동산정책\\구별\\아파트(매매)_실거래가_5년_중랑구.csv");
				BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1,true)); // 파일 만들기

				while ((readtxt = br.readLine()) != null) { // 파일에 내용이 존재하면 (null이 아니면)
					String[] field = readtxt.split(","); // 문자열 배열 필드 내용을 선언하고 읽은 내용을 빈칸 단위로 자른다
					if (field[0].contains("중랑구")) {
						StringBuffer s = new StringBuffer();
						s.append(readtxt);
						bw1.write(s.toString()); // 새로 만든 파일에 내용 추가
						bw1.newLine(); // 새로 만든 파일에 줄 바꾸기

					}
				}
				bw1.newLine();
				bw1.close();
			}
		}

	//}
}
