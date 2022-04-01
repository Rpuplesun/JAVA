package collection;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {
		// People class로 ArrayList 생성
		/*
		 * List를 사용하는 가장 일반적인 방법은,
		 * 사용자 정의 클래스에 대한 객체를 포함하도록
		 * 지정하는 것이다.
		 */
		List<People> peopleList = new ArrayList<People>();
		
		// 10명의 데이터를 임의로 추가 (3개의 코드가 같은 의미, 회원정보가 다 다른경우 각각 추가)
//		peopleList.add(new People("회원1", "010-1234-5670"));
//		peopleList.add(new People("회원2", "010-1234-5671"));
//		peopleList.add(new People("회원3", "010-1234-5672"));
//		peopleList.add(new People("회원4", "010-1234-5673"));
//		peopleList.add(new People("회원5", "010-1234-5674"));
//		peopleList.add(new People("회원6", "010-1234-5675"));
//		peopleList.add(new People("회원7", "010-1234-5676"));
//		peopleList.add(new People("회원8", "010-1234-5677"));
//		peopleList.add(new People("회원9", "010-1234-5678"));
//		peopleList.add(new People("회원10", "010-1234-5679"));

		for(int i = 0; i < 10; i++) {
			People p = new People("회원" + i, "010-1234-567" + i);
			peopleList.add(p);
			
		//	peopleList.add(new People("회원" + i, "010-1234-567" + i));
			
		}

		// 출력하기
		
		for(int i = 0; i< peopleList.size(); i++) {
			// List에 저장된 데이터를 하나 꺼내면,
			// People 클래스 형의 객체다
			People item = peopleList.get(i);
			System.out.println(item);
		}
			
			
		
	}


}
