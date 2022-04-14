package javarunner;

import java.util.ArrayList;
import java.util.Scanner;

public class Javarunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int number = scanNum();
	      running(number);
	   }

	   public static int scanNum() {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Input runner number -> ");
	      int number = sc.nextInt();
	      return number;
	   }

	   public static void running(int number) {
	      ArrayList<String> runner = new ArrayList<String>();
	      ArrayList<ArrayList<String>> allRun = new ArrayList<ArrayList<String>>();
	      double result = 0;
	      while (result < 50) {
	         result += Math.random() * 9 + 1;
	         if (result >= 50) {
	            runner.add("Finish");
	            allRun.add(runner);
	         } else {
	            runner.add(String.valueOf(Math.round(result * 10) / 10.0) + "m ");
	         }

	      }
	      for (int i = 1; i <= 10; i++) {
	         try {
	            Thread.sleep(1000);
	            for (int j = 0 ; j < i; j++) {
	               for (int k = 0; k < allRun.get(j).size(); k++) {
	                  System.out.print(allRun.get(j).get(k));
	               }
	               System.out.println();
	            }
	            System.out.println();
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }

	}

}
