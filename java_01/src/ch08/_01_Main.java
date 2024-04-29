package ch08;

public class _01_Main {
	public static void main(String[] args) {
		/*
		 * [면접]
		 * 제네릭 : 여러 참조 자료형이 쓰일수 있는 곳에 특정한 자료형을 지정하지 않고
		 *        클래스나 메서드를 지정한 후 사용하는 시점(제네릭 클래스의 인스턴스 생성시점)에
		 *        어떤 자료형을 사용할 것인지 지정하는 방식
		 *        (단 제네릭클래스가 static이면 예외) 
		 *        T : Type parameter
		 *        E : element
		 *        K : Key
		 *        V : value
		 *        
		 *  - 제네릭으로 구현하면 형변환을 하지 않아도 된다.(매개변수의 다형성, 다운캐스팅 안해도 된다.)
		 *  => 제네릭 클래스를 사용하면 컴파일러는 일단 대입된 자료형이 잘 쓰였는지 검증한다.
		 *     class 파일을 생성할 때 T를 사용한 곳에 지정된 자료형에 따라 컴파일하므로     
		 */
		System.out.println("=== T가 _01_Powder 일 때 ===");
		_01_GenericPrinter<_01_Powder> powderPrinter = new _01_GenericPrinter<_01_Powder>();
		
		powderPrinter.setMaterial(new _01_Powder());
		_01_Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		System.out.println(powder.toString());
		System.out.println(powder); // 재료는 powder 입니다.
		powder.doPrinting(); // powder 재료로 출력합니다.
		
		System.out.println("=== T가 _01_Plastic 일 때 ===");
		_01_GenericPrinter<_01_Plastic> plasticG = new _01_GenericPrinter<_01_Plastic>();
		plasticG.setMaterial(new _01_Plastic());
		_01_Plastic plastic = plasticG.getMaterial();
		System.out.println(plastic);
		System.out.println(plastic.toString());
		System.out.println(plasticG);
		plastic.doPrinting();
	}
}
