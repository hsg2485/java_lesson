package koreait.day13a;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;



public class C35_ListSortTest {
//sort�� ���õ� �������̽� ���
	public static void main(String[] args) {
		//List�� �������̽�, ArrayList�� ����ü
		//������ : List�� ����Ÿ������ �Ͽ� 
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(76);
		ilist.add(45);
		ilist.add(9);
		
		System.out.println("sort ���� : " + ilist);
		//����: ��������
		ilist.sort(null);	//���ڷ� �ʿ��� ���� ���� Comparator ����ü �ʿ���
								//�⺻��, String�� null�� �� �� ����(�������� �⺻)
		System.out.println("sort ���� : " + ilist);
		ilist.sort(Comparator.reverseOrder());		//reverse: ����(��������)
											//Comparator�������̽��� static �޼ҵ�
		System.out.println("�������� sort : " + ilist);
		
		slist.add("Ʈ���̽�");
		slist.add("�����̰�");
		slist.add("����ũ");
		slist.add("�ҳ�ô�");
		slist.add("�극�̺����");
		
		System.out.println("sort ���� : " + slist);
		slist.sort(null);	
		System.out.println("sort ���� (ascending) : " + slist);	//(ASC)
		slist.sort(Comparator.reverseOrder());		
		System.out.println("�������� sort (descending) : " + slist);	//(DESC)
		
		System.out.println("1. Comparator �������̽� ����ϴ� sort");
		List<Member> mlist = new ArrayList<>();
		
		mlist.add(new Member("momo", 23));
		mlist.add(new Member("nana", 27));
		mlist.add(new Member("nayeon", 25));
		mlist.add(new Member("dahyeon", 29));
		mlist.add(new Member("sooni", 26));
		mlist.add(new Member("jenny", 27));
		
		System.out.println("member ����Ʈ ���� : " + mlist);
		//mlist.sort(null);	//����: Member ��ü�� ���� �� ���� ��ü => ���� �������̽��� ���ڷ� �ؾ� ��
		//Member ��ü�� sort : �� ������ ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü ����
		
		mlist.sort(new MemberAgeAscending());
		System.out.println("memberAge sort Ȯ��(ASC) : " + mlist);
		mlist.sort(new MemberAgeDescending());
		System.out.println("memberAge sort Ȯ��(DESC) : " + mlist);
		mlist.sort(new MemberNameAscending());
		System.out.println("memberName sort Ȯ��(ASC) : " + mlist);
		mlist.sort(new MemberNameDescending());
		System.out.println("memberName sort Ȯ��(DESC) : " + mlist);
		
		System.out.println("\n2. Comparable �������̽� ����ϴ� sort");
		List<User> ulist = new ArrayList<User>();
		ulist.add(new User("���", 23));
		ulist.add(new User("����", 27));
		ulist.add(new User("����", 25));
		ulist.add(new User("����", 29));
		ulist.add(new User("����", 26));
		ulist.add(new User("����", 27));
		
		System.out.println("user ����Ʈ ���� : " + ulist);
		//User�� ���� �� �ִ� Ÿ�� : Comparable ����ü
		ulist.sort(null);
		System.out.println("user sort(ASC) : " + ulist);
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort(DESC) : " + ulist);
		
		ulist.sort(new Comparator<User>() {
			
			@Override
			public int compare(User o1, User o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});	//�޼ҵ� ���ڷ� �͸�Ŭ������ �����ؼ� ��ü�� ����
		
		System.out.println("user sort(name ASC) : " + ulist);
		
	}

}
/*�񱳴� �����ϰ� ��ü�� ���� ���Ҽ� �ִ� ���·� ����°�? �ƴѰ�?
 * �ƴѰ�? -> �񱳱��� ����� ����� sort�� ����
 * ��ü�� ���� ���Ҽ� �ִ� ���·� ����°�? User
 * �񱳱��� ����� ����� sort�� ������ ���� Member
*/
