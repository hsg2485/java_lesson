package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ���űݾ� 10���� �̻��̸� ������ ���űݾ��� 10%
		 * 7�����̻� 9%, 4���� �̻� 7%, �� �̸� 3%
		 */
		Scanner sc = new Scanner(System.in);
		
		int point;
		int pay;
		double rate;
		
		System.out.print("���űݾ� : ");
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
		
		System.out.printf("���� ! ���� �����Ͻ� �ݾ��� ������ %d�� �Դϴ�\n", point);
		System.out.printf("�̺�Ʈ �Ⱓ ������ %d%% ���� �Ǿ����ϴ�", (int)(rate*100));
		
		sc.close();

	}

}
