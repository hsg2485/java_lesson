package koreait.test;

public class Bike extends Product{
	//e	
	private int speed;
	
	//f
	public Bike() {	//기본생성자
		
	}
	
	public Bike(int price,String prdName ,int speed) {	//커스텀생성자
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//d
	@Override
	public String sell(Object obj) {
		return String.format("추가 할인 행사 - %d %% 인하", obj);
	}
	/*
	Object 타입에 대입되는 int,long, 이런것들은
	래퍼클래스타입으로 변환되어 캐스팅됩니다.
	우리가 Integer a= 1;
	이렇게 쓸때도 변환이 일어난거에요. 자동으로요
	원래는 new Integer(1)
	이렇게 해야해요
	*/

	
	//e
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//g
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
}
