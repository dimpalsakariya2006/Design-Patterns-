package designpattern;

import java.lang.reflect.Constructor;

public class ReflectionSinglton {
	public static void main(String[] args) {
		
		 EagarInitialization One = EagarInitialization.getInstance();
		 EagarInitialization Two = null;
	        try {
	            Constructor[] constructors = EagarInitialization.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                // This code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                Two = (EagarInitialization) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println(One.hashCode());
	        System.out.println(Two.hashCode());
	    }
	}
