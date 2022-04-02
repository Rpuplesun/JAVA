class Soap {
	private String s;

	Soap() {
		System.out.println("Soap()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}

	public static class Bath {
		private String s1 = "Happy", s2 = "Happy", s3, s4;
		private Soap castille;
		private int i;
		private float flo;

		public Bath() { //
			System.out.println("Inside Bath()");
			s3 = "Korea";
			flo = 3.14f;
			castille = new Soap();
		}

		{
			i = 47;
		}// 인스턴스 초기화

		public String toString() {
			if (s4 == null) //
				s4 = "KoreaIt";
			return "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n" + "s4 = " + s1 + "\n" + "i = " + i
					+ "\n" + "flo = " + flo + "\n" + "castille = " + castille;
		}

		/*
		 * lazy 초기화 : 초기화 하지 않고 사용하면 런타임 에러 클래스의 생성자에서는 어떠한 초기화도 되기 전에 명령문이 먼저 실행되면
		 * 예외처리가 발생할 수 있다.
		 */
		public static void main(String[] args) {
			Bath b = new Bath();
			System.out.println(b);
		}
	}
}
