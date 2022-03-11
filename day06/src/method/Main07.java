package method;

/*
 * 문제3. 반환 값이 있고 받는 인자값이 없는 메서드를 구현하세요
 */


public class Main07 {

	public static void main(String[] args) {
		// int rMethod = return_();
		// System.out.println(rMethod);
		System.out.println(return_());
	}
	public static int return_() {
		int x = 10;
		return x; //return에 바로 값을 넣어주어도 무관 ex) return 100;, return false ...
	}
}
