package ch08;

public class _01_GenericPrinter<T> {
	//p393
	//new class => 클래스명 :_09_GenericPrinter<T> => _09_GenericPrinter로 만들어진다.

	/*
	* T의 자료형이 정해지는 순간은 제네릭 클래스의 인스턴스가 생성되는 순간이다.
	* 따라서 static은 T의 자료형이 결정되는 시점보다 빠르기 때문에 
	* static 변수의 자료형이나, static 메서드 내부의 자료형으로 T를 사용할 수 없다.
	* 단 제네릭클래스가 static이면 예외 
	*/
	
	//멤버변수
	private T material; // T는 자료형, material은 참조변수
	
	//멤버메소드
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}
