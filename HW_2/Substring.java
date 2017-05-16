/*this programe is doing that:
-----a class named Substring that will expect the first command line argument to be a string, 
-----and the second two command line arguments to be integers,
-----the first will be used as an index and the second as a length. 
-----The output is the subtring of string starting at the index and of the specified length.		

	@author ÂÀÑ§Ãñ 14130110061 mouron@qq.com
*/

import java.lang.String;
import java.util.Scanner;
public class  Substring 
{
	public static void main(String[] args) 
	{
		do{
			Scanner scanner = new Scanner(System.in);
			String Subs = scanner.next( );
			int Index = scanner.nextInt( );
			int Len = scanner.nextInt( );
			int fact_len = Subs.length( );
			String message ;
			if( Len>= fact_len )
					 message = Subs.substring(Index);
			else
					 message = Subs.substring(Index, Index+Len);
			// left ws not be included

			System.out.println( message );
		}while (1+1==2 ); 

		/*Char [ ] chars = Subs.toCharArray( );
		int i, j;
		for( i =Index , j = 0; j < Len ;  i++, j++ )
			 System.out.print(chars [ i ] );
			 */
	}
}
