package koreait.day05;

public class C23_ForTest {		//�ݺ��Ǵ� ��ɵ��� �����ϴ� for �� �����մϴ�. 

	public static void main(String[] args) {

		//��ɹ��� �ݺ�1
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");

		
		//��ɹ��� �ݺ�2
		System.out.println("hello!(1)");
		System.out.println("hello!(2)");
		System.out.println("hello!(3)");
		System.out.println("hello!(4)");
		System.out.println("hello!(5)");
		
//		for(�����ʱⰪ;�������ǽ�;������)		
		for(int i=0;i<5;i++)	{		//i�� for() �ȿ��� �����ϸ� for������ ����Ҽ� �ֽ��ϴ�.(for { }�� ��������)
			//i�� 0���� 4���� ����Ǹ鼭 �����մϴ�.
			System.out.println("��ο� !");		//i=0 , 0<5 �� -> ��� ���� -> i++
			System.out.println(i);
			System.out.println("////////");		//i=1 , 1<5 �� ->    " -> i++
		}						//i=2, 2<5 �� ->     "    -> i++
								//	:
								//i=5, 5<5 ���� -> for����

		//�ٸ� ����
		for(int i=0;i<10;i+=2)			//�����?
			System.out.println("hello!!!!!");  
		
		for(int i=0;i<10;i++) 			//�����?
			System.out.println("��ο�!!!!!");
		
		for(int i=10; i>0; i--)
			System.out.println("����!!");

		// �� ��ɹ��� �ݺ�2�� for�� ����غ�����.
		for(int i = 1; i <=5; i ++) 
			System.out.println("hello!"+"("+i+")");
				


	}							
}
