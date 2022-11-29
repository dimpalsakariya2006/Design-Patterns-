package absractfactorypattern;

public class FactoryGenerator {
	
	public static AbstractSubjectFactory getFactory(FactoryType factoryType) {
		
		switch(factoryType) {
		case PRIMARYSUBJECT :
			return new PrimarySubject();
		case SECONDARYSUBJECT : 
			return new SecondarySubject();
		}
			
		return null;
		
	}

}
