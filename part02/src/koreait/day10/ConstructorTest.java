package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Product {
	int price;
	
	//����Ʈ �����ڴ� ������ ����
	
	public Product(int price) {		//Ŀ���� ������
		this.price = price;
	}
}

class Food extends Product {		//Product() ����Ʈ ������ ���� ������ ���� => Food() ����Ʈ ������ ����
	//�ڽ�Ŭ������ Ŀ���� �����ڸ� �����ؼ� �θ�Ŭ���� Ŀ���� �����ڸ� ȣ��
	public Food(int price) {
		super(price);		// ���� �ذ��� 1) Product() ����Ʈ ������ ��ſ� �θ� Ŭ���� Ŀ���� ������ ȣ��
	}
}

class Electronics extends Product {		//Product() ����Ʈ ������ ����
	public Electronics(int price) {
		super(price);		// ���� �ذ��� 1) Product() ����Ʈ ������ ��ſ� �θ� Ŭ���� Ŀ���� ������ ȣ��
	}
}