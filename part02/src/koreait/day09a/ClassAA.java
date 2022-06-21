package koreait.day09a;

public class ClassAA extends ClassA {		//super(부모) 클래스는 ClassA
	
	//ClassAA의 인스턴스 메소드
	//name 필드 상속받은 것으로 여기서 선언하지 않았음
	void test() {
		System.out.println("name = " + name);
	}

}
//파일 별도로 만들어서 테스트 할 수도 있음. 단, public 클래스는 같은 파일에서 1개만

