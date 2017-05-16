public class Course1 
{
	public static void main(String[] args) 
	{
		int len = args.length;
		int i;
		//String result;
		Student newStu = new Student();
			for(i = 0;i < len;i++)
			{
				long sid = 0;
				// sex = 1;
				String book = " ";
				String result = " ";
				try{
					//sid = 0;
						sid = Integer.parseInt(args[i]);}
					catch(Exception io){
						book = args[i];
					}

				sid = newStu.student(sid);
				book = newStu.student(book);
				//if(sid == 0)
				//    continue;
				//else 
					result = sid + " choose " + book ;
					
				System.out.print(result);
			}
		//newStu.sid=Long.parseLong(args[0]);
		//System.out.print(result);
	}
}

	class Student
	{
		public long sid;
		public char sex;
		public String book;

		void student (){
			}

		long student(long sid){
			this.sid = sid;
			return sid;
			}

		String student(String book){
			this.book = book;
			return book;
			}
	}

	class Book 
	{
		public String book;
		void book () 
		{
			
		}
	}
