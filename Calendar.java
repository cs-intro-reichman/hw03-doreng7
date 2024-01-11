
public class Calendar
	{
		static int dayOfMonth = 1;   
	    static int month = 1;
	    static int year = 1900;
	    static int dayOfWeek = 2; 
		public static void main(String[] args) {
            
            int year_user=Integer.parseInt(args[0]);			
			while(year < year_user) {
			  advance();
			}  
            if(year == year_user)
			{
			advance1();
			}
			
									
		}
		
		
			public static void advance()
			{
				for(month =1 ; month<=12; month++)
				{
					for(dayOfMonth =1; dayOfMonth<=nDaysInMonth(month,year); dayOfMonth++)
					{
						dayOfWeek = (dayOfWeek+1) % 7;
					}
				}
				year++;
			}
			
			public static void advance1(){
			for(month =1 ; month<=12; month++)
				{
					for(dayOfMonth =1; dayOfMonth<=nDaysInMonth(month,year); dayOfMonth++)
					{
						if(dayOfWeek == 1)
						{
							System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
						}
						else{
						System.out.println(dayOfMonth + "/" + month + "/" + year);
						}
						dayOfWeek = (dayOfWeek+1) % 7;
					}
				}
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
			
			
			
			
			public static int nDaysInMonth(int month, int year) 
			{
		         int Num_Of_Days = 31;
				 if(isLeapYear(year))
				 {
					 if(month == 2)
					 {
						 Num_Of_Days = 28;
					 }
				 }
					 if(month == 4 || month == 6 || month == 9 || month == 11 )
					 {
					     Num_Of_Days = 30;	 
					 }
					 if(month == 2)
					 {
						 Num_Of_Days = 28;
					 }
					 
					 
		     return Num_Of_Days;
			}
                			
			 
		 
			 
			
		
	}