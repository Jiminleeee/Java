package java2_006;
//tv������2 / 20220417 / k32_������ / �ּ����� k32_����
public class P010 {
	static P010_TvRemocon2 k32_rmt1;	// �������� Ŭ������ ���� �̸� ����
	static P010_TvRemocon2 k32_rmt2;	// �������� Ŭ������ ���� �̸� ����

	public static void main(String[] args) {
		
		k32_rmt1 = new P010_TvRemocon2();	//������ �����ʴ� ������ �޼ҵ� ����
		k32_rmt2 = new P010_TvRemocon2(10, 13);	//������ ���� 2���� �����ؼ� �޴� ������ �޼ҵ� ����
		
		for (int k32_i = 0; k32_i < 5; k32_i++) {	// ������ ���� i�� 0���� 4���� 1�� �����ϸ�
			k32_rmt1.k32_tvChannelUp(); k32_rmt1.k32_msg();	// ä���� 1��ŭ �����ϴ� �޼ҵ� ���� �� �޼��� ��� �޼ҵ� ����
			//k32_rmt2.k32_tvChannelUp(); k32_rmt2.k32_msg();
		}
		
		for (int k32_i = 0; k32_i < 5; k32_i++) {	// ������ ���� i�� 0���� 4���� 1�� �����ϸ�
			k32_rmt1.k32_tvChannelDown(); k32_rmt1.k32_msg();	// ä���� 1��ŭ �����ϴ� �޼ҵ� ���� �� �޼��� ��� �޼ҵ� ����
			//k32_rmt2.k32_ChannelDown(); k32_rmt2.k32_msg();
		}

		for (int k32_i = 0; k32_i < 10; k32_i++) {	// ������ ���� i�� 0���� 9���� 1�� �����ϸ�
			//k32_rmt1.k32_VolUp(); k32_rmt1.k32_msg();
			k32_rmt2.k32_tvVolUp(); k32_rmt2.k32_msg(); //������ 1��ŭ �����ϴ� �޼ҵ� ���� �� �޼��� ��� �޼ҵ� ����
		}

		for (int k32_i = 0; k32_i < 10; k32_i++) {	// ������ ���� i�� 0���� 9���� 1�� �����ϸ�
			//k32_rmt1.k32_VolDown(); k32_rmt1.k32_msg();
			k32_rmt2.k32_tvVolDown(); k32_rmt2.k32_msg();	//������ 1��ŭ �����ϴ� �޼ҵ� ���� �� �޼��� ��� �޼ҵ� ����
		}

	}
}
