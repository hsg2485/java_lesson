package koreait.day03;

import java.util.Scanner;
//작성자 : 한성구
public class C13_MaxMinEx2 {

	public static void main(String[] args) {
		int num1, num2, num3;
		int max, min;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수 입력: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		if(max < num3) {
			max = num3;
		}
		if(min > num3) {
			min = num3;
		}
		System.out.println("가장 큰 정수는 : " + max);
		System.out.println("가장 작은 정수는 : " + min);
		sc.close();
	}

}
