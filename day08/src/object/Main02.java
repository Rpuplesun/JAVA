package object;

class Member {
	String name;
	int age;
	
	// getName(), return, 전역변수 name;
	// setName(), param name, 전역변수 name = param name
	// getAge(), return, 전역변수 age
	// setAge(), param age, 전역변수 age = param age
	// say(), getName(), getAge() 각각 출력
	
	public String getName() { return this.name; }
	
	public void setName(String name) { this.name = name; }
	
	public int getAge() { return this.age; }
	
	public void setAge(int age) { this.age = age; }
	
	public void say() {
		System.out.println("이름 : " + getName() + ", 나이 : " + getAge());
	}
	
}

public class Main02 {

	public static void main(String[] args) {
		// Member class 객체 생성
		// 메서드를 사용해서 전역변수 name, age에 임의의 데이터 할당
		// say() 메서드 호출
		Member std = new Member();
		std.setName("자바학생");
		std.setAge(20);
		std.say();
		
	}

}
