package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
// 조건연산자 => 조건식? 값/수식(true) : 값/수식(false)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int korean, math;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수: ");
		korean = sc.nextInt();
		System.out.println("수학 점수: ");
		math = sc.nextInt();
		System.out.println("모범 학생? "+ ((korean >=80 && math >=80)? "맞음" : "아님"));
		
		// {    } 안에 들어가는 명령이 1개일 때는 생략할 수 있음
		/*if(korean >= 80 && math >= 80) 
			System.out.println("모범학생");		
		else 
			System.out.println("모범학생 아님");
		*/
		if(korean >= 80 && math >= 80) {
			System.out.println("모범학생");
		}
		else {
			System.out.println("모범학생 아님");
		}
		
		// else {  }에 해당하는 내용 없으면 생략 가능
		if(!(korean >= 20 && korean <= 80))
		System.out.println("표준편차 값이 큰 점수임");
		
		
		
		sc.close();

	}

}
