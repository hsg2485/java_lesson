package koreait.day02;

public class C08_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ۼ��� : �Ѽ���
		int s_width = 23;
		int s_height = 19;
		int s_area = s_width * s_height;
		
		final double PI = 3.14; //(���)
		double c_radius = 23.230;
		double c_ference = 2 * PI * c_radius;
		double c_area = PI * c_radius * c_radius;
		
		System.out.println("�簢�� ������ ����");
		System.out.printf("%d x %d = %d��\n", s_width, s_height, s_area);
		
		System.out.println("�� ������ ����");
		System.out.printf("%.3f��\n", c_area);
		System.out.println("�� ������ �ѷ�");
		System.out.printf("%.3f��\n", c_ference);
		
		final int test = 123; //���� ����� �տ� final ���� ���� �߰��� ���� ����(���)
		System.out.println("test =" + test);
		//test = 124; //���� �߻�
	}

}
