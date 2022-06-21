package koreait.day11;

public class AShapeTest {
//main 메소드는 클래스로 만들어진 애플리케이션
//추상클래스로 완성된 애플리케이션에서 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle(100,84);
		tri.shapeName = "직각삼각형";
		System.out.println(tri);
		System.out.println("넓이 = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89);
		cir.shapeName = "원";
		System.out.println(cir);
		System.out.println("넓이 = " + cir.getArea());
		
	}

}
/*
 * 참고: 메소드 재정의할 때 접근 한정자
 * 부모 public => 자식 default : 오류
 * 부모 default => 자식 public : 가능
 */

abstract class AShape	{
	protected String shapeName;
	protected int width;
	protected int height;
	
	public AShape() {	//AShape()는 객체는 직접 못만들고 자식 객체 만들어질 때 실행
		System.out.println("AShape 디폴트 생성자 동작");
	}
	
	//추상클래스는 커스텀 생성자 만드는가?
	public AShape(int width, int height) {
		System.out.println("AShape 생성자 동작");
		this.width = width;
		this.height = height;
	}
	
	public abstract double getArea();
	
	//추상클래스도 인스턴스 메소드 정의해서 자식 클래스가 재정의 할 수 있음
	public Object explain() {	//애플리케이션 완료 후 추상메소드 추가 오류 발생하므로 인스턴스 메소드 추가
		return null;
	}

	@Override
	public String toString() {
		return "AShape [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
}

class Triangle extends AShape	{
	public Triangle(int width, int height) {
		super(width, height);
		//this.width = width;
		//this.height = height;
	}
	@Override
	public double getArea() {
		return width*height/2;
	}
}

class Circle extends AShape	{
	private int radius;
	@Override
	public double getArea() {
		return radius*radius*3.14;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
				+ "]";
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}

class Rectangle extends AShape {
	@Override
	public double getArea() {
		return width*height;
	}
}