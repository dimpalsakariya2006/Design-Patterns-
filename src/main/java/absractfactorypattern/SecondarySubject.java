package absractfactorypattern;

public class SecondarySubject extends AbstractSubjectFactory {

	@Override
	Subject getSubject(SubjectName subjectName) {
		switch(subjectName) {
		case CHEMISTRY : 
			return new Chemistry("10","5th edition","Mukesh Baldha");
			
		case PHYSICS : 
			return new Physics("8","7th edition","Akhilesh Zala");
		}
		return null;
	}

}
