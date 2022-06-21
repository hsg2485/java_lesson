package koreait.day04;

public class C20_StringMethod {
//작성자 : 한성구
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "hello"; //java.lang.String (기본패키지 클래스)
		
//		message.length();			//public int length()
//		message.charAt(0);			//public char charAt(int index)
		
//		message.equals("Hello"); //public boolean equals(Object anObject), Object는 모든 타입
											//message가 String타입 이므로 Object는 String으로 해석

		//리턴값 형식은?
		int indexOf = message.indexOf('e');
		String substring = message.substring(2);
		String substring2 = message.substring(2,4);
		String replace = message.replace("ll", "!@");
		
		System.out.println("indexOf('e') = " + indexOf);
		System.out.println("substring(2) = " +substring);
		System.out.println("substring(2,4) = " + substring2);
		System.out.println("replace(\"ll\", \"!@\") =  " + replace);
		System.out.println("startsWith(\"h\") = " + message.startsWith("h"));
		System.out.println("endsWith(\"!\") = " + message.endsWith("!"));
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("lo"));
		System.out.println("test.lastIndexOf(\"lo\") = " + test.lastIndexOf("lo"));
		
		int len = message.length();		//문자열 길이
		char temp = message.charAt(3);		//0부터 시작해서 3번째 문자가 무엇인지 리턴
		boolean isState = message.equals("Hello"); //문자열이 같은지 비교 
		
		System.out.println("-------------------------");
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello\") = " + isState);  
		// 큰따옴표를 문자 자체로 출력하려면 => \"내용\"
	}

}
//String 클래스의 메소드는 많으므로 다 외우고 사용하는 것이 아니고 메소드의 이름,인자,리턴형식을 참조해서 사용
//메소드 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것.


