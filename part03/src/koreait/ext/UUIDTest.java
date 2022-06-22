package koreait.ext;

import java.util.UUID;

public class UUIDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uuid = null;
		//16진수 32자리 + 하이픈 기호 4개로 만들어지는 랜덤 문자열
		for(int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid);
		}
		
		for(int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", ""));
		}
		for(int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", "").substring(0,12));
		}
	}
}
