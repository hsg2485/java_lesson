package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] datas = {11, 22, 33, 44, 55, 66, 77}; //배열은 선언할 때 배열의 크기를 정함
											//배열은 기본형 데이터 타입 int, double, long, ... 또는 참조형 타입
		
		ArrayList<Integer> list = new ArrayList<>();
									//ArrayList는 크기가 동적
									//데이터 타입은 참조형 타입만. 기본형은 래퍼클래스 사용
									//<E> 는 제너릭(Generic) 타입이라고 부름. 데이터 요소의 타입을 정함. 
									//리스트에 저장하는 데이터를 요소(Element)라고 함
		
		String[] names = {"쯔위", "모모", "신비", "은하", "나나"};
		ArrayList<String> name_list = new ArrayList<>();
		
		//ArrayList에 데이터 추가는 add() 메소드
		list.add(11);
		list.add(33);
		list.add(44);list.add(55);list.add(66);list.add(77);
		
		System.out.println("1. 첫번째 ArrayList<Integer> 출력");
		System.out.println(list);
		System.out.println("참고(배열 출력 방법) :  " + Arrays.toString(datas)
							+ "배열 크기 출력방법" + datas.length);
		System.out.println("두번째 ArrayList<String> 출력");
		System.out.println(name_list);		//
		System.out.println("리스트의 크기 : " + name_list.size());		//데이터 없을 때는 0
		
		name_list.add("쯔위");name_list.add("모모");name_list.add("은하");
		name_list.add("나나");
		System.out.println("2. 두번째 ArrayList<Integer> 출력");
		System.out.println(name_list);
		System.out.println("리스트의 크기 : " + name_list.size());
		
		System.out.println("3. 특정 위치에 데이터 추가");
		list.add(1,22);		//(인덱스 위치, 추가될 값) 단, 인덱스 위치는 배열의 크기보다 작아야 함
		/*int temp = 22;
		   list.add(1,temp);	//변수 선언해서 리터럴 넣을 위치에 변수를 넣어도 가능
		*/
		System.out.println("add(1,22) 결과 : " + list);
		name_list.add(2, "신비");
		System.out.println("add(2,\"신비\") 결과" + name_list);
		
		System.out.println("4. 배열처럼 index 값으로 데이터 가져오기");
		System.out.println("list.get(3) : " + list.get(3));
		System.out.println("name_list.get(3) : " + name_list.get(3));
		
		System.out.println("5. 특정 위치의 데이터(요소) 제거");
		list.remove(4);
		System.out.println(list);
		name_list.remove(4);
		System.out.println(name_list);
		
		System.out.println("\n6. 특정 값 위치를 알아내기");
		System.out.println("배열 : " +Arrays.binarySearch(names, "신비"));
		System.out.println("리스트 : " + name_list.indexOf("신비"));
		
		System.out.println("\n7. 6번의 실행 내용을 for문으로 한다면?");
		System.out.println("배열");
		int i;
		for(i = 0; i< names.length; i++) {
			if(names[i].equals("신비"))
				break;
		}
		System.out.println("'신비'는 인덱스 : " + i);
		System.out.println("리스트");
		for(i = 0; i < name_list.size(); i++) {
			if(name_list.get(i).equals("신비")) 
				break;
		}
		System.out.println("'신비'는 인덱스 : "  + i);
		
		//'신비' 요소가 여러개일때 리스트는 lastIndexOf 메소드로 마지막 일치 요소를 찾을 수 있음
		
		System.out.println("\n8. contains 메소드");
		System.out.println("'나나'가 리스트에 있는가? " + name_list.contains("나나"));
		System.out.println("'다현'이 리스트에 있는가? " + name_list.contains("다현"));
		
		
		
		
		

	}

}
/* 배열 : 많은 양의 데이터를 저장하는 방법
 * 컬렉션(Collections) : 자료 구조. 많은 양의 데이터를 저장하는 것이고 데이터 특징에 따라
 * 								관리(저장, 읽기/쓰기)하는 차이가 있음
 * 								데이터를 삽입/삭제 등의 알고리즘이 메소드로 구현되어 있음
 * 			ㄴArrayList 클래스
 * 			ㄴHashMap 클래스
 * 
 * add 추가
	get 데이터 가져오기
	remove 특정위치 데이터 삭제
	기본배열크기 length
	리스트 크기 size

 * 
 */
