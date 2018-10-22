package singletonexample;


public class Singleton {

	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {
		str = "Hey I am using singleton class ";
		
	}
	public static Singleton getInstance() {
		if(singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;
		
			
	}

	public static void main(String[] args) {
		Singleton X = Singleton.getInstance();
		Singleton Y = Singleton.getInstance();
		Singleton Z = Singleton.getInstance();
		
		X.str = (X.str).toUpperCase();
		
		System.out.println(X.str);
		System.out.println(Y.str);
		System.out.println(Z.str);
	}

}
