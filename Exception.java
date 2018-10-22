package executionhand;

public class Exception {
	
	

	public static void main(String args[]) {
		try {
			int data = 50 / 0;
			int c[] = { 1 };
			c[42] = 99;
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("Divided by e:" + e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index oob" + e);
		}
		finally {
			System.out.println("i always executed");
		}
		System.out.println("rest of the code");
	

	}

}
