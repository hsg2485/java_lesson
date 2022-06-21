package koreait.day04;

import java.util.Scanner;
//작성자 : 한성구
public class C18_ReviewEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int korean, english, science;
		int sum;
		double average;
		String best;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		korean = sc.nextInt();
		System.out.print("영어 : ");
		english = sc.nextInt();
		System.out.print("과학 : ");
		science = sc.nextInt();
		
		/*if(korean >=90) {
			best = "국어";
		}
		else if(english >= 90) {
			best = "영어";
		}
		else
			best = "과학";
		*/
		
		if (korean > english && korean > science) {
			best = "국어";
		} else if (english > korean && english > science) {
			best = "영어";
		} else {
			best = "과학";
		}
		
		sum = korean+english+science;
		average = ((double)(korean+english+science))/3;
		
		System.out.println("처리되었습니다.");
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %d (%.2f), 과목수 : 3\n",(int)average, average);
		System.out.println("특기과목은 " + best + " 입니다.");
		
		sc.close();
	}

}
