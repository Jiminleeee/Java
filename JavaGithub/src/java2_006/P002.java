package java2_006;

// ������ �޼���(2) / 20220417 / k32_������ / �ּ��� k32_����
public class P002 {

	static int k32_iStatic; // ������ Ŭ���� �������� ����ϴ� static���� ����(���� ��� ����)

	public static void add(int k32_i) { // �Լ�(�޼���) add ���� (���� i ���)
		k32_iStatic++; // ���� iStatic�� 1 ����
		k32_i++; // ���� i�� 1 ����
		System.out.printf("add�޼ҵ忡�� => k32_iStatic = [%d]\n", k32_iStatic); // ���� iStatic ���
		System.out.printf("add�޼ҵ忡�� => k32_i = [%d]\n", k32_i); // ���� i ���
	}

	public static int add2(int k32_i) { // �Լ�(�޼���) add ���� (���� i ���)
		k32_iStatic++; // ��� ���� iStatic�� 1 ����
		k32_i++; // ���� i�� 1 ����
		System.out.printf("add�޼ҵ忡�� => k32_iStatic = [%d]\n", k32_iStatic); // ���� iStatic ���
		System.out.printf("add�޼ҵ忡�� => k32_i = [%d]\n", k32_i); // ���� i ���
		return k32_i; // ������ �޼ҵ� ���� �����Ͽ� �Ű������� �����ϰ� ���Ϲ޴� ���·� ���
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k32_iMain; // ���� ���� iMain�� ����

		k32_iMain = 1; // ���� iMain�� 1�� �ʱ�ȭ
		k32_iStatic = 1; // ������ Ŭ���� �������� ����ϴ� static���� ����(���� ��� ����)

		System.out.printf("*************************************\n");
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k32_iStatic=[%d]\n", k32_iStatic); // ���� iStatic ��� > 1
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k32_iMain=[%d]\n", k32_iMain); // ���� iMain ��� > 1
		System.out.printf("*************************************\n");

		add(k32_iMain); // �Լ� add�� ���� (���� iMain�� ����)

		System.out.printf("*************************************\n");
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k32_iStatic=[%d]\n", k32_iStatic);// ���� iStatic ��� > 2 (1 ���������Ƿ�)
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k32_iMain=[%d]\n", k32_iMain); // ���� iMain ��� > 1 (add���� ���ϰ��� ����)
		System.out.printf("*************************************\n");

		k32_iMain = add2(k32_iMain); // �Լ� add2�� ���� (���� iMain�� ����)

		System.out.printf("*************************************\n");
		System.out.printf("�޼ҵ� add2 ȣ�� �� ���ο��� -> k32_iStatic=[%d]\n", k32_iStatic);// ���� iStatic ��� > 3 (1 ���������Ƿ�)
		System.out.printf("�޼ҵ� add2 ȣ�� �� ���ο��� -> k32_iMain=[%d]\n", k32_iMain); // ���� iMain ��� > 2 (add2���� ���ϰ��� �ִ�)
		System.out.printf("*************************************\n");

	}

}
