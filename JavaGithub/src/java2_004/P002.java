package java2_004;

public class P002 {
// switch/case�� / 20220415 / k32_������ / �ּ����� k32_�� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k32_jumin = "123456-1234567";	// ���ڿ� jumin ���� �� �ʱ�ȭ
		
		switch (k32_jumin.charAt(7)) {	// jumin�� 7��° ��ġ�� �ִ� ���ڿ� ���Ͽ�
			case '1' : 	// ���ڰ� 1�̸�
				System.out.printf("20������ �¾ ���� ���\n");	// ���๮ ���
				break;
			case '2' : 	// ���ڰ� 2�̸�
				System.out.printf("20������ �¾ ���� ���\n");	// ���๮ ���
				break;	// �ش� case���� ���� ����
			case '3' : 	// ���ڰ� 3�̸�
				System.out.printf("20���� �� �¾ ���� ���\n");	// ���๮ ���
				break;	// �ش� case���� ���� ����
			case '4' : 	//���ڰ� 4�̸�
				System.out.printf("20���� �� �¾ ���� ���\n");	// ���๮ ���
				break;	// �ش� case���� ��������
			default : // ���� case�鿡 �ش��� �ȵǴ� ���
				System.out.printf("���\n");	// ���๮ ���
				break;	// �ش� default���� ��������
		}
	}
// ����! �� �ڵ忡�� ���� ������ ���� �ʴ´�. �ٸ� ����� �̻����� �� �� �ִ�. 
// case '1'�� break���� ���� ������ ���������� ���ϰ� �״�� case '2'���� ���� �� ���������� �����̴�.
}
