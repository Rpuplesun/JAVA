package arraylist;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		// 10명의 학생 데이터를 임의로 add
		for(int i = 0; i < 10; i++) {
			Student st = new Student("회원" + i, "010-1234-567" + i, "주소 : 역삼동 " + i + "번지");
			studentList.add(st);		
		}
		
		// arraylist의 크기 출력
		System.out.println(studentList.size());
		
		System.out.println(studentList.get(5)); // arraylist의 5번째 요소 출력
		
		studentList.remove(5);	// arraylist의 5번째 요소 삭제
				
		for(int i = 0; i< studentList.size(); i++) {
			Student data = studentList.get(i);
			System.out.println(data);		
		}
		
	}
}
