package absractfactorypattern;

public class Maths extends Subject{
	
	private String chapters;
	private String edition;
	private String writer;

	
	@Override
	 public String getDetails() {
		return "Maths : Total chapters : "+this.chapters+" , Edition : "+this.edition+" , Writer : "+this.writer;	
	}


	public Maths(String chapters, String edition, String writer) {
		super();
		this.chapters = chapters;
		this.edition = edition;
		this.writer = writer;
	}
	

}
