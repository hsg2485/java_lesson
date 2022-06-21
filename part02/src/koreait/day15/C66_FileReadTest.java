package koreait.day15;

import java.io.File;	//io : input, output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {

	public static void main(String[] args) {

		//String filename = "D:\\dev1228\\�ڹ��׽�Ʈ1.txt";
		String filename = "D:\\dev1228\\�ڹ��׽�Ʈ.txt";
		
		File file = new File(filename);
		
		//Scanner : �Է� ����� ���� Ŭ����
		//Unhandled exception type FileNotFoundException : ���� ���ɼ��� �����Ƿ� try~catch �ʿ���
		Scanner sc = null;
		try {
			sc = new Scanner(file);	//System.in : ǥ�� �Է�(�ܼ� �Է�)
			/*
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			*/
			while(sc.hasNext()) {	//������ ���͸� �������� ���� �����Ͱ� ������ true
				System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			}
			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");	
		} catch (FileNotFoundException e) {
			//�Է� ��ɿ��� ������ ������ Exception �߻�
			System.out.println("���� �߻� : " + e.getMessage());
		} finally {
			if(sc != null)
				sc.close();
		}
		
		
	}

}
// try~catch �ڿ����� ����� finally => java 7 �������� Throws 
