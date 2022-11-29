package designpattern;

public class ThreadSafeSingleton {

	 private static ThreadSafeSingleton th;

	    private ThreadSafeSingleton(){}

	    public static synchronized ThreadSafeSingleton getInstance() {
	        if (th == null) {
	            th = new ThreadSafeSingleton();
	        }
	        return th;
	    }
	    
	    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
	        if (th == null) {
	            synchronized (ThreadSafeSingleton.class) {
	                if (th == null) {
	                    th = new ThreadSafeSingleton();
	                }
	            }
	        }
	        return th;
	    }

}
