package BasicPrograms;

public class LargestOfThreeNumbers {

	public static void main(String[] args) 
	{
		int a =23;
		int b = 28; int c= 25;
		
		if(a>b && a>c) {
			System.out.println(("A is greatest"));
		}else if(b>a && b>c) {
			System.out.println("B is greatest");
		}else {
			System.out.println("C is greatest");
		}

	}

}
