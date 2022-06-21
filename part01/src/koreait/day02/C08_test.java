package koreait.day02;

public class C08_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//작성자 : 한성구
		int s_width = 23;
		int s_height = 19;
		int s_area = s_width * s_height;
		
		final double PI = 3.14; //(상수)
		double c_radius = 23.230;
		double c_ference = 2 * PI * c_radius;
		double c_area = PI * c_radius * c_radius;
		
		System.out.println("사각형 도형의 넓이");
		System.out.printf("%d x %d = %d㎠\n", s_width, s_height, s_area);
		
		System.out.println("원 도형의 넓이");
		System.out.printf("%.3f㎠\n", c_area);
		System.out.println("원 도형의 둘레");
		System.out.printf("%.3f㎝\n", c_ference);
		
		final int test = 123; //변수 선언부 앞에 final 쓰면 값을 중간에 변경 못함(상수)
		System.out.println("test =" + test);
		//test = 124; //오류 발생
	}

}
