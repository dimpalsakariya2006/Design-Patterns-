package absractfactorypattern;

public class Chemistry extends Subject {
	
	private String chapters;
	private String edition;
	private String writer;

	
	@Override
	 public String getDetails() {
		return "Chemistry : Total chapters : "+this.chapters+" , Edition : "+this.edition+" , Writer : "+this.writer;	
	}


	public Chemistry(String chapters, String edition, String writer) {
		super();
		this.chapters = chapters;
		this.edition = edition;
		this.writer = writer;
	}


	@Override
	public String toString() {
		return "Chemistry [chapters=" + chapters + ", edition=" + edition + ", writer=" + writer + "]";
	}
	
	

}
