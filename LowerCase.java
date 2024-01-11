
public class LowerCase
	{
		public static void main(String[] args)
		{
			//program that gets 3 lenghs and prints "true" if these 3 lenghs can form a triangle, otherwise prints "false"
			 
			 String Word = args[0]; 
			 String ans = "";
			 for(int i = 0; i< Word.length(); i++)
			 {
				
				if( ((int) Word.charAt(i) >= 65) && ((int) Word.charAt(i) <= 90) )
				{
					int character = ((int) Word.charAt(i)) + 32;
					char current = 0;
					current += character;
					ans += current;
					current = 0;
					
				} else {
				ans += Word.charAt(i);
				}
			 }
				System.out.println(ans);
				
                			
			 
		 
			 
			
		}
	}