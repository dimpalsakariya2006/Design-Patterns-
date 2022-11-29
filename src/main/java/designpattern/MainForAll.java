package designpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class MainForAll {

	public static void main(String[] args) throws IOException, Exception {

		//1. Eagar initialization
		//both object are same 
		
		EagarInitialization obj1 = EagarInitialization.getInstance();
		EagarInitialization obj2 = EagarInitialization.getInstance();
		
//		//this is different object cannot able to create : because of private constructor
//		EagarInitialization obj3 = new EagarInitialization();
//		System.out.println(obj3);
	
		System.out.println("Eagar Initialization :: ");
		System.out.println(obj1);
		System.out.println(obj2);
		if(obj1.equals(obj2))
			System.out.println("Both objects are same :: EagarInitialization\n");
		
	

		
		//2. StaticBlock

		StaticBlock b1 = StaticBlock.getInstance();
		StaticBlock b2 = StaticBlock.getInstance();
		
		System.out.println("Static Block Initialization :: ");
		System.out.println(b1);
		System.out.println(b2);
		
		if(b1.equals(b2))
			System.out.println("Both objects are equal :: StaticBlock\n");
		
		//3. Lazy Initialization
		
		LazyInitialization l1 = LazyInitialization.getInstance();
		LazyInitialization l2 = LazyInitialization.getInstance();
		
		System.out.println("Lazy Initialization :: ");
		System.out.println(l1);
		System.out.println(l2);
		
		if(l1.equals(l2))
			System.out.println("Both objects are same :: LazyInitialization\n");
		
		
		//4. Thread Safe Singlton
		
		ThreadSafeSingleton th1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton th2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		
		System.out.println("ThreadSafe Singleton :: ");
		System.out.println(th1);
		System.out.println(th2);
		
		if(th1.equals(th2))
			System.out.println("Both objects are same :: Thread Safe Singleton\n");
		
		
		//5. Bill Pugh Singleton
		
		System.out.println("Bill Pugh Singleton :: ");
		BillPugh p1 = BillPugh.getInstance();
		BillPugh p2 = BillPugh.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1.equals(p2))
			System.out.println("Both objects are same :: Bill pugh Singlton\n");
		
		
		//6. Enum
		
		System.out.println("Enum Singleton :: ");
		//creating object of enum
		EnumAbc e1 = EnumAbc.INSTANCE;
		e1.i=5;
		e1.show();
		
		EnumAbc e2 = EnumAbc.INSTANCE;
		e2.i=9;
		e1.show();
		
		System.out.println();
		//7. Serialization 
		
		System.out.println("Serialization Singleton :: ");
		SerializationSingleton s1 = SerializationSingleton.getInstance();
		s1.readResolve();
		ObjectOutput o = new ObjectOutputStream(new FileOutputStream("dimple.txt"));
		o.writeObject(s1);
		o.close();
		
		//Deserialization
		
		ObjectInput i = new ObjectInputStream(new FileInputStream("dimple.txt"));
		SerializationSingleton s2 = (SerializationSingleton) i.readObject();
		
		i.close();
		
		System.out.println("s1 : "+s1.hashCode());
		System.out.println("s2 : "+s2.hashCode());
		
		
		
	}
	
	

}
