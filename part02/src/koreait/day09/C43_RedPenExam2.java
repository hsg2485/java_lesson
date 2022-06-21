package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C43_RedPenExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;		//문제 갯수
		//int max_size = MathProblem.max_size;		//size 변수 값이 max_size 초과하는지 검사 추가
		
		MathProblem[] problems = new MathProblem[size];
		//모든 문제 저장하는 배열
		
		//배열의 타입은 MathProblem 객체참조형 : n1, n2, op, isCorrect
		
		int ans;
		int cnt = 0;
		System.out.println("빨간펜 수학 2자리 덧셈 풀기");
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();		//n1, n2 값이 객체의 필드로 난수 생성
			//방법 1) System.out.print("문제 " + (i+1) + ".  " + temp.getN1() + "+ " 
			//			+ temp.getN2() + " =  답 입력 >>>");
			//방법 2)
			System.out.print("문제 " + (i+1) + ".  " + temp.problem() + "답 입력 >>> ");	
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) {	//정답과 비교.맞은 갯수 카운트
				cnt++;		//틀린 문제 카운트
				temp.setCorrect(true);
			}
			problems[i] = temp;
		}
		System.out.println("채점합니다 맞은 갯수 " + cnt + " ( " 
					+ (cnt*100/size) + " 점)");
		System.out.println("틀린 문제 정답 보기");
		/*방법1)
		 * for(int i = 0; i< problems.length; i++)
			//방법 1) if(problems[i].isCorrect() == false)		//틀렸을 때
			//방법 2)
			if(!problems[i].isCorrect())	//problems[i].isCorrect()이 거짓이면 !연산으로 참으로 바뀜
			System.out.println("문제 " + (i+1) + ".  " + problems[i].problem() 
					+ problems[i].showAnswer());
		*/
		//방법2) for each로 변경 : 문제 " + (i+1)은 출력 안함
		for(MathProblem temp : problems)
			if(!temp.isCorrect())
				System.out.println(temp.problem() + temp.showAnswer());
		sc.close();
	}

}
