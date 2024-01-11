
public class Calendar0
	{
		public static void main(String[] args)
		{
			 
			int year = Integer.parseInt(args[0]);
		    isLeapYearTest(year);
		    nDaysInMonthTest(year);
		}	 
		
			private static void isLeapYearTest(int year) 
			{
				String commonOrLeap = "common";
				if (isLeapYear(year)) 
				{
				commonOrLeap = "leap";
				}
				System.out.println(year + " is a " + commonOrLeap + " year");  
			}
	
			public static boolean isLeapYear(int year)
			{
	        
				if( (year % 4 == 0 || year % 100 == 0))
				{
					return true;
				}
				else
				{
					return false;
				}

			}
			
			
			private static void nDaysInMonthTest(int year)
			{
				for(int i= 1; i<=12; i++)
				{
					System.out.println ("Month " + i + " has " + nDaysInMonth(i, year)  + " days");	
				}
			}
			
			
			
			
			public static int nDaysInMonth(int month, int year) 
			{
		         int Num_Of_Days = 31;
				 if(isLeapYear(year))
				 {
					 if(month == 2)
					 {
						 Num_Of_Days = 29;
					 } 
					  if(month == 4 || month == 6 || month == 9 || month == 11 )
					 {
					     Num_Of_Days = 30;	 
					 }
					 
				 }
                 else 
				 {	
				 if(month == 2)			 
				 {   
			      Num_Of_Days = 28;
				 }
				  if(month == 4 || month == 6 || month == 9 || month == 11 )
					 {
					     Num_Of_Days = 30;	 
					 }
				 }				 
					 
		     return Num_Of_Days;
			}
			
			
				
                			
			 
		 
			 
			
		
	}