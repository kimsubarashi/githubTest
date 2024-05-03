package test;

//p506
//사용자 정의 Exception - Exception을 상속받아야 한다.
public class _13_PasswordInvalidException extends Exception{
	
	// 매개변수 생성자
	public _13_PasswordInvalidException(String message){
		super(message);	// 부모(=Exception) 매개변수 생성자 호출
	}
}
