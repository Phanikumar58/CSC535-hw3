
public class Digits {
	public static void main(String[] args)
	{
		
         String s ="hello1230";
		
		for(int i=0; i<s.length(); i++)
		{
			char number = s.charAt(i);
		if((number == '1')||
		   (number == '2')||
		   (number == '3')||
		   (number == '4')||
		   (number == '5')||
		   (number == '6')||
	       (number == '7')||
	       (number == '8')||
	       (number == '9')||
	       (number == '0'))
				
			{
				System.out.println(number);
			}
				
				
		  	}
		
		    
		}
	}

