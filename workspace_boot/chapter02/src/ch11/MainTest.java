package ch11;

public class MainTest {

	public static void main(String[] args) {
			
		Zealot zealot1 = new Zealot("질럿1");
		//zealot1.showinfo();
		
		Marine marine1 = new Marine("마린1");
		//marine1.showinfo();
		
		Zergling zergling1 = new Zergling("저글링1");
		//zergling1.showinfo();
		
		// Zergling X
		zealot1.attackMarine(marine1);
		marine1.attackZealot(zealot1);
		zergling1.attackMarine(marine1);

		marine1.showinfo();
		zealot1.showinfo();

		for (int i = 0; i < 20; i++) {
			zealot1.attackMarine(marine1);
		}
		
	
	}

}