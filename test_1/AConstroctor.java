	class Rock 
	{
		Rock(){
			System.out.println("Creating rock ...");
			}
	}

	class Rock1
	{
		Rock1(int i){
			System.out.println("Creating rock ..." + i);
			}
	}

	public class AConstroctor
	{
		public static void main(String args[]){
			for(int i = 0; i < 10 ; i ++)
				// new Rock();
					new Rock1(i);
		}
	}
