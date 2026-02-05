package BasicPrograms;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) 
	{
		int a = 1970;
		int sum = 0;
		int x =a;
		while(x != 0) 
		{
			sum = sum + x%10;
			x /= 10;
		}
		System.out.println("The sum of all the digits of the given no :-"+a+" is "+sum);
	}

}
