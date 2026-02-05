package BasicPrograms;

public class InterchangeTheValues {

	public static void main(String[] args) 
	{
		int a =23;
		int b =28;
		System.out.println(a+","+b);
		
		a += b;//a=a+b
		b = a-b;
		a -= b;//a= a-b
		System.out.println(a+","+b);

	}

}
