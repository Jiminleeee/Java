package java2_006;
//���� ����ǥ ���(1������) / 20220417 / k32_������ / �ּ����� k32_����
public class P014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iPerson = 30;	//������ ���� ���� �� 30���� �ʱ�ȭ
		
		P013_InputData k32_inData = new P013_InputData(k32_iPerson);	//�ٸ� Ŭ������ k32_inData�� ����
		
		
		String k32_time1 = k32_inData.k32_printDate();	//����ð� �����ص� ���信 �°� ����ؼ� ���ڿ��� �Է�
		
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {	//�� �ο��� ��ŭ �ݺ� (for��)
			String k32_name = String.format("����%02d", k32_i);	//���ڿ� �̸����� (���� + �ѹ� ����)
			//���� �Լ��� 0�̻� ~ 1�̸��� double�� ���� �������� ����, 0���� 100���̸� ��������� ���ϱ� 100�ǽ�
			int k32_kor = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			int k32_eng = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			int k32_math = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			// ������ ������ ������ �޴� �ٸ� Ŭ������ �޼ҵ�� ����
			k32_inData.k32_SetDate(k32_i,k32_name,k32_kor,k32_eng,k32_math);	
		}
		


		System.out.println("           ������� :"  + k32_time1);	// ������ڸ� ��ܿ� ���
		System.out.println("================================================");
		System.out.printf("%-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s\n","��ȣ","�̸�","����","����","����","����","���");	// ��� ��� ��� �޴���
		System.out.println("================================================");
		
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {	//�� �ο��� ��ŭ �ݺ� (for��)
			// ������ Ŭ�������� �迭�� ����� ������ for���� ���� ��� (�ο��� ������ ����, ����� ���ٷ� ���)
			System.out.printf("%03d %5.5s  %3d     %3d    %3d     %3d   %.2f\n",
					k32_i + 1, k32_inData.k32_name[k32_i], k32_inData.k32_kor[k32_i], k32_inData.k32_eng[k32_i],
					k32_inData.k32_math[k32_i], k32_inData.k32_sum[k32_i], k32_inData.k32_avg[k32_i]);
		}
		System.out.println("===============================================");
		//���� ������ �����ֱ����� �ٸ�Ŭ������ �żҵ忡 ���� ���� �迭�� �Է°����� �Է��ϰ�, ����� ���Ϲ޾� ���信 �°� ����Ѵ�.
		System.out.printf("%-2.2s        %3d    %3d    %3d    %4d  %.2f\n", "�հ�",k32_inData.k32_subjectSum(k32_inData.k32_kor),
				k32_inData.k32_subjectSum(k32_inData.k32_eng), k32_inData.k32_subjectSum(k32_inData.k32_math),
				k32_inData.k32_subjectSum(k32_inData.k32_sum), k32_inData.k32_avgSum(k32_inData.k32_avg));
		//���� ����� �����ֱ����� �ٸ�Ŭ������ �żҵ忡 ���� ���� �迭�� �Է°����� �Է��ϰ�, ����� ���Ϲ޾� ���信 �°� ����Ѵ�.
		System.out.printf("%-2.2s       %3.2f   %3.2f   %3.2f   %3.2f  %.2f\n", "���",k32_inData.k32_subjectAvg(k32_inData.k32_kor),
				k32_inData.k32_subjectAvg(k32_inData.k32_eng), k32_inData.k32_subjectAvg(k32_inData.k32_math),
				k32_inData.k32_subjectAvg(k32_inData.k32_sum), k32_inData.k32_avgAvg(k32_inData.k32_avg));
	}

}
