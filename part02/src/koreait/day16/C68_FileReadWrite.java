package koreait.day16;
//Exception 처리 명령이 별도 메소드에서 정의될 때 다른 방법 : 
import java.io.File;	//io : input, output 입출력 관련된 기능들의 클래스
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//Exception 처리 명령이 별도 메소드에서 정의될 때 다른 방법 : 1), 2)
public class C68_FileReadWrite {
	//main 메소드가 throws Exception 한다면 jvm에게 넘김. 처리내용은 printStackTrace 결과와 동일
	public static void main(String[] args) {

		String filename = "D:\\HSG_JAVA\\자바테스트0617.txt";
		
		try{
			fileWrite2(filename);
			//filename = "D:\\HSG_JAVA\\자바테스트0618.txt";	//없는 파일 테스트용
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("사용자 실행 오류 : " +e.getMessage());
			System.out.println("파일이 존재하는지 확인하세요.");
		}
		
		
		
	}
	//방법1: Exception을 try~catch로 직접 처리
	public static void fileWrite(String filename) {
		
		File file = new File(filename);	
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(file);	//file로 지정된 위치에 출력을 위한 객체
			pw.println("모모 90 89 82");
			pw.println("다현 80 90 82");
			pw.println("나현 82 89 90");
			System.out.println("파일 출력이 완료되었습니다.");	//System.out : 표준 출력(콘솔 출력)
		} catch (FileNotFoundException e) {
			//출력 기능에는 파일이 없으면 자동으로 파일이 만들어짐
			System.out.println("오류 발생 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}
	
	//방법2: throws 키워드는 해당 Exception 을 호출한 곳으로 넘긴다
	//		   throws 뒤에  , 로 구분해서 여러개를 지정할 수 있음
	//		   Exception 처리해야 할 메소드가 많이 정의되고 사용될 때
	public static void fileWrite2(String filename) throws FileNotFoundException {
			
			File file = new File(filename);	
			PrintWriter pw = null;
	
			
			pw = new PrintWriter(file);	//file로 지정된 위치에 출력을 위한 객체
			pw.println("모모 90 89 82");
			pw.println("다현 80 90 82");
			pw.println("나현 82 89 90");
			System.out.println("파일 출력이 완료되었습니다.");	//System.out : 표준 출력(콘솔 출력)
			pw.close();
			
		}

	public static void fileRead(String filename) throws FileNotFoundException {
		
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
