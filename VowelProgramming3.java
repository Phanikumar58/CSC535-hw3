
public class VowelProgramming3 {
	public static void main(String[] args)
	{
		
		String s ="this is america";
		
		for(int i=0; i<s.length(); i++)
		{
			char vowel = s.charAt(i);
		    if( (vowel == 'a')||
		        (vowel == 'e')||
		        (vowel == 'i')||
		        (vowel == 'o')||
		        (vowel == 'u')||
		        (vowel == 'A')||
		        (vowel == 'E')||
		        (vowel == 'I')||
		        (vowel == 'O')||
		        (vowel == 'U')){
		            System.out.println(vowel);
		    }
		  
		}
	}
}
