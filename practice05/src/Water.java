class WaterSource {
	private String s;

	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class Water {
	private String valve1, valve2, valve3, valve4; // String 클래스의 객체들
	private WaterSource source = new WaterSource(); // 컴포지션
	private int i;
	private float f;

	public String toString() { // toString()은 어떠한 객체를 String 객체로 나타낼 필요가 있을 때 컴파일러가 자동으로 호출함
		return "valve1 = " + valve1 + " " + "valve2 = " + valve2 + " " + "valve3 = " + valve3 + " " + "valve4 = "
				+ valve4 + "\n" + "i = " + i + " " + " f =  " + f + " " + "source = " + source;
	}

	/*
	 * 자바의 컴파일러는 String객체("source =")를 WaterSource와 합하여 새로운 String 객체를 생성한다. //그럴 때
	 * 양쪽 클래스 모두가 String으로 선언되어야 한다. source(WaterSource의 객체)를 String으로 변환하기 위해
	 * toString을 호출한다.
	 */
	public static void main(String[] args) {
		Water sprinklers = new Water();
		System.out.println(sprinklers);
	}

}
