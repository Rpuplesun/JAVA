package test4.lcw;

// Student 클래스 생성
public class Student {
	
	// 변수 선언
	private String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	// 생성자 정의
	public Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// getter, setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// 합계 return
	public int getTotal() {
		int result1 = kor + eng + math; 
		return result1;
	}
	
	// 평균 return (int 값)
	public int getAverage() {
		int result2 = getTotal() / 3;
		return result2;
	}
	
	// name, ban, no, kor, eng, math 출력 메서드 생성
	public void name() {
		System.out.println("name : " + this.name);
	}
	public void ban() {
		System.out.println("ban : " + this.ban);
	}
	public void no() {
		System.out.println("no : " + this.no);
	}
	public void kor() {
		System.out.println("kor : " + this.kor);
	}
	public void eng() {
		System.out.println("eng : " + this.eng);
	}
	public void math() {
		System.out.println("math : " + this.math);
	}

}
