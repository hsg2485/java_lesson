package koreait.day08;
//�ۼ���: �Ѽ���
public class Member {
	
	private String name, email;
	private int age, level;
	
	//�⺻(default) ������ : ���� ������� ���� �ʾƵ� �˾Ƽ� �ڵ����� ��. ��¹� �߰�
	public Member() {
		System.out.println("name, email, age, level �ʵ�� �⺻ �� �Դϴ�.");
		System.out.println("name = " + this.name);	//this�� �޼ҵ带 �����ϴ� ��ü
		System.out.println("age = " + this.age);
	}
	
	/*
	public Member(String name) {	//������ �޼ҵ� : Ÿ�԰� ���� ������ ������ ������ �Ǿ�� �޼ҵ� �����ε�
		this.name = name;
	}
	
	public Member(String email) {	//����: ���� �����ڿ� 2�� ���ÿ� ���ǵ� �� ����. 
												// 2�� �� �ϳ��� ���� �� ����
		this.email = email;
	}
	*/
	
	public Member(String name, String email){	//()�ȿ��� ������ �� ���޹��� ����
		//name, email �ʵ� �ʱ�ȭ�ϴ� Ŀ���� ������
		this.name = name;		
		this.email = email;
	}

	//getter, setter �޼ҵ�(����Ű: ��Ŭ�� => source => generate getter, setter)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	

	

}
	

