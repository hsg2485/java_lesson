package koreait.day11.test;

//�߻�Ŭ������ �ٲ㼭 �̰����� �׽�Ʈ �غ���
public abstract class Animal {
	
	//�̸� ��ӵ� ��������� type�� ���ϴ� ����
	static final int CAT = 1;
	static final int DOG = 2;
	static final int CROW = 3;
	static final int FROG =  4;
	static final int SNAKE = 5;

	private String name;
	private String color;
	protected int type;		//protected�� ���� ��Ű�� �ȿ� �־�� �ϰ� �ٸ� ��Ű���� ������ getter, setter ����ؾ� ��
	
	public Animal() {
		System.out.println("���ο� Animal ������ ������ϴ�.");
	}
	
	//�߻�޼ҵ�� ����
	/*public void act() {
		System.out.println("Animal �ൿ : ���� �� (unknown)");
	}
	*/
	public abstract void act();
	
	//�� �ٸ� �߻�޼ҵ�
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
