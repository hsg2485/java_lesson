package koreait.day10;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person sinb = new Person();	//객체 생성과 동시에 초기화 Person sinb;로만 하면 값이 null이라 오류 발생
		sinb.setName("신비");
		sinb.setAge(27);
		System.out.println(sinb);
		System.out.println(sinb.toString());
		
		Person momo = new Person();
		System.out.println(momo);

	}

}
