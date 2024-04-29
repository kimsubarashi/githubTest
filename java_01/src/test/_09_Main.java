package test;

public class _09_Main {
   public static void main(String[] args) {
      // 자식매개변수 생성자를 통한 값 전달(대출번호, 상품명, 대출여부)
      // loan() 호출시점에 값 전달(대출자, 대출일자)
      // 대출상태 판단은 상수를 이용
	
	_09_MyLoanInfo my = new _09_MyLoanInfo("P001", "청년취업지원", "홍길동", "2024-04-26",1);
	my.loan("P001", "청년취업지원", "홍길동", "2024-04-26");
	my.repay();
	
	_09_MyLoanInfo my2 = new _09_MyLoanInfo("P001", "청년취업지원", "홍길동", "2024-04-26",1);
	my2.loan("P001", "청년취업지원", "홍길동", "2024-04-26");
	my2.repay();
   }
}