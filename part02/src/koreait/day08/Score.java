package koreait.day08;

public class Score {

	private int korean;
	private int english;
	private int science;
	private String grade;	// �� ����: A+, A, B+....
	
	//�⺻�����ڰ� ���� ����. � �ڵ�? ���� �����ڴ�?
	public Score()	{
		
	}// �⺻�����ڰ� ���� ������ �ȵ��� ���� ���� �����ڰ� public���� �ڵ�������
	
	void setKorean(int korean) {
		this.korean = korean;
		//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean�� ����(����)
		//this�� setKorean �޼ҵ带 �����Ű�� ��ü
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
