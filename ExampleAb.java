package abclass;

public class ExampleAb {

	public static void main(String[] args) {
		
		MaheshPhone obj = new SureshPhone();
		obj.call();
		obj.cook();
		obj.dance();
		obj.move();
			}

}
    abstract class MaheshPhone
    {
    	public void call()
    	{
    		System.out.println("calling...");
    	}
    	public abstract void move();
    	public abstract void dance();
    	public abstract void cook();
    	
    }
abstract class RameshPhone extends MaheshPhone
{
	public void move()
	{
		System.out.println("moving...");
		
	}
}
class SureshPhone extends RameshPhone
{
	public void dance()
	{
		System.out.println("dancing...");
	}
	public void cook()
	{
		System.out.println("cooking...");
	}
}