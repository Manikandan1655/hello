package methodoverrideing;

public class Override {

	public static void main(String[] args) {
		sub_class o = new sub_class(10,30);
		o.display();
		

	}

}
class super_class
{
	int b;
	super_class(int b)
	{
		this.b = (b + 10);
		
	}
	public void display()
	{
		System.out.println("\nsuper class : "+b);
	}
}
class sub_class extends super_class
{
	int a;
	sub_class(int a,int b)
	{
		super(b);
		this.a = a;
	}
	public void display()
	{
		System.out.println("\nsub class : " +a);
		System.out.println("\nsuper class : " +b);
		
	}
}

