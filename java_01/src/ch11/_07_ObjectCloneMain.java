package ch11;

public class _07_ObjectCloneMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		_07_Circle circle= new _07_Circle(10,20,30);
		System.out.println(circle); //원점은 x = 10, y = 20, 반지름은 30 => circle.toString()
		System.out.println(System.identityHashCode(circle));
		
		System.out.println("========== circle.clone() =============");
		System.out.println(circle.clone());
		System.out.println(System.identityHashCode(circle.clone()));
		
		System.out.println("========== (_07_Circle)circle.clone() =============");
		System.out.println((_07_Circle)circle.clone());
		System.out.println(System.identityHashCode((_07_Circle)circle.clone()));
		//각 circle.clone()은 주소값이 모두 다름
		
		System.out.println("========== copy_circle =============");
		//clone이 Object 타입이므로 _07_Circle 타입으로 다운 캐스팅
		_07_Circle copy_circle = (_07_Circle)circle.clone();
		System.out.println(copy_circle);
		System.out.println(System.identityHashCode(copy_circle));
	}
}
