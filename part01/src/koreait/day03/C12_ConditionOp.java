package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
// ���ǿ����� => ���ǽ�? ��/����(true) : ��/����(false)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int korean, math;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ����: ");
		korean = sc.nextInt();
		System.out.println("���� ����: ");
		math = sc.nextInt();
		System.out.println("��� �л�? "+ ((korean >=80 && math >=80)? "����" : "�ƴ�"));
		
		// {    } �ȿ� ���� ����� 1���� ���� ������ �� ����
		/*if(korean >= 80 && math >= 80) 
			System.out.println("����л�");		
		else 
			System.out.println("����л� �ƴ�");
		*/
		if(korean >= 80 && math >= 80) {
			System.out.println("����л�");
		}
		else {
			System.out.println("����л� �ƴ�");
		}
		
		// else {  }�� �ش��ϴ� ���� ������ ���� ����
		if(!(korean >= 20 && korean <= 80))
		System.out.println("ǥ������ ���� ū ������");
		
		
		
		sc.close();

	}

}
