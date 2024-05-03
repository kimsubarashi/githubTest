package ch08;

import java.util.HashMap;
import java.util.Scanner;

public class _10_LoginHashMap {
	/* [시험, 플젝]
     * 1. id, pwd 5건을 hashtable에 저장(hashMap에 저장) - put
     * 2. 콘솔로부터 id, password를 입력받는다.(로그인을 위해)
     *    1과 2를 비교해서
     * 3. 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다." 출력
     *    아이디가 있으면 비밀번호와 비교해서 일치시 "로그인 성공" 출력
     *                                불일치시 "비밀번호가 불일치" 출력
     * 4. id입력시 Q나 q를 입력시 종료  :  System.exit(0) // 정상종료, break, return;
     * 문자열 비교 =>  입력값.equals(비교값)
     * == : 문자열 물리적 주소값 비교
     * equals : 논리적인 값 비교
     * 
     *  key      value    
     *    id       password
     * "park"   "park1234"
     * "kim"    "kim1234"
     * "lee"    "lee1234"
     * "son"    "son1234"
     * "choi"   "choi1234"
     */
    // 1. id, pwd 5건을 hashtable에 저장(hashMap에 저장) - put
	public static void main(String[] args) {
		HashMap<String, String> user = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		user.put("park", "park1234");
		user.put("kim", "kim1234");
		user.put("lee", "lee1234");
		user.put("son", "son1234");
		user.put("choi", "choi1234");
		
		while(true) {
			System.out.print("아이디를 입력해주세요 : ");
			String id = sc.next();
			
			if(id.equals("q") || id.equals("Q")) {
				System.out.println("종료합니다.");
				//break;
				System.exit(0); //프로그램 강제 종료
			}
			
			System.out.print("패스워드를 입력해주세요 : ");
			String pw = sc.next();
			
			if(user.containsKey(id)) {
				if(pw.equals(user.get(id))) { // 입력받은 비밀번호 == hashMap의 비밀번호
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호 불일치");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
		sc.close();
	}
}
