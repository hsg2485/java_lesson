package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person momo = new Person();		//�Ϲ� Ŭ����
		//ClassAbs abs = new ClassAbs();	//����: ClassAbs�� �߻�Ŭ����. new ����
		ClassAbs abs = new ClassX();		//�θ� Ÿ�� ����
		ClassX cls = new ClassX();			//����(�ڽ�) Ŭ���� Ÿ�� ����
		System.out.println("�׽�Ʈ ù��° : test �޼ҵ�");
		abs.test();
		cls.test();
		abs.name = "�����";			//name�� �θ� Ŭ���� �ʵ�
		cls.name = "���";
		abs.print();						//print() �θ� Ŭ���� �޼ҵ�
		cls.print();
		System.out.println("�׽�Ʈ �ι�° : �ڽ� �ʵ� num");
		cls.setNum(23);
		cls.test();
		ClassX x = (ClassX)abs;	//abs�� �ٿ�ĳ�����ؾ� setNum ��� ����
		x.setNum(100);
		abs.test();
	}

}
