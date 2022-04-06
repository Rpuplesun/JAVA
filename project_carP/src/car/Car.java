package car;

public class Car {

	// 차량정보
	String carname;
	String fuel;
	boolean sunLoop;
	boolean sensor;
	int cc;
	int price;

	public Car(String carname, String fuel, boolean sunLoop, boolean sensor, int cc, int price) {
		super();
		this.carname = carname;
		this.fuel = fuel;
		this.sunLoop = sunLoop;
		this.sensor = sensor;
		this.cc = cc;
		this.price = price;
	}

	@Override
	public String toString() {

		return "차량정보 <<< " + "차 이름 : " + carname + ", 연료 : " + fuel + ", 선루프 유무 : " + sunLoop + ", 센서 유무 : " + sensor
				+ ", 배기량 : " + cc + ", 가격 : " + price + " >>>";
	}

}
