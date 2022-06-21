package koreait.day11.test;

//추상클래스로 바꿔서 이것저것 테스트 해보기
public abstract class Animal {
	
	//미리 약속된 상수값으로 type을 정하는 예시
	static final int CAT = 1;
	static final int DOG = 2;
	static final int CROW = 3;
	static final int FROG =  4;
	static final int SNAKE = 5;

	private String name;
	private String color;
	protected int type;		//protected는 같은 패키지 안에 있어야 하고 다른 패키지에 있으면 getter, setter 사용해야 함
	
	public Animal() {
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	
	//추상메소드로 변경
	/*public void act() {
		System.out.println("Animal 행동 : 아직 모름 (unknown)");
	}
	*/
	public abstract void act();
	
	//또 다른 추상메소드
	public abstract String eat(Object object);
	
	public void print() {
		System.out.println("name : " + name + ", color : " + color);
	}
	
	

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]";
	}

	public static boolean isDog(Object object) {
		return object instanceof Dog;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
