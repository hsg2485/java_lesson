package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * �л� ����(����) ���� ���� �ۼ�
		 * �л� �� 100�� - ������ ���������� �׽�Ʈ(0<=����<=100)
		 * 
		 * 90~100: 0��(�Ҽ��� 1�ڸ�%)		ī��Ʈ������ 5�� �ʿ���(cntA, cntB, cntC, cntD, cntE)
		 * 80~89: 0��(�Ҽ��� 1�ڸ�%)						�� counts[5] 
		 * 70~79: 0��(�Ҽ��� 1�ڸ�%)
		 * 60~69: 0��(�Ҽ��� 1�ڸ�%)
		 * 50~59: 0��(�Ҽ��� 1�ڸ�%)
		 * 
		 */
		
		int[]	students = new int [100];
		int [] counts = new int[5];
		Random score = new Random();
		
		for(int i = 0; i < students.length; i++) {
			students[i] = score.nextInt(101);
		}//���� ���� ����
		
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
		
		System.out.printf("90~100��: %d��(%.1f%%)\n", counts[0], (double)counts[0]/students.length*100 );
		System.out.printf("80~89��: %d��(%.1f%%)\n", counts[1], (double)counts[1]/students.length*100);
		System.out.printf("70~79��: %d��(%.1f%%)\n", counts[2], (double)counts[2]/students.length*100);
		System.out.printf("60~69��: %d��(%.1f%%)\n", counts[3], (double)counts[3]/students.length*100);
		System.out.printf("50~59��: %d��(%.1f%%)\n", counts[4], (double)counts[4]/students.length*100);
	
	}
	

}
//�迭���� ����� ���(������ ����/����, ũ�⵵ �������� ����)�� ���� �ڹ� ArrayList
//�迭������ ���� ������ ����/������ ���� => �޼ҵ� ����
