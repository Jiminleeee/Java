package java2_006;
//����������3 / 20220417 / k32_������ / �ּ����� k32_���� / public���� ����� ���� �� ��� ����
public class P011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P011_elev3 k32_elev3;	//P011_elev3 Ŭ������ ȣ��
		
		k32_elev3 = new P011_elev3();	//P011_elev3 Ŭ������ elev3�� ȣ��
		
		for(int k32_i = 0; k32_i < 10; k32_i++) {	//������ ������ 0���� 9���� 1�� �����ϴ� ����
			k32_elev3.k32_up();	// elev3Ŭ������ up �޼ҵ� ����
			System.out.printf("MSG k32_elev3[%s]\n",k32_elev3.k32_help);	// ��� ���
		}
		
		for(int k32_i = 0; k32_i < 10; k32_i++) {	//������ ������ 0���� 9���� 1�� �����ϴ� ����
			k32_elev3.k32_down();	// elev3Ŭ������ down �޼ҵ� ����
			System.out.printf("MSG k32_elev3[%s]\n",k32_elev3.k32_help);	// ��� ���
		}
		
		// extends(���) �޾Ƽ� ����� �Լ��� ���� ����Ǿ� ��µȴ�.
		k32_elev3.k32_Repair();	//������ �޼��� �Է� �޼ҵ� ����
		System.out.printf("MSG k32_elev3[%s]\n",k32_elev3.k32_help);	// �Էµ� �޼��� ��� ���
	}

}
