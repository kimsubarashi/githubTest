package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_IOException {
	public static void main(String[] args) throws IOException { //부모에게 예외처리를 떠넘긴다.
		  /*
	       * 예외처리 미루기 - throws 사용하기
	       * - 예외를 해당 메서드에서 처리(try-catch)하지 않고 미룬후, 
	       *       메서드를 호출하여 사용하는 부분(부모메서드에게 떠너김, 여기서는 JVM 에게 떠넘김)에서 예외를 처리하는 방법이다.
	       */
	      //예외처리 안했을 경우 -> 비정상종료
	      /*
	       *  예외처리 했을 때 =>
	       *  예외가 발생하지 않으면 finally -> 정상종료
	       *  예외가 발생하면 catch -> finally -> 정상종료 
	       */

		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\dev\\file\\a.txt");
		} catch (FileNotFoundException e) {
			System.err.println("== catch문 ==");
			System.out.println("메시지 : " + e.getMessage());
			// e.printStackTrace();
		} finally {
			if(fis != null) {
				fis.close();
			}
			System.out.println("finally 문장이므로 항상 수행됩니다.");
		}
		System.out.println("정상종료^^");
		
	}
}
/*
1) 예외처리 안하면 => 비정상 종료

2) 예외처리시  
<< a.txt 파일이 존재할 때 >> 
  finally 문장이므로 항상 수행됩니다.
 정상종료^^
 
<< a.txt 파일이 존재하지 않을 때 try -> catch -> finally >> 
 == catch문 ==
 메시지 : D:\dev03\file\a.txt (지정된 파일을 찾을 수 없습니다)
 finally 문장이므로 항상 수행됩니다.
 정상종료^^
*/