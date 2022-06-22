package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class C52_MyDictionary_my {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ���) 1. �ܾ����� 2. �ܾ�˻� 3. �ܾ��庸�� 4. ���α׷� ������");
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> Dictionary = new HashMap<>();
		boolean run = true;
		
		while (run) {
			System.out.println("��� ���� => ");
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
					System.out.print("�˻� �ܾ� English => ");
					String find = sc.nextLine();
						if(!Dictionary.containsKey(find))	{ 
							System.out.println("�˻� ��� : " + Dictionary.get(find));
						}
						else {
							System.out.println("ã�� �ܾ �����ϴ�");
						}
						break;
					
				case "3":
					System.out.println(Dictionary);
					break;
					
				case "4":
					run = false;
					System.out.println("���α׷��� �����մϴ�.");
					break;
				
				default:
					System.out.println("�߸��� �Է��Դϴ�. 1~4�� �Է��ϼ���");
					break;
				}
		sc.close();
	}
	}

}
