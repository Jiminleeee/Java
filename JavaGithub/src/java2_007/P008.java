package java2_007;

import java.util.ArrayList;

public class P008 {
//ArrayList 2 / 20220420 / k32_������ / �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iTestMAX = 1000000;	// ������ ���� ���� �� �ʱ�ȭ
		ArrayList k32_iAL = new ArrayList();	// arrayList ����
		
		for (int k32_i = 0; k32_i < k32_iTestMAX; k32_i++) {	// ������ŭ 1�� �����ϸ� (for��)
			k32_iAL.add((int)(Math.random()*1000000));	// �迭�� �������� ���� �߰�
		}
		
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {	// �迭 �����ŭ 1�� �����ϸ� (for��)
			System.out.printf(" ArrayList %d = %d\n", k32_i, k32_iAL.get(k32_i));	// �迭 ���
		}
		
		System.out.println("******************************************");
		k32_iAL.sort(null);		// �迭 �����ϱ�
		
		for (int k32_i =0; k32_i < k32_iAL.size(); k32_i++) {	// �迭�� �����ŭ 1�� �����ϸ� �ݺ� (for��)
			System.out.printf(" ArrayList %d = %d\n", k32_i, k32_iAL.get(k32_i));	// �迭 ����ϱ�
		}
		
	}

}
