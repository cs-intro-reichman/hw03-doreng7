
public class UniqueChars
	{
		public static void main(String[] args)
		{
			 String str = args[0];
			 System.out.println(unique(str));
		}	 
		
			private static String unique(String s)
			{
				String ans = "";
				for(int i =0; i<=s.length()-1; i++)
				{
					char c = s.charAt(i);
					if(c == 32)
					{
						ans +=c;
					}
					else
					{
						if(ans.indexOf(c) == -1)
						{
							ans += c;
						}
					}
					
				}
				return ans;
			}
	}
	
			