package BasicPrograms;

public class OneToHundredWithoutLoop {
	
	public static int hundred(int x)
	{
		if(x == 101) {
			return 100;
		}else {
			System.out.println(x);
			x++;
			return hundred(x);
		}
	}
	
	public static void main(String[] args) 
	{
		int x =1;
		hundred(x);

	}

}
