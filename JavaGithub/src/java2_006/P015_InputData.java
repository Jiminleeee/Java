package java2_006;
//���� ����ǥ ���(�ټ� ������) / 20220417 / k32_������ / �ּ����� k32_����
import java.text.SimpleDateFormat;
import java.util.Date;

public class P015_InputData {
	int k32_totalPerson;	// �� �ο��� ������ ���� ����
	int k32_pgPerson;	// ������ �� �ο��� ������ ���� ����
	int [] k32_i;	// ��� ��ȣ ������ �迭 ����
	String [] k32_name;	// ��� �̸� ���ڿ� �迭 ����
	int [] k32_kor;	// ����� ������ �迭 ����
	int [] k32_eng;	// ����� ������ �迭 ����
	int [] k32_math;	// ���м��� ������ �迭 ����
	int [] k32_sum;	// �л��� ������ �� ������ �迭 ����
	double [] k32_avg;	//�л��� ��� ������ �迭 ����
	int[] k32_personGroupArray;	//�������� �ο��� ���� ������ �迭 ����
	
	P015_InputData(int k32_iPerson, int k32_onePagePerson) {	//������, ���ο��� �������� �ο��� �޾ƿ´�.
		//�޾ƿ� �ο��� ũ�⸸ŭ��
		k32_totalPerson = k32_iPerson;	
		k32_pgPerson = k32_onePagePerson;
		k32_i = new int[k32_iPerson];	// ������ �迭 ����
		k32_name = new String[k32_iPerson];	// ���ڿ� �迭 ����
		k32_kor = new int[k32_iPerson];	// ������ �迭 ����
		k32_eng = new int[k32_iPerson];	// ������ �迭 ����
		k32_math = new int[k32_iPerson];// ������ �迭 ����
		k32_sum = new int[k32_iPerson];	// ������ �迭 ����
		k32_avg = new double[k32_iPerson];	// �Ǽ��� �迭 ����
		 
		if (k32_iPerson % k32_onePagePerson == 0) {	// �� �ο��� �������� �ο�(30)���� �������ٸ�
			k32_personGroupArray = new int[(k32_iPerson / k32_onePagePerson)];	//�������� �߰��� �ʿ����.
		} else {	// �� �ο��� �������� �ο�(30)���� �������� �ʴ´ٸ�
			k32_personGroupArray = new int[(k32_iPerson / k32_onePagePerson) + 1];
			// ������ ���� 200/30 = 6(����) +1�� �ؼ� �� 7�������� �����ش�.
		}
	}
	
	public String k32_printDate() {	//���� �ð��� ���信 �°� �����ϴ� �޼ҵ� ����(���ڿ�)
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");	//�ð��� ���¸� ���Ѵ�.
		
		Date k32_time = new Date();	//����ð��� �����´�.
			
		String k32_time1 = format1.format(k32_time);	//������ ���ڿ��� ���信 ���� �ð��� �Է��Ѵ�.
		
		return k32_time1;	//�Է��� �ð����ڿ��� ����
	}
	
	public int[] k32_perPagePerson() {	// �� ������ ���� ����� �ִ��� �Է�
		
		for (int k32_i = 0; k32_i < k32_personGroupArray.length ; k32_i++) {	// �������� �ο� �� ũ�⸸ŭ �ݺ� (for��)
			if (k32_i == k32_personGroupArray.length - 1 ) {	// ���������̶��, 
				k32_personGroupArray[k32_i] = k32_totalPerson % k32_pgPerson;	//�������� �ο����� ���� �������� �Է�(20)
			if (k32_totalPerson == k32_pgPerson) {
				k32_personGroupArray[k32_i] = k32_pgPerson;
			} else {
				k32_personGroupArray[k32_i] = k32_totalPerson % k32_pgPerson;
			}
			} else {	//���������� �ƴ϶�� 
				k32_personGroupArray[k32_i] = k32_pgPerson;	//�������� �ο����� �Է�
			}
		}
		return k32_personGroupArray;	// �ۼ��� �迭�� �����Ѵ�.(������)
	}
	
	//������ ���� �����ο��� ���ڸ� ���Ͽ� ���������� �����ϴ� �޼ҵ�
	public int k32_currentStartNumber(int k32_ii) {	//ù�������� 0, �ι�°�� 1... �̷������� ������ �޾ƿ´�.
		int k32_startNum = 0;	// ����� �������� ù ��ȣ�� ���� ������ ���� ���� �� 0���� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_ii; k32_i++) {	//������������ -1 ��ŭ �ݺ� (for��) 1�������� 0��, 2�������� 1��, ... 7�������� 6��
			k32_startNum += k32_personGroupArray[k32_i];	// ù������ 0, 2������ 30, 3������ 60, ... ������������ 180
		}
		return k32_startNum;	//������ ���� ����
	}
	
	//�Ű������� k32_���̸� �迭��� �������� ����
	public void k32_SetDate(int i, String name, int kor, int eng, int mat) {	//�޾ƿ� �̸��� ���� ������ �� �迭�� ����ִ� �޼ҵ� ����
		k32_i[i - 1] = i;	// ��ȣ �Է�, �迭�̶� -1
		k32_name[i - 1] = name;	// �̸� �Է�
		k32_kor[i - 1] = kor;	// ���� ���� �Է�
		k32_eng[i - 1] = eng;	// ���� ���� �Է�
		k32_math[i - 1] = mat;	// ���� ���� �Է�
		k32_sum[i - 1] = kor + eng + mat;	//���� �� �Է�
		k32_avg[i - 1] = k32_sum[i - 1] / 3.0; //3�����̰� �Ǽ����̱� ������ 3.0���� ǥ��
	}
	
	//���� �������� ���� ���� ���� ���ϴ� �޼ҵ�, ���������� -1 �� ������, ���� ���� �迭�� �����´�.
	public int k32_curSubjectSum(int k32_cycNumber, int[] k32_array) {
		int k32_sum = 0, k32_startNum = 0;	//�հ� ���۹�ȣ�� ���� ������ ���� ���� �� 0���� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_cycNumber; k32_i++) {	//�������� ��ȣ -1 ��ŭ �ݺ� (for��)
			
			k32_startNum += k32_personGroupArray[k32_i];	//1�������� 0, 2�������� 30, .. ������������ 180
		}
		//�������� ���۰� �� ��ȣ ���̸� ���� for�� �ۼ�, 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k32_i = k32_startNum; k32_i < k32_startNum + k32_personGroupArray[k32_cycNumber]; k32_i++) {
			
			k32_sum += k32_array[k32_i];	// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� �ش� ������ ���� ���Ѵ�.
		}
		return k32_sum;	//������ �� ����
	}
	
	// �� �޼ҵ�� �Ȱ��� ����, ����� ���� �Ǽ��� �迭�� �ް� �Ǽ������� ������ ����ؼ� ���� ����
	public double k32_curAvgSum(int k32_cycNumber, double[] k32_array) {
		double k32_sum = 0;	// ���� ���� �Ǽ��� ���� ���� �� 0���� �ʱ�ȭ
		int k32_startNum = 0;	//���۹�ȣ�� ���� ������ ���� ���� �� 0���� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_cycNumber; k32_i++) {	//�������� ��ȣ -1 ��ŭ �ݺ� (for��)
			k32_startNum += k32_personGroupArray[k32_i];	//1�������� 0, 2�������� 30, .. ������������ 180
		}
		//�������� ���۰� �� ��ȣ ���̸� �ݺ� (for��) 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k32_i = k32_startNum; k32_i < k32_startNum + k32_personGroupArray[k32_cycNumber]; k32_i++) {
			
			k32_sum += k32_array[k32_i];	// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� ����� ���� ���Ѵ�.
		}
		return k32_sum;	//�Ǽ��� �� ����
	}
	
	//���� �������� ����� ���ϴ� �޼ҵ�, ���������� -1 �� ������, ���� ���� �迭�� �����´�. ����̶� double������ ����
	public double k32_cursubjectAvg(int k32_cycNumber, int[] k32_array) {
		int k32_sum = 0, k32_startNum = 0;	//�հ� ���۹�ȣ�� ���� ���� ���� �� 0���� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_cycNumber; k32_i++) {	//�������� ��ȣ -1 ��ŭ �ݺ� (for��)			
			k32_startNum += k32_personGroupArray[k32_i];	//1�������� 0, 2�������� 30, .. ������������ 180
		}
		//�������� ���۰� �� ��ȣ ���̸� �ݺ�(for��) 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k32_i = k32_startNum; k32_i < k32_startNum + k32_personGroupArray[k32_cycNumber]; k32_i++) {			
			k32_sum += k32_array[k32_i];	// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� ����� ���� ���Ѵ�.
		}
		return ((double) k32_sum) /  k32_personGroupArray[k32_cycNumber];	//�� / ������ �ο��� �� ���� ����(�Ǽ���)
	}
	
	// �� �޼ҵ�� �Ȱ��� ����, ����� ���� �Ǽ��� �迭�� �ް� �Ǽ������� ������ ����ؼ� ���� ����
	public double k32_curaveAvg(int k32_cycNumber, double[] k32_array) {		
		double k32_sum = 0;	// ���� ���� �Ǽ��� ���� ���� �� 0���� �ʱ�ȭ
		int k32_startNum = 0;	//���۹�ȣ�� ���� ������ ���� ���� �� 0���� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_cycNumber; k32_i++) {	//�������� ��ȣ -1 ��ŭ �ݺ� (for��)
			
			k32_startNum += k32_personGroupArray[k32_i];	//1�������� 0, 2�������� 30, .. ������������ 180
		}
		//�������� ���۰� �� ��ȣ ���̸� �ݺ� (for��) 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k32_i = k32_startNum; k32_i < k32_startNum + k32_personGroupArray[k32_cycNumber]; k32_i++) {
			
			k32_sum += k32_array[k32_i];	// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� ����� ���� ���Ѵ�.
		}
		return k32_sum /  k32_personGroupArray[k32_cycNumber];	//�� / ������ �ο��� �� ���� �����Ѵ�.(�Ǽ���)
	}
	
	
	// ���� ������������ ���� ������, ������ -1 ������, ���� ���� �迭�� �����´�. 
	public int k32_totalSubjectSum(int k32_cycNumber, int[] k32_array) {
		int k32_sum = 0, k32_endNum = 0;	//�հ� ����ȣ�� ���� ���� ���� �� 0���� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_cycNumber + 1; k32_i++) {//0���� ������������ȣ���� �ݺ� (for��)(���� �������� +1) 
			
			k32_endNum += k32_personGroupArray[k32_i];	// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
		}
		 
		
		for (int k32_i = 0; k32_i < k32_endNum; k32_i++) {	// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� �ݺ�(for��)
			 												// 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
			k32_sum += k32_array[k32_i];	// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�.
		}
		return k32_sum;	//���Ѱ��� ���� (������)
	}
	
	// ���� ������������ ���� �����, ������ -1 ������, ���� ���� �迭�� �����´�. 
	public double k32_totalAvgSum(int k32_cycNumber, double[] k32_array) {
		double k32_sum = 0;	// ���� ���� �Ǽ��� ���� ���� �� 0���� �ʱ�ȭ
		int k32_endNum = 0;	//�� ��ȣ�� ���� ������ ���� ���� �� 0���� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_cycNumber + 1; k32_i++) {//0���� ������������ȣ���� �ݺ� (for��)(���� �������� +1)
			
			k32_endNum += k32_personGroupArray[k32_i];	// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
		}
		
		for (int k32_i = 0; k32_i < k32_endNum; k32_i++) {// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� �ݺ� 
														  // 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)		
			k32_sum += k32_array[k32_i];	// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�. 
		}
		return k32_sum;	//�Ǽ��� ��� ����;
	}
	
	// ���� ������������ ���� ���� ���, ������ -1 ������, ���� ���� �迭�� �����´�. 
	public double k32_totalsubjectAvg(int k32_cycNumber, int[] k32_array) {	
		int k32_sum = 0, k32_endNum = 0;	//�հ� �������� ����ȣ�� ���� ������ ���� ���� �� 0���� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_cycNumber + 1; k32_i++) { //0���� ������������ȣ���� �ݺ� (for��)(���� �������� +1)		
			k32_endNum += k32_personGroupArray[k32_i];	// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
		}
				
		for (int k32_i = 0; k32_i < k32_endNum; k32_i++) {// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� �ݺ�(for��) 
														  // 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
			k32_sum += k32_array[k32_i];	// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�.
		}
		return ((double) k32_sum) /  k32_endNum;	// �����Ҷ� ������ / ���������� �����ο� �� ���� ����(�Ǽ���)
	}
	
	// ���� ������������ ���� ����� ���, ������ -1 ������, ���� ���� �迭�� �����´�. 
	public double k32_totalaveAvg(int k32_cycNumber, double[] k32_array) {
		double k32_sum = 0;	// ���� ���� �Ǽ��� ���� ���� �� 0���� �ʱ�ȭ
		int k32_endNum = 0;	//�� ��ȣ�� ���� ������ ���� ���� �� 0���� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_cycNumber + 1; k32_i++) {//0���� ������������ȣ���� �ݺ� (for��)(���� �������� +1)			
			k32_endNum += k32_personGroupArray[k32_i];	// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
		}
		
		
		for (int k32_i = 0; k32_i < k32_endNum; k32_i++) {// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� �ݺ�(for��) 
														  // 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
			k32_sum += k32_array[k32_i];	// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�. 
		}
		return k32_sum /  k32_endNum;	// �����Ҷ� ������ / ���������� �����ο� �� ���� ���� (�Ǽ���)
	}
}
