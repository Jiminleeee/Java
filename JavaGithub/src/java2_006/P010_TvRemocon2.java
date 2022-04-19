package java2_006;
//tv������2 / 20220417 / k32_������ / �ּ����� k32_����
public class P010_TvRemocon2 {
	private int k32_tvVol;		//private(Ŭ������������ ��밡��) ���� ���� tv���� ���� 
	private int k32_tvChannel;	//private(Ŭ������������ ��밡��) ���� ���� tvä�� ����
	
	P010_TvRemocon2() {	//������ ����
		k32_tvVol = 45;	// ���� ����
		k32_tvChannel = 7;	//���� ä��
	}
	
	P010_TvRemocon2(int k32_currentVol, int k32_currentChannel) { //������ ����, ������ ���� 2�� ���� , �����ε�
		k32_tvVol = k32_currentVol;	//���� ����
		k32_tvChannel = k32_currentChannel;	//���� ä��
	}
	
	void k32_tvVolUp() {	// tv ���� ���� �Լ� ���� (���ϰ� ����)
		k32_tvVol++;	// tv ���� ����
		System.out.printf("���� ���� ");	// ��� ���
	}
	
	void k32_tvVolDown() {	// tv ���� ���� �Լ� ���� (���ϰ� ����)
		k32_tvVol--;	// tv ���� ����
		System.out.printf("���� ���� ");	// ��� ���
	}
	
	void k32_tvChannelUp() {	// tv ä�� ���� �Լ� ���� (���ϰ� ����)
		k32_tvChannel++;	// tv ���� ����
		System.out.printf("ä�� ���� ");	// ��� ���
	}

	void k32_tvChannelDown() {	// tv ä�� ���� �Լ� ���� (���ϰ� ����)
		k32_tvChannel--; 	// tv ���� ����
		System.out.printf("ä�� ���� ");	// ��� ���
	}
	
	void k32_msg() {	//���� ä�ΰ� ���� ���
		System.out.printf("���� ä�� [%d], ���� ���� [%d]\n", k32_tvChannel, k32_tvVol);
	}

}
