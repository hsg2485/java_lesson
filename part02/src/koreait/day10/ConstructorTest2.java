package koreait.day10;

public class ConstructorTest2 {
//ConstructorTest1, 2 �ذ��� ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Product2 {
	int price;
	//����Ʈ �����ڴ� ������ ����
	//�θ�Ŭ���� ����Ʈ ������ �����ؼ� �ڽ�Ŭ������ ����� �� �ֵ��� ��
	public Product2() {		//���� �ذ��� 2) �θ�Ŭ���� ����Ʈ ������ �����ؼ� �ڽ�Ŭ������ ����� �� �ֵ��� ��
		
		
	}
	
	public Product2(int price) {		//Ŀ���� ������
		this.price = price;
	}
}

class Food2 extends Product2 {		//Product() ����Ʈ ������ ���� ������ ���� => Food() ����Ʈ ������ ����
	//Food2 ����Ʈ �����ڴ� �ڵ����� ����
	//�� �ȿ��� �θ�Ŭ���� Product2 ����Ʈ ������ super ȣ��
	
}

class Electronics2 extends Product2 {		//Product() ����Ʈ ������ ����
	
}
