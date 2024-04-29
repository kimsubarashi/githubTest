package ch05;

public class _04_Main {
	public static void main(String[] args) {
		//학번 S001 S002 S003
		//이름 홍길동 아이유 유느님
		_04_Student[] st = new _04_Student[3];
		
		st[0] = new _04_Student("S001","홍길동",20);
		st[1] = new _04_Student("S002","아이유",30);
		st[2] = new _04_Student("S003","유느님",40);
		
		for(int i = 0; i < st.length; i++) {
			st[i].printInfo();
		}
	}
}
