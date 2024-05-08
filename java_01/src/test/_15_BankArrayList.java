package test;

import java.util.ArrayList;
import java.util.Iterator;

public class _15_BankArrayList {
	ArrayList<_15_Bank> list;

   // 2. 디폴트 생성자
   	_15_BankArrayList(){
		list = new ArrayList<_15_Bank>();
	}
   // 8. 은행추가 메서드 addBank()
   	public void addBank(_15_Bank bank){
		list.add(bank);
	}
   // 11. 우리은행삭제 메서드 removeBank()
   	public void  removeBank(_15_Bank bank){
		list.remove(bank);
	}
   // 10. 전체 은행 정보 출력
   //   System.out.println("== 방법1. 향상된 for문 ==");
	public void for_printInfo(){
		for(int i = 0; i < list.size(); i++){ //length 아님
			System.out.print(list.get(i));
		}	// list[i] 아니고 list.get(i) -> toString()이용해서 출력
	}
	
	public void for2_printInfo(){
		for(_15_Bank bank : list){ //length 아님
			System.out.print(bank);
		}	// list[i] 아니고 list.get(i) -> toString()이용해서 출력
	}

   //   System.out.println("== 방법2. 반복자(Iterator) ==");
   	public void Iterator_print(){
		Iterator<_15_Bank> iterator = list.iterator();
		while(iterator.hasNext()){ //getNext() 아님  //ArrayList의 값이 존재하는지 체크
			_15_Bank bank = iterator.next();
			System.out.print(bank); //iterator.next()로 다음 값 출력
		}
	}

}