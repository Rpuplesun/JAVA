package override;

public class Main06 {

	public static void main(String[] args) {
		Army army = new Army("육군");
		AirForce airforce = new AirForce("공군");
		Navy navy = new Navy("해군");
		
		army.attack();
		army.tank();
		
		airforce.attack();
		airforce.bombing();
		
		navy.attack();
		navy.nucleus();
	}

}
