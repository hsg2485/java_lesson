package koreait.day14;

public class C57_ArraySortEx2 {
//�ۼ���: �Ѽ���
	//�迭�� ����� �� �����ϱ� ���� �����غ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"����", "����", "����", "�ź�", "����", "���"};
		
		for(int i=0; i<names.length-1; i++) {		//������ i = nums.length-2
			
			for(int k=i+1; k<names.length; k++) {
				
				if(names[i].compareTo(names[k]) > 0) { 	//��������
					
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


