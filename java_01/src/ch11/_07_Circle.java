package ch11;

public class _07_Circle implements Cloneable{
	_07_Point point;
	int radius;
	
	//생성자
	_07_Circle(){}
	
	_07_Circle(int x, int y, int radius){
		this.radius = radius;
		point = new _07_Point(x,y);
	}
	
	public String toString() {
		return "원점은 " + point + "이고," + "반지름은" + radius + "입니다.";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// throws CloneNotSupportedException
		// clone() 메서드를 사용할 때 발생할 수 있는 오류를 예외 처리함
		return super.clone();
	}
}
