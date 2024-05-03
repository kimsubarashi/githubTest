package test;

import test._13_PasswordInvalidException;

public class _13_PasswordFormat {
	
	// 멤버변수
	private String password;
	
	//getter, setter
	//자바에서 제공하는 예외가 아니기 때문에 직접 발생시킨다.
	public void setPassword(String password) throws _13_PasswordInvalidException {
		if(password.isEmpty()) {
			throw new _13_PasswordInvalidException("비밀번호는 null일 수 없습니다.");
		} else if (password.length() < 10 || password.length() > 20){
			// 패스워드 10자~20자 사이만 허용
			throw new _13_PasswordInvalidException("비밀번호는 10자 이상 20자 이하로 쓰세요.");
		}
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
}
