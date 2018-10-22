package multilevel;
class Base
{
	void dispB()
	{
		System.out.println("Base Display");
	}
}
class Inter extends Base
{
	void dispI()
	{
		System.out.println("Intermediate Display");
	}
}
class Derived extends Inter
{
	void dispD()
	{
		System.out.println("Derived Display");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
	Derived d = new Derived();
	d.dispB();
	d.dispI();
	d.dispD();
	
	

	}

}
