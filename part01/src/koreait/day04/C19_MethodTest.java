package koreait.day04;

public class C19_MethodTest {
	//main 메소드 : 실행의 시작점; 프로그램 실행을 위해서는 꼭 있어야 할 메소드 (정적인 요소)
	public static void main(String[] args) {
		
		/*
		 * 메소드의 주요 요소 : 반환값(형식), 인자(argument)또는 매개변수(parameter) (둘다 같은 의미),메소드명, public 또는 static 등의 설정
		 *			ㄴ 반환값: 메소드 실행 완료되면 얻어지는 결과 값
		 *			ㄴ 인자: 메소드 실행을 위해서 필요한 데이터 (형식과 변수명 선언 필요) => 인자의 갯수와 형식은 다양함
		 *			ㄴ 메소드명: 식별자	
		 *			ㄴ public: 접근한정자, static: 정적 요소                  
		 */
		
		System.out.println("메소드를 직접 정의해서 사용");
	    /*프로그램은 main 메소드의 명령문을 순서대로 실행하고 중간에 메소드 호출을 만나면 메소드가 정의된 실행을 위해
		제어를 이동함. 메소드 실행이 종료되면 다시 main 메소드로 제어가 돌아옴
		*/
		
		methodA(); //메소드 호출(실행), 필요할 때 호출
		methodB(11,13); //11, 13은 메소드 실행에 필요한 인자
		methodB(123, 456);
	  //methodB(123, 4.56); // 실수(double)=>정수(int)는 자동 형변환 안됨
		methodC(123, 456);  // 정수(int)=>실수(double)는 자동 형변환 됨
	  //methodD(); //호출만 하면 반환값이 있는 메소드지만 main 메소드에서 반환값 저장 안하기 때문에 오류 발생
		methodD();
		System.out.println("return = " + methodD()); //반환값을 받아서 출력하는 예시
		int temp = methodD();				//반환값을 받아서 변수에 저장하는 예시
		System.out.println(temp);
		double result = methodE(314, 3.14);
		System.out.println("return = " + result);
		int result2 = methodF('i', 4); //문자+정수=정수
		System.out.println("return = " +result2);
		char result3 = methodF('i', 4);
		System.out.println("return = " +result3);
		
		char a = 'a';
		int b = 3;
		a = methodF(a,b);
		System.out.println("return = " + a);
		

	}
	//static인 main에서 실행할 메소드는 동일하게 static 이어야 함 (같은 성격을 지녀야 함)
	//메소드 선언(정의)
	public static void methodA() {
		
		System.out.println("첫번째 메소드 정의 연습");
	}
	public static void methodB(int a, int b) //int a, int b는 인자값을 전달받는 매개변수
	{
		System.out.println("두번째 메소드 정의 연습");
		System.out.println("전달 받은 값  a = " + a + ", b= " + b);
	}
	public static void methodC(int a, double b) {
		System.out.println("세번째 메소드 정의 연습");
		System.out.println("전달 받은 값  a = " + a + ", b= " + b);
	}
	public static int methodD() //void(반환값 없음)을 쓰지 않으면 반환값이 있는 형식: 반환값은 int 데이터, 반드시 return이 필요함
	{
		System.out.println("네번째 메소드 정의 연습");
		return 999;
	}
	public static double methodE(int a, double b) {
		System.out.println("다섯번째 메소드 정의 연습");
		return a+b;
	}
	public static char methodF(int a, int b) {
		System.out.println("여섯번째 메소드 정의 연습");
		return (char)(a+b);
	}

}
