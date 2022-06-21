package koreait.day08;
//작성자: 한성구
public class Member {
	
	private String name, email;
	private int age, level;
	
	//기본(default) 생성자 : 따로 만들어져 있지 않아도 알아서 자동생성 됨. 출력문 추가
	public Member() {
		System.out.println("name, email, age, level 필드는 기본 값 입니다.");
		System.out.println("name = " + this.name);	//this는 메소드를 실행하는 객체
		System.out.println("age = " + this.age);
	}
	
	/*
	public Member(String name) {	//생성자 메소드 : 타입과 인자 갯수를 가지고 구별이 되어야 메소드 오버로딩
		this.name = name;
	}
	
	public Member(String email) {	//오류: 위의 생성자와 2개 동시에 정의될 수 없음. 
												// 2개 중 하나만 쓰는 건 가능
		this.email = email;
	}
	*/
	
	public Member(String name, String email){	//()안에는 실행할 때 전달받을 인자
		//name, email 필드 초기화하는 커스텀 생성자
		this.name = name;		
		this.email = email;
	}

	//getter, setter 메소드(단축키: 우클릭 => source => generate getter, setter)
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
	

