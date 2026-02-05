package BasicPrograms;

public class CountNoOfDigits 
{
	public static int countDigits(int x, int y)
	{   
		if(x ==0) {
			return y;
		}
		else
		{
			y= y+1;
			return countDigits(x/10, y);
		}

	}
	
	
	public static void main(String[] args) 
	{
		int x = 19710904;
		int y = 0;
		System.out.println(countDigits(x,y));
	}

}
