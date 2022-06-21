package koreait.day04;

import java.util.Scanner;

public class C21_StringEx_RightAnswer {
//작성자 : 한성구
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  구글 이메일 계정을 체크하는 기능 구현 
		 *  1. @ 기호가 1개 포함되어야 합니다.	(메시지 : 이메일 형식이 아닙니다.)
		 *  		ㄴ indexof 가 -1이 아니고 indexof 와 lastindexof 가 같은 값인가?
		 *  
		 *  2. 1번이 참일 때 @ 뒤에는 gmail.com 이어야 합니다. (메시지 : 도메인 이름이 틀립니다.)
		 *  		ㄴ '@' 의 indexof 를 구해서 그 뒤부터 끝까지 substring 추출한 문자열을 equals 비교
		 *  
		 *  3. 2번이 참일 떄 @ 앞까지의 문자열(계정이름)만 추출합니다.
		 *  		ㄴ '@' 의 indexof 를 구해서 처음 부터 '@' 이전 까지의 문자열 substring 저장
		 *  
		 *  4. 3번의 계정이름은 6글자 이상이어야 합니다.
		 *  		ㄴ 3번의 문자열이 length() 값 6인지 비교
		 *  
		 *  5. 3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다. 
		 *   		ㄴ indexof('$') , indexof('%') 가 모두 -1이 아니면 허용안하는 기호 포함
		 */

		/*원래 풀이
		 * Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid;
		
		System.out.print("사용할 이메일을 입력하세요 >>>");
		email = sc.nextLine();		
		String acc_Name = email.substring(0,email.indexOf('@'));
		int name_Length = acc_Name.length();
		String domain = email.substring((email.indexOf('@')+1), email.length());
		isValid = domain.equals("gmail.com");
		
		
		if((email.indexOf('@')!=-1 && email.indexOf('@') == email.lastIndexOf('@'))) {
			if(isValid = true) {
				if(name_Length >= 6) {
					if(!(acc_Name.indexOf('$') == -1 && acc_Name.indexOf('%') == -1)) {
						System.out.println("사용할 계정은 : " + email +" 입니다.");
					} 
					else {
						System.out.println("계정 이름에는 특수기호($,%)가 포함되면 안됩니다.");
					}
				} 
				else {
					System.out.println("계정 이름은 6글자 이상이어야 합니다");
				}
				} 
			else {
					System.out.println("도메인 이름이 틀립니다");
				}
		}
		else {
			System.out.println("이메일 형식이 아님");
		}
		
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;

		System.out.print("사용할 이메일 입력하세요. >>> ");
		email = sc.nextLine(); 
		int sp_char = email.indexOf('@');
		String account, domain;

		if(sp_char != -1 && sp_char == email.lastIndexOf('@')) {
			account = email.substring(0, sp_char);
			domain = email.substring(sp_char+1, email.length());
			if(domain.equals("gmail.com")) {
				if(account.length() >=6) {
					if(!(account.indexOf('$')== -1 && account.indexOf('%')==-1)) {
						System.out.println("$,%는 사용할 수 없는 기호입니다.");
						isValid=false;
					}
					
				}else {
					System.out.println("계정이름은 6글자 이상이어야 합니다.");
					isValid=false;
				}
				
			}else {
				isValid=false;
				System.out.println("도메인 이름이 틀립니다.");
			}
			
		}else {
			System.out.println("이메일 형식이 아닙니다.");
			isValid = false;
		}
		
		if(isValid = true) 
			System.out.println(email +"은 유효한 이메일 입니다.");
		sc.close();
		

	}
}
		

		
		
			
		
		
				
			
	
		
		
		
		//입력한 email이 처리조건 1,2,3,4,5에 해당하지 않으면 메시지 출력하고 isValid 변수를 false로 변경
		// alt + shift + r => 변수명 한번에 수정
	



