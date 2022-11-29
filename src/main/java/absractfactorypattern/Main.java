package absractfactorypattern;

public class Main {
	public static void main(String[] args) {
		
		AbstractSubjectFactory subjectFactory = FactoryGenerator.getFactory(FactoryType.PRIMARYSUBJECT);
		System.out.println(subjectFactory);
		
		Subject maths = subjectFactory.getSubject(SubjectName.MATHS);
		System.out.println(maths.getDetails());
		
		Subject chemistry = FactoryGenerator.getFactory(FactoryType.SECONDARYSUBJECT).getSubject(SubjectName.CHEMISTRY);
		System.out.println(chemistry.getDetails());
		
		Subject socialscience = FactoryGenerator.getFactory(FactoryType.PRIMARYSUBJECT).getSubject(SubjectName.SOCIALSCIENCE);
		System.out.println(socialscience.getDetails());
		
		AbstractSubjectFactory subjectFactory1 = FactoryGenerator.getFactory(FactoryType.SECONDARYSUBJECT);
		Subject physics = subjectFactory1.getSubject(SubjectName.PHYSICS);
		System.out.println(physics.getDetails());
	}

}
