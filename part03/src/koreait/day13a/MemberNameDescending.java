package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

//Member 객체의 sort : 비교 가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만듬
public class MemberNameDescending implements Comparator<Member> {
	
	@Override
	public int compare(Member o1, Member o2) {
		
		//name 필드 비교
		return o2.getName().compareTo(o1.getName());
		/*String name1 = o1.getName();
		String name2 = o2.getName();
		return name2.compareTo(name1);	//내림차순 : 
		*/
	}

}
