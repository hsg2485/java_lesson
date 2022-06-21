package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;		//시도 횟수
		int[] triallst = new int[max];
		String trialstr;
		
		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다");
		System.out.println("너 휴먼은 맞춰보세요. (101~ 299)");
		int numComputer = r.nextInt(199) + 101;
		int numHuman;
		int i = 0;
		
		do {
			System.out.println("생각한 숫자 입력 (기회 : " + (max - i) + ") => ");
			numHuman = sc.nextInt();
			if(numComputer > numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다. 더 큰 값입니다");
			}
			else if(numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다. 더 작은 값입니다");	
				}
			if(i == max)
				break;
		}	while(numComputer != numHuman);
		//numComputer == numHuman 이면 답을 맞춘 것 => do~while 종료
		if(i == max) {
			System.out.println("너 휴먼 입력 내용 : " + Arrays.toString(triallst));
			System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요! [정답은 : " + numComputer + "]");
		}
		else {
			System.out.println("딩동댕~ 맞추셨습니다. 성공까지 시도 횟수 : " + (i+1));	//1번만에 성공하면 i값이 0이기 때문에 (i+1)으로 씀
		}
		sc.close();
	}
}


