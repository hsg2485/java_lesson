package koreait.day08;

public class MyClass2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기본 생성자로 객체 생성
		MyClass2 my2 = new MyClass2();
		//커스텀 생성자를 정의하면 기본으로 쓸 수 있는 기본 생성자가 사용할 수 없게 됨
		//==> 직접 정의함
		
		//커스텀 생성자로 객체 생성
		MyClass2 my22 = new MyClass2("모모");
		
		System.out.println("my2 name : " + my2.getName());
		System.out.println("my22 name : " + my22.getName());
		
		//my2객체에 기본생성자를 허용하면 name 필드 값 초기화를 못함(예시적용)
		
		//기본생성자를 허용하지 않는 예시
		//Scanner sc = new Scanner();

	}

}
