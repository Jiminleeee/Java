package java2_006;
// Ŭ����, ��ü, �ν��Ͻ� / 20220417 / k32_������ / �ּ������� k32_����
public class P005 {

	private static int k32_inVal;	// private(���� Ŭ���� �������� ���) ����� static ���� ���� ����
	public static void k32_up() {	// public ����� static �Լ� ���� / ���ϰ� ����
		k32_inVal++;	// ������ �� 1 ����
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k32_inVal);	// ��� ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k32_inVal = 0;	// ������ 0 �Է�
		P004 k32_elev;	// P004 Ŭ������ elev�� ����
		
		k32_elev = new P004(); // elev�� P004 Ŭ���� �Է�
		
		k32_up();	// ���� ������ �Լ� ����
		
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// ���� ���� i�� 0���� 9���� 1�� ������ ��
			k32_elev.k32_up();	// P004�� �ִ� up�Լ� ����
			System.out.printf("MSG[%s]\n", k32_elev.k32_help);	// ��� ���
		}
		
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// ���� ���� i�� 0���� 9���� 1�� ������ ��
			k32_elev.k32_down();	// P004�� �ִ� down�Լ� ����
			System.out.printf("MSG[%s]\n", k32_elev.k32_help);	// ��� ���
		
	}
}

	
}
