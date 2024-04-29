package ch07;

//자식클래스
//구현하지 않은 메서드가 남아있기 때문에(부모클래스에) 추상 클래스로 만들어야 함
public abstract class _01_NoteBook extends _01_Computer{
	
	@Override
	public void display() {
		System.out.println("_01_NoteBook - display");
	}
}
