package koreait.day03;

import java.util.Scanner; // ScannerŬ���� ȣ��

public class C08_InputTest {
	// �ۼ��� : �Ѽ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s_width = 0;
		int s_height = 0;
		int s_area = 0;
		
		final double PI = 3.14; //(���)
		double c_radius = 0;
		double c_area = 0;
		double c_ference = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�簢�� ������ ���� ���ϱ�");
		System.out.println("���� ����: ");
		s_width = sc.nextInt();
		System.out.println("���� ����: ");
		s_height = sc.nextInt();
		s_area = s_width * s_height;
		//System.out.printf("���� : %d x %d = %d��\n", s_width, s_height, s_area);
		System.out.printf("����: %d��\n", s_area);
		
		System.out.println("�� ������ ���̿� ���� ���ϱ�");
		System.out.println("������ ����: ");
		c_radius = sc.nextDouble();
		c_area = PI * c_radius * c_radius;
		c_ference = 2 * PI * c_radius;
		System.out.printf("����: %.3f��\n", c_area);
		System.out.println("�� ������ �ѷ�");
		System.out.printf("%.3f��\n", c_ference);
		
		sc.close(); //ScannerŬ���� ��� �� ���� 
		
		//final int test = 123; //���� ����� �տ� final ���� ���� �߰��� ���� ����(���)
		//System.out.println("test =" + test);
		//test = 124; //���� �߻�
	}

}
