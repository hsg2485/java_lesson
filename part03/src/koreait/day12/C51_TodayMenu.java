package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("오늘의 저녁 메뉴 투표");
		String foods = "치맥, 떡볶이, 곱창, 불고기, 햄버거, 오징어물회";
		System.out.println(foods);
		
		//key: 메뉴이름, value :  투표 수 
		
		//초기화
		HashMap<String, Integer> map = new HashMap<>();
		map.put("치맥", 0);
		map.put("떡볶이", 0);
		map.put("곱창", 0);
		map.put("불고기", 0);
		map.put("햄버거", 0);
		map.put("오징어물회", 0);
		
		Scanner sc = new Scanner(System.in);
		
		//메뉴 선택(반복)
		while(true) {
			System.out.println(foods);
			System.out.println("선택 메뉴 음식명 입력하세요.(종료는 end 입력) =>");
			String menu = sc.nextLine();
			if(menu.equals("end"))
				break;
			if(!map.containsKey(menu)) {	//map의 key값에 menu 입력 문자열이 없으면
				System.out.println("없는 메뉴입니다. 메뉴에 추가합니다");
				map.put(menu, 1);	//없는 메뉴 리스트에 새로 추가 후 카운트
				foods += ", " + menu;
				continue;
			}
			
			//입력받은 menu의 value값 가져오고 => +1하기 => 결과 저장
			int temp = map.get(menu);
			++temp;
			map.put(menu, temp);
			//map.put(menu, ++temp);		//위에랑 동일코드

		}
		System.out.println("투표 종료합니다.");
		System.out.println(map);
		System.out.println("최대 투표수 : " + Collections.max(map.values()));	//가장 큰 value
		System.out.println("참고 : " + Collections.max(map.keySet()));	//가장 큰 key (가나다 순 가장 뒤에 인 ㅎ의 햄버거가 출력)
		//Entry<Key, Value>
		
	}

}
