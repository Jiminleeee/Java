package java2_007;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k32_OneRec = { "����,�̿밴 ��", "2016-01,103462", "2016-02,109914", "2016-03,112204", "2016-04,128351",
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

				String[] k32_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" }; // ���ڿ� �迭 units ���� �� �ʱ�ȭ
				String[] k32_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" }; // ���ڿ� �迭 unitX ���� �� �ʱ�ȭ

				if (k32_j == 1) {
					
						String k32_number = k32_field[k32_j];
						System.out.println(k32_field[k32_j]);
						k32_l = 0;
						k32_m = k32_number.length() - 1;
						
						while (true) {
							if (k32_l >= k32_number.length()) // ���� i�� sNumVal.length()���� ���ų� Ŭ ��
								break; // �ݺ����� �ߴ��ϰ� �������� �Ѿ��
							if (k32_number.length() <= 8) {
								k32_numberKorean = k32_numberKorean // sNumVoice�� sNumVoice +
										+ k32_units[Integer.parseInt(k32_number.substring(k32_l, k32_l + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)																								
										+ k32_unitX[k32_m]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
							}
							if (k32_number.substring(k32_l, k32_l + 1).equals("0")) { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �� (if��) (.equals > ���ڿ� ���� �� �� Ȯ�ν� ���)
								/*if (k32_number.substring(k32_number[k32_k].length() - 8, k32_number[k32_k].length() - 4).equals("0000")
										&& k32_unitX[k32_j].equals("��")) {
									// sNumVal�� ����-8 ���� sNumVal�� ����-4������ sNumVal���� �ڸ��� �װ��� 0000�̰� �迭 unitX[j] �� "��"�̸� �ƹ� �͵� ���� �ʴ´�.
								} else */if (k32_unitX[k32_m].equals("��") || k32_unitX[k32_m].equals("��")) { // ���� ������ false�̰� unitX[j]�� "��" �Ǵ� "��"�̸� (||�� �Ǵ� �ǹ�)
									k32_numberKorean = k32_numberKorean + "" + k32_unitX[k32_m]; // sNumVoice�� sNumVoice + "" + unitX[j]�� ����
								}

							 else { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �ƴϸ�
								k32_numberKorean = k32_numberKorean // sNumVoice�� sNumVoice +
										+ k32_units[Integer.parseInt(k32_number.substring(k32_l, k32_l + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)																								
										+ k32_unitX[k32_m]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
							}
							k32_l++; // ���� i�� 1��ŭ ����
							k32_m--; // ���� j�� 1��ŭ ����
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

		String[] k32_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" }; // ���ڿ� �迭 units ���� �� �ʱ�ȭ
		String[] k32_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" }; // ���ڿ� �迭 unitX ���� �� �ʱ�ȭ

		
			
				String k32_number = k32_field[1];
				System.out.println(k32_field[1]);
				k32_l = 0;
				k32_m = k32_number.length() - 1;
				
				while (true) {
					if (k32_l >= k32_number.length()) // ���� i�� sNumVal.length()���� ���ų� Ŭ ��
						break; // �ݺ����� �ߴ��ϰ� �������� �Ѿ��
					if (k32_number.length() <= 8) {
						k32_numberKorean = k32_numberKorean // sNumVoice�� sNumVoice +
								+ k32_units[Integer.parseInt(k32_number.substring(k32_l, k32_l + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)																								
								+ k32_unitX[k32_m]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
					}
					if (k32_number.substring(k32_l, k32_l + 1).equals("0")) { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �� (if��) (.equals > ���ڿ� ���� �� �� Ȯ�ν� ���)
						/*if (k32_number.substring(k32_number[k32_k].length() - 8, k32_number[k32_k].length() - 4).equals("0000")
								&& k32_unitX[k32_j].equals("��")) {
							// sNumVal�� ����-8 ���� sNumVal�� ����-4������ sNumVal���� �ڸ��� �װ��� 0000�̰� �迭 unitX[j] �� "��"�̸� �ƹ� �͵� ���� �ʴ´�.
						} else if (k32_unitX[k32_m].equals("��") || k32_unitX[k32_m].equals("��")) { // ���� ������ false�̰� unitX[j]�� "��" �Ǵ� "��"�̸� (||�� �Ǵ� �ǹ�)
							k32_numberKorean = k32_numberKorean + "" + k32_unitX[k32_m]; // sNumVoice�� sNumVoice + "" + unitX[j]�� ����
						}

					 else { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �ƴϸ�
						k32_numberKorean = k32_numberKorean // sNumVoice�� sNumVoice +
								+ k32_units[Integer.parseInt(k32_number.substring(k32_l, k32_l + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)																								
								+ k32_unitX[k32_m]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
					}
					k32_l++; // ���� i�� 1��ŭ ����
					k32_m--; // ���� j�� 1��ŭ ����
				}
			}
	}

}*/
