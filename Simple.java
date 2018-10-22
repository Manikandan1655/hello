package simpleinheritance;
class Base
{
	void dispB()
	{
		System.out.println(" Base Display");
	}
}
class Derived extends Base
{
	void dispD()
	{
		System.out.println("Derived Display");
	}

}

public class Simple {

	public static void main(String[] args) {
		Derived d = new Derived();
		d.dispB();
		d.dispD();
	}

}
