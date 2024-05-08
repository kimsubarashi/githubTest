package test;

public class _15_BankMain {
	public static void main(String[] args) {
		   // 매개변수 생성자를 통해 멤버변수로 값을 전달하고, 
		   // ArrayList에 추가, 삭제, 조회
			_15_Bank bank1 = new _15_Bank(101,"신한은행","101-1111");
			_15_Bank bank2 = new _15_Bank(102,"우리은행","102-2222");
			_15_Bank bank3 = new _15_Bank(103,"국민은행","103-3333");

			_15_BankArrayList list = new _15_BankArrayList();

			list.addBank(bank1);
			list.addBank(bank2);
			list.addBank(bank3);
			
			System.out.println("=========for문1==============");
			list.for_printInfo();
			
			System.out.println("=========for문2==============");
			list.for2_printInfo();
			
			System.out.println("=========iterator==============");
			list.Iterator_print();
			
			System.out.println("=========삭제후==============");
			list.removeBank(bank3);
			
			list.for_printInfo();
	}
}