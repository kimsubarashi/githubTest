package ch06;

public class _02_Main {
	public static void main(String[] args) {
		// _02_FireCar 자식클래스 정보 + 공통기능 출력
		_02_FireCar fc = new _02_FireCar("소방차",1000);
		
		fc.carInfo();
		fc.water();
		
		// _02_PoliceCar 자식클래스 정보 + 공통기능 출력
		_02_PoliceCar pc = new _02_PoliceCar("경찰차",2000);
		pc.carInfo();
		pc.siren();
		
		
		_02_FireCar fCar = new _02_FireCar();
		fCar.setKind("소방차");
		fCar.setSpeed(2000);
		fCar.carInfo();
		
		fCar.water();
		
		_02_PoliceCar pCar = new _02_PoliceCar("경찰차",2000);
		pCar.setKind("경찰차");
		pCar.setSpeed(3000);
		pCar.carInfo();
		
		pCar.siren();
	}
}
