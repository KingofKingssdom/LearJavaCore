package Abtraction;

public class TV extends Remote{

	@Override
	public void turnOff() {
		System.out.println("Tivi đã được tắt");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Tivi đã được bật");
		
	}

}
