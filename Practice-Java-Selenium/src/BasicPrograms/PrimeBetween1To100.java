package BasicPrograms;

public class PrimeBetween1To100 {

	public static void main(String[] args) 
	{	
		int count =3;
		boolean flag = false;
		System.out.print("The Prime No. Between 1-100 are :-1 2 3 ");
		for(int i =4 ; i<=100 ; i++)
		{
			for(int j=2; j <= i/2 ; j++) 
			{
				if(i%j == 0) {
					flag = true;
					break;
				}else {
					flag = false;
					
				}
			}
			if(flag == false) {
				count++;
				System.out.print(i+",");
			}
		}System.out.println("\nThe count is :- "+count);

	}

}
