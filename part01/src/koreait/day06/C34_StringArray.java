package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "hi java!";		//message는 참조형 변수
		
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		//int, double, char  배열에서는 요소를 나태는 nums[2], carr1[2], point[2]
		//														 ㄴ 기본형 데이터 타입
		//engKey 뿐만 아니라 engKey[2] 도 String 참조형 타입
		
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i]);		//engKey[i]는 String 참조형
		
		String[] koreans = new String[5];		//배열요소의 값이 기본형 데이터 저장x, 참조값 저장
															//기본 초기값은? null (아무것도 참조하지 않은 상태)
		for(int i = 0; i < koreans.length; i++)
			System.out.println(koreans[i]);
		
		System.out.println("1. engKey 배열요소 값이 참조하는 문자열의 길이");
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i] + ":" + engKey[i].length());
		
		koreans[0] = "계속하다";
		koreans[1] = "멈추다";
		koreans[2] = "공용의";
		
		System.out.println("2. koreans 배열요소 값이 참조하는 문자열의 길이");
		for(int i = 0; i < koreans.length; i++)
			if(koreans[i] != null)	//*** 중요
			System.out.println(koreans[i] + ":" + koreans[i].length());
		//참조하고 있는 객체가 없을 때 메소드/필드 참조하면 오류 발생 : koreans[3], korean[4] null 참조하기 때문에
		
		Scanner sc = new Scanner(System.in);
		System.out.println("static 뜻? >>>");
		koreans[3] = sc.nextLine();
		System.out.println("dynamic 뜻? >>>");
		koreans[4] = sc.nextLine();
		
		System.out.println("3. 모두 입력된 koreans 배열 확인");
		for(int i = 0; i < koreans.length; i++)
			System.out.println(koreans[i]);
		
		//사용자가 입력한 영어 단어가 engKey 배열 인덱스 몇번인지?
		System.out.print("찾을 단어는 >>> ");
		String find = sc.nextLine();
		
		int index = -1;		
		
		for(int i = 0; i < engKey.length; i++) {
			if(find.equals(engKey[i])) {
				index = i;
				break;
			}
		}
		//index 변수를 사용하지 않는 방법 생각해보기	
		/*int i;
		for(int i = 0; i< engKey.length; i++) {
			if(find.equals(engKey[i]))
				break;	//i = 0 ~ engKey.length-1
			}
		break로 for를 중단하지 않고 for를 모두 실행했을 때는 같은 문자열이 배열 engKey에 없을 때임	
		i = ?
		
		System.out.println("찾은 단어 위치 : " + i);
		if(index == engKey.length)
			System.out.println("찾는 단어가 engKey에 없습니다");
		else
			System.out.println("한글 뜻 : " + koreans[i]);
		*/	
		System.out.println("찾은 단어 위치 : " + index);
		if(index == -1)
			System.out.println("찾는 단어가 engKey에 없습니다");
		else
			System.out.println("한글 뜻 : " + koreans[index]);
		
	
	}

}
