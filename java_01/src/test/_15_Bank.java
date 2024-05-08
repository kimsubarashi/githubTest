package test;

public class _15_Bank {

   // 6.멤버변수
   private int bankNo;        // 은행번호     101      102        103
   private String bankName;   // 은행명       신한은행   우리은행     국민은행
   private String accountNo;     // 계좌번호     101-1111  102-2222  103-3333
   
   // 생성자
   // 디폴트 생성자
   	public _15_Bank(){}
   // 5.매개변수 생성자
   	public _15_Bank(int bankNo, String bankName, String accountNo){
		this.bankNo = bankNo;
		this.bankName = bankName;
		this.accountNo = accountNo;
	}
   // 멤버메서드 Getter, Setter
   	public void setBankNo(int bankNo){
		this.bankNo = bankNo;
	}
	
	public void setBankName(String bankName){
		this.bankName = bankName;
	}

	public void setAccountNo(String accountNo){
		this.accountNo = accountNo;
	}

	public int getBankNo(){
		return bankNo;
	}
	
	public String getBankName(){
		return bankName;
	}

	public String getAccountNo(){
		return accountNo;
	}
   // 출력 - 부모 toString() 재정의
	@Override
	public String toString() {
		return "은행번호 : " + bankNo + "\n은행명 : " + bankName + "\n계좌번호 : " + accountNo + "\n";
	}
}