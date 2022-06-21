package koreait.day03;

import java.util.Scanner; // Scanner클래스 호출

public class C08_InputTest {
	// 작성자 : 한성구
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s_width = 0;
		int s_height = 0;
		int s_area = 0;
		
		final double PI = 3.14; //(상수)
		double c_radius = 0;
		double c_area = 0;
		double c_ference = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형 도형의 넓이 구하기");
		System.out.println("가로 길이: ");
		s_width = sc.nextInt();
		System.out.println("세로 길이: ");
		s_height = sc.nextInt();
		s_area = s_width * s_height;
		//System.out.printf("넓이 : %d x %d = %d㎠\n", s_width, s_height, s_area);
		System.out.printf("넓이: %d㎠\n", s_area);
		
		System.out.println("원 도형의 넓이와 길이 구하기");
		System.out.println("반지름 길이: ");
		c_radius = sc.nextDouble();
		c_area = PI * c_radius * c_radius;
		c_ference = 2 * PI * c_radius;
		System.out.printf("넓이: %.3f㎠\n", c_area);
		System.out.println("원 도형의 둘레");
		System.out.printf("%.3f㎝\n", c_ference);
		
		sc.close(); //Scanner클래스 사용 후 종료 
		
		//final int test = 123; //변수 선언부 앞에 final 쓰면 값을 중간에 변경 못함(상수)
		//System.out.println("test =" + test);
		//test = 124; //오류 발생
	}

}
