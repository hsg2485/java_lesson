package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {

	public static void main(String[] args) {
		// 
		int item_no;
		int pay = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("상품목록: 1.2200원 2.1900원 3.3600원 4.2870원");
		System.out.print("상품(번호)를 선택해서 장바구니에 넣으세요 : ");
		item_no = sc.nextInt();
		
		/*switch(item_no) {
		case 1:
			pay = 2200;
			break;
		case 2:
			pay = 1900;
			break;
		case 3:
			pay = 3600;
			break;
		case 4:
			 pay = 2870;
			break;
		default: 
			System.out.println("상품 선택이 잘못 되었습니다.");
			pay = 99999;
			break;
		}
		*/
		if(item_no ==1) {
			pay = 2200;
		}
		else if(item_no ==2) {
			pay = 1900;
		}
		else if(item_no == 3) {
			pay = 3600;
		}
		else if(item_no == 4) {
			pay = 2870;
		}
		else
			pay = 99999;
			System.out.println("상품 선택이 잘못 되었습니다.");
			
		System.out.println("결제금액은 " + pay + "원 입니다.");
		sc.close();
	}

}


