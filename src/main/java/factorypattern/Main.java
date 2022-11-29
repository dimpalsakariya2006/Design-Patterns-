package factorypattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryOS obj = new FactoryOS();
		
		//can get any object
		OS os = obj.getObject("open");
		os.specification(); 
		
		OS os1 = obj.getObject("closed");
		os1.specification();
		
		OS os2 = obj.getObject("any");
		os2.specification();
	}

}
