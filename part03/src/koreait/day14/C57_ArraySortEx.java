package koreait.day14;

public class C57_ArraySortEx {
//작성자: 한성구
	//배열에 저장된 값 정렬하기 직접 구현해보기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {34, 77, 19, 56, 45, 9};
		
		for(int i=0; i<nums.length-1; i++) {		//마지막 i = nums.length-2
			
			for(int k=i+1; k<nums.length; k++) {		//오름차순
				
				if(nums[i] > nums[k]) { 
					
					int tmp = nums[i];
					nums[i] = nums[k];
					nums[k] = tmp;
					
				}
				
			}
			
		}
		
		for(int i=0; i<nums.length; i++) {
			
			System.out.printf("%d, ", nums[i]);
		
		}
	}	
}


