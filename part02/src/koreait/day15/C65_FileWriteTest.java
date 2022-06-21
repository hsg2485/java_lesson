package koreait.day15;

import java.io.File;	//io : input, output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {

	public static void main(String[] args) {

		String filename = "D:\\HSG_JAVA\\�ڹ��׽�Ʈ.txt";
		
		File file = new File(filename);
		
		PrintWriter pw = null;
		
		//PrintWriter : ��� ����� ���� Ŭ����
				//Unhandled exception type FileNotFoundException : ���� ���ɼ��� �����Ƿ� try~catch �ʿ���
		try {
			pw = new PrintWriter(file);	//file�� ������ ��ġ�� ����� ���� ��ü
			pw.println("��� 90 89 82");
			pw.println("���� 80 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");	//System.out : ǥ�� ���(�ܼ� ���)
		} catch (FileNotFoundException e) {
			//��� ��ɿ��� ������ ������ �ڵ����� ������ �������
			System.out.println("���� �߻� : " + e.getMessage());
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}

}