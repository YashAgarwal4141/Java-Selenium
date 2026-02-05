package BasicPrograms;

public class FactorialOFN 
{
	public static int fact(int y,int x)
	{
		if(x == 1) {
			return y;
		}else {
			y=y*x;
			return fact(y,x-1);
		}
	}
	public static void main(String[] args) 
	{
		int n = 7;
		int y =1;
		System.out.println(fact(y,n));
	}

}
