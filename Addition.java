package methodoverloading;

public class Addition {
	int a = 10;
	int b = 5;
	void add()
	{
		System.out.println(a + b);
	}
void addTwoNumbers(double num1,double num2)
{
	System.out.println(num1 + num2);
}
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add();
		obj.addTwoNumbers(2.5, 3);
		

	}

}
