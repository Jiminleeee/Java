package java2_007;

public class P006 {
// Ŭ������ �迭 / 20220420 / k32_������ / �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iPerson = 5;	// ������ ������ �л� �� ���� �� 5�� �ʱ�ȭ
		
		P006_OneRec [] k32_inData = new P006_OneRec[k32_iPerson];	// Ŭ���� �迭 ���� , ũ��� �л� ����
		
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {	// �л� �� ��ŭ 1�� �����ϸ� �ݺ� (for��)
			String k32_name = String.format("����%02d", k32_i);	//���ڿ� �̸����� (���� + �ѹ� ����)
			int k32_kor = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			int k32_eng = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			int k32_math = (int)(Math.random() * 100);	// �������� �����, �Ǽ��� > ���������� ����ȯ
			
			k32_inData[k32_i] = new P006_OneRec(k32_name, k32_kor, k32_eng, k32_math);	//������ ������ ������ �޴� �ٸ� �޼ҵ�� ����
			
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n",	// ����� ���¿� ���߾� ���
					k32_i, k32_inData[k32_i].k32_getName(), k32_inData[k32_i].k32_getKor(), k32_inData[k32_i].k32_getEng(),
					k32_inData[k32_i].k32_getMath(), k32_inData[k32_i].k32_getSum(), k32_inData[k32_i].k32_getAvg());
		}
		
	
	}

}
