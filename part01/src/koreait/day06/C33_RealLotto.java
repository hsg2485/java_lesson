package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//작성자: 한성구
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[45];
		Random r = new Random();
		
		for(int i = 0; i < 45; i++) {	//인덱스 범위 : 0 ~ 44
			numbers[i] = i + 1;			//값 범위 : 1 ~ 45
		}
		System.out.println("numbers 배열 초기값-------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("----------------------------------------");
		
		int[] lotto = new int[6];	//6개의 수를 받기 위한 공간
		int k;
		for(int cnt = 0; cnt < 6; cnt++) {	
			k = r.nextInt(45-cnt);				//45개 인덱스 번호 중 난수 추출, 중복방지(확률적인 범위 줄이기)
			System.out.println("k = " + k + ", numbers = " + numbers[k]);
			
			lotto[cnt] = numbers[k];			//추출된 난수 인덱스 번호에 있는 값을 lotto[0]부터 순차적으로 대입
			for(int i = k; i < numbers.length-1; i++) {
				numbers[i] = numbers[i+1];		//한번 뽑힌 번호는 삭제
				//(k위치의 값을 제거: 인덱스 k+1부터 마지막 요소까지 왼쪽으로 이동)
			}
			System.out.println(Arrays.toString(numbers));
		}
		System.out.println("최종 선택 숫자: ");
		System.out.println(Arrays.toString(lotto));		//배열 lotto에 저장된 값 출력
		
		Arrays.sort(lotto);	//lotto 배열값의 크기 순서대로 위치를 변경
		System.out.println(Arrays.toString(lotto));		//오름차순으로 출력
		
	}

}
