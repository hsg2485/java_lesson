package koreait.day04;

public class C20_StringMethod {
//�ۼ��� : �Ѽ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "hello"; //java.lang.String (�⺻��Ű�� Ŭ����)
		
//		message.length();			//public int length()
//		message.charAt(0);			//public char charAt(int index)
		
//		message.equals("Hello"); //public boolean equals(Object anObject), Object�� ��� Ÿ��
											//message�� StringŸ�� �̹Ƿ� Object�� String���� �ؼ�

		//���ϰ� ������?
		int indexOf = message.indexOf('e');
		String substring = message.substring(2);
		String substring2 = message.substring(2,4);
		String replace = message.replace("ll", "!@");
		
		System.out.println("indexOf('e') = " + indexOf);
		System.out.println("substring(2) = " +substring);
		System.out.println("substring(2,4) = " + substring2);
		System.out.println("replace(\"ll\", \"!@\") =  " + replace);
		System.out.println("startsWith(\"h\") = " + message.startsWith("h"));
		System.out.println("endsWith(\"!\") = " + message.endsWith("!"));
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("lo"));
		System.out.println("test.lastIndexOf(\"lo\") = " + test.lastIndexOf("lo"));
		
		int len = message.length();		//���ڿ� ����
		char temp = message.charAt(3);		//0���� �����ؼ� 3��° ���ڰ� �������� ����
		boolean isState = message.equals("Hello"); //���ڿ��� ������ �� 
		
		System.out.println("-------------------------");
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello\") = " + isState);  
		// ū����ǥ�� ���� ��ü�� ����Ϸ��� => \"����\"
	}

}
//String Ŭ������ �޼ҵ�� �����Ƿ� �� �ܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�,����,���������� �����ؼ� ���
//�޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��.


