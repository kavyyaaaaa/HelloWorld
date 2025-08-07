package variables;

public class variables {
	int a=10;//instance variable
	
	void print()
	{
		String msg="hello";//local variable
		System.out.println(msg);
	}
	
	static String message="hello students";
	
	public static void main(String[] args) {
		 variables obj = new  variables();
		 System.out.println("the value of a " +obj.a);
		 obj.print();
		 System.out.println(message);
	}
}
