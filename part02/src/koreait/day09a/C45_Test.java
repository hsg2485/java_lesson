package koreait.day09a;

import koreait.day09b.ClassAB;

public class C45_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new 연산으로 객체가 만들어질 때 실행되는 메소드 -> 생성자
			ClassAA test1 = new ClassAA();
			test1.ab = 123;			//상속받은 필드
			test1.name = "hong";
				
			//상속받은 메소드
			test1.print();
			//ClassAA에서 정의된 메소드
			test1.test();
			
			ClassAB test2 = new ClassAB();
			test2.test();
				
			}
	}


