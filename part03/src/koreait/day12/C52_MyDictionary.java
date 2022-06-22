package koreait.day12;
//작성자: 한성구
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	//키보드 입력시 nextLine() 과 nextInt()등을 같이 쓰면 입력이 정상 실행 안됨
		//HashMap<String, String> mydic = new HashMap<>();	//단어장 저장할 자료 구조
		TreeMap<String, String> mydic = new TreeMap<String, String>();
		// ㄴ이진 검색 가능한 구조로 Map을 생성: 정렬이 되는 Map
		//Key : 영어 단어, value: 한글 뜻
		String sel, eng, kor;
		System.out.println("선택 기능) 1. 단어저장 2. 단어검색 3. 단어장보기 4. 프로그램 종료");
		boolean run = true;
		while(run) {		//while 반복 안에 switch로 종료조건을 동작시킬 때 break로 못함 => 변수 사용
			System.out.println("기능 선택 => ");
			sel = sc.nextLine();
			switch(sel) {
			case "1": 		//switch 문에서 case "문자열" 형식 가능. if 문에서는 sel.equals("1")로 해야함
				System.out.println("English => ");
				eng = sc.nextLine();	//eng = sc.nextInt();
				System.out.println("Korean => ");
				kor = sc.nextLine();
				mydic.put(eng, kor);		//저장
				break;
			case "2":
				System.out.print("검색 단어 English => ");
				String find = sc.nextLine();
				if(mydic.containsKey(find))	{ 
					System.out.println("검색 결과 : " + mydic.get(find));
				}
				else {
					System.out.println("찾는 단어가 없습니다");
				}
				break;
			case "3":
				System.out.println("단어장 전체 보기: " + mydic);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. (1~4)");
				break;
			}
		}
		System.out.println("단어장 종료");
		sc.close();
	}

}	//참고: 정수 데이터 입력을 받아야 한다면 문자열 nextLine() 받아서 정수로 변환
	//		int score = Integer.parseInt(sc.nextLine());
	//		이유: nextInt()는 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해됨
	//		결론: 한 소스 파일에서 nextInt()만 사용 또는 nextLine()만 사용하거나 함
