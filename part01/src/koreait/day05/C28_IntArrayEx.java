package koreait.day05;

import java.util.Scanner;

public class C28_IntArrayEx {
	/* �ۼ���: �Ѽ���
	 * 1. int �迭 ũ�� 5�� ����. �̸�: nums
	 * 2. �迭 ����� ���� ����� �Է����� ����
	 * 3. �Էµ� ���� �հ�, ��� ���ϱ� => �հ�� 2������ �Է¹޴� for�� �ȿ��� ���� �ۼ�
	 * 4. �Էµ� ���� �ִ밪, �ּҰ�
	 * 		�� maxOfArray, minOfArray : ���ڴ� int �迭, ��ȯ�� ���� int
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		int sum = 0;	
		double average;
	        System.out.println("5�� �� �Է�");
	        Scanner sc = new Scanner(System.in); 
	        
	        for(int i=0; i< nums.length; i++) {
	            nums[i]=sc.nextInt();
	            sum += nums[i];
	        }
	        average = sum/(double)nums.length;
	        System.out.println("�հ�: " + sum);
	        System.out.printf("���: %.1f\n", average);
			System.out.println("�ּҰ�:"+minOfArray(nums));
			System.out.println("�ִ밪:"+maxOfArray(nums));
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
	//max, min ������ �迭�� 0�� ��Ұ����� �ʱ�ȭ
	//�迭 ��� 1������ ������ ��ұ��� max, min�� ������� ���ؼ� 
	//max�� �� ������ ������ (min�� �� ������ ũ��) max(min)���� �迭 ��� ������ ����
	// => �񱳰� ������ ���� max,min ������ ��

