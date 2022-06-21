package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		
		result = 10 > 5;
		System.out.println("10 > 5 의 결과: "+ result);
		
		System.out.println("9 != 9의 결과: " + (9!=9));
		System.out.println("9 == 9의 결과: " + (9==9));
		
		System.out.println("논리연산 결과 확인하기 : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		//Dead code라고 나오는 이유
		// ㄴ아래 2개의 논리식은 첫번 째 값이 false이므로 두번 째 값 상관없이 false
		System.out.println(" false and true = " + (false && true));
		System.out.println(" false and false = " + (false && false));
		
		System.out.println("논리연산 결과 확인하기 : or");
		//Dead code라고 나오는 이유
	    // ㄴ아래 2개의 논리식은 첫번 째 값이 true이므로 두번 째 값 상관없이 true
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));

		System.out.println("논리연산 결과 확인하기 : not");
		System.out.println(" not ture = " + !true);    //true 값을 반대(not)값으로 바꿈
		System.out.println(" not false = " + !false);

		int korean, math;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수: ");
		korean = sc.nextInt();
		System.out.println("수학 점수: ");
		math = sc.nextInt();
		System.out.println("모범 학생? "+ (korean >=80 && math >=80));
		System.out.println("특기 학생? "+ (korean >=90 || math >=90));
		System.out.println("특이한 학생? " + !(korean >= 20 && korean <= 80));
		
		sc.close();

	}

}
/*
 * boolean은 true 또는 false 값을 가짐 (Boolean 래퍼 클래스 있음)
 */
