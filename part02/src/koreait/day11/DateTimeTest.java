package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1��, 1���� ���� �� ms?	1�� = 1000ms
		//1�� = 24�ð�* 60�� * 60�� * 1000 => result ���� ����
		int result = 24*60*60*1000;
		System.out.println("1���� " + result + " ms �Դϴ�.");
		//int ���� ����� overflow. long ��ȯ �ʿ�
		System.out.println("1���� " + result*365L + " ms �Դϴ�.");
		
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1���� " + df.format(result) + " ms �Դϴ�.");
		System.out.println("1���� " + df.format(result*365L) + " ms �Դϴ�.");
		//String.format("%15s", ~) ���� �ϸ� �ڸ� ���� ��ġ�� ���� �� ����
		
		/*
		��¥�� �ð������� �ٷ�� �ڹ�Ŭ������ �����մϴ�.
		1)java.util.Date Ŭ����  2)java.util.Calendar Ŭ���� => �� 2���� �� ���� Ŭ����
		3) java 8 ����  java.time.LocalDate(��¥) , LocalTime(�ð�) , LocalDateTime(��¥�� �ð�) Ŭ����
		4) java.sql.Date Ŭ���� - �����ͺ��̽� �ٷ� �� ���
		 */
		
		LocalDate currentDate = LocalDate.now();		//static �޼ҵ�� ��ü ����
		System.out.println("��¥ Ȯ�� : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("�ð� Ȯ�� : " + currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("��¥�� �ð� Ȯ�� : " + current);
		
		//of() �޼ҵ�� Ư�� �ð� �� ��¥ ��ü ����
		LocalDate mybirth = LocalDate.of(1998, 10, 15);
		System.out.println("�� ź���� Ȯ�� : " + mybirth);
		
		LocalTime mybirth_time = LocalTime.of(5, 00);
		System.out.println("�� ź�� �ð� : " + mybirth_time);
		
		//�� ���� Ŭ������ ��¥ ������ ���� ��� Ŭ������ ����
		Period between = Period.between(mybirth, currentDate);
		System.out.println("���� �¾�� " + between.getYears() + " ��(years)"
		 + between.getMonths() + " ����(months)" + between.getDays() + " ��(days)");
		
		System.out.println("���� �¾�� : " + ChronoUnit.DAYS.between(mybirth, currentDate) + " �� �������ϴ�.");
		//Duration Ŭ����
		//ChronoUnit Ŭ����
		
		
	}

}
