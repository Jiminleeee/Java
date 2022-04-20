package java2_007;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k32_OneRec = { "연월,이용객 수", "2016-01,103462", "2016-02,109914", "2016-03,112204", "2016-04,128351",
				"2016-05,224462", "2016-06,196737", "2016-07,246683", "2016-08,205932", "2016-09,143336",
				"2016-10,153767", "2016-11,105085", "2016-12,88442", "2017-01,131520", "2017-02,139372",
				"2017-03,146703", "2017-04,131411", "2017-05,160724", "2017-06,236393", "2017-07,264731",
				"2017-08,275547", "2017-09,118661", "2017-10,176067", "2017-11,110150", "2017-12,145310",
				"2018-01,87455", "2018-02,73592", "2018-03,58184", "2018-04,108680", "2018-05,184518", "2018-06,139516",
				"2018-07,149282", "2018-08,165913", "2018-09,114090", "2018-10,93758", "2018-11,94882", "2018-12,99372",
				"2019-01,109000", "2019-02,97273", "2019-03,121104", "2019-04,154597", "2019-05,194262",
				"2019-06,146978", "2019-07,325318", "2019-08,278993", "2019-09,134546", "2019-10,163608",
				"2019-11,158821", "2019-12,155008", "2020-01,106304", "2020-02,54797", "2020-03,0", "2020-04,0",
				"2020-05,19938", "2020-06,0", "2020-07,12517", "2020-08,25624", "2020-09,2144", "2020-10,52303",
				"2020-11,52079", "2020-12,2863" };

		String[] k32_fieldName = k32_OneRec[0].split(",");
		for (int k32_i = 1; k32_i < k32_OneRec.length - 1; k32_i++) {
			String[] k32_field = k32_OneRec[k32_i].split(",");
			System.out.println("***********************************************************");
			for (int k32_j = 0; k32_j < k32_fieldName.length; k32_j++) {
				int k32_k, k32_l, k32_m;
				String k32_numberKorean = "";

				String[] k32_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 문자열 배열 units 선언 및 초기화
				String[] k32_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" }; // 문자열 배열 unitX 선언 및 초기화

				if (k32_j == 1) {
					
						String k32_number = k32_field[k32_j];
						System.out.println(k32_field[k32_j]);
						k32_l = 0;
						k32_m = k32_number.length() - 1;
						
						while (true) {
							if (k32_l >= k32_number.length()) // 변수 i가 sNumVal.length()보다 같거나 클 때
								break; // 반복문을 중단하고 다음으로 넘어간다
							if (k32_number.length() <= 8) {
								k32_numberKorean = k32_numberKorean // sNumVoice에 sNumVoice +
										+ k32_units[Integer.parseInt(k32_number.substring(k32_l, k32_l + 1))] // sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용)																								
										+ k32_unitX[k32_m]; // + unitX[j]를 대입한다 // String 배열 units의 위치에 있는 문자를 출력
							}
							if (k32_number.substring(k32_l, k32_l + 1).equals("0")) { // sNumVal을 i에서 i+1만큼 자른 수가 0일 때 (if문) (.equals > 문자열 같은 것 비교 확인시 사용)
								/*if (k32_number.substring(k32_number[k32_k].length() - 8, k32_number[k32_k].length() - 4).equals("0000")
										&& k32_unitX[k32_j].equals("만")) {
									// sNumVal의 길이-8 부터 sNumVal의 길이-4까지를 sNumVal에서 자르고 그것이 0000이고 배열 unitX[j] 가 "만"이면 아무 것도 하지 않는다.
								} else */if (k32_unitX[k32_m].equals("만") || k32_unitX[k32_m].equals("억")) { // 위의 조건이 false이고 unitX[j]가 "만" 또는 "억"이면 (||는 또는 의미)
									k32_numberKorean = k32_numberKorean + "" + k32_unitX[k32_m]; // sNumVoice에 sNumVoice + "" + unitX[j]를 대입
								}

							 else { // sNumVal을 i에서 i+1만큼 자른 수가 0이 아니면
								k32_numberKorean = k32_numberKorean // sNumVoice에 sNumVoice +
										+ k32_units[Integer.parseInt(k32_number.substring(k32_l, k32_l + 1))] // sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용)																								
										+ k32_unitX[k32_m]; // + unitX[j]를 대입한다 // String 배열 units의 위치에 있는 문자를 출력
							}
							k32_l++; // 변수 i를 1만큼 증가
							k32_m--; // 변수 j를 1만큼 감소
						}
					}
						System.out.printf(" %s : %s\n", k32_fieldName[k32_j], k32_field[k32_j]);
						System.out.println("***********************************************************");
			}
			}

		}
				
						
				
			
			
		}
	}
	


		/*int k32_k, k32_l, k32_m;
		String k32_numberKorean = "";

		String[] k32_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 문자열 배열 units 선언 및 초기화
		String[] k32_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" }; // 문자열 배열 unitX 선언 및 초기화

		
			
				String k32_number = k32_field[1];
				System.out.println(k32_field[1]);
				k32_l = 0;
				k32_m = k32_number.length() - 1;
				
				while (true) {
					if (k32_l >= k32_number.length()) // 변수 i가 sNumVal.length()보다 같거나 클 때
						break; // 반복문을 중단하고 다음으로 넘어간다
					if (k32_number.length() <= 8) {
						k32_numberKorean = k32_numberKorean // sNumVoice에 sNumVoice +
								+ k32_units[Integer.parseInt(k32_number.substring(k32_l, k32_l + 1))] // sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용)																								
								+ k32_unitX[k32_m]; // + unitX[j]를 대입한다 // String 배열 units의 위치에 있는 문자를 출력
					}
					if (k32_number.substring(k32_l, k32_l + 1).equals("0")) { // sNumVal을 i에서 i+1만큼 자른 수가 0일 때 (if문) (.equals > 문자열 같은 것 비교 확인시 사용)
						/*if (k32_number.substring(k32_number[k32_k].length() - 8, k32_number[k32_k].length() - 4).equals("0000")
								&& k32_unitX[k32_j].equals("만")) {
							// sNumVal의 길이-8 부터 sNumVal의 길이-4까지를 sNumVal에서 자르고 그것이 0000이고 배열 unitX[j] 가 "만"이면 아무 것도 하지 않는다.
						} else if (k32_unitX[k32_m].equals("만") || k32_unitX[k32_m].equals("억")) { // 위의 조건이 false이고 unitX[j]가 "만" 또는 "억"이면 (||는 또는 의미)
							k32_numberKorean = k32_numberKorean + "" + k32_unitX[k32_m]; // sNumVoice에 sNumVoice + "" + unitX[j]를 대입
						}

					 else { // sNumVal을 i에서 i+1만큼 자른 수가 0이 아니면
						k32_numberKorean = k32_numberKorean // sNumVoice에 sNumVoice +
								+ k32_units[Integer.parseInt(k32_number.substring(k32_l, k32_l + 1))] // sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용)																								
								+ k32_unitX[k32_m]; // + unitX[j]를 대입한다 // String 배열 units의 위치에 있는 문자를 출력
					}
					k32_l++; // 변수 i를 1만큼 증가
					k32_m--; // 변수 j를 1만큼 감소
				}
			}
	}

}*/
