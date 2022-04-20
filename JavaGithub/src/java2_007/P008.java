package java2_007;

import java.util.ArrayList;

public class P008 {
//ArrayList 2 / 20220420 / k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iTestMAX = 1000000;
		ArrayList k32_iAL = new ArrayList();
		
		for (int k32_i = 0; k32_i < k32_iTestMAX; k32_i++) {
			k32_iAL.add((int)(Math.random()*1000000));
		}
		
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {
			System.out.printf(" ArrayList %d = %d\n", k32_i, k32_iAL.get(k32_i));
		}
		
		System.out.println("******************************************");
		k32_iAL.sort(null);
		
		for (int k32_i =0; k32_i < k32_iAL.size(); k32_i++) {
			System.out.printf(" ArrayList %d = %d\n", k32_i, k32_iAL.get(k32_i));
		}
		
	}

}
