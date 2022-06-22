package koreait.day13a;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;



public class C35_ListSortTest {
//sort와 관련된 인터페이스 사용
	public static void main(String[] args) {
		//List는 인터페이스, ArrayList는 구현체
		//다형성 : List를 참조타입으로 하여 
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(76);
		ilist.add(45);
		ilist.add(9);
		
		System.out.println("sort 이전 : " + ilist);
		//정렬: 오름차순
		ilist.sort(null);	//인자로 필요한 것은 비교자 Comparator 구현체 필요함
								//기본형, String은 null로 할 수 있음(오름차순 기본)
		System.out.println("sort 이후 : " + ilist);
		ilist.sort(Comparator.reverseOrder());		//reverse: 역순(내림차순)
											//Comparator인터페이스의 static 메소드
		System.out.println("내림차순 sort : " + ilist);
		
		slist.add("트와이스");
		slist.add("오마이걸");
		slist.add("블랙핑크");
		slist.add("소녀시대");
		slist.add("브레이브걸즈");
		
		System.out.println("sort 이전 : " + slist);
		slist.sort(null);	
		System.out.println("sort 이후 (ascending) : " + slist);	//(ASC)
		slist.sort(Comparator.reverseOrder());		
		System.out.println("내림차순 sort (descending) : " + slist);	//(DESC)
		
		System.out.println("1. Comparator 인터페이스 사용하는 sort");
		List<Member> mlist = new ArrayList<>();
		
		mlist.add(new Member("momo", 23));
		mlist.add(new Member("nana", 27));
		mlist.add(new Member("nayeon", 25));
		mlist.add(new Member("dahyeon", 29));
		mlist.add(new Member("sooni", 26));
		mlist.add(new Member("jenny", 27));
		
		System.out.println("member 리스트 상태 : " + mlist);
		//mlist.sort(null);	//오류: Member 객체는 비교할 수 없는 객체 => 비교자 인터페이스를 인자로 해야 함
		//Member 객체의 sort : 비교 가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만듬
		
		mlist.sort(new MemberAgeAscending());
		System.out.println("memberAge sort 확인(ASC) : " + mlist);
		mlist.sort(new MemberAgeDescending());
		System.out.println("memberAge sort 확인(DESC) : " + mlist);
		mlist.sort(new MemberNameAscending());
		System.out.println("memberName sort 확인(ASC) : " + mlist);
		mlist.sort(new MemberNameDescending());
		System.out.println("memberName sort 확인(DESC) : " + mlist);
		
		System.out.println("\n2. Comparable 인터페이스 사용하는 sort");
		List<User> ulist = new ArrayList<User>();
		ulist.add(new User("모모", 23));
		ulist.add(new User("나나", 27));
		ulist.add(new User("나연", 25));
		ulist.add(new User("다현", 29));
		ulist.add(new User("수니", 26));
		ulist.add(new User("제니", 27));
		
		System.out.println("user 리스트 상태 : " + ulist);
		//User는 비교할 수 있는 타입 : Comparable 구현체
		ulist.sort(null);
		System.out.println("user sort(ASC) : " + ulist);
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort(DESC) : " + ulist);
		
		ulist.sort(new Comparator<User>() {
			
			@Override
			public int compare(User o1, User o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});	//메소드 인자로 익명클래스를 정의해서 객체를 생성
		
		System.out.println("user sort(name ASC) : " + ulist);
		
	}

}
/*비교는 동일하고 객체를 직접 비교할수 있는 상태로 만드는가? 아닌가?
 * 아닌가? -> 비교기준 내용과 방법을 sort에 적용
 * 객체를 직접 비교할수 있는 상태로 만드는가? User
 * 비교기준 내용과 방법을 sort에 적용한 것이 Member
*/
