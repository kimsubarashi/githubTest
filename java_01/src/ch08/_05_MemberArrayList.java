package ch08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ArrayList에 회원정보 추가, 삭제, 조회
public class _05_MemberArrayList {
	private List<_05_Member> list;
	
	// 디폴트 생성자
	public _05_MemberArrayList() {
		// ArrayList 생성
		list = new ArrayList<_05_Member>();
	}
	
	//회원추가 메서드
	public void addMember(_05_Member member) {
		list.add(member); //1001, "이지원" //1002, "손민국" // 1003, "박서원" // 1004, "홍길동"
	}
	
	//회원탈퇴 메서드 - key로 삭제
	public boolean removeMember(int memberId) {
		for(int i=0; i<list.size(); i++) {
			_05_Member member = list.get(i);
			if(member.getMemberID() == memberId) {
				list.remove(i); //i번째 값 삭제, 해당회원(1004)을 삭제
				return true;	//삭제후 종료.. 삭제후 바깥 removeMember() 메서드를 빠져나감
			} //if
		} //for
		System.out.println(memberId + "가 존재하지 않습니다."); //반복문이 끝날때까지 해당 아이디를 못찾는 경우
		return false;
	}
	
	//전체 회원 출력
	public void showAllMember() {
		//향상된 for문
		System.out.println("=== 방법1. 향상된 for문 ===");
		for(_05_Member member : list) {
			System.out.println(member.toString());
		}
		System.out.println();
		
		System.out.println("=== 방법2. 반복자 Iterator ===");
		Iterator<_05_Member> iterator = list.iterator();
		while(iterator.hasNext()) {
			_05_Member member = iterator.next();
			System.out.println(member.toString());
		}
		System.out.println();
	}
	
}
