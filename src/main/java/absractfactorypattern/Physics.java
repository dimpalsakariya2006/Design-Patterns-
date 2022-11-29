package absractfactorypattern;

public class Physics  extends Subject{
	private String chapters;
	private String edition;
	private String writer;

	
	@Override
	 public String getDetails() {
		return "Physics : Total chapters : "+this.chapters+" , Edition : "+this.edition+" , Writer : "+this.writer;	
	}


	public Physics(String chapters, String edition, String writer) {
		super();
		this.chapters = chapters;
		this.edition = edition;
		this.writer = writer;
	}

	
}
