package java2_007;

public class P005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] k32_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};	// ������ �迭 ���� �� �ʱ�ȭ
		
		for (int k32_i = 0; k32_i < k32_iArray.length; k32_i++) {	// ������ �迭�� ������ŭ 1�� �����ϸ� �ݺ� (for��)
			System.out.printf("iArray[%d]=%d\n", k32_i, k32_iArray[k32_i]);		// ��� ���
		}
		//MAX ã��
		int k32_iMax = k32_iArray[0];	// ó�� ���� �迭���� ����
		int k32_iMaxPt = 0;	// �ƽ� ������ ��ġ�� 0���� ����
		for (int k32_i = 0; k32_i < k32_iArray.length; k32_i++) {	// �迭�� ������ŭ 1�� �����ϸ� �ݺ� (for��)
			if(k32_iMax < k32_iArray[k32_i]) {	// ���� ���� �ƽ� �������� �迭���� ũ�ٸ�
				k32_iMax = k32_iArray[k32_i];	// ���� �ƽ� ���� ���� �迭������ �ٲٰ�
				k32_iMaxPt = k32_i;				// ���� �ƽ� ������ �迭 ��ġ ���� �ٲ۴�
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k32_iMaxPt, k32_iMax);	// ��� ���
	}

}
