package koreait.day05;

import java.util.Scanner;

public class C24_StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[��ȭ ���� �ı�]]");
		System.out.println("������ �� �� �ֽðڽ��ϱ�? (1~5) >>>");
		
		int count = sc.nextInt();
		
		System.out.println("��� 1");
		for(int i = 1; i <= count; i++) {
		System.out.print("��");
		}
		
		System.out.println("\n");
		
		System.out.println("��� 2");
		for(int i = 1; i <= count; i++)
		System.out.print("��");
		for(int i = 1; i <= 5-count; i++)
		System.out.print("��"); // 5-count
		
		System.out.println("\n");
		
		System.out.println("���2_2");
		for(int i = 0; i < 5; i++)
			if(i<count)
				System.out.print("��");
			else
				System.out.print("��");
		
		System.out.println("\n");
		
		System.out.println("���2_3");
		int k;		//loop counter ������ main�޼ҵ��� ��������
		for(k = 0; k < count; k++) //count=3�϶�
			System.out.print("��");
		System.out.println("\n");
		System.out.println("k="+k); //k=3, ���� for���� ���ᰡ �Ǵ� k��
		for(;k<5;k++) //���� k�� �ʱⰪ�� ���� �����൵ 3���� ������
			System.out.print("��");
		
		sc.close();
		
	}

}
