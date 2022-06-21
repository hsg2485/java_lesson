package koreait.day10;

public class ConstructorTest2 {
//ConstructorTest1, 2 해결방법 비교
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Product2 {
	int price;
	//디폴트 생성자는 동작을 안함
	//부모클래스 디폴트 생성자 정의해서 자식클래스가 사용할 수 있도록 함
	public Product2() {		//오류 해결방법 2) 부모클래스 디폴트 생성자 정의해서 자식클래스가 사용할 수 있도록 함
		
		
	}
	
	public Product2(int price) {		//커스텀 생성자
		this.price = price;
	}
}

class Food2 extends Product2 {		//Product() 디폴트 생성자 실행 없으면 오류 => Food() 디폴트 생성자 실행
	//Food2 디폴트 생성자는 자동으로 동작
	//그 안에서 부모클래스 Product2 디폴트 생성자 super 호출
	
}

class Electronics2 extends Product2 {		//Product() 디폴트 생성자 실행
	
}
