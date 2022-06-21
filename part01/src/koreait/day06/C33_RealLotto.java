package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//�ۼ���: �Ѽ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[45];
		Random r = new Random();
		
		for(int i = 0; i < 45; i++) {	//�ε��� ���� : 0 ~ 44
			numbers[i] = i + 1;			//�� ���� : 1 ~ 45
		}
		System.out.println("numbers �迭 �ʱⰪ-------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("----------------------------------------");
		
		int[] lotto = new int[6];	//6���� ���� �ޱ� ���� ����
		int k;
		for(int cnt = 0; cnt < 6; cnt++) {	
			k = r.nextInt(45-cnt);				//45�� �ε��� ��ȣ �� ���� ����, �ߺ�����(Ȯ������ ���� ���̱�)
			System.out.println("k = " + k + ", numbers = " + numbers[k]);
			
			lotto[cnt] = numbers[k];			//����� ���� �ε��� ��ȣ�� �ִ� ���� lotto[0]���� ���������� ����
			for(int i = k; i < numbers.length-1; i++) {
				numbers[i] = numbers[i+1];		//�ѹ� ���� ��ȣ�� ����
				//(k��ġ�� ���� ����: �ε��� k+1���� ������ ��ұ��� �������� �̵�)
			}
			System.out.println(Arrays.toString(numbers));
		}
		System.out.println("���� ���� ����: ");
		System.out.println(Arrays.toString(lotto));		//�迭 lotto�� ����� �� ���
		
		Arrays.sort(lotto);	//lotto �迭���� ũ�� ������� ��ġ�� ����
		System.out.println(Arrays.toString(lotto));		//������������ ���
		
	}

}
