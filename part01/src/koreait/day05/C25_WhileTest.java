package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++)
			System.out.println("hello!(" +(i+1)+")");
		
		
		int j = 0;
		while(j<5) {
			System.out.println("hello!(" +(j+1)+")");
			j++;
		}
			//예시 : for 문은 1부터 100까지 더하는 연속적인 값을 대상으로 할 때 적합
			//       while문은 아직 정해지지 않은 값들을 대상으로 할 때 적합
		    //		 반복문과 함께 사용하는 명령문: break, continue(continue 뒤의 명령들 실행하지 않고 반복 처음으로 돌아감)
			int k = 0, sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("[ver1] (종료: -1)");
			while(k!=-1) {	//k가 -1이 아닌 동안 반복 실행
				System.out.println("정수 입력>>> (종료: -1)");
				k = sc.nextInt();
				sum += k;
			}
			System.out.println("sum = " + sum);
			
			sum = 0;
			k = 0;
			System.out.println("[ver2] (종료: -1)");
			do {
				sum+=k;
				System.out.println("정수 입력>>> (종료: -1)");
				k = sc.nextInt();
			} while(k!=-1);		//조건을 뒤에서 검사
			System.out.println("sum = " + sum);
			
			sum = 0;
			k = 0;
			System.out.println("[ver2.1] (종료: -1)");
			while(true) {
				System.out.println("정수 입력>>>");
				k = sc.nextInt();
				if(k==-1)	//항상 참일 때, 탈출(종료) 조건과 break문 사용
					break;	
				sum += k;
			}
			System.out.println("sum = " + sum);
			
			sum = 0;
			k = 0;
			System.out.println("[ver2.2]");
			boolean isState = true;
			while(isState) {
				System.out.println("정수 입력>>>");
				k = sc.nextInt();
				if(k==-1) 
					isState = false;		//boolean 변수를 활용. 종료 조건 값일 때 boolean 변수 값 false로 함
				else 
					sum += k;
			}
			System.out.println("sum = " + sum);
			
			//continue 연습: 입력된 값이 10의 배수이면 sum 에 더하지 않고 다시 입력받기
			System.out.println("입력된 값이 10의 배수이면 sum 에 더하지 않고 다시 입력받기");
			while(true) {
				System.out.println("정수 입력>>>");
				k = sc.nextInt();
				if(k == -1)
					break;
				if(k%10==0) 
					continue;
				sum+=k;
			}
			System.out.println("sum = " + sum);
			sc.close();
	}
}
