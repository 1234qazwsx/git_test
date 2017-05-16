/*this programe is doing that:
-----a class named "cal"  print out to standard output the calendar for any month. 
----get command line arguments for a numeric month and year, 
----and print the calendar for that month in the format displayed below.
----If there are no command line arguments, or if the command line arguments are not a valid month and year,
---- print the calendar for the current month.		

	@author 吕学民 14130110061 mouron@qq.com
*/

import java.util.Scanner;
import java.util.*;

public class Cal 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int Month = scanner.nextInt( );
		int Year = scanner.nextInt( );

		if (Month < 0 || Month > 12)
			{
				Month = 4;			
				Year = 2017;
			}
		if( Year < 1970 )
		{
			Month = 4 ;
			Year = 2017;
		}	

	    String[] DAYS ={ "Sunday",
				  "Monday",
				  "Tuesday",
				  "Wednesday",
				  "Thursday",
				  "Friday",
				  "Saturday" };

		 String[] MONTHS = { "January",
				     "February",
				     "March",
				     "April",
				     "May",
				     "June",
				     "July",
				     "August",
				     "September",
				     "October",
				     "November",
				     "December"};

			Calendar c =Calendar.getInstance();
			c.set(Calendar.MONTH,Month-1);
			c.set(Calendar.YEAR,Year);
			c.set(Calendar.DATE,1);

			int D = c.getActualMaximum(Calendar.DAY_OF_MONTH) ;
			//days  in curreent month
			int tmp = c.get(Calendar.DAY_OF_WEEK)-1;
			String W = DAYS[tmp] ;
			//start week


			System.out.println(Year +"年" + Month + "月");
			System.out.println( "  Mon  Yue  Wed  Thu  Fri  Sat  Sun  ");//weith is 5

			int i ,j ,k ;
			for( i =0 ; i< tmp -1; i++)
				System.out.print("     ");
			for(j = 0, k= tmp ;j< D; j++,k++)
			{

				
				System.out.printf("%5d", j+1);
				if(k%7==0)
				{
					System.out.print("\n");
				}
			}
				
			//System.out.print( D) ;
			//			System.out.print( tmp) ;

	}
}
