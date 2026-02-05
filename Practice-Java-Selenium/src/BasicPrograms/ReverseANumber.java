package BasicPrograms;

public class ReverseANumber {

	public static void main(String[] args) 
	{
		int x =143;
		int remainder = 0;
		int z =x;
		while( z != 0) {
			x = x%10;
			remainder  = (remainder*10) + x;
			z /=10;
			x=z;
		}
		System.out.println(remainder);

	}

}
