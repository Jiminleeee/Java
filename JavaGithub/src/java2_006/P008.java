package java2_006;
//�޼ҵ� �����ε� / 20220417 / k32_������ /�ּ��� k32_����
public class P008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P008_scoreSumAvg k32_scoreCal = new P008_scoreSumAvg();	//P008_scoreSumAvg Ŭ���� scoreCal ����
		
		//�⺻ ���� ���� �Է�(������)
		int k32_Korean = 80, k32_English = 90, k32_Math = 100, k32_Science = 100, k32_Society = 70,
			k32_Sum = 0;	// ������ ���� sum(��) ����
		double k32_Avg= 0.0;	// �Ǽ��� ���� avg(���) ����
		

		k32_Avg = k32_scoreCal.k32_avg(k32_Math, k32_English, k32_Korean); // 3���� ������ �޾Ƽ� ����� ���ϴ� �ٸ� Ŭ������ �޼ҵ� ����(�Ǽ���)
		k32_Sum = k32_scoreCal.k32_sum(k32_Math, k32_English, k32_Korean); // 3���� ������ �޾Ƽ� ���� ���ϴ� �ٸ� Ŭ������ �޼ҵ� ����(������)
		
		// ���� ���信 ���缭 �޼��� ���
		System.out.println("3�� ����ǥ");
		System.out.printf("=====================================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","�̸�","����","����","����","����","���");
		System.out.printf("=====================================\n");
		System.out.printf("%-4.4s%-4d%4d  %4d   %4d  %-4.1f\n\n","������",k32_Korean,k32_English,k32_Math,k32_Sum,k32_Avg);
				
		k32_Avg = k32_scoreCal.k32_avg(k32_Math, k32_English, k32_Korean, k32_Science); // 4���� ������ �޾Ƽ� ����� ���ϴ� �ٸ� Ŭ������ �޼ҵ� ����(�Ǽ���)
		k32_Sum = k32_scoreCal.k32_sum(k32_Math, k32_English, k32_Korean, k32_Science); // 4���� ������ �޾Ƽ� ���� ���ϴ� �ٸ� Ŭ������ �޼ҵ� ����(������)
		
		// ���� ���信 ���缭 �޼��� ���
		System.out.println("4�� ����ǥ");
		System.out.printf("========================================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","�̸�","����","����","����","����","����","���");
		System.out.printf("========================================\n");
		System.out.printf("%-4.4s%-4d%4d  %4d   %4d  %4d  %4.1f\n\n","������",k32_Korean,k32_English,k32_Math,k32_Science,k32_Sum,k32_Avg);
		
		k32_Avg = k32_scoreCal.k32_avg(k32_Math, k32_English, k32_Korean, k32_Science, k32_Society); //5���� ������ �޾Ƽ� ����� ���ϴ� �ٸ� Ŭ������ �޼ҵ� ����(�Ǽ���)
		k32_Sum = k32_scoreCal.k32_sum(k32_Math, k32_English, k32_Korean, k32_Science, k32_Society); //5���� ������ �޾Ƽ� ���� ���ϴ� �ٸ� Ŭ������ �޼ҵ� ����(������)
		
		// ���� ���信 ���缭 �޼��� ���
		System.out.println("5�� ����ǥ");
		System.out.printf("=================================================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","�̸�","����","����","����","����","��ȸ","����","���");
		System.out.printf("=================================================\n");
		System.out.printf("%-4.4s%-4d%4d  %4d  %4d  %4d   %4d %5.1f\n\n","������",k32_Korean,k32_English,k32_Math,k32_Science,k32_Society,k32_Sum,k32_Avg);
	}

	}


