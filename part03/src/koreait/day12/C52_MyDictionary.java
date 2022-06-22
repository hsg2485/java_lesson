package koreait.day12;
//�ۼ���: �Ѽ���
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	//Ű���� �Է½� nextLine() �� nextInt()���� ���� ���� �Է��� ���� ���� �ȵ�
		//HashMap<String, String> mydic = new HashMap<>();	//�ܾ��� ������ �ڷ� ����
		TreeMap<String, String> mydic = new TreeMap<String, String>();
		// ������ �˻� ������ ������ Map�� ����: ������ �Ǵ� Map
		//Key : ���� �ܾ�, value: �ѱ� ��
		String sel, eng, kor;
		System.out.println("���� ���) 1. �ܾ����� 2. �ܾ�˻� 3. �ܾ��庸�� 4. ���α׷� ����");
		boolean run = true;
		while(run) {		//while �ݺ� �ȿ� switch�� ���������� ���۽�ų �� break�� ���� => ���� ���
			System.out.println("��� ���� => ");
			sel = sc.nextLine();
			switch(sel) {
			case "1": 		//switch ������ case "���ڿ�" ���� ����. if �������� sel.equals("1")�� �ؾ���
				System.out.println("English => ");
				eng = sc.nextLine();	//eng = sc.nextInt();
				System.out.println("Korean => ");
				kor = sc.nextLine();
				mydic.put(eng, kor);		//����
				break;
			case "2":
				System.out.print("�˻� �ܾ� English => ");
				String find = sc.nextLine();
				if(mydic.containsKey(find))	{ 
					System.out.println("�˻� ��� : " + mydic.get(find));
				}
				else {
					System.out.println("ã�� �ܾ �����ϴ�");
				}
				break;
			case "3":
				System.out.println("�ܾ��� ��ü ����: " + mydic);
				break;
			case "4":
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

}	//����: ���� ������ �Է��� �޾ƾ� �Ѵٸ� ���ڿ� nextLine() �޾Ƽ� ������ ��ȯ
	//		int score = Integer.parseInt(sc.nextLine());
	//		����: nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ص�
	//		���: �� �ҽ� ���Ͽ��� nextInt()�� ��� �Ǵ� nextLine()�� ����ϰų� ��
