package koreait.day04;

public class C19_MethodTest {
	//main �޼ҵ� : ������ ������; ���α׷� ������ ���ؼ��� �� �־�� �� �޼ҵ� (������ ���)
	public static void main(String[] args) {
		
		/*
		 * �޼ҵ��� �ֿ� ��� : ��ȯ��(����), ����(argument)�Ǵ� �Ű�����(parameter) (�Ѵ� ���� �ǹ�),�޼ҵ��, public �Ǵ� static ���� ����
		 *			�� ��ȯ��: �޼ҵ� ���� �Ϸ�Ǹ� ������� ��� ��
		 *			�� ����: �޼ҵ� ������ ���ؼ� �ʿ��� ������ (���İ� ������ ���� �ʿ�) => ������ ������ ������ �پ���
		 *			�� �޼ҵ��: �ĺ���	
		 *			�� public: ����������, static: ���� ���                  
		 */
		
		System.out.println("�޼ҵ带 ���� �����ؼ� ���");
	    /*���α׷��� main �޼ҵ��� ��ɹ��� ������� �����ϰ� �߰��� �޼ҵ� ȣ���� ������ �޼ҵ尡 ���ǵ� ������ ����
		��� �̵���. �޼ҵ� ������ ����Ǹ� �ٽ� main �޼ҵ�� ��� ���ƿ�
		*/
		
		methodA(); //�޼ҵ� ȣ��(����), �ʿ��� �� ȣ��
		methodB(11,13); //11, 13�� �޼ҵ� ���࿡ �ʿ��� ����
		methodB(123, 456);
	  //methodB(123, 4.56); // �Ǽ�(double)=>����(int)�� �ڵ� ����ȯ �ȵ�
		methodC(123, 456);  // ����(int)=>�Ǽ�(double)�� �ڵ� ����ȯ ��
	  //methodD(); //ȣ�⸸ �ϸ� ��ȯ���� �ִ� �޼ҵ����� main �޼ҵ忡�� ��ȯ�� ���� ���ϱ� ������ ���� �߻�
		methodD();
		System.out.println("return = " + methodD()); //��ȯ���� �޾Ƽ� ����ϴ� ����
		int temp = methodD();				//��ȯ���� �޾Ƽ� ������ �����ϴ� ����
		System.out.println(temp);
		double result = methodE(314, 3.14);
		System.out.println("return = " + result);
		int result2 = methodF('i', 4); //����+����=����
		System.out.println("return = " +result2);
		char result3 = methodF('i', 4);
		System.out.println("return = " +result3);
		
		char a = 'a';
		int b = 3;
		a = methodF(a,b);
		System.out.println("return = " + a);
		

	}
	//static�� main���� ������ �޼ҵ�� �����ϰ� static �̾�� �� (���� ������ ����� ��)
	//�޼ҵ� ����(����)
	public static void methodA() {
		
		System.out.println("ù��° �޼ҵ� ���� ����");
	}
	public static void methodB(int a, int b) //int a, int b�� ���ڰ��� ���޹޴� �Ű�����
	{
		System.out.println("�ι�° �޼ҵ� ���� ����");
		System.out.println("���� ���� ��  a = " + a + ", b= " + b);
	}
	public static void methodC(int a, double b) {
		System.out.println("����° �޼ҵ� ���� ����");
		System.out.println("���� ���� ��  a = " + a + ", b= " + b);
	}
	public static int methodD() //void(��ȯ�� ����)�� ���� ������ ��ȯ���� �ִ� ����: ��ȯ���� int ������, �ݵ�� return�� �ʿ���
	{
		System.out.println("�׹�° �޼ҵ� ���� ����");
		return 999;
	}
	public static double methodE(int a, double b) {
		System.out.println("�ټ���° �޼ҵ� ���� ����");
		return a+b;
	}
	public static char methodF(int a, int b) {
		System.out.println("������° �޼ҵ� ���� ����");
		return (char)(a+b);
	}

}
