package java2_006;
// ������� Ŭ���� ����� / 20220417 / k32_������ / �ּ����� k32_���� / public���� ����� ���� �� ��� ����
public class P011_elev3 extends P009_elev2 {

	void k32_Repair() {	// Repair �޼ҵ� ����
		k32_help = String.format("�������Դϴ�");	// "���� ���Դϴ�" ���
	}
	
	void k32_up() {	// ����� Ŭ������ ��ӹ޾� ������
		if(k32_floor >= k32_limit_up_floor) {	//�ƹ��� Ŭ������ k32_up �籸��
			k32_help = "���������Դϴ�.";
		} else {
			k32_floor = k32_floor + 2;	//�ֻ����� �ƴ� �� 2���� �ö�
			k32_help = String.format("%d���Դϴ�.", k32_floor);
		}
		
		this.k32_down();	//�Ʒ� k32_down()�� �����ϹǷ� 1�� ������ printf�� �����ص� �޼����� ��µȴ�.
		//���������� 2�� �ø����� 1�� �������鼭 �޼��� ����ϴ� �޼ҵ�
	}
	
	void k32_down() {
		super.k32_down();	//�ƹ��� Ŭ������ down�� ������ ����(super), ���� k32_upó�� ���� ĥ �ʿ����
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n",this.k32_help);	//Ŭ���� �ȿ��� �޼��� ����ϴ°� Ȯdls
		//this.k32_down(); ����! ���ȣ��� ������
	}
}
