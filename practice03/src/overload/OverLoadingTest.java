package overload;

/*
하나의 클래스 안에 매개변수 개수나 혹은 데이터 형(자료형)은 다르지만 메소드 이름이 같은 메소드를
여러 개 정의하는 것을 오버로딩(OverLoading)이라 한다.
***데이터가 달라도 매개변수 개수가 같으면 오류
*오버라이딩(Overriding)(상속에서 쓰임)
*오버로딩, 오버라이딩 둘 다 메소드에서 이루어짐
*/
class Book {
	String title;
	int price;
	int num = 0;
	
	Book() { //default 생성자 = 매개변수를 가지고 있지 않은 생성자
		title = "JavaProgramming";
		price = 1000;
		}
	Book(String t, int p) {
		title = t;
		price = p;
		}
	
	void print() {
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price);
		System.out.println("수량 : " + num);
		System.out.println("합계 : " + (price * num));
	}

}


public class OverLoadingTest {
	public static void main(String[] args) {
		
		 Book book1 = new Book();
		 book1.print();
		 
		 Book book2 = new Book("자바 프로그래밍", 12000); //오버로딩된 생성자 사용
		 book2.num = 5;
		 book2.print();
	}
}
