package java2_006;
//���� ����ǥ ���(�ټ� ������) / 20220417 / k32_������ / �ּ����� k32_����
public class P015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iPerson = 200;		// �� �ο��� �Է�, ������, 200��
		int k32_onePagePerson = 30;	// ���������� ������ �ο��� �Է�, ������, 30��
		//������, k32_iPerson, k32_onepagePerson�� ������ �޴� �޼ҵ� ����, k32_inData�� ���
		P015_InputData k32_inData = new P015_InputData(k32_iPerson, k32_onePagePerson);
		
		String k32_time1 = k32_inData.k32_printDate();	//����ð� �����ص� ���信 �°� ����ؼ� ���ڿ��� �Է�
		//������ �迭, �� ��������(200)�� ������, �� ���������� ����� ǥ�õ��� ��´�. {30, 30, 30, 30, 30, 30, 20} ���·� ��� ����
		int[] k32_personGroupArray = k32_inData.k32_perPagePerson();
		
		for (int k32_i = 0; k32_i < k32_personGroupArray.length; k32_i++) {//�� �������� ��ŭ �ݺ� (for��)
			// �� ������ ���� �����ϴ� ���ڸ� ����, ���� ���° for������(k32_i)�� ������ �޴´�. 1������ 0, 2������ 30 .. ������ 180
			int k32_startNumber = k32_inData.k32_currentStartNumber(k32_i);
			
			for (int k32_j = 0; k32_j < k32_personGroupArray[k32_i]; k32_j++) { // �ش� �������� �ο��� ��ŭ �ݺ� (for��) ��ҿ� 30��, �������� 20�� �ݺ�
				String k32_name = String.format("����%03d", (k32_startNumber + k32_j + 1));	//���ڿ� �̸�����, 1������ �����̶� + 1
				//���� �Լ��� 0�̻� ~ 1�̸��� double�� ���� �������� ����, 0���� 100���̸� ��������� ���ϱ� 100�ǽ�
				int k32_kor = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
				int k32_eng = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
				int k32_math = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
				// ������ ������ ������ �޴� �ٸ� Ŭ������ �޼ҵ�� ����, ���ڿ� 1���� ������ 1������ �����̱� �����̴�.
				k32_inData.k32_SetDate(k32_startNumber + k32_j + 1, k32_name,k32_kor,k32_eng,k32_math);
			}
			
			System.out.printf("PAGE: %d       ������� :"  + k32_time1 + "\n", k32_i + 1);	//���� ������(0�̶� + 1)�� ��¥�� ����Ѵ�.
			System.out.println("=================================================");
			System.out.printf("%-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s\n","��ȣ","�̸�","����","����","����","����","���");	//���� ���
			System.out.println("=================================================");
			
			
			for (int k32_k = 0; k32_k < k32_personGroupArray[k32_i]; k32_k++) {// �ش� �������� �ο��� ��ŭ �ݺ� (for��) ��ҿ� 30��, �������� 20�� �ݺ�
				// k32_k + k32_startNumber�� ������ ���۹�ȣ + ���� ���������� ���°, �׷� ���� ��ȣ�� �ȴ�.1���� 30, 30 ~ 60 .. 180 ~ 200���� �þ
				// �����迭���� �� ������ �����´�. �迭�̿��� +1�� ��������, �� �迭�� ũ��� 200�̴�.
				System.out.printf("%03d %5.5s  %3d     %3d    %3d    %3d    %.2f\n",
						k32_inData.k32_i[k32_k + k32_startNumber], k32_inData.k32_name[k32_k + k32_startNumber],
						k32_inData.k32_kor[k32_k + k32_startNumber], k32_inData.k32_eng[k32_k + k32_startNumber],
						k32_inData.k32_math[k32_k + k32_startNumber], k32_inData.k32_sum[k32_k + k32_startNumber],
						k32_inData.k32_avg[k32_k + k32_startNumber]);
			}
			System.out.println("=================================================");
			
			System.out.println("����������");
			//���� �������� ���� �������� �����ش�. k32_inData Ŭ�������� k32_curSubjectSum �޼ҵ忡 k32_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� �������� ����.
			//����� �Ǽ����̱� ������ k32_curAveSum�� �޼ҵ� ���� ����
			System.out.printf("%-2.2s         %4d   %4d   %4d   %4d   %.2f\n", "�հ�",k32_inData.k32_curSubjectSum(k32_i, k32_inData.k32_kor),
					k32_inData.k32_curSubjectSum(k32_i, k32_inData.k32_eng), k32_inData.k32_curSubjectSum(k32_i, k32_inData.k32_math),
					k32_inData.k32_curSubjectSum(k32_i, k32_inData.k32_sum), k32_inData.k32_curAvgSum(k32_i, k32_inData.k32_avg));
			
			//���� �������� ���� ����� �����ش�. k32_inData Ŭ�������� k32_cursubjectAve �޼ҵ忡 k32_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� ����� ����.
			//����� �Ǽ����̱� ������ k32_curaveAvg�� �޼ҵ� ���� ����
			System.out.printf("%-2.2s        %4.2f  %4.2f  %4.2f  %4.2f   %.2f\n", "���",k32_inData.k32_cursubjectAvg(k32_i, k32_inData.k32_kor),
					k32_inData.k32_cursubjectAvg(k32_i, k32_inData.k32_eng), k32_inData.k32_cursubjectAvg(k32_i, k32_inData.k32_math),
					k32_inData.k32_cursubjectAvg(k32_i, k32_inData.k32_sum), k32_inData.k32_curaveAvg(k32_i, k32_inData.k32_avg));
			
			System.out.println("=================================================");
			
			//���ݱ��� �������� ���� �������� �����ش�. k32_inData Ŭ�������� k32_totalSubjectSum �޼ҵ忡 k32_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� �������� ����.
			//����� �Ǽ����̱� ������ k32_totalAveSum�� �޼ҵ� ���� ����
			System.out.println("����������");
			System.out.printf("%-2.2s        %4d    %4d   %4d   %4d   %.2f\n", "�հ�",k32_inData.k32_totalSubjectSum(k32_i, k32_inData.k32_kor),
					k32_inData.k32_totalSubjectSum(k32_i, k32_inData.k32_eng), k32_inData.k32_totalSubjectSum(k32_i, k32_inData.k32_math),
					k32_inData.k32_totalSubjectSum(k32_i, k32_inData.k32_sum), k32_inData.k32_totalAvgSum(k32_i, k32_inData.k32_avg));
			
			//���ݱ��� �������� ���� ����� �����ش�. k32_inData Ŭ�������� k32_totalsubjectAve �޼ҵ忡 k32_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� ����� ����.
			//����� �Ǽ����̱� ������ k32_totalaveAve�� �޼ҵ� ���� ����
			System.out.printf("%-2.2s       %4.2f   %4.2f   %4.2f  %4.2f   %.2f\n\n\n", "���",k32_inData.k32_totalsubjectAvg(k32_i, k32_inData.k32_kor),
					k32_inData.k32_totalsubjectAvg(k32_i, k32_inData.k32_eng), k32_inData.k32_totalsubjectAvg(k32_i, k32_inData.k32_math),
					k32_inData.k32_totalsubjectAvg(k32_i, k32_inData.k32_sum), k32_inData.k32_totalaveAvg(k32_i, k32_inData.k32_avg));
			
		}
	}

}
