package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {
	//ClassA의 private, default 접근한정자 요소는 상속 못 받음
	
public void test() {
		//System.out.println("name = " + name);		//오류: name 필드 접근 한정자는 디폴트 : 다른 패키지에서 사용 불가
		title = "momo";	//상속받은 title 필드 : 다른 패키지이지만 protected 접근한정자로 자식클래스는 허용
		System.out.println("title = " + title);
		setName("신비");
		System.out.println("name = " + getName());
	}

}
