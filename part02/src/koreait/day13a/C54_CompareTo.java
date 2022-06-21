package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
//모든 객체(Object 상속)에는 compareTo 메소드가 있음: 값의 비교
		
		String na = "kim";
		String you = "momo";
		String he = "Son";
		
		//String은 알파벳(사전식) 비교 : 대문자 < 소문자
		System.out.println("kim과 momo : " + na.compareTo(you));	//-2 : "kim" < "momo"
		System.out.println("kim과 Son : " + na.compareTo(he));		//24 : "kim" > "Son"(대문자)
		
		int a = 12, b = 45;
		System.out.println("a-b = " + (a-b));
		
		Integer aa = 12;
		Integer bb = 45;
		System.out.println("12와 45 : " + aa.compareTo(bb));	//-1 : aa<bb
		aa = 90;
		System.out.println("90과 45 : " + aa.compareTo(bb));	//1 : aa>bb
		aa = 45;
		System.out.println("45와 45 : " + aa.compareTo(bb));	//0 : aa==bb
		
		//compareTo 와 같은 비교는 sort (정렬) 에 사용됨
		//정렬은 오름차순, 내림차순 2가지 방법으로 할 수 있음
		

	}

}
