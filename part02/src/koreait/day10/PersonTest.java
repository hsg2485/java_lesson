package koreait.day10;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person sinb = new Person();	//��ü ������ ���ÿ� �ʱ�ȭ Person sinb;�θ� �ϸ� ���� null�̶� ���� �߻�
		sinb.setName("�ź�");
		sinb.setAge(27);
		System.out.println(sinb);
		System.out.println(sinb.toString());
		
		Person momo = new Person();
		System.out.println(momo);

	}

}
