package koreait.day07;

import java.util.Random;
import java.util.Scanner;

/*1. ���� ������
���ڸ� �����Դϴ�.

2. ������ ������ ����ϴ�.

3. �׽�Ʈ�Ҷ��� ������
5���� �ٿ��� �ϼ���.

4. Ŭ���� Ȱ��ƴϰ�
int �� �迭�θ� �ϼ���.

5. ù��° �ǿ����� �迭
   �ι�° �ǿ����� �迭
   ����� �Է� �������� �迭

��繮�� 10���� ����? or
Ʋ�������� ����?
*/
//�ۼ���: �Ѽ���

public class C42_Day07Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[] x = new int[5];
		    int[] y = new int[5];
		    int[] answer = new int[5];  // ���� ��
		    int count = 0, score = 0;
		    Scanner sc = new Scanner(System.in); 
		    Random r = new Random(); 
		    //Ʋ������ ���� ���� �͵� for������ �ۼ�	   
		    System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		 
		    for(int i = 0; i < 5; i++) {	//������ ���� 5�� ���� �� �迭�� ����
		    	x[i] = r.nextInt(89)+10;	
		    	y[i] = r.nextInt(89)+10;
		    	//����ڰ� �Է��� ������ Ʋ���� �迭�� �����ؼ� ����ϴ� ���?
		    	System.out.printf("���� %d. %d + %d = ? : \n", i+1, x[i], y[i]);
			    answer[i] = sc.nextInt();	// ���� �� 
			    if(answer[i] == x[i] + y[i]) {
	            count++;
	            score += 20;
			    }
		    }
		    for(int i = 0; i< 5; i++) 
		        if(answer[i] != x[i] + y[i]) {
		            System.out.println("����!\n" + x[i] + "+" + y[i] + " = " + (x[i] + y[i])
		            		+" �Դϴ�.");
		        }
		    System.out.printf("ä���մϴ�. ���� ���� : %d (%d��)",count, score);
		    sc.close();
		    
	}
}
