//import java.util.Calendar;
//import java.util.Scanner;
import java.awt.*;
import java.util.*;

import javax.swing.*;

class Cal{
	public int Year;
	public int Month;
	public String year_with_month;
	public int days_in_C_month;
	//days  in curreent month
	public int day_start;
	
	public Cal() 
	{
		Scanner scanner = new Scanner(System.in);
		int Month = scanner.nextInt( );
		int Year = scanner.nextInt( );
		year_with_month = Year +"Äê" + Month + "ÔÂ";
		scanner.close();
		//Cal_day_of(Month,Year);
	}

	void Cal_day_of(){
		
		if (Month < 0 || Month > 12){
			Month = 4;			
			Year = 2017;
		}
		
		if( Year < 1970 ){
			Month = 4 ;
			Year = 2017;
		}	

		/*
			String[] DAYS ={ "Sunday","Monday","Tuesday",
			  "Wednesday","Thursday","Friday","Saturday" };

			String[] MONTHS = { "January","February","March","April",
			     "May","June","July","August","September",
			     "October","November","December"};
		*/
		
		Calendar c =Calendar.getInstance();
		c.set(Calendar.MONTH,Month-1);
		c.set(Calendar.YEAR,Year);
		c.set(Calendar.DATE,1);

		days_in_C_month = c.getActualMaximum(Calendar.DAY_OF_MONTH) ;
		//days  in curreent month
		day_start = c.get(Calendar.DAY_OF_WEEK)-1;
		//String W = DAYS[tmp] ;
	}
}

class Pimma {
	int days;
	JFrame cul= new JFrame();
	JPanel year = new JPanel();
	JPanel week = new JPanel();
	JPanel date = new JPanel();
	
	public Pimma(){
		Cal cal = new Cal();
		String year_1 = new String(cal.year_with_month);
		JTextField display1 = new JTextField(""+"\t"+year_1+"\t\t");
		year.add(display1);
		

        week.setLayout(new GridLayout(1,7));
		String[] DAYS ={ "Sunday","Monday","Tuesday",
				  "Wednesday","Thursday","Friday","Saturday" };
		for(int i= 0; i< 7 ;i++){
			JButton week_list = new JButton(""+DAYS[i]);
			week.add(week_list);	
		}
		
        //date.setLayout(new GridLayout( 5,7));
        days =cal.days_in_C_month;
		for( int i =0 ; i< (cal.day_start-1); i++){
			//JButton date_list = new JButton(""+"     ");
			JButton date_list = new JButton();
			date_list.setText(""+"     ");
			date.add(date_list);
		}
		
				
		for(int j = 0 ; j < cal.days_in_C_month; j++)
			{
			int a = j+1;
			String show = ""+ a;
			JButton date_list_1 = new JButton();
			date_list_1.setText(show);
			//JButton date_list_1 = new JButton(""+show);
			date.add(date_list_1);
			}
		}
        
	public void pim_test(){
		cul.setSize(500,700);
		cul.setTitle("PimManager_061");
		cul.setLayout(new BorderLayout());
		cul.add(year,BorderLayout.NORTH);
		cul.add(week,BorderLayout.CENTER);
		cul.add(date,BorderLayout.SOUTH);
		cul.setVisible(true);
	}
		

}

public class Test_1 {	
	public static void main(String[] args) 
	{	
		Pimma t1 =new Pimma();
		t1.pim_test();
	
	}
}
