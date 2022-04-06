package car;

import java.util.regex.Pattern;

public class User {
	private UsedCar myCar;
	private String name;
	private String age;
	private String phoneNum;
	private String pay;

	public UsedCar getMyCar() {
		return myCar;
	}

	public void setMyCar(UsedCar myCar) {
		this.myCar = myCar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public User() {

	}

	public User(String name, String age, String phoneNum, String pay) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.pay = pay;
	}

	public boolean isValue(String str) {
		boolean result = false;
		if (str != null) {
			result = !str.trim().equals("");
		}
		return result;
	}

	public boolean isname(String str) {
		boolean result = false;
		if (isValue(str)) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		}
		return result;
	}

	public boolean payNumCk(String num) {
		if (this.pay.equals(num)) {
			return true;
		}
		return false;

	}
}
