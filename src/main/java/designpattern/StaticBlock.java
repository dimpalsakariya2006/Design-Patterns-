package designpattern;

public class StaticBlock {
	private static StaticBlock obj;
	
	private StaticBlock() {
		
	}
	static {
		try {
			obj =  new StaticBlock();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static StaticBlock getInstance() {
		return obj;
	}


		
		
	

}
