package ch14;

public class Car {

	String name;
	int price;
	Engin engin;
	
	public Car() {
		engin = new Engin("gdr엔진", 600);
	}
	
	
	
	public void showInfo() {
		System.out.println(engin.name);
		System.out.println(engin.price);
	}
	
	
}
