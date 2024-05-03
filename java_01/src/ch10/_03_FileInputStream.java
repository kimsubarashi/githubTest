package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// p525 작성한 .txt파일을 읽어서 콘솔에 출력
public class _03_FileInputStream {
	public static void main(String[] args) throws IOException { // JVM에게 떠넘긴다.
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("D:\\dev\\file\\3_InputStream.txt"); // "경로\\내가만든file"
			int i;
			// 3_inputStream.txt 데이터를 1byte씩 읽어들여서 아스키값으로 저장
			while((i = fis.read()) != -1) { //-1 : 파일의 끝
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis != null) {
				fis.close();
			}
		}
		System.out.println();
		System.out.println("end~~");
		System.out.println("작업종료");
	}

}
