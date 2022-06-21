package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "hi java!";		//message�� ������ ����
		
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		//int, double, char  �迭������ ��Ҹ� ���´� nums[2], carr1[2], point[2]
		//														 �� �⺻�� ������ Ÿ��
		//engKey �Ӹ� �ƴ϶� engKey[2] �� String ������ Ÿ��
		
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i]);		//engKey[i]�� String ������
		
		String[] koreans = new String[5];		//�迭����� ���� �⺻�� ������ ����x, ������ ����
															//�⺻ �ʱⰪ��? null (�ƹ��͵� �������� ���� ����)
		for(int i = 0; i < koreans.length; i++)
			System.out.println(koreans[i]);
		
		System.out.println("1. engKey �迭��� ���� �����ϴ� ���ڿ��� ����");
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i] + ":" + engKey[i].length());
		
		koreans[0] = "����ϴ�";
		koreans[1] = "���ߴ�";
		koreans[2] = "������";
		
		System.out.println("2. koreans �迭��� ���� �����ϴ� ���ڿ��� ����");
		for(int i = 0; i < koreans.length; i++)
			if(koreans[i] != null)	//*** �߿�
			System.out.println(koreans[i] + ":" + koreans[i].length());
		//�����ϰ� �ִ� ��ü�� ���� �� �޼ҵ�/�ʵ� �����ϸ� ���� �߻� : koreans[3], korean[4] null �����ϱ� ������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("static ��? >>>");
		koreans[3] = sc.nextLine();
		System.out.println("dynamic ��? >>>");
		koreans[4] = sc.nextLine();
		
		System.out.println("3. ��� �Էµ� koreans �迭 Ȯ��");
		for(int i = 0; i < koreans.length; i++)
			System.out.println(koreans[i]);
		
		//����ڰ� �Է��� ���� �ܾ engKey �迭 �ε��� �������?
		System.out.print("ã�� �ܾ�� >>> ");
		String find = sc.nextLine();
		
		int index = -1;		
		
		for(int i = 0; i < engKey.length; i++) {
			if(find.equals(engKey[i])) {
				index = i;
				break;
			}
		}
		//index ������ ������� �ʴ� ��� �����غ���	
		/*int i;
		for(int i = 0; i< engKey.length; i++) {
			if(find.equals(engKey[i]))
				break;	//i = 0 ~ engKey.length-1
			}
		break�� for�� �ߴ����� �ʰ� for�� ��� �������� ���� ���� ���ڿ��� �迭 engKey�� ���� ����	
		i = ?
		
		System.out.println("ã�� �ܾ� ��ġ : " + i);
		if(index == engKey.length)
			System.out.println("ã�� �ܾ engKey�� �����ϴ�");
		else
			System.out.println("�ѱ� �� : " + koreans[i]);
		*/	
		System.out.println("ã�� �ܾ� ��ġ : " + index);
		if(index == -1)
			System.out.println("ã�� �ܾ engKey�� �����ϴ�");
		else
			System.out.println("�ѱ� �� : " + koreans[index]);
		
	
	}

}
