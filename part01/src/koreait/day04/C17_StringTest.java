package koreait.day04;

public class C17_StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "kim";     
		String name2 = "kim";   
		String name3 = "lee";
		String name4 = new String("kim"); //���ο� String ��ü ���� => �޸� �Ҵ�
		
		System.out.println("name == name2 ������ġ? " + (name==name2)); //true
		// name, name2 ��� ���� ���ͷ��� ����ϱ� ������ �������� ������� ����
		System.out.println("name == name4 ������ġ? " + (name==name4)); //false
		System.out.println("name2 == name4 ������ġ? " + (name2==name4)); //false
		
		name2="son";
		System.out.println("name == name2 ������ġ? " +(name == name2)); //false
		
		System.out.println("name = " + name);
		System.out.println("name2 = " + name2);
		System.out.printf("name3 = %s\n", name3);
		System.out.printf("name4 = %s\n", name4	);
	}

}
/*
 * �ڹٿ����� �⺻�� ������ �ƴϰ� String Ŭ���� Ÿ������ ���
 *      �� �ʵ�, �޼ҵ带 �̿��Ͽ� ���ڿ� ��� ���
 * 
 */