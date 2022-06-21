package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Product {
	int price;
	
	//디폴트 생성자는 동작을 안함
	
	public Product(int price) {		//커스텀 생성자
		this.price = price;
	}
}

class Food extends Product {		//Product() 디폴트 생성자 실행 없으면 오류 => Food() 디폴트 생성자 실행
	//자식클래스도 커스텀 생성자를 정의해서 부모클래스 커스텀 생성자를 호출
	public Food(int price) {
		super(price);		// 오류 해결방법 1) Product() 디폴트 생성자 대신에 부모 클래스 커스텀 생성자 호출
	}
}

class Electronics extends Product {		//Product() 디폴트 생성자 실행
	public Electronics(int price) {
		super(price);		// 오류 해결방법 1) Product() 디폴트 생성자 대신에 부모 클래스 커스텀 생성자 호출
	}
}