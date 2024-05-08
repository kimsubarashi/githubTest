package ch12;

public class _06_Account {
	
	//멤버변수
	private String accountNo; //계좌정보 	010-1111-2222	010-8888-9999
	private String ownerName; //예금주명	김태희			비
	private int balance;	  //잔액		2000000			1000000
	
	//디폴트 생성자
	public _06_Account() {}
	
	//매개변수 생성자
	public _06_Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		
	}
	
	//멤버메서드(getter, setter)
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	//입금하다
	public void deposit(int amount) {
		balance += amount;
	}
	
	//출금하다
	public int withdraw(int amount) {
		if(balance < amount) return 0;
		
		balance -= amount;
		return balance;
	}
	
}
