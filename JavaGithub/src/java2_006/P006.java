package java2_006;
// tv������ �����ϱ� / 20220417 / k32_������ / �ּ��� k32_����
public class P006 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		P006_TvRemocon k32_rmc = new P006_TvRemocon();	// P006_TvRemocon Ŭ���� rmc ����
		
		// ä�� 10�� �ø���
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// ���� ���� i�� 0���� 9���� 1�� ������ ��
			k32_rmc.k32_tvChannelUp();	// rmc�� ä�� �ø��� �Լ� ����
		}
		//ä�� 10�� ������
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// ���� ���� i�� 0���� 9���� 1�� ������ ��
			k32_rmc.k32_tvChannelDown();	// rmc�� ä�� ������ �Լ� ����
		}
		// ���� 5�� �ø���
		for (int k32_i = 0; k32_i < 5; k32_i++) {	// ���� ���� i�� 0���� 5���� 1�� ������ ��
			k32_rmc.k32_tvVolUp();	// rmc�� ���� �ø��� �Լ� ����
		}
		// ���� 5�� ������
		for (int k32_i = 0; k32_i < 5; k32_i++) {	// ���� ���� i�� 0���� 5���� 1�� ������ ��
			k32_rmc.k32_tvVolDown();	// rmc�� ���� ������ �Լ� ����
		}
	}

}
