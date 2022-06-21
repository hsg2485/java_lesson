package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'a';
		char c2 = 97;
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
		//���ڸ� ������ ��� => int�� ĳ���� �ʿ�
		//System.out.printf("c1 = %d\n", c1); //���� : char ���� %d�� �ƴ�
		System.out.printf("c1 = %d\n", (int)c1);
		
		c1 = (char)(c1+1); //���� ���� ����. ������ ������ ���� casting �ʿ�
		System.out.println("c1 = " + c1);
		
		c1++; //++������ c1 = c1 + 1, char�������� casting�� ��
		System.out.println("c1 = " + c1);
		
		//�ѱ� ���� �׽�Ʈ
		char h1 = '��';
		char h2 = 44032;
		char h3 = '\uac00'; //  \\u�� 16���� �����ڵ�, ac00�� 16���� �� //�ּ����� �������� �ѹ� ���� �������Ƿ� �ι� ��
		
		System.out.println("h1 = "  + h1);
		System.out.println("h2 = "  + h2);
		System.out.println("h3 = "  + h3);
		
		System.out.printf("h1 = %d\n", (int)h1);
		System.out.printf("h2 = %d\n", (int)h2);
		System.out.printf("h3 = %d\n", (int)h3);
		
		h1++;
		System.out.println("h1 = "  + h1);
	
		h1++;
		System.out.println("h1 = "  + h1);
		
		//�ѱ��� ������ ����
		char h4 = 55203;
		char h5 = '\ud7a3';
		System.out.println("h4 = "  + h4);
		System.out.println("h5 = "  + h5);
	

	}

}
/*
 * ���� �����͸� �����ϴ� 2����Ʈ ����. ������ 0 ~ 65535 ���� ���嵵 ����
 * 	���ڴ� ���������� ��ȯ�Ǿ� �����
 * 		
 * 		������, ����, Ư�����ڴ� ASCII �ڵ�� ǥ�� ex) A = 65, a = 97
 * 		������, ����, Ư������ �ܿ� �ٱ��� ���ڴ� ���ڸ� ó���ϴ� ���ڵ� ��Ŀ� ����
 *		�����ڵ� ���� �ٸ�. ����ȭ ���ڵ����� utf-8 ����� �ַ�
 *
 * 		ex) ��: �� �� �� (�ʼ�, �߼�, ���� ������ �ڵ尪���� �����ϴ� ������)
 *     �ѱۿ��� ���� �� �ִ� ��� �ʼ�/�߼�/������ ��� ǥ���� ���� ���� �ڵ尪�� �ο��ϴ� �ϼ���
 */
