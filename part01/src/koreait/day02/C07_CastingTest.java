package koreait.day02;

public class C07_CastingTest {
//클래스명 변경 시 파일명도 같이 변경해야 함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123, b = 13;
		double c = 10.34;
		
		int isum;
		double dsum;
		
		isum = a + b;
		dsum = a + c;
		
		//isum = a + c; 
		//정수+실수일 때 값을 실수가 아닌 정수로 저장하려면 형변환(캐스팅) 해야 함
		
		
		System.out.println("a + b = " + isum);
		System.out.println("a + c = " + dsum);
		
		b = 10;
		System.out.printf("%d / %d =  %f\n",a,b,(double)a/b); //실수 형식 문자 %f => 기본 소수점 이하 6자리까지 출력
		
		b = 11;
		System.out.printf("%d / %d =  %.2f\n",a,b,(float)a/b); //소수점 이하 2자리까지 출력
		
		double test  = 12.90203948;
		System.out.println("test = " + test);
		System.out.printf("test = %f\n", test);
		System.out.printf("test = %.15f\n", test);
		
		
	}

}

