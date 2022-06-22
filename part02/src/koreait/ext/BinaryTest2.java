package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {
		
		int n10 = 123;
		int n16 = 0xa41c;	//16���� ǥ��� 0x�� ������
		int n2 = 0b1010010000011100;		//2���� ǥ��� 0b�� ������
		
		System.out.println("1. ������ �״�� ���");
		System.out.println("10���� ���ͷ� 123 : " + n10);
		System.out.println("16���� ���ͷ� 0xa41c : " + n16);		//������ ����� format ���� ���ϸ� 10������ ��µ�
		System.out.println("2���� ���ͷ� 0b1010010000011100 : " + n2);
		
		System.out.println("2. format �����Ͽ� 16���� ���");
		System.out.println(String.format("16���� ���ͷ� 0xa41c : %x", n16));		//16���� ���� %x
		System.out.println(String.format("2���� ���ͷ� 0b1010010000011100 : %x", n2));
		System.out.println(String.format("10���� ���ͷ� 42012 : %x", 42012));
		//��� : 10���� 42012, n16�� n2 ���� ���� �޸𸮿� ����� ���� ��� ������ 0,1 ǥ������
		
		System.out.println("3. -1�� 2����, 16���� ǥ�� Ȯ��");
		n16 = 0xffffffff;
		System.out.println("16���� 0xffffffff : " + n16);		//-1
		System.out.printf("-1�� 16���� %x\n", -1);
		System.out.println("-1�� 2���� : " + Integer.toBinaryString(-1));
		
		System.out.println("3. �Է��� 2���� �Ǵ� 16���� ���� 10������ �ٲپ� �帳�ϴ�");
		Scanner sc = new Scanner(System.in);
		System.out.println("2���� �� �Է� >>>");
		String t2 = sc.nextLine();
		System.out.println("16���� �� �Է� >>>");
		String t16 = sc.nextLine();
		
		//������ Integer.parseInt(s) �� �����̾��� s ���ڿ��� 10���� ǥ���̶�� �ǹ�
		System.out.println(String.format("2���� %s �� 10���� %d �Դϴ�", 
				t2, Long.parseLong(t2, 2)));	//t2�� 2���� => �޼ҵ� ��� ������
		System.out.println(String.format("16���� %s �� 10���� %d �Դϴ�", 
				t16, Long.parseLong(t16, 16)));	//t16�� 16���� => �޼ҵ� ��� ������
									//������ -��ȣ �Ἥ ���밪 ���� �ʴ� �������� ���ڿ� �Է�
									//�ִ� ���� �Է°��� -7fffffff
	}

}