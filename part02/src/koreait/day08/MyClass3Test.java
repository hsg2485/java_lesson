package koreait.day08;

import java.util.Calendar;

public class MyClass3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MyClass3 my3 = new MyClass3();	//����: �����ڰ� private ������
		MyClass3 my3 = MyClass3.getInstance();		//�̸� ������� ��ü�� ����
		my3.test();		//��ü�� �ν��Ͻ� �޼ҵ�
		MyClass3.staticTest();		//static �޼ҵ�
		
		//�̸� ���� ��ü�� �������ִ� Calendar Ŭ����
		Calendar today = Calendar.getInstance();
		System.out.println(today);
	}

}
