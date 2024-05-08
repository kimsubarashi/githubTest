package ch10;

import java.io.FileWriter;
import java.io.IOException;

public class _07_FileWriter {
    public static void main(String[] args) {
    	 	// 파일 "D:\\dev\\file\\7_fileWriter.txt"에 대한 FileWriter 객체를 생성합니다.
        	// FileWriter는 파일을 쓰기 위한 문자 스트림을 생성합니다.
        	// 이미 존재하는 파일의 내용은 덮어쓰게 됩니다.
        	// 파일이 없으면 새로운 파일이 생성됩니다.
        try (FileWriter fw = new FileWriter("D:\\dev\\file\\7_fileWriter.txt")) {
            // 파일에 단일 문자 'A'를 작성합니다.
            fw.write('A');
            // 문자 배열을 생성합니다.
            char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
            // 문자 배열을 파일에 작성합니다.
            fw.write(buf);
            // 문자열을 파일에 작성합니다.
            fw.write("안녕하세요. 잘써지네요");
            // 문자 배열의 일부를 파일에 작성합니다. (인덱스 1부터 길이 2까지)
            fw.write(buf, 1, 2);
            // 문자열 "65"를 파일에 작성합니다.
            fw.write("65");
        } catch (IOException e) {
            // IOException이 발생하면 스택 트레이스를 출력합니다.
            e.printStackTrace();
        }
        // 출력이 완료되었음을 나타내는 메시지를 출력합니다.
        System.out.println("출력이 완료되었습니다.");
    }
}