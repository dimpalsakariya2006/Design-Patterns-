package designpattern;

public class EagarInitialization {

	private static final EagarInitialization ei = new EagarInitialization();

	private EagarInitialization() {
	}

	public static EagarInitialization getInstance() {
		return ei;
	}

	

}
