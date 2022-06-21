package koreait.day11;

public class AShapeTest {
//main �޼ҵ�� Ŭ������ ������� ���ø����̼�
//�߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle(100,84);
		tri.shapeName = "�����ﰢ��";
		System.out.println(tri);
		System.out.println("���� = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89);
		cir.shapeName = "��";
		System.out.println(cir);
		System.out.println("���� = " + cir.getArea());
		
	}

}
/*
 * ����: �޼ҵ� �������� �� ���� ������
 * �θ� public => �ڽ� default : ����
 * �θ� default => �ڽ� public : ����
 */

abstract class AShape	{
	protected String shapeName;
	protected int width;
	protected int height;
	
	public AShape() {	//AShape()�� ��ü�� ���� ������� �ڽ� ��ü ������� �� ����
		System.out.println("AShape ����Ʈ ������ ����");
	}
	
	//�߻�Ŭ������ Ŀ���� ������ ����°�?
	public AShape(int width, int height) {
		System.out.println("AShape ������ ����");
		this.width = width;
		this.height = height;
	}
	
	public abstract double getArea();
	
	//�߻�Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ� Ŭ������ ������ �� �� ����
	public Object explain() {	//���ø����̼� �Ϸ� �� �߻�޼ҵ� �߰� ���� �߻��ϹǷ� �ν��Ͻ� �޼ҵ� �߰�
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