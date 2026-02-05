package BasicPrograms;

public class SaggregationString {

	public static void main(String[] args) 
	{
		
		String s = "Hello2 god3 morning5";
		char[] str = new char[s.length()-1];
		char[] num = new char[s.length()-1];
		
		int x = 0;
		int y = 0;
		
		for(int i = 0; i<= s.length()-1 ; i++)
		{
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
			{
				num[x] = s.charAt(i); 
				x++;
			}
			else 
			{
				str[y] = s.charAt(i);
				y++;
			}
		}
		System.out.println(str);
		System.out.println(num);
		
		String z ="";
		String[] rev = (new String(str)).trim().split(" ");
		for(int i =rev.length-1; i>= 0 ; i--)
		{
			z = rev[i] + " ";
			
		}
		System.out.println(z);
	}

}
