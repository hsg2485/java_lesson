package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'a';
		char c2 = 97;
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
		//문자를 정수로 출력 => int로 캐스팅 필요
		//System.out.printf("c1 = %d\n", c1); //오류 : char 형은 %d가 아님
		System.out.printf("c1 = %d\n", (int)c1);
		
		c1 = (char)(c1+1); //덧셈 연산 가능. 연산결과 대입할 때는 casting 필요
		System.out.println("c1 = " + c1);
		
		c1++; //++연산은 c1 = c1 + 1, char형에서는 casting도 함
		System.out.println("c1 = " + c1);
		
		//한글 문자 테스트
		char h1 = '가';
		char h2 = 44032;
		char h3 = '\uac00'; //  \\u는 16진수 유니코드, ac00은 16진수 값 //주석에서 역슬래시 한번 쓰면 오류나므로 두번 씀
		
		System.out.println("h1 = "  + h1);
		System.out.println("h2 = "  + h2);
		System.out.println("h3 = "  + h3);
		
		System.out.printf("h1 = %d\n", (int)h1);
		System.out.printf("h2 = %d\n", (int)h2);
		System.out.printf("h3 = %d\n", (int)h3);
		
		h1++;
		System.out.println("h1 = "  + h1);
	
		h1++;
		System.out.println("h1 = "  + h1);
		
		//한글의 마지막 문자
		char h4 = 55203;
		char h5 = '\ud7a3';
		System.out.println("h4 = "  + h4);
		System.out.println("h5 = "  + h5);
	

	}

}
/*
 * 문자 데이터를 저장하는 2바이트 형식. 정수값 0 ~ 65535 범위 저장도 가능
 * 	문자는 정수값으로 변환되어 저장됨
 * 		
 * 		영문자, 숫자, 특수문자는 ASCII 코드로 표현 ex) A = 65, a = 97
 * 		영문자, 숫자, 특수문자 외에 다국어 문자는 문자를 처리하는 인코딩 방식에 따라
 *		문자코드 값이 다름. 국제화 인코딩으로 utf-8 방식이 주류
 *
 * 		ex) 간: ㄱ ㅏ ㄴ (초성, 중성, 종성 각각의 코드값으로 조합하는 조합형)
 *     한글에서 나올 수 있는 모든 초성/중성/종성의 모든 표현을 만들어서 각각 코드값을 부여하는 완성형
 */
