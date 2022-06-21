package koreait.day08;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member momo = new Member();
		
		Member nana = new Member("ÃÖ³ª³ª", "nana@gmail.com");
		System.out.println("nana name = " + nana.getName());
		nana.setAge(26);
		System.out.println("nana email = " + nana.getEmail());
	}

}
