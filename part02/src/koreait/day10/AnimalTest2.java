package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani1 = new Frog();		//��ĳ����: �ڵ���ȯ <=> �ٿ�ĳ����: ������ȯ
		Animal ani2 = new Cat();
		
		Dog puddle = new Dog();
		Crow crow = new Crow();
		//�ڽİ�ü�� ������ �� ���� �θ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ŭ���� ������ ����
		Dog dog = new Dog();
		
		System.out.println("=========");
		//animal(ani1);		//��ü������ ����: ���޵Ǵ� ���� ��ü�� �ּ�
		//animal(ani2);
		//animal(puddle);
		animal(crow);
	    //animal(new Frog());
	}
	
	//������
	//���� ����1. �޼ҵ� ����(�Ǵ� ����) Ÿ���� Animal: Animal, Dog, Crow, Frog, Cat ��ü ��� ����
	public static void animal(Animal animal) {
		//���� ����2. �޼ҵ� ������. animal ��ü �ν��Ͻ� Ÿ�Կ� ���� ����Ǵ� act�� �ٸ�
		animal.act();
		animal.print();
		//���ڷ� ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ��(�ν��Ͻ� Ÿ��) �˻�: instanceof
		System.out.println("dog? " + (animal instanceof Dog));	//����: ��ü�������� instanceof Ŭ������
		System.out.println("crow? " + (animal instanceof Crow));
		System.out.println("Frog? " + (animal instanceof Frog));
		System.out.println("Cat? " + (animal instanceof Cat));
		
		/* Animal �θ�Ÿ�� ������ �ڽ�Ŭ���� �ʵ�� �޼ҵ� ���� ����
		animal.jump();	//Frog
		animal.run();		//Dog
		animal.fly();		//Crow
		animal.sound();
		*/
		Cat cat; Dog dog; Frog frog; Crow crow;
		if(animal instanceof Cat) {
			cat = (Cat)animal;		//�ٿ�ĳ���� : animal ��¥ ��ü�� ���� ���� �Ǵ� ���� ����
			cat.sound();				//			��instanceof ���ǽ� �ʿ�
		}
		if(animal instanceof Dog) {
			dog = (Dog)animal;
			dog.run();
		}
		if(animal instanceof Frog) {
			frog = (Frog)animal;
			frog.jump();
		}
		if(animal instanceof Crow) {
			crow = (Crow)animal;
			crow.fly();
		}
		
		animal.print();
		
	}

}

class Frog extends Animal {
	
	protected int mouth;		
	
	public Frog() {
		System.out.println("���ο� ���������� Frog");
	}
	
	public void jump() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
	}
	//������ ����: �޼ҵ� �������̵� *����: �����ε�(overloading)�� �ٸ� ����
	//					�� �θ�Ŭ������ �޼ҵ带 ������ �ϴ� ��. �̶� ���ڿ� ����Ÿ���� �����ϰ� ��
	@Override		//annotation �ֳ����̼� : �ڵ�(�Ǵ� ����)�� �� ���� �Ǵ� �ּ�
	public void act() {
		//super.act();		//�θ� Ŭ������ act() ���� (���� ����)
		System.out.println("Animal �ൿ : ���÷� �����ϱ�");
	}

}

class Cat extends Animal {
	
	protected int eyes;		//����Ʈ ������ + �ٸ� ��Ű�� �ڽ� Ŭ����
	
	public Cat() {
		System.out.println("���ο� ���������� cat");
	}
	
	public void sound()	{
		setName("�����");
		setColor("ȭ��Ʈ");
		System.out.println("Ư¡ : �߿�");
	}
	
	public void act() {
		System.out.println("Animal �ൿ : ���÷� �߿��ϱ�");
	}

}

