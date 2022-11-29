package absractfactorypattern;

public class PrimarySubject extends AbstractSubjectFactory {

	@Override
	Subject getSubject(SubjectName subjectName) {
		switch(subjectName) {
		case MATHS : 
			return new Maths("11","9th edition","Vaibhav Virani");
		case SOCIALSCIENCE : 
			return new SocialScience("15","3rd edition","Ankita Vasoya");
		}
		return null;
	}
}
