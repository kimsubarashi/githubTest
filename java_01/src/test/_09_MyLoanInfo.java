package test;

// 자식클래스 - 부모클래스 상속받고인터페이스 구현
public class _09_MyLoanInfo extends _09_LoanInfo implements _09_Loan {

   // 멤버변수
   private String borrower;   // 대출자  "홍길동"
   private String loanDate;   // 대출일자 "2024-04-26"
   private int state;         // 대출여부  STATE_REPAY = 0;   // 상환상태 

   // 생성자
   // 디폴트 생성자
   public _09_MyLoanInfo (){}
  
   // 매개변수 생성자
   public _09_MyLoanInfo (String loanNo, String productName, String borrower, String loanDate, int state){
	   super(loanNo, productName);
	   this.borrower = borrower;;
	   this.loanDate = loanDate;
	   this.state = state;
   }

   // 대출하다
   @Override
   public void loan(String loanNo, String productName, String borrower, String loanDate){
	if(state != STATE_LOAN){
		System.out.println("=== 대출시 ===");
		System.out.println("대출되었습니다");
		System.out.println("도서번호 : " + loanNo);
		System.out.println("도서제목 : " + productName);
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + loanDate);
	} else {
		System.out.println("=== 이미 대출된 상태인데 대출시도할 때 ===");
		System.out.println("대출하실 수 없습니다");
	}
   }

   // 상환하다
   @Override
   public void repay(){
	if(state != STATE_REPAY){
		System.out.println("=== 대출 상환시 ===");
		System.out.println("상환되었습니다.");
		System.out.println("상환인 : " + borrower);
	} else {
		System.out.println("=== 이미 상환된 상태일때 대출 상환시 ===");
		System.out.println("이미 상환된 상태입니다");
	}
   }
  
}