package java2_006;
//tv������3 / 20220417 / k32_������ / �ּ����� k32_����
public class P012_TvRemoconX extends P010_TvRemocon2 {
	
	public int k32_battery = 80;
	
	void k32_batteryCheck() {	//P010_TvRemocon�� ��ӹ޾� �޼ҵ� �߰�		
		System.out.printf("���� �������� %d%% ���ҽ��ϴ�.\n", k32_battery);	//���� ���������� ���
		k32_battery--;
	}

}
