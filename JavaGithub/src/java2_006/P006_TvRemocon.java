package java2_006;
// tv������ Ŭ���� / 20220417 / k32_������ / �ּ����� k32_����
public class P006_TvRemocon {

	int k32_tvVol = 1;		//���� ���� tv���� ���� �� 1�� �ʱ�ȭ
	int k32_tvChannel = 1;	//���� ���� tvä�� ���� �� 1�� �ʱ�ȭ
	
	
	void k32_tvVolUp() {	// tv ���� ���� �Լ� ���� (���ϰ� ����)
		k32_tvVol++;	// tv ���� ����
		System.out.printf("���� ���� -> ���� ���� [%d]�Դϴ�\n", k32_tvVol);	// ��� ���
	}
	
	void k32_tvVolDown() {	// tv ���� ���� �Լ� ���� (���ϰ� ����)
		k32_tvVol--;	// tv ���� ����
		System.out.printf("���� ���� -> ���� ���� [%d]�Դϴ�\n", k32_tvVol);	// ��� ���
	}
	
	void k32_tvChannelUp() {	// tv ä�� ���� �Լ� ���� (���ϰ� ����)
		k32_tvChannel++;	// tv ���� ����
		System.out.printf("ä�� ���� -> ���� ä�� [%d]�Դϴ�\n", k32_tvChannel);	// ��� ���
	}

	void k32_tvChannelDown() {	// tv ä�� ���� �Լ� ���� (���ϰ� ����)
		k32_tvChannel--; 	// tv ���� ����
		System.out.printf("ä�� ���� -> ���� ä�� [%d]�Դϴ�\n", k32_tvChannel);	// ��� ���
	}
}
