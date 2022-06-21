package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 구매금액 10만원 이상이면 적립금 구매금액의 10%
		 * 7만원이상 9%, 4만원 이상 7%, 그 미만 3%
		 */
		Scanner sc = new Scanner(System.in);
		
		int point;
		int pay;
		double rate;
		
		System.out.print("구매금액 : ");
		pay = sc.nextInt();
		
		if(pay >= 100000) {
			rate = 0.1;
		}
		else if(pay >= 70000) {
			rate = 0.09;
		}
		else if(pay >= 40000) {
			rate = 0.07;
		}
		else
			rate = 0.03;
		
		point = (int)(pay * rate);
		
		System.out.printf("고객님 ! 오늘 구매하신 금액의 적립금 %d원 입니다\n", point);
		System.out.printf("이벤트 기간 적립율 %d%% 적용 되었습니다", (int)(rate*100));
		
		sc.close();

	}

}
