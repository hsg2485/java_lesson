package koreait.day04;

import java.util.Scanner;
//�ۼ��� : �Ѽ���
public class C18_ReviewEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int korean, english, science;
		int sum;
		double average;
		String best;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		korean = sc.nextInt();
		System.out.print("���� : ");
		english = sc.nextInt();
		System.out.print("���� : ");
		science = sc.nextInt();
		
		/*if(korean >=90) {
			best = "����";
		}
		else if(english >= 90) {
			best = "����";
		}
		else
			best = "����";
		*/
		
		if (korean > english && korean > science) {
			best = "����";
		} else if (english > korean && english > science) {
			best = "����";
		} else {
			best = "����";
		}
		
		sum = korean+english+science;
		average = ((double)(korean+english+science))/3;
		
		System.out.println("ó���Ǿ����ϴ�.");
		System.out.printf("���� : %d\n", sum);
		System.out.printf("��� : %d (%.2f), ����� : 3\n",(int)average, average);
		System.out.println("Ư������� " + best + " �Դϴ�.");
		
		sc.close();
	}

}
