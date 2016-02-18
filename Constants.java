
public class Constants {
	public static void main(String[] args)
	{
		
		String s ="This is america";
		
		for(int i=0; i<s.length(); i++)
		{
			char word = s.charAt(i);
		    if( !((word == 'a')||
		        (word == 'e')||
		        (word == 'i')||
		        (word == 'o')||
		        (word == 'u')||
		        (word == 'A')||
		        (word == 'E')||
		        (word == 'I')||
		        (word == 'O')||
		        (word == 'U'))){
		            System.out.println(word);
		    }
		    
		}
	}
}
