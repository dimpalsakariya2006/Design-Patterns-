package absractfactorypattern;

public class SocialScience extends Subject{

	private String chapters;
	private String edition;
	private String writer;

	
	@Override
	 public String getDetails() {
		return "SocialScience : Total chapters : "+this.chapters+" , Edition : "+this.edition+" , Writer : "+this.writer;	
	}


	public SocialScience(String chapters, String edition, String writer) {
		super();
		this.chapters = chapters;
		this.edition = edition;
		this.writer = writer;
	}
	
	

}
