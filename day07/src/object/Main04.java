package object;

class Calc{
	// plus, param, int x, int y, return

	// minus, param, int x, int y, return
	
	// times, param, int x, int y, return
	
	// divide, param, int x, int y, return
	
	int plus(int x, int y){ return x + y; }
	int minus(int x, int y){ return x - y; }
	int times(int x, int y){ return x * y; }
	int divide(int x, int y){ 
		int result = 0;
		if(y != 0) {
			result = x / y;
		}
		return result;
		}
}

public class Main04 {

	public static void main(String[] args) {

		Calc cal = new Calc();
		int p = cal.plus(10, 5);
		System.out.println(p);
		int m = cal.minus(10, 5);
		System.out.println(m);
		int t = cal.times(10, 5);
		System.out.println(t);
		int d = cal.divide(10, 5);
		System.out.println(d);
		
	}

}
