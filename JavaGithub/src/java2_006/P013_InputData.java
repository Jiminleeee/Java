package java2_006;
//Ŭ���� ����� / 20220417 / k32_������ / �ּ����� k32_����
import java.text.SimpleDateFormat;
import java.util.Date;

public class P013_InputData {
	int k32_Person;		// ������ ���� ����
	int [] k32_i;		// ������ �迭 ����
	String [] k32_name;	// ���ڿ� �迭 ����
	int [] k32_kor;		// ������ �迭 ����
	int [] k32_eng;		// ������ �迭 ����
	int [] k32_math;		// ������ �迭 ����
	int [] k32_sum;		// ������ �迭 ����
	double [] k32_avg;	// �Ǽ��� �迭 ����
	
	P013_InputData(int k32_iPerson) {	//�޾ƿ� �ο��� ũ�⸸ŭ��
		k32_i = new int[k32_iPerson];	// ������ �迭 ����
		k32_name = new String[k32_iPerson];	// ���ڿ� �迭 ����
		k32_kor = new int[k32_iPerson];	// ������ �迭 ����
		k32_eng = new int[k32_iPerson];	// ������ �迭 ����
		k32_math = new int[k32_iPerson];	// ������ �迭 ����
		k32_sum = new int[k32_iPerson];	// ������ �迭 ����
		k32_avg = new double[k32_iPerson];	// �Ǽ��� �迭 ����
		k32_Person = k32_iPerson;	//�ο� �� ����
	}
	
	//k32_�� ���̸� �ߺ��̶� ���⼱ ����
	public void k32_SetDate(int i, String name, int kor, int eng, int math) {
		k32_i[i] = i;	// �޾ƿ� ��ȣ �迭�� �Է�
		k32_name[i] = name;	// �޾ƿ� �̸� �迭�� �Է�
		k32_kor[i] = kor;	// �޾ƿ� ���� ���� �迭�� �Է�
		k32_eng[i] = eng;	// �޾ƿ� ���� ���� �迭�� �Է�
		k32_math[i] = math;	// �޾ƿ� ���� ���� �迭�� �Է�
		k32_sum[i] = kor + eng + math;	//���� ����� �迭�� �Է�
		k32_avg[i] = k32_sum[i] / 3.0;	//��� ����� �迭�� �Է�
	}
	
	public int k32_subjectSum(int[] k32_intArr) {	//������ �迭�� �޾ƿͼ� ���� ���� �����ִ� �޼ҵ� ����
		int k32_sum = 0;	//���� ���� ������ ���� ���� �� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_intArr.length; k32_i++) {//������ ���� ����ŭ �ݺ� (for��)
			k32_sum += k32_intArr[k32_i];	//�迭�� ���鼭 ��� ������ �����ش�
		}
		return k32_sum;	//���� ���� ���� �����Ѵ�(������)
	}
	
	
	public double k32_avgSum(double[] k32_doubleArr) {//�Ǽ��� �迭�� �޾ƿͼ� ����� ���� ���ϴ� �޼ҵ� ����
		double k32_sum = 0;	//����� ���� �޴� �Ǽ��� ���� ����
		
		for (int k32_i = 0; k32_i < k32_doubleArr.length; k32_i++) {	//����� ����ŭ �ݺ�(for��)
			k32_sum += k32_doubleArr[k32_i];	//�� ��� �� �����ֱ�
		}
		return k32_sum;	//����� ���� ���� ����(�Ǽ���)
	}
	
	// 39pg ReportSheet, Ŭ���� �����
	public double k32_subjectAvg(int[] k32_intArr) {	//������ �迭�� �޾ƿͼ� ���� ���� ����� �����ִ� �޼ҵ� ����
		int k32_sum = 0;	//���� ���� ������ ���� ����
		
		for (int k32_i = 0; k32_i < k32_intArr.length; k32_i++) {	// �ο��� ��ŭ �ݺ� (for��)			
			k32_sum += k32_intArr[k32_i];	// �迭�� ���鼭 ���Ѵ�
		}
		return ((double) k32_sum) / k32_Person;	//�Ǽ������� ���� ���� �տ� ����ȯ
	}
	
	
	public double k32_avgAvg(double[] k32_doubleArr) {	//�Ǽ��� �迭�� �޾ƿͼ� �л����� ����� ����� �����ִ� �޼ҵ� ����
		double k32_sum = 0;	//�Ǽ��� ���� ����, ���� �뵵�� ���
		
		for (int k32_i = 0; k32_i < k32_doubleArr.length; k32_i++) {	// �ο��� ��ŭ �ݺ� (for��)
			k32_sum += k32_doubleArr[k32_i];	//�迭�� ���鼭 ���� ��� ���Ѵ�.
		}
		return k32_sum / k32_Person;	//�ο����� ���� ����� ����� ���� �����Ѵ� (�Ǽ���)
	}
		
	public String k32_printDate() {	//��¥�� ���ڿ��� ��ȯ�ϴ� �޼ҵ� ����, import�� ��ܿ� �ִ�.
		//�ð��� �޾ƿ��� ����� ����, 4�ڸ����� �� �� 24�� �ð� �� ��
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		
		Date k32_time = new Date();	//Date �Լ��� time���� ���ڴٰ� ����
				
		String k32_time1 = format1.format(k32_time);	//�޾ƿ� �ð��� ���信 �°� �����ؼ� ������ time1�� �Է�
		
		return k32_time1;	//�� ���信 ������ ���ڿ��� ��¥ ����
	}
}
