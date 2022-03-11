package method;

/*
 * 문제4. 반환값이 있고 받는 인자값이 있는 메서드를 구현해보세요.
 */

public class Main08 {

	public static void main(String[] args) {
		int z = returnMethod(10);
		System.out.println(z);
	}
	public static int returnMethod(int x) {
		int y = x + 1;
		return y;
	}
	
	// 다른 예시
	/* 
	public static void main(String[] args) {
		System.out.println(plusM(10, 20));
	}
	
	public static int plusM(int a, int b) {
		return a + b
	} */
	
	
}
