package koreait.day02;

public class C07_CastingTest {
//Ŭ������ ���� �� ���ϸ� ���� �����ؾ� ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123, b = 13;
		double c = 10.34;
		
		int isum;
		double dsum;
		
		isum = a + b;
		dsum = a + c;
		
		//isum = a + c; 
		//����+�Ǽ��� �� ���� �Ǽ��� �ƴ� ������ �����Ϸ��� ����ȯ(ĳ����) �ؾ� ��
		
		
		System.out.println("a + b = " + isum);
		System.out.println("a + c = " + dsum);
		
		b = 10;
		System.out.printf("%d / %d =  %f\n",a,b,(double)a/b); //�Ǽ� ���� ���� %f => �⺻ �Ҽ��� ���� 6�ڸ����� ���
		
		b = 11;
		System.out.printf("%d / %d =  %.2f\n",a,b,(float)a/b); //�Ҽ��� ���� 2�ڸ����� ���
		
		double test  = 12.90203948;
		System.out.println("test = " + test);
		System.out.printf("test = %f\n", test);
		System.out.printf("test = %.15f\n", test);
		
		
	}

}

