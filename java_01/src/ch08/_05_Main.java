package ch08;

public class _05_Main {
	public static void main(String[] args) {
		
		//디폴트 생성자 호출
		_05_MemberArrayList mList = new _05_MemberArrayList();
		
		// _05_Member 매개변수 생성자로 값 전달
		mList.addMember(new _05_Member(1001, "이지원"));
		mList.addMember(new _05_Member(1002, "손민국"));
		mList.addMember(new _05_Member(1003, "박서원"));
		mList.addMember(new _05_Member(1004, "홍길동"));
		
		//회원출력
		System.out.println("[추가 후 전체 회원 출력]");
		mList.showAllMember();
		
		// 회원삭제 .. 1004 회원 삭제
		mList.removeMember(1004);
		
		//12.회원출력
		System.out.println("[삭제후 전체 회원 출력]");
		mList.showAllMember();
	}
}
