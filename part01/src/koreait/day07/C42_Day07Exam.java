package koreait.day07;

import java.util.Random;
import java.util.Scanner;

/*1. 덧셈 문제는
두자리 덧셈입니다.

2. 문제는 난수로 만듭니다.

3. 테스트할때는 문제를
5개로 줄여서 하세요.

4. 클래스 활용아니고
int 형 배열로만 하세요.

5. 첫번째 피연산자 배열
   두번째 피연산자 배열
   사용자 입력 정답저장 배열

모든문제 10개를 저장? or
틀린문제만 저장?
*/
//작성자: 한성구

public class C42_Day07Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[] x = new int[5];
		    int[] y = new int[5];
		    int[] answer = new int[5];  // 적을 답
		    int count = 0, score = 0;
		    Scanner sc = new Scanner(System.in); 
		    Random r = new Random(); 
		    //틀린문제 정답 보는 것도 for문으로 작성	   
		    System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		 
		    for(int i = 0; i < 5; i++) {	//무작위 문제 5개 생성 및 배열에 저장
		    	x[i] = r.nextInt(89)+10;	
		    	y[i] = r.nextInt(89)+10;
		    	//사용자가 입력한 정답이 틀리면 배열에 저장해서 출력하는 방식?
		    	System.out.printf("문제 %d. %d + %d = ? : \n", i+1, x[i], y[i]);
			    answer[i] = sc.nextInt();	// 적은 답 
			    if(answer[i] == x[i] + y[i]) {
	            count++;
	            score += 20;
			    }
		    }
		    for(int i = 0; i< 5; i++) 
		        if(answer[i] != x[i] + y[i]) {
		            System.out.println("오답!\n" + x[i] + "+" + y[i] + " = " + (x[i] + y[i])
		            		+" 입니다.");
		        }
		    System.out.printf("채점합니다. 맞은 갯수 : %d (%d점)",count, score);
		    sc.close();
		    
	}
}
