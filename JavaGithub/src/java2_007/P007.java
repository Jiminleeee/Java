package java2_007;

import java.util.ArrayList;
//ArrayList / 20220420 / k32_������ / �ּ����� k32_����
public class P007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k32_iAL = new ArrayList();	// ArrayList ����
		// ArrayList�� ������ ���� ���� �߰� , .add Ȱ�� 
		// ArrayList�� ó�� String���� ä��� �����Ͽ����� string���� �־�� �Ѵ�. > �߰��� ���� ���� �ȵ�!
		k32_iAL.add("abc");
		k32_iAL.add("abcd");
		k32_iAL.add("efga");
		k32_iAL.add("������0");
		k32_iAL.add("1234");
		k32_iAL.add("12rk34");
		
		System.out.printf("*******************************************\n");
		System.out.printf(" ���� ArraySize %d \n", k32_iAL.size());
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {
			System.out.printf(" ArrayList %d = %s\n", k32_i, k32_iAL.get(k32_i));
		}
		
		k32_iAL.set(3, "������");
		System.out.printf("*******************************************\n");
		System.out.printf(" ���뺯�� ArraySize %d \n", k32_iAL.size());
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {
			System.out.printf(" ArrayList %d = %s\n", k32_i, k32_iAL.get(k32_i));
		}
		
		k32_iAL.remove(4);
		System.out.printf("*******************************************\n");
		System.out.printf(" ���뺯�� ArraySize %d \n", k32_iAL.size());
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {
			System.out.printf(" ArrayList %d = %s\n", k32_i, k32_iAL.get(k32_i));
		}
		
		k32_iAL.sort(null);
		System.out.printf("*******************************************\n");
		System.out.printf(" ����ƮSort ArraySize %d \n", k32_iAL.size());
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {
			System.out.printf(" ArrayList %d = %s\n", k32_i, k32_iAL.get(k32_i));
		}
		
		k32_iAL.clear();
		System.out.printf("*******************************************\n");
		System.out.printf(" ���� ���� ArraySize %d \n", k32_iAL.size());
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {
			System.out.printf(" ArrayList %d = %s\n", k32_i, k32_iAL.get(k32_i));
		}
		
		
		
	}

}
