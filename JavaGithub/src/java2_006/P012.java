package java2_006;
//tv������3 / 20220417 / k32_������ / �ּ����� k32_����
public class P012 {
	
	public static void main(String[] args) {
		
		P012_TvRemoconX k32_rmt3 = new P012_TvRemoconX();	//P012_TvRemoconX Ŭ������ rmt3���� ȣ��

		k32_rmt3.k32_batteryCheck();	// ��ӹ޾� �߰��� �Լ� ����

		for (int k32_i = 0; k32_i < 5; k32_i++) {	// ������ ���� i�� 0���� 4���� 1�� ������ ��
			k32_rmt3.k32_tvChannelUp();	// ä���� �ø��� �Լ� ����
			k32_rmt3.k32_msg();		// ���� ä���� �˷��ִ� �Լ� ����
		}

		k32_rmt3.k32_batteryCheck(); // ��ӹ޾� �߰��� �Լ� ����
	}
}
