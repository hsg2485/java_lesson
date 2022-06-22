package koreait.day14;

import java.util.Random;

public class C61_FunctionATest {

	public static void main(String[] args) {
		
		//1) 익명 클래스 : 추상 메소드의 개수 상관 없음
		FunctionA fa = new FunctionA() {
			@Override
			public int methodA(int a, int b) {
				
				return a*b;
			}
		};
		
		System.out.println(fa.methodA(23, 11));
		
		//2) 람다식: 추상메소드가 1개일 때만 가능. 즉 함수형 인터페이스만 표현이 가능(메소드 이름을 생략한 형식)
		fa = (int a, int b) -> {
			return a+b;
		};
		
		System.out.println(fa.methodA(23, 11));
		
		fa = (int max, int min) -> {
			//min~max 범위의 난수를 만들어서 리턴
			Random r= new Random();
			return r.nextInt(max-min+1)+min;
		};

	

}
}
