package ch09;

public class _06_IDFormat {
	
	// 멤버변수
	private String userID;
	
	//getter, setter
	//자바에서 제공하는 예외가 아니기 때문에 직접 발생시킨다.
	public void setUserID(String userID) throws _06_IDFormatException {
		if(userID.isEmpty()) { //userID가 비어있는지 비교
			throw new _06_IDFormatException("아이디는 null일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20){
			throw new _06_IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}
	
	public String getUserID() {
		return userID;
	}
}
