package BasicPrograms;

public class FiboTillN 
{

	public static void main(String[] args) 
	{	
		int f =0;
		int s =1;
		int c =0;
		int x =5;
		System.out.println(f+"\n"+s);
		for(int i =0 ; i<=x ; i++)
		{
			
			c = s+f;
			f = s;
			s = c;
			System.out.println(s);
		}
	}

}
