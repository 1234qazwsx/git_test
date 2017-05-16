import java.util.Scanner;
import java.lang.*;

public class BusMenanager 
{
	int current_passager = 0 ;
	

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Bus_manager System.");
		Scanner scanner = new Scanner(System.in);
		Bus_station New_Bus_Station =new Bus_station() ;
		System.out.println("Please input the start station num ,this num is between 1 - 8 ");
		int start_station_num = scanner.nextInt();
		if((start_station_num < 1)||(start_station_num > 8))
		{
				System.out.println("Please input the legal start station num ,this num is between 1 - 8 ");
				start_station_num = scanner.nextInt();
		}

		Bus New_bus = new Bus();

		do
		{
			String others = "the " + start_station_num + "th station "
								+ New_Bus_Station.Bus_station_list[start_station_num-1];
			Bus.Bus_running(start_station_num-1, New_Bus_Station.Bus_station_list);

			New_Bus_Station.Bus_station(start_station_num-1,others);
			
			New_Bus_Station.Bus_station_Added(start_station_num-1,others);


			int Passager_left_out_bus = New_bus.passager_left_out_bus(start_station_num-1,others);
			New_bus.current_pssager -= Passager_left_out_bus;
			New_Bus_Station.First_Passager[start_station_num-1] += Passager_left_out_bus;

			int Passager_get_in_bus = New_bus.passager_get_in_bus(start_station_num-1,others);
			New_bus.current_pssager += Passager_left_out_bus;
			New_Bus_Station.First_Passager[start_station_num-1] -= Passager_get_in_bus;

			if(New_Bus_Station.First_Passager[start_station_num-1] > New_Bus_Station.Max_Passager[start_station_num-1])
			{					
					Bus Ask_bus = new Bus();
					Ask_bus.If_ask_bus(others);

					Ask_bus.current_pssager = 0 ;
					int Passager_get_in_ask_bus = Ask_bus.passager_get_in_bus(start_station_num - 1,others);
					Ask_bus.current_pssager += Passager_get_in_ask_bus;
					New_Bus_Station.First_Passager[start_station_num-1] -= Passager_get_in_ask_bus;

			}





			//New_Bus_Station.First_Passager[start_station_num] = New_Bus_Station.First_Passager[start_station_num] + 


			start_station_num = ( start_station_num + 1 )% 8;

		}
		while (New_bus.Bus_state);


		/*
		for(int i = 0 ; i < 8; i ++){
			Passager New_passager = new Passager();
			New_passager.passager_adding(i , New_Bus_Station.Bus_station_list, New_passager.Adding_num);
		}
		*/

		//System.out.println("Hello World!");
	}
}

class  Passager
{
		int Adding_num ; 
		//Math New_math = new Math();

		Passager()
		{
			Adding_num = (int)(Math.random() * 10 );
			//System.out.println("The passager is adding");
		}

}

class Bus_station
{
	int Station_num = 0 ;
	String [] Bus_station_list = {"A1","A2","A3","A4","B1","B2","B3","B4"};
	int [] First_Passager = {0 ,5 , 7 ,4 ,6 ,7 ,10 ,2};
	// at first waiting in the station
	int [] Max_Passager = {5 , 15, 20 ,20 , 15 , 15, 20 ,20 };
	// every station's max waiting  passager

	public void Bus_station(int i ,String others)
	{
			System.out.print("There are " + First_Passager[i] + "  passager waiting in "+ others + "\n");
	}



	public void Bus_station_Added(int i ,String others)
	{
		System.out.println("If the " + (i+1) + "th station will add passagers ? ");
		Scanner Bus_station_Added_scanner = new Scanner(System.in);
 		String station_answer = Bus_station_Added_scanner.next();
			if(station_answer.equalsIgnoreCase("yes"))
			{
				Passager New_passager = new Passager();
				System.out.println("There are "+ New_passager.Adding_num + " passagers adding in "+ others);
				First_Passager[i] += New_passager.Adding_num;
			}
	}



	public void Bus_station_Left(int i ,int Left_num ,int [] First_Passager)
	{
		First_Passager[i] -= Left_num;
	}

	
}

class  Bus
{
	Boolean Bus_state = true ;
	int current_pssager = 20;  //

	Bus(){
	
	}

	public static void Bus_running( int Station_num , String [] Bus_station_list)
	{
		System.out.println("The bus is in the " + Bus_station_list[Station_num]+ " Station ");
		
	}

	public int passager_left_out_bus(int Station_num , String others)
	{	
			System.out.println("If there are passagers get out bus in " + Station_num + "th station ? ");
			Scanner Bus_out_answer_scanner = new Scanner(System.in);
			String Bus_out_answer = Bus_out_answer_scanner.next();
			Passager New_passager_out_bus = new Passager();

			if(Bus_out_answer.equalsIgnoreCase("yes"))
				{
					System.out.println("There are " + New_passager_out_bus.Adding_num + 
						" passagers get out bus in " + others + "\n");
				}

			return New_passager_out_bus.Adding_num;
	}

	public int passager_get_in_bus(int Station_num , String others)
	{	

			System.out.println("If there are passagers get in bus in " + Station_num+ "th station ? ");
			Scanner Bus_in_answer_scanner = new Scanner(System.in);
			String Bus_in_answer = Bus_in_answer_scanner.next();
			Passager New_passager_in_bus = new Passager();

			if(Bus_in_answer.equalsIgnoreCase("yes"))
				{
					
					System.out.println("There are " + New_passager_in_bus.Adding_num + 
						" passagers get in bus in " + others + "\n");
				}

			return New_passager_in_bus.Adding_num;
	}

	public void If_ask_bus( String others)
	{
		System.out.println("A new bus is coming towards " + others );
	}

}



