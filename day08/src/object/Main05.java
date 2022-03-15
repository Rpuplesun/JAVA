package object;

class Artickel{
	int seq;		// 글 번호
	String subject; // 글 제목
	String writer;  // 작성자
	
	/*	
	 *  파라미터가 존재하는 생성자
	 *  모든 전역변수를 초기화
	 */
	
	public Artickel(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	/*
	 * 메서드, 전역변수 각각을 출력하는 메서드 작성
	*/
	void print(){
		System.out.println("artickel() 메서드 실행");
		System.out.println("글 번호 : " + this.seq);
		System.out.println("글 제목 : " + this.subject);
		System.out.println("작성자 : " + this.writer);
	}
	
}


public class Main05 {

	public static void main(String[] args) {
		// Article 객체 1번 생성
		// 객체.메서드(); (출력 메서드 호출)
		Artickel art1 = new Artickel(1, "첫 번째 자바 학습", "자바학생");
		art1.print();
		System.out.println("-----------------------------");
		
		// Article 객체 2번 생성
		// 객체.메서드(); (출력 메서드 호출)
		Artickel art2 = new Artickel(2, "자바는 개체지향 언어입니다", "자바강사");
		art2.print();
		
		
	}

}
