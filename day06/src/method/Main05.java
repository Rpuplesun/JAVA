package method;

/*
 * 문제 1. "Hello, World~", "메서드가 호출되었습니다." 
 * 를 출력하는 메서드를 각각 만들어 호출하세요
 */

public class Main05 {

	public static void main(String[] args) {
		helloWorld();
		showMs();
	}

	public static void helloWorld() {
		String hello =  "Hello, World~";
		System.out.println(hello);
	}
	public static void showMs() {
		String method =  "메서드가 호출되었습니다.";
		System.out.println(method);
	}
	
	// 다른 예시
	/*
	public static void main(String[] args) {
		helloWorld();
		showMs();
	}
	public static void helloWorld() {
		System.out.println("Hello, World~");
	}
	public static void showMs() {
		System.out.println("메서드가 호출되었습니다.");
	} */
	
}
