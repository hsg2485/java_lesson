package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * 학생 성적(국어) 분포 보고서 작성
		 * 학생 수 100명 - 점수는 랜덤값으로 테스트(0<=난수<=100)
		 * 
		 * 90~100: 0명(소수점 1자리%)		카운트변수가 5개 필요함(cntA, cntB, cntC, cntD, cntE)
		 * 80~89: 0명(소수점 1자리%)						ㄴ counts[5] 
		 * 70~79: 0명(소수점 1자리%)
		 * 60~69: 0명(소수점 1자리%)
		 * 50~59: 0명(소수점 1자리%)
		 * 
		 */
		
		int[]	students = new int [100];
		int [] counts = new int[5];
		Random score = new Random();
		
		for(int i = 0; i < students.length; i++) {
			students[i] = score.nextInt(101);
		}//국어 점수 저장
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] >= 90) {
				counts[0] += 1;
			}
			else if(students[i] >= 80) {
				counts[1] ++;
			}
			else if(students[i] >= 70) {
				counts[2] ++;
			}
			else if(students[i] >= 60) {
				counts[3] ++;
			}
			else if(students[i] >= 50){
				counts[4] ++;
			}
		}
		
		System.out.printf("90~100점: %d명(%.1f%%)\n", counts[0], (double)counts[0]/students.length*100 );
		System.out.printf("80~89점: %d명(%.1f%%)\n", counts[1], (double)counts[1]/students.length*100);
		System.out.printf("70~79점: %d명(%.1f%%)\n", counts[2], (double)counts[2]/students.length*100);
		System.out.printf("60~69점: %d명(%.1f%%)\n", counts[3], (double)counts[3]/students.length*100);
		System.out.printf("50~59점: %d명(%.1f%%)\n", counts[4], (double)counts[4]/students.length*100);
	
	}
	

}
//배열에서 기능이 향상(데이터 삭제/삽입, 크기도 동적으로 변경)된 것이 자바 ArrayList
//배열에서는 직접 데이터 삽입/삭제를 구현 => 메소드 정의
