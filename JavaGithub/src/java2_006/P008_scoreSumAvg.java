package java2_006;
//�޼ҵ� �����ε� / 20220417 / k32_������ /�ּ��� k32_����
public class P008_scoreSumAvg {
	// 3���� ������ �Ű������� �޾� ����� ���ϴ� �޼ҵ� ����
	public double k32_avg(int k32_a, int k32_b, int k32_c) {	
		return (k32_a + k32_b + k32_c) / 3.0;	// ������ ����
	}

	//4���� ������ �Ű������� �޾� ����� ���ϴ� �޼ҵ� ����
	public double k32_avg(int k32_a, int k32_b, int k32_c, int k32_d) {	
		return (k32_a + k32_b + k32_c + k32_d) / 4.0;	//������ ����
	}

	//5���� ������ �Ű������� �޾� ����� ���ϴ� �޼ҵ� ����
	public double k32_avg(int k32_a, int k32_b, int k32_c, int k32_d, int k32_e) {
		return (k32_a+ k32_b + k32_c + k32_d + k32_e)/5.0;	//������ ����
	}
	
	//3���� ������ �Ű������� �޾� ���� ���ϴ� �޼ҵ� ����
	public int k32_sum(int k32_a, int k32_b, int k32_c) {	//������ ����	
		return (k32_a + k32_b + k32_c) ;
	}

	// 4���� ������ �Ű������� �޾� ���� ���ϴ� �޼ҵ� ����
	public int k32_sum(int k32_a, int k32_b, int k32_c, int k32_d) {
		return (k32_a + k32_b + k32_c + k32_d) ;	//������ ����
	}

	// 5���� ������ �Ű������� �޾� ���� ���ϴ� �޼ҵ� ����
	public int k32_sum(int k32_a, int k32_b, int k32_c, int k32_d, int k32_e) {
		return (k32_a+ k32_b + k32_c + k32_d + k32_e);	//������ ����
	}
}
