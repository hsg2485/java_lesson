package koreait.day06;

public class C32_ArrayManipulation {

	public static void main(String[] args) {
		// 배열 요소의 삽입/삭제
		int[] test = {11, 22, 33, 44, 55, 66, 77};
		
		//인덱스 2에 삽입할 때 - 오른쪽 인데스 증가 방향으로 이동
		for(int i = test.length-2; i>=2; i--) {	
		// for(int i = 2; i < test.length-1; i++)	오작동
			test[i+1] = test[i];
		}
		
		test[2] = 23;
		for(int i = 0; i < test.length; i++)
			System.out.print(test[i] + "\t");
		
		//
		
		System.out.println();
		int [] test2 = {11, 22, 33, 44, 55, 66, 77};
		
		//인덱스 2를 삭제할 때 - 왼쪽 인덱스 감소 방향으로 이동
		for(int i = 3; i < test2.length; i++) {
			test2[i-1] = test2[i];
		}
		for(int i = 0; i < test2.length-1; i++)
		System.out.print(test2[i] + "\t");
		
	}

}
