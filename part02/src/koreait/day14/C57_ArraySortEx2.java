package koreait.day14;

public class C57_ArraySortEx2 {
//작성자: 한성구
	//배열에 저장된 값 정렬하기 직접 구현해보기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"제니", "다현", "나연", "신비", "나나", "모모"};
		
		for(int i=0; i<names.length-1; i++) {		//마지막 i = nums.length-2
			
			for(int k=i+1; k<names.length; k++) {
				
				if(names[i].compareTo(names[k]) > 0) { 	//오름차순
					
					String tmp = names[i];
					names[i] = names[k];
					names[k] = tmp;
					
				}
				
			}
			
		}
		
		for(int i=0; i<names.length; i++) {
			
			System.out.printf("%s, ", names[i]);
		
		}
	}	
}


