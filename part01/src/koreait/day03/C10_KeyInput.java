package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {

	public static void main(String[] args) {
		//sc�� �������̰� �⺻�� ������ �ƴ� Ŭ���� Ÿ���� ����(�ʵ�� �޼ҵ� ����) => ������ ����
		//		�� new �������� ����� ��ü�� Ŭ���� �̸��� ���� �̸����� ���� ����
		Scanner sc = new Scanner(System.in);
		//Ű���� �Է��� ���� ���� sc ����. => ǥ�� �Է����� Scanner ��ü�� ����� ���� sc�� ����
		int data;
		System.out.print("���� �� �Է�: ");
		data = sc.nextInt();
		System.out.println("�Էµ� ���� " + data+ " �Դϴ�");
		
		double point; 
		System.out.println("�Ǽ� �� �Է�: ");
		
		point = sc.nextDouble();
		System.out.println("�Էµ� ���� " + point + " �Դϴ�.");

	}

}
/*
 * 	ǥ�� ��� : System.out		(out�� System Ŭ������ ������ �ʵ��̰� �޼ҵ� println()�� ����)
 *  ǥ�� �Է� : System.in        ->in�� System Ŭ������ ������ �ʵ�
 *  					 -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 * 						 -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
 * 							(�⺻��Ű�� java.lang�� import���� ���)
 * 
 * import ����Ű : ctrl+Shift+O
 */
