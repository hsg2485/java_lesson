package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C43_RedPenExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;		//���� ����
		//int max_size = MathProblem.max_size;		//size ���� ���� max_size �ʰ��ϴ��� �˻� �߰�
		
		MathProblem[] problems = new MathProblem[size];
		//��� ���� �����ϴ� �迭
		
		//�迭�� Ÿ���� MathProblem ��ü������ : n1, n2, op, isCorrect
		
		int ans;
		int cnt = 0;
		System.out.println("������ ���� 2�ڸ� ���� Ǯ��");
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();		//n1, n2 ���� ��ü�� �ʵ�� ���� ����
			//��� 1) System.out.print("���� " + (i+1) + ".  " + temp.getN1() + "+ " 
			//			+ temp.getN2() + " =  �� �Է� >>>");
			//��� 2)
			System.out.print("���� " + (i+1) + ".  " + temp.problem() + "�� �Է� >>> ");	
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) {	//����� ��.���� ���� ī��Ʈ
				cnt++;		//Ʋ�� ���� ī��Ʈ
				temp.setCorrect(true);
			}
			problems[i] = temp;
		}
		System.out.println("ä���մϴ� ���� ���� " + cnt + " ( " 
					+ (cnt*100/size) + " ��)");
		System.out.println("Ʋ�� ���� ���� ����");
		/*���1)
		 * for(int i = 0; i< problems.length; i++)
			//��� 1) if(problems[i].isCorrect() == false)		//Ʋ���� ��
			//��� 2)
			if(!problems[i].isCorrect())	//problems[i].isCorrect()�� �����̸� !�������� ������ �ٲ�
			System.out.println("���� " + (i+1) + ".  " + problems[i].problem() 
					+ problems[i].showAnswer());
		*/
		//���2) for each�� ���� : ���� " + (i+1)�� ��� ����
		for(MathProblem temp : problems)
			if(!temp.isCorrect())
				System.out.println(temp.problem() + temp.showAnswer());
		sc.close();
	}

}
