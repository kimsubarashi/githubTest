package ch10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// p545

//import java.util.Timestamp;
//System.currentTimeMillies() : 오늘날짜 시분초

public class _09_BufferedStream {
	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("D:\\dev\\file\\_09_BufferedStream.zip");
			FileOutputStream fos = new FileOutputStream("D:\\dev\\file\\Copy_09_BufferedStream.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			millisecond = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데" + millisecond + " milliseconds 소요되었습니다.");
	}
}
