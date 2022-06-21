package koreait.day16;
import java.util.ArrayList;
import java.util.Comparator;
//�ۼ���: �Ѽ���
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
//���迡 �� �������� ����(�����ʼ�)
public class MyDictionary {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);	
		List<Word> mywords = new ArrayList<>();	
		String sel, eng, kor;
		int level;
		System.out.println("���� ���) 1. �ܾ����� 2. �ܾ�˻� 3. �ܾ��庸�� 4. ������ �˻� 5. ���α׷� ����");
		boolean run = true;
		while(run) {		
			System.out.println("��� ���� => ");
			sel = sc.nextLine();
			switch(sel) {
			case "1": 		
				System.out.println("English => ");
				eng = sc.nextLine();	
				System.out.println("Korean => ");
				kor = sc.nextLine();
				System.out.println("���� => ");
				level = Integer.parseInt(sc.nextLine());
				mywords.add(new Word(eng, kor, level));		
				break;
			case "2":
				System.out.print("�˻� �ܾ� English => ");
				eng = sc.nextLine();
				for(Word w : mywords)
				if(w.getEnglish().equals(eng))	
					System.out.println("�˻� ��� : " + w);
				break;
			case "3":
				//System.out.println("�ܾ��� ��ü ����: " + mywords);
				all(mywords);		//�����ϰ� ����ϱ�
				break;
			case "4":
				System.out.println("�˻��� ���� �Է�(1~3) => ");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords, no);
				break;
			case "5":
				run = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�. (1~4)");
				break;
			}
		}
		System.out.println("�ܾ��� ����");
		sc.close();
	}

	private static void level(List<Word> mywords, int no) {
		
		for(Word w : mywords)
			if(w.getLevel() == no)
				System.out.println(w);
		
	}

	private static void all(List<Word> mywords) {	//mywords �� ������ ���޹޾� ������ ��ü�� ����Ŵ
		
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