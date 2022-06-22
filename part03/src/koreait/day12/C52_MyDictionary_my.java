package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class C52_MyDictionary_my {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("선택 기능) 1. 단어저장 2. 단어검색 3. 단어장보기 4. 프로그램 끝내기");
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> Dictionary = new HashMap<>();
		boolean run = true;
		
		while (run) {
			System.out.println("기능 선택 => ");
			String choice = sc.nextLine();
			switch (choice) {
				case "1":
					System.out.println("English => ");
					String word = sc.nextLine();
					System.out.println("Korean => ");
					String mean = sc.nextLine();
					Dictionary.put(word, mean);
					break;
			
				case "2":
					System.out.print("검색 단어 English => ");
					String find = sc.nextLine();
						if(!Dictionary.containsKey(find))	{ 
							System.out.println("검색 결과 : " + Dictionary.get(find));
						}
						else {
							System.out.println("찾는 단어가 없습니다");
						}
						break;
					
				case "3":
					System.out.println(Dictionary);
					break;
					
				case "4":
					run = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				
				default:
					System.out.println("잘못된 입력입니다. 1~4만 입력하세요");
					break;
				}
		sc.close();
	}
	}

}
