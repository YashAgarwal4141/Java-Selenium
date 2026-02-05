package BasicPrograms;

public class CheckPalindrome {

	public static void main(String[] args) 
	{
		int num = 121;
		int palindrome = num;
		int x = 0;
		while(num != 0)
		{
			x = x*10 + num%10;
			num = num/10;
		}
		System.out.println(x);
		
		if(palindrome == x) {
			System.out.println("This is palindrome");
		}
	}

}
