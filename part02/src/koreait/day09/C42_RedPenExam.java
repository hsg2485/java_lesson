package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C42_RedPenExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;		//������ ����
		int[] x1 = new int[size];		//��� ���� �ǿ�����1�� ������ �迭
		int[] x2 = new int[size];		//��� ���� �ǿ�����2�� ������ �迭
		int[] answer = new int[size];	//����ڰ� �Է��� ���� ������ �迭
		int cnt = 0;
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		for(int i = 0; i < x1.length; i++) {
			x1[i] = r.nextInt(89) + 11;		//11~99
			x2[i] = r.nextInt(89) + 11;
			System.out.printf("���� %2d. %d + %d = �� �Է� >>> ", i+1, x1[i], x2[i]);
			answer[i] = sc.nextInt();
			if(answer[i] == x1[i]+ x2[i]){
				cnt++;		//���� ���� ī��Ʈ
			}
		}
		System.out.println("ä���մϴ�. ���� ���� " + cnt + " ( " + cnt * 100 / size + " �� )");
		System.out.println("Ʋ�� ���� ���� ����");
		for(int i = 0; i < x1.length; i++) {
			if(answer[i] != x1[i] + x2[i]) {
				System.out.println(String.format("���� %2d. %d + %d = %3d", i+1,
						i+1, x1[i], x2[i], x1[i] + x2[i]));
				sc.close();
			}
		}
	}

}
