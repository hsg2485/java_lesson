package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++)
			System.out.println("hello!(" +(i+1)+")");
		
		
		int j = 0;
		while(j<5) {
			System.out.println("hello!(" +(j+1)+")");
			j++;
		}
			//���� : for ���� 1���� 100���� ���ϴ� �������� ���� ������� �� �� ����
			//       while���� ���� �������� ���� ������ ������� �� �� ����
		    //		 �ݺ����� �Բ� ����ϴ� ��ɹ�: break, continue(continue ���� ��ɵ� �������� �ʰ� �ݺ� ó������ ���ư�)
			int k = 0, sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("[ver1] (����: -1)");
			while(k!=-1) {	//k�� -1�� �ƴ� ���� �ݺ� ����
				System.out.println("���� �Է�>>> (����: -1)");
				k = sc.nextInt();
				sum += k;
			}
			System.out.println("sum = " + sum);
			
			sum = 0;
			k = 0;
			System.out.println("[ver2] (����: -1)");
			do {
				sum+=k;
				System.out.println("���� �Է�>>> (����: -1)");
				k = sc.nextInt();
			} while(k!=-1);		//������ �ڿ��� �˻�
			System.out.println("sum = " + sum);
			
			sum = 0;
			k = 0;
			System.out.println("[ver2.1] (����: -1)");
			while(true) {
				System.out.println("���� �Է�>>>");
				k = sc.nextInt();
				if(k==-1)	//�׻� ���� ��, Ż��(����) ���ǰ� break�� ���
					break;	
				sum += k;
			}
			System.out.println("sum = " + sum);
			
			sum = 0;
			k = 0;
			System.out.println("[ver2.2]");
			boolean isState = true;
			while(isState) {
				System.out.println("���� �Է�>>>");
				k = sc.nextInt();
				if(k==-1) 
					isState = false;		//boolean ������ Ȱ��. ���� ���� ���� �� boolean ���� �� false�� ��
				else 
					sum += k;
			}
			System.out.println("sum = " + sum);
			
			//continue ����: �Էµ� ���� 10�� ����̸� sum �� ������ �ʰ� �ٽ� �Է¹ޱ�
			System.out.println("�Էµ� ���� 10�� ����̸� sum �� ������ �ʰ� �ٽ� �Է¹ޱ�");
			while(true) {
				System.out.println("���� �Է�>>>");
				k = sc.nextInt();
				if(k == -1)
					break;
				if(k%10==0) 
					continue;
				sum+=k;
			}
			System.out.println("sum = " + sum);
			sc.close();
	}
}
