package operator;

public class Main03 {

	public static void main(String[] args) {

		int source = 100;
		
		source += 100; //source = source + 100; 결과 : 200
		source -= 50;  // 200 - 50 = 150
		source *= 2;   // 150 * 2 = 300
		source /= 100; // 300 / 100 = 3
		source %= 2;   // 3 % 2 = 1(나머지)
		
		System.out.println("source : " + source);
		
		
		
	}

}
