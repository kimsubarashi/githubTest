package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _11_ImageCopy {
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("원본 파일명을 입력하세요 : "); //D:\dev\file\11\hegemony.png
		String inputFileName = input.nextLine();
		
		System.out.print("복사 파일명을 입력하세요 : "); //D:\dev\file\11\copy_hegemony.png
		String outputFileName = input.nextLine();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(inputFileName);
			fos = new FileOutputStream(outputFileName);
			
			int i;
			while((i=fis.read()) != -1) {
				fos.write(i);
			}
			System.out.println(inputFileName + "를" + outputFileName + "으로 복사하였습니다.!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis != null) fis.close();
			if(fos != null) fos.close();
		}
		System.out.println();
		System.out.println("프로그램 정상종료~~");
	}
}
