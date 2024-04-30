package ch08;

public class _05_Member {
	// 멤버변수
	private int memberID; //회원아이디
	private String memberName; //회원이름
	
	// 디폴트 생성자
	public _05_Member() {
		
	}
	
	// 매개변수 생성자
	public _05_Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	// 멤버메서드 getter, setter
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public int getMemberID() {
		return memberID;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	// toString()
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberID + "입니다";
	}
}
