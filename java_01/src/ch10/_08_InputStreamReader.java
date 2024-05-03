package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class _08_InputStreamReader {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = null;
		
		
		try {
			// InputStreamReader => 1바이트 데이터 단위로 읽어들인 내용을 문자(2바이트)로 변환
			// new 보조스트림(new 기반스트림("파일명");
			isr = new InputStreamReader(new FileInputStream("D:\\dev\\file\\8_inputStream.txt")); // 안녕하세요^^
			
			// isr = new FileInputStream("D:\\dev03\\file\\8_inputStream.txt"); // 한글은 1바이트 단위로 읽으면 깨진다.
			int i;
			while((i=isr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(isr != null) isr.close();
		}
	}
}
