package collection;

import java.util.ArrayList;
import java.util.List;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 객체 생성시 제너릭스의 사용
		 * -> 클래스 이름 오른쪽에 <자료형>의 형식으로 표현한다.
		 * 이때 자료형에는 클래스타입만 가능하다.
		 * 기본 데이터형을 사용하고자 하는 경우에는
		 * 해당 데이터의 WrapperClass를 사용해야 한다.
		 */
		// numberList 이름의, ArrayList 객체 생성, Integer
		List<Integer> numberList = new ArrayList<Integer>();
		
		// 데이터 추가하기
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		numberList.add(60);
		numberList.add(70);
		numberList.add(80);
		numberList.add(90);
		
		
		// 데이터의 수량
		System.out.println(numberList.size());
		
		// 5번째 요소의 값 얻기(50)
		System.out.println(numberList.get(4));
		
		// 5번째 요소의 값을 삭제
		numberList.remove(4);
		
		// 하나를 삭제 후, 전체 크기 다시 조회
		System.out.println(numberList.size());
		
		// 5번째 요소의 값 다시 얻기
		System.out.println(numberList.get(4));
		
		// 5번째 자리에 데이터 추가
		numberList.add(4, 123);
		System.out.println(numberList.get(4));

		// 전체삭제
		numberList.clear();
		System.out.println(numberList.size());

	}

}
