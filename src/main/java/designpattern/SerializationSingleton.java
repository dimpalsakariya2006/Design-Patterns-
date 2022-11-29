package designpattern;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2351290477619696276L;
	
	private SerializationSingleton() {
		
	}
	
	private static class Helper{
		private static final SerializationSingleton si = new SerializationSingleton();
		
	}
	
	public static SerializationSingleton getInstance() {
		return Helper.si;
	}

	protected Object readResolve() {
	    return getInstance();
	}
}
