package car;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		ArrayList<UsedCar> carList = new ArrayList<>();

		// 차량 정보 입력
		UsedCar morning = new UsedCar("모닝", "LPG", true, true, 998, 1500, 100000, true, "침수");

		UsedCar k5 = new UsedCar("k5", "가솔린", false, true, 1598, 2150, 0, false, "없음");

		UsedCar bmw5 = new UsedCar("bmw-520d", "디젤", true, true, 1995, 3599, 102950, false, "없음");

		UsedCar porsche = new UsedCar("포르쉐 박스터", "가솔린", true, true, 1988, 10130, 3000, false, "없음");

		UsedCar rolls = new UsedCar("롤스로이스 고스트 블랙배지", "가솔린", true, true, 6750, 55500, 2300, false, "없음");

		// carList에 차량정보 넣기
		carList.add(morning);
		carList.add(k5);
		carList.add(bmw5);
		carList.add(porsche);
		carList.add(rolls);
		
		Scanner sc = new Scanner(System.in);
		User user = new User();

		String name = "";
		String age = "";
		String phoneNum = "";
		String pay = "";
		int cartype = 0;
		boolean check = true;
		int answer = 0;

		// 메인 while문
		while (check) {

			System.out.println("어서오세요. 찬카입니다. \n차량 구매를 원하시면 회원정보를 입력해 주세요.");

			// 이름 정규 표현식
			while (true) {
				System.out.println("이름을 입력해 주세요.");
				name = sc.next();

				boolean isname = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name);

				if (!isname) {
					System.out.println("[ERROR] 이름은 한글로 입력해 주세요.");
					System.out.println("--------------------------");
					continue;
				}
				user.setName(name);
				break;
			}

			// 나이 정규 표현식
			while (true) {
				System.out.println("나이를 입력해 주세요.");
				age = sc.next();

				boolean isage = Pattern.matches("^[0-9]*$", age);

				if (!isage) {
					System.out.println("[ERROR] 나이는 숫자로 입력해 주세요.");
					System.out.println("--------------------------");
					continue;
				}
				if (Integer.parseInt(age) < 20) {
					System.out.println("[ERROR] 미성년자는 구매하실 수 없습니다.");
					System.out.println("--------------------------");
					continue;
				}
				user.setAge(age);
				break;
			}

			// 핸드폰번호 정규 표현식
			while (true) {
				System.out.println("-를 제외한 핸드폰 번호를 입력해 주세요.");
				phoneNum = sc.next();

				boolean isname = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", phoneNum);

				if (!isname) {
					System.out.println("[ERROR] 핸드폰 번호 형식이 올바르지 않습니다.");
					System.out.println("--------------------------");
					continue;
				}
				user.setPhoneNum(phoneNum);
				break;
			}

			// 결제 비밀번호 정규 표현식
			while (true) {
				System.out.println("결제 시 사용할 비밀번호 6자리를 입력해 주세요.");
				pay = sc.next();

				boolean ispay = Pattern.matches("^[0-9]*$", pay);

				if (!ispay) {
					System.out.println("[ERROR] 비밀번호는 숫자로만 입력해 주세요.");
					System.out.println("--------------------------");
					// 실행도중 return을 만나면 즉시 중단
					// void 형은 return 키워드만 명시한다.
					continue;
				}
				if (pay.length() != 6) {
					System.out.println("[ERROR] 비밀번호는 6자리로 입력해 주세요.");
					continue;
				}
				// 비밀번호 재입력 정규 표현식
				while (true) {
					System.out.println("비밀번호를 한번 더 입력해 주세요.");
					String payCheck = sc.next();

					if (!payCheck.equals(pay)) {
						System.out.println("[ERROR] 비밀번호가 일치하지 않습니다.");
						continue;
					}
					break;
				}
				user.setPay(pay);
				break;
			}

			// 시작 while문
			while (true) {

				System.out.println(user.getName() + "님 환영합니다.");

				// 차량리스트 출력 시작
				System.out.println("아래는 찬카가 보유한 차량 목록입니다.");
				for (int i = 0; i < carList.size(); i++) {
					System.out.println(i + 1 + ". " + carList.get(i).carname);
				}
				// 차량리스트 출력 종료
				System.out.println("원하시는 항목을 선택해 주세요.");
				System.out.println("(1)차량 구매하기 \t(2)내차 팔기 \t(3)나가기");
				answer = sc.nextInt();

				// 차량 구매하기
				if (answer == 1) {
					System.out.println("(1)차량 구매하기 탭입니다. \n구매 시 선택하신 차량 가격의 10퍼센트가 계약금으로 지불됩니다. \n");
					System.out.println("☆★☆★☆★☆★☆★구매하실 차량을 선택해주세요 ☆★☆★☆★☆★☆★");
					for (int i = 0; i < carList.size(); i++) {
						System.out.println(i + 1 + ". " + carList.get(i).carname);
					}

					cartype = sc.nextInt();
					carList.get(cartype - 1);

					System.out.println("선택하신 차량의 정보입니다. \n" + carList.get(cartype - 1));
					int cnt = 1;
					// 결제 while문
					while (true) {
						System.out
								.println("선택하신 차량의 계약금은 " + (int) (carList.get(cartype - 1).price * 0.01) + "만원 입니다.");
						System.out.println("계약금을 결제하시겠습니까? \n(1)결제한다. \t(2)결제 안한다.");
						answer = sc.nextInt();
						boolean buy = false;

						// 비밀번호 입력
						if (answer == 1) {

							for (int i = 1; i <= 5; i++) {
								System.out.println("결제 비밀번호를 입력해 주세요.");
								String answer2 = sc.next();
								if (user.payNumCk(answer2)) {
									user.setMyCar(carList.get(cartype - 1));
									carList.remove(cartype - 1);
									buy = true;
									break;
								} else {
									System.out.println("비밀번호가 " + i + "번 틀렸습니다.");
									cnt++;
								}
							}

							// 비밀번호 5회 틀리면 처음으로 이동
							if (cnt > 5) {
								System.out.println("비밀번호가 5회 틀렸으므로 결제를 종료합니다.");
								break;
							}

							if (buy) {
								System.out.println("결제가 성공적으로 이루어졌습니다.");
								break;
							}
						} else if (answer == 2) {
							System.out.println("<내차 구매하기>를 종료합니다. 감사합니다.");
							break;
						}
					}

					// 결과적으로 구매한 차량의 정보 출력
					System.out.println("아래는 구매하신 차량 정보입니다.");
					if (user.getMyCar() == null) {
						System.out.println("차량 구매 내역이 없습니다.");
					} else {
						System.out.println(user.getMyCar());
					}


					// 내차팔기
				} else if (answer == 2) {

					int sellAns = 0;

					String carname;
					String fuel = null;
					boolean sunLoop = false;
					boolean sensor = false;
					int cc;
					int km;
					boolean accident = false;
					String sign = null;
					String carpoor = "";
					int price = 0;

					System.out.println("☆★☆★☆★☆★☆★판매하실 차량 정보를 입력해 주세요.☆★☆★☆★☆★☆★ \n\n");
					System.out.println("차랑명을 입력해주세요.");
					carname = sc.next();
					System.out.println("연료를 선택해주세요. (1)가솔린 \t(2)디젤");
					sellAns = sc.nextInt();
					if (sellAns == 1) {
						fuel = "가솔린";
					} else if (sellAns == 2) {
						fuel = "디젤";
					}
					System.out.println("선루프가 있나요? (1)네\t(2)아니요");
					sellAns = sc.nextInt();

					if (sellAns == 1) {
						sunLoop = true;
					} else if (sellAns == 2) {
						sunLoop = false;
					}
					System.out.println("센서가 있나요?  (1)네\t(2)아니요");
					sellAns = sc.nextInt();

					if (sellAns == 1) {
						sensor = true;
					} else if (sellAns == 2) {
						sensor = false;
					}
					System.out.println("배기량을 입력해주세요.");
					cc = sc.nextInt();
					System.out.println("주행거리를 입력해주세요.");
					km = sc.nextInt();
					System.out.println("사고가 난적이 있나요? (1)네\t(2)아니요");
					sellAns = sc.nextInt();
					if (sellAns == 1) {
						accident = true;
						System.out.println("사고 내용을 입력해주세요.");
						sign = sc.next();
					} else if (sellAns == 2) {
						accident = false;
						sign = "사고기록이 없습니다.";
					}

					System.out.println("희망하는 판매 가격을 입력해주세요.(단위 : 만원)");
					price = sc.nextInt();

					// 차량 정보 등록 시 목록에 업데이트
					UsedCar sellCar = new UsedCar(carname, fuel, sunLoop, sensor, cc, price, km, accident, sign);
					carList.add(sellCar);
					System.out.println("차량이 등록되었습니다.");
					// break 프로그램 전체 종료
				} else if (answer == 3) {
					// 나가기
					System.out.println("이용해 주셔서 감사합니다.");
					// break 프로그램 전체 종료
					check = false;
					break;
				}

				System.out.println("================================");
				sc.nextLine();
			}
		}
	}
}