package test;

// 부모클래스
public class _09_LoanInfo {
   
   // 멤버변수
   private String loanNo;   // 대출번호  "P001"
   private String productName;   // 대출상품명   "청년취업지원"
   
   // 디폴트 생성자
   public _09_LoanInfo (){

   }
 
   // 매개변수 생성자
   public _09_LoanInfo (String loanNo, String productName){
   	this.loanNo = loanNo;
	this.productName =productName;
   }

   // 멤버메서드
   public void setLoanNo(String loanNo){
	this.loanNo = loanNo;
   }

   public void setProductName(String productName){
	this.productName = productName;
   }
   public String getLoanNo(String loanNo){
	return loanNo;
   }

   public String getProductName(String productName){
	return productName;
   }

}