package test;

// 부모
public interface _09_Loan {
   // 상수
   int STATE_LOAN = 1;   // 대출상태
   int STATE_REPAY = 0;   // 상환상태
   
   // 추상메서드
   public void loan(String loanNo, String productName, String borrower, String loanDate);   // 대출하다.
   public void repay();   // 상환하다.
}