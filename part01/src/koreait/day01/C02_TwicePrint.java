package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		System.out.println("Ʈ���̽�");
		System.out.println("�̸�\t�������\t\t����");
		System.out.println("----------------------------");
		System.out.println("�糪\t1996.12.29\t27");
		System.out.println("��ȿ\t1997.02.01\t26");
		System.out.println("�̳�\t1998.03.24\t25");
		//printf() �޼ҵ� ����ؼ� ��� ���� ����
		//"%-12s %s %5d" : 12ĭ ���ڿ�+�ڸ� �� �������� ���� ���ڿ�+5ĭ ����
		//%s�� ������ ĭ���� ������ ����, -��ȣ�� ���� ����
		System.out.printf("%-12s%s%5d\n","dayeon","1998.05.28",25);
		System.out.printf("%12s%s%5d\n","momo","1999.4.23",24);
		System.out.printf("%-12s%s%5d\n","nana","1997.06.14",27);
		
		//printf �޼ҵ忡�� ���Ĺ��� ������ŭ �ڿ� ������ ������ ������ ��ġ�ؾ� ��
		//System.out.printf("%-12s%s%5d\n","nana","1997.06.14");
		
		//printf �޼ҵ忡�� ���Ĺ��ڿ� �ڿ� ������ ������ ������ ��ġ���� �ʾ� ���� �߻�
		//System.out.printf("%-12s%5d\n","nana","1997.06.14");
		
		//%02d : ���� �ڸ� �� 0���� ä��
		System.out.printf("%-12s%4d.%02d.%02d%5d","dayeon",1998,5,28,25);

	
		
		/*��¿� ���Ǵ� ����
		 * \n(�ٹٲ�), \t(tab)
		 * ������ Ÿ�� : %s(���ڿ�), %d(����), 
		 */

	}

}
