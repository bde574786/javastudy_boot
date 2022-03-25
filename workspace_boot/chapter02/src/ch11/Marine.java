package ch11;

public class Marine {

	private static int marineSId;

	private int id;
	private String name;
	private int power;
	private int hp;

	public Marine(String name) {
		this.name = name;
		marineSId++;
		this.id = marineSId;
		power = 5;
		hp = 100;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 질럿을 공격합니다.
	public void attackZealot(Zealot zealot) {
		zealot.beAttacked(power);
		System.out.println("마린이 질럿을 공격합니다.");
		
	}

	// 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
			zergling.beAttacked(power);
			System.out.println("마린이 저글링을 공격합니다.");
	}

	// 내가 공격을 당하다.
	public void beAttacked(int power) {
		this.hp -= power;
		if(this.hp <= 0) {
			System.out.println(this.name + "은 사망하였습니다.");
			this.hp = 0;
		}
	}

	public void showinfo() {
		System.out.println("=======정보창=======");
		System.out.println("이름 : " + name);
		System.out.println("아이디 : " + id);
		System.out.println("공격력 : " + power);
		System.out.println("생명력 : " + hp);
		System.out.println("==================");
	}
}
