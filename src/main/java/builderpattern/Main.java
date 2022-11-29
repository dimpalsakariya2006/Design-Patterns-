package builderpattern;

public class Main {

	public static void main(String[] args) {
		
//		Phone p = new Phone("Android",2,"Snapdragon",5.5,3100);
//		System.out.println(p);
		
		Phone p = new PhoneBuilder().setOs("Android").setBattery(4000).setProcessor("snapdragon").getPhone();
		System.out.println(p);
		
	}
}
