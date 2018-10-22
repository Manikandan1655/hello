package multiple;
interface shape
{
	double pi = 3.14;
	void calculate(float f1,float f2);
	
}
class circule implements shape
{
	public void calculate(float x,float y)
	
{
	System.out.println(pi*x*x);
}
}
class rectangle implements shape
{
	public void calculate(float x,float y)
	{
		System.out.println(x*y);
	}
}

public class Multiple {

	public static void main(String s[]) {
		
		shape s1;
		circule c1 = new circule();
		rectangle r1 = new rectangle();
		s1 = c1;
		s1.calculate(10,0);
		s1 = r1;
		s1.calculate(10, 2);
		

	}

}

