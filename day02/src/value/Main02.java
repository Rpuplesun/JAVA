package value;

public class Main02 {

	public static void main(String[] args) {
		//일반변수
		int width = 100;
		
		//상수
		final double PI = 3.14D;
		
		System.out.println("width : " + width);
		System.out.println("PI : " + PI);
		
		//값의 변경
		width = 200;
		
		
		// 에러 -> PI = 3.141582d;
		
		System.out.println("width : " + width);
		System.out.println("PI : " + PI);
		
	}

}
