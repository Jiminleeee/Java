package java2_004;

public class P010 {
// ���� �б� / 20220415 / k32_������ // �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k32_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" }; // ���ڿ� �迭�� units�� �����ϰ� �ʱ�ȭ �Ѵ�
		for (int k32_i = 0; k32_i < 101; k32_i++) { // ������ ���� i�� 0���� 100���� 1�� ������ �� (for��)
			if (k32_i >= 0 && k32_i < 10) { // i�� 0�̻� 10 �̸��̸� (if��)
				System.out.printf("�����ڸ� : %s\n", k32_units[k32_i]); // �迭���� �ùٸ� ���� �б⸦ ã�� ���
			} else if (k32_i >= 10 && k32_i < 100) { // i�� 10�̻� 100�̸� �̸� (if��)
				int k32_i10, k32_i0; // ������ ���� i10�� i0�� ����
				k32_i10 = k32_i / 10; // i10�� ���� i/10���� �ʱ�ȭ (���� �ڸ�)
				k32_i0 = k32_i % 10; // i0�� ���� i%10���� �ʱ�ȭ (���� �ڸ�)
				
				if (k32_i0 == 0) { // i0(���� �ڸ�)�� 0�̸�
					System.out.printf("�����ڸ� : %s��\n", k32_units[k32_i10]); // �迭���� i10��ġ�� ���
				} else { // i0(���� �ڸ�)�� 0�� �ƴϸ�
					System.out.printf("�����ڸ� : %s��%s\n", k32_units[k32_i10], k32_units[k32_i0]); // �迭���� i10��ġ, i0��ġ�� ���
				}
			} else
				System.out.printf("==> %d\n", k32_i); // i�� �� �� ���ǽ��� �������� ������(100 �̻� �̸�) i�� ���
		}
	}

}