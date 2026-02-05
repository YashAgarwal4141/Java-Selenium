package BasicPrograms;

public class CheckPrimeOrNot {

	public static void main(String[] args) 
	{
		boolean flag = true;
		int x = 12;
		for(int i = 2; i<x/2 ; i++)
		{
			if(x%i == 0)
			{
				flag = false;
			}
		}
		
		if(flag == false)
			System.out.println("No. is not prime");
		else 
			System.out.println("No. is prime");

	}

}
