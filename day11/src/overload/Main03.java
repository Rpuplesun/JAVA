package overload;

public class Main03 {
	// main() 클래스 생성, 객체생성을 생성자 타입별로 생성 후, 출력
	public static void main(String[] args) {
		// 생성자가 여러가지 형태로 Overload 되어 있기 때문에
		// 객체를 생성하는 방법이 다양해졌다.
		Member m1 = new Member();
		System.out.println(m1.toString());
		
		Member m2 = new Member(20);
		System.out.println(m2.toString());
		
		Member m3 = new Member("회사원");
		System.out.println(m3.toString());
		
		Member m4 = new Member("회사원", 20);
		System.out.println(m4.toString());

	}

}
