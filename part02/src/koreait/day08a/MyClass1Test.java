package koreait.day08a;

import koreait.day08.MyClass1;

public class MyClass1Test {
	
	public static void main(String[] args) {
		
		//MyClass1 ��ü ����
		MyClass1 my = new MyClass1();	//public Ŭ���������� �ٸ� ��Ű�� �϶��� import �ʿ�
		//��Ű���� �ٸ� MyClass1 Ŭ������ �ʵ� �� ����� �� �ִ� ����? �� : point
		//						default(package) ������ �ʵ� name, �޼ҵ� getAge, setAge ������
		//my.name = "momo";
		my.point = 1.234;
		//my.age = 23;		//����: private ������ �ʵ�
		//my.setAge(23);		
		//System.out.println("age = " + my.age);		//����: private ������ �ʵ�
		//System.out.println("age = " + my.getAge());	
		//my.setAge(-100);
		//System.out.println("age = " + my.getAge());	
		System.out.println("point = " + my.point);		//public ������ �ʵ�
		//System.out.println("name = " + my.name);		
	}
}
//���� ������ �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���
