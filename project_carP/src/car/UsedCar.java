package car;

public class UsedCar extends Car {
	// 차량정보2
	int km;
	boolean accident;
	String sign;

	public UsedCar(String carname, String fuel, boolean sunLoop, boolean sensor, int cc, int price, int km,
			boolean accident, String sign) {
		super(carname, fuel, sunLoop, sensor, cc, price);
		this.accident = accident;
		this.km = km;
		this.sign = sign;
	}

	@Override
	public String toString() {
		String resultSunLoop = "";
		String resultSensor = "";
		String resultAccident = "";

		if (sunLoop) {
			resultSunLoop = "선루프가 있습니다.";
		} else {
			resultSunLoop = "선루프가 없습니다.";
		}

		if (sensor) {
			resultSensor = "센서가 있습니다.";
		} else {
			resultSensor = "센서가 없습니다.";
		}

		if (accident) {
			resultAccident = "사고기록이 있습니다.";
		} else {
			resultAccident = "사고기록 없습니다.";
		}

		return ">>> 차량정보 <<< " + "\n● 차 이름 : " + carname + "\n● 연료 : " + fuel + "\n● 선루프 유무 : " + resultSunLoop + "\n● 센서 유무 : "
				+ resultSensor + "\n● 배기량 : " + cc + "\n● 가격 : " + price + "만원" + "\n● 주행거리 : " + km + "\n● 사고유무 : " + resultAccident
				+ "\n● 사고내용 : " + sign;
	}

}
