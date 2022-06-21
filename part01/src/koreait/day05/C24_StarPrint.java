package koreait.day05;

import java.util.Scanner;

public class C24_StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[영화 감상 후기]]");
		System.out.println("평점을 몇 점 주시겠습니까? (1~5) >>>");
		
		int count = sc.nextInt();
		
		System.out.println("방법 1");
		for(int i = 1; i <= count; i++) {
		System.out.print("★");
		}
		
		System.out.println("\n");
		
		System.out.println("방법 2");
		for(int i = 1; i <= count; i++)
		System.out.print("★");
		for(int i = 1; i <= 5-count; i++)
		System.out.print("☆"); // 5-count
		
		System.out.println("\n");
		
		System.out.println("방법2_2");
		for(int i = 0; i < 5; i++)
			if(i<count)
				System.out.print("★");
			else
				System.out.print("☆");
		
		System.out.println("\n");
		
		System.out.println("방법2_3");
		int k;		//loop counter 변수가 main메소드의 지역변수
		for(k = 0; k < count; k++) //count=3일때
			System.out.print("★");
		System.out.println("\n");
		System.out.println("k="+k); //k=3, 위의 for문이 종료가 되는 k값
		for(;k<5;k++) //따라서 k의 초기값을 지정 안해줘도 3부터 시작함
			System.out.print("☆");
		
		sc.close();
		
	}

}
