package ch07;

public class _01_Main {
	public static void main(String[] args) {
		//추상클래스 객체생성 : 추상클래스는 객체를 생성할 수 없다(추상메서드가 있으므로)
		// _01_Computer computer = new _01_Computer();
		
		//자식클래스 객체생성
		_01_Computer desktop = new _01_DeskTop(); // 다형성 적용
		desktop.display(); //재정의된 자식메서드 호출(자식클래스가 new에 의해 실제 메모리공간을 차지)
		desktop.typing(); //재정의된 자식메서드 호출(자식클래스가 new에 의해 실제 메모리공간을 차지)
		desktop.turnOff(); //부모메서드 호출
		desktop.turnOn(); //부모메서드 호출
		//_01_DeskTop - display()
		//_01_DeskTop - typing()
		//전원을 끕니다.
		//전원을 켭니다.
		System.out.println("-------------------");
		
		_01_Computer notebook = new _01_MyNoteBook(); //다형성 적용
		notebook.display(); //재정의된 자식메서드 호출(자식클래스가 new에 의해 실제 메모리공간을 차지)
		notebook.typing(); //재정의된 자식메서드 호출(자식클래스가 new에 의해 실제 메모리공간을 차지)
		notebook.turnOff(); //부모메서드 호출
		notebook.turnOn(); //부모메서드 호출
		//_01_NoteBook - display
		//_01_MyNoteBook - typing()
		//전원을 끕니다.
		//전원을 켭니다.
		
	}
}
