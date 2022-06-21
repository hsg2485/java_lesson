package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
	//난수 발생하는 Random 클래스의 메소드 테스트
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();		//Random 클래스의 객체 생성 (new연산)
		
		System.out.println("1. 정수형 랜덤값 10개 출력");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt();	//int 범위 내에서 랜덤값(난수) 만듬
			System.out.println(inum);
		}
	
		System.out.println("1. 정수형 랜덤 값 10개 출력 - bound(경계값) 있음");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(100);	// 0 <= 난수 < 100 범위의 랜던값 만듬, 경계값은 양수값만 사용함
			System.out.println(inum);
	}
		System.out.println("3. 특정 범위의 랜덤값 10개 출력 - bound를 이용한 수식");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(100)+1;	// 1 <= 난수 < 101 범위의 랜던값 만듬
			System.out.println(inum);			
		}
		
		//n보다 크거 같고 m보다 작은 범위 난수 : r.nextInt(m-n)+n
		System.out.println("4. 2~45 범위의 값으로 난수 10개");	//45도 포함; n=2, m=46
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(44)+2;
			System.out.println(inum);
		}
	}
}
