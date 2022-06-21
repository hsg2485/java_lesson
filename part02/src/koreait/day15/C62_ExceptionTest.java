package koreait.day15;

import java.util.Scanner;

//Throwable Ŭ������ ���� Ŭ����
// : ??
public class C62_ExceptionTest {

	public static void main(String[] args) {

		//Exception ����1 : java.lang.NullPointerException
		//						�� ��ü ������ null�̸� �޼ҵ� ���� �� ��
		String message = null;
				
		char temp = message.charAt(0);     //message ���ڿ����� ù��°(0) ���� 1�� �����ɴϴ�.
		
		//Exception ����2 : java.lang.ArrayIndexOutOfBoundsException: 5
		//int[] nums = new int[5];		//�迭���� : ��� 5���Դϴ�.
		//nums[5] = 100;
		
		//Exception ����3
		Scanner sc = new Scanner(System.in);
		//System.out.println("���� �Է� >>> ");
		//int a = sc.nextInt();			//Ű�����Է��� ������ ��ȯ�ؼ� ������ �����մϴ�.
		//���� �ܿ� �ٸ� ���� �Է��ϸ� Exception �߻� : java.util.InputMismatchException
		//System.out.println("����� �Է��� �� : " + a);
		
		//Exception ����4 : java.lang.NumberFormatException: For input string: "12.1"
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("����� �Է��� �� : " + n);



	}

}
/*
 * ���� ���� : int a = 4.1; �� ���� ������ ��ü�� �ȵ�
Exception ��� : ���������� �ƴմϴ�. �����ϸ鼭 �߻��ϴ� ���� �Դϴ�.(�߻����ɼ��� ����ؼ� ���α׷����ؾ��մϴ�.)
     -> ���ο� ���� �ٸ��̸� XXXXException �� �߻��ϰ� �̵��� Exception Ŭ������ �ڽ� Ŭ�����Դϴ�.
     -> Exception �� ���� �߿� �߻��ϸ� �� ���Ĵ�?..... ���α׷��� �� �������� �ߴܵ˴ϴ�. 
         ����, Exception �� �����ϰ� ���α׷��� �ߴܵ��� �ʵ��� ���α׷� ������ �ؾ��մϴ�.
*/

