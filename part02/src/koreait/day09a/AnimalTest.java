package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("---------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print();		//��� �޼ҵ�
		System.out.println("---------------------");
		
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		System.out.println("---------------------");
		
		Animal temp = dog;		//�ڽ� ��ü�� �θ�Ŭ���� Ÿ������ ������ �� ����(�ڽ� Ŭ������ �θ� Ŭ���� Ÿ������ �ڵ�ĳ����)
		temp.print();
		//temp.run();					//���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ����
		temp = crow;				//�ڽ� ��ü�� �θ�Ŭ���� Ÿ������ ������ �� ����
		temp.print();
		//temp.fly();					//���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ����
		
		System.out.println("---------------------");
		Animal puppy = new Dog();
		puppy.print();
		//puppy.run();				//���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ����
		
		System.out.println("---------------------");
		Dog puddle = (Dog)puppy;	//Animal Ÿ���� DogŸ������ ���� casting 
		puddle.run();						//		��puppy ������ �����ϴ� ��ü�� Dog Ÿ���϶��� ����
		puddle.print();
	}

}
