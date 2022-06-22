package koreait.day16;
import java.util.ArrayList;
import java.util.Comparator;
//작성자: 한성구
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
//시험에 이 형식으로 나옴(복습필수)
public class MyDictionary {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);	
		List<Word> mywords = new ArrayList<>();	
		String sel, eng, kor;
		int level;
		System.out.println("선택 기능) 1. 단어저장 2. 단어검색 3. 단어장보기 4. 레벨로 검색 5. 프로그램 종료");
		boolean run = true;
		while(run) {		
			System.out.println("기능 선택 => ");
			sel = sc.nextLine();
			switch(sel) {
			case "1": 		
				System.out.println("English => ");
				eng = sc.nextLine();	
				System.out.println("Korean => ");
				kor = sc.nextLine();
				System.out.println("레벨 => ");
				level = Integer.parseInt(sc.nextLine());
				mywords.add(new Word(eng, kor, level));		
				break;
			case "2":
				System.out.print("검색 단어 English => ");
				eng = sc.nextLine();
				for(Word w : mywords)
				if(w.getEnglish().equals(eng))	
					System.out.println("검색 결과 : " + w);
				break;
			case "3":
				//System.out.println("단어장 전체 보기: " + mywords);
				all(mywords);		//정렬하고 출력하기
				break;
			case "4":
				System.out.println("검색할 레벨 입력(1~3) => ");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords, no);
				break;
			case "5":
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

	private static void level(List<Word> mywords, int no) {
		
		for(Word w : mywords)
			if(w.getLevel() == no)
				System.out.println(w);
		
	}

	private static void all(List<Word> mywords) {	//mywords 의 참조값 전달받아 동일한 객체를 가리킴
		
		mywords.sort(new Comparator<Word>() {
			
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
			
		});
		
		System.out.println(String.format("%-20s %-20s\t %10s", "English","Korean","Level"));
		System.out.println("-------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %10d", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
		
	}

}	