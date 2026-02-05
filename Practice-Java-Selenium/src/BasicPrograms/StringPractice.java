package BasicPrograms;

public class StringPractice 
{

	static String s2;
	public static void main(String[] args) 
	{
//		String str = "This is String Program";
//		String str1  = "Thanx";
//		
//		String srt2 = new String("This is using New Keyword");
		
		StringPractice obj = new StringPractice();
		obj.printString();
		
		System.out.println(s2);
		
		char[] ch = {'I','r','o','n'};
		System.out.println(ch);
		obj.convertACharArrayToString(ch);
		
		
	}
	
	void printString()
	{
		System.out.println(s2);
	}
	
	void convertACharArrayToString(char[] ch)
	{
		String chs = new String(ch);
		System.out.println(chs);
	}

}
