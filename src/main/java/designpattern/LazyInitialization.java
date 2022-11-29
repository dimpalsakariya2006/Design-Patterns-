package designpattern;

public class LazyInitialization {


	private static  LazyInitialization li;
	
	private LazyInitialization() {
		
	}
	
	public static LazyInitialization getInstance() {
		if(li==null)
		{
			li = new LazyInitialization();
		}
		return li;
	}

}
