package koreait.day04;

public class C17_StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "kim";     
		String name2 = "kim";   
		String name3 = "lee";
		String name4 = new String("kim"); //새로운 String 객체 생성 => 메모리 할당
		
		System.out.println("name == name2 참조위치? " + (name==name2)); //true
		// name, name2 모두 같은 리터럴을 사용하기 때문에 램에서의 저장공간 같음
		System.out.println("name == name4 참조위치? " + (name==name4)); //false
		System.out.println("name2 == name4 참조위치? " + (name2==name4)); //false
		
		name2="son";
		System.out.println("name == name2 참조위치? " +(name == name2)); //false
		
		System.out.println("name = " + name);
		System.out.println("name2 = " + name2);
		System.out.printf("name3 = %s\n", name3);
		System.out.printf("name4 = %s\n", name4	);
	}

}
/*
 * 자바에서는 기본형 데이터 아니고 String 클래스 타입으로 사용
 *      ㄴ 필드, 메소드를 이용하여 문자열 기능 사용
 * 
 */
