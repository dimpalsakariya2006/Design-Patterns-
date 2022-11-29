package factorypattern;

public class FactoryOS {

	public OS getObject(String str) {
		
		if(str.equalsIgnoreCase("open"))
			return new Android();
		else if(str.equalsIgnoreCase("closed"))
			return new Ios();
		else 
			return new Windows();
	}
}
