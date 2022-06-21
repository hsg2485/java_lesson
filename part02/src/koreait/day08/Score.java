package koreait.day08;

public class Score {

	private int korean;
	private int english;
	private int science;
	private String grade;	// 값 예시: A+, A, B+....
	
	//기본생성자가 숨어 있음. 어떤 코드? 접근 한정자는?
	public Score()	{
		
	}// 기본생성자가 직접 생성이 안됐을 때는 접근 한정자가 public으로 자동생성됨
	
	void setKorean(int korean) {
		this.korean = korean;
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
		//this는 setKorean 메소드를 실행시키는 객체
	}
	
	int getKorean() {
		return korean;
	}
	
	void setEnglish(int english) {
		this.english = english;
		
	}
	
	int getEnglish() {
		return english;
	}
	
	void setScience(int science) {
		this.science = science;
		
	}
	
	int getScience() {
		return science;
	}
	
	void setGrade(String grade) {
		this.grade = grade;
	}
	
	 String getGrade() {
		return grade;
	}
}
