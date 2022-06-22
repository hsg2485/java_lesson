package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import koreait.day09.MathProblem;

//C43_RedPenExam2 ���� ����Ʈ�� �ٲٱ�
//�ۼ���: �Ѽ���
public class C48_MathList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		
		ArrayList<MathProblem> problems = new ArrayList<>();
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
			problems.add(temp);
			//problems.add(i,temp); for������ i���� ����ؼ� ��ȭ�ϹǷ� i ���� ����
		}
		System.out.println("ä���մϴ� ���� ���� " + cnt + " ( " 
					+ (cnt*100/size) + " ��)");
		System.out.println("Ʋ�� ���� ���� ����");
	
		for(int i = 0; i< problems.size(); i++)
			//��� 1) if(problems[i].isCorrect() == false)		//Ʋ���� ��
			
			if(!problems.get(i).isCorrect())	//problems[i].isCorrect()�� �����̸� !�������� ������ �ٲ�
			System.out.println("���� " + (i+1) + ".  " + problems.get(i).problem() 
					+ problems.get(i).showAnswer());
		
		//���2) for each�� ���� : ���� " + (i+1)�� ��� ����
		/*for(MathProblem temp : problems)
			if(!temp.isCorrect())
				System.out.println(temp.problem() + temp.showAnswer());
				*/
		sc.close();

	}

}
