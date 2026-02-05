
public class StringReversal {

	public static void main(String[] args) 
	{
		// Reversing the String Word by word wise
		String s = "This IS my Name";
		String[] arr=s.split(" ");
		String Rev = "";
		for(int i = arr.length -1 ; i>= 0 ; i--)
		{
			Rev = Rev + arr[i] + " ";
		}
		System.out.println(Rev.trim());
		
		// reversing a string letter by letter
		char[] c = new char[s.length()];
		int j= 0;
		for(int i = s.length()-1; i>=0; i--)
		{
			c[j] = s.charAt(i);
			j++;
		}
		System.out.println(new String(c));
		
		//reversing a string letter by letter inside the Reversed array
		String[] reverse = Rev.trim().split(" ");
		String demo ="";
		for(int i = 0; i<reverse.length ; i++) {
			int x = 0;
			char[] ch = new char[reverse[i].length()];
			for(int k = reverse[i].length()-1; k>= 0 ; k-- )
			{
				ch[x] = reverse[i].charAt(k);
				x++;
			}demo =demo + new String(ch) +" ";
			
		}System.out.println(demo);
	}

}
