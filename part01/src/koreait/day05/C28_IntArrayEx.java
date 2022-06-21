package koreait.day05;

import java.util.Scanner;

public class C28_IntArrayEx {
	/* 작성자: 한성구
	 * 1. int 배열 크기 5를 선언. 이름: nums
	 * 2. 배열 요소의 값은 사용자 입력으로 저장
	 * 3. 입력된 값의 합계, 평균 구하기 => 합계는 2번에서 입력받는 for문 안에서 수식 작성
	 * 4. 입력된 값의 최대값, 최소값
	 * 		ㄴ maxOfArray, minOfArray : 인자는 int 배열, 반환값 형식 int
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		int sum = 0;	
		double average;
	        System.out.println("5개 수 입력");
	        Scanner sc = new Scanner(System.in); 
	        
	        for(int i=0; i< nums.length; i++) {
	            nums[i]=sc.nextInt();
	            sum += nums[i];
	        }
	        average = sum/(double)nums.length;
	        System.out.println("합계: " + sum);
	        System.out.printf("평균: %.1f\n", average);
			System.out.println("최소값:"+minOfArray(nums));
			System.out.println("최대값:"+maxOfArray(nums));
			sc.close();
	}
	
	public static int maxOfArray(int[] arr1) {
		int max = arr1[0];
		for(int i = 0; i< arr1.length; i++) {
			if(arr1[i] > max) {
				max = arr1[i];
			}
		}
		return max;
	}

	public static int minOfArray(int[] arr2) {
		int min = arr2[0];
		for(int i = 0; i< arr2.length; i++) {
			if(arr2[i] < min) {
				min = arr2[i];
			}
		}
		return min;
	}
				
	}
	//max, min 변수를 배열의 0번 요소값으로 초기화
	//배열 요소 1번부터 마지막 요소까지 max, min과 순서대로 비교해서 
	//max가 그 값보다 작으면 (min이 그 값보다 크면) max(min)값을 배열 요소 값으로 변경
	// => 비교가 끝나면 최종 max,min 결정이 됨

