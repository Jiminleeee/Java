package java2_006;
//Ŭ���� ����� / 20220417 / k32_������ / �ּ����� k32_����
public class P013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iPerson = 10;	//������ ������ �ο��� ���� �� 10���� �ʱ�ȭ
		
		P013_InputData k32_inData = new P013_InputData(k32_iPerson);	//�ٸ� Ŭ������ k32_inData�� ����
		
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {	// ��� �� ��ŭ �ݺ� (for��)
			String k32_name = String.format("����%02d", k32_i);	//���ڿ� �̸����� (���� + �ѹ� ����)
			//���� �Լ��� 0�̻� ~ 1�̸��� double�� ���� �������� ����, 0���� 100���̸� ��������� ���ϱ� 100�ǽ�
			int k32_kor = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			int k32_eng = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			int k32_math = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			// ������ ������ ������ �޴� �ٸ� Ŭ������ �޼ҵ�� ����
			k32_inData.k32_SetDate(k32_i,k32_name,k32_kor,k32_eng,k32_math);	
		}
		
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {	// ���� �ο��� ��ŭ �ݺ� (for��)
			// ��ȣ, �ٸ� Ŭ�������� ����� �迭���� �ʿ��� ��, ��Ŀ� ���缭 ��� ���(�л��� ����, ����, ���)
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n",
					k32_i, k32_inData.k32_name[k32_i], k32_inData.k32_kor[k32_i], k32_inData.k32_eng[k32_i],
					k32_inData.k32_math[k32_i], k32_inData.k32_sum[k32_i], k32_inData.k32_avg[k32_i]);
		}
	}

}
