public class Course
{
	public static void main(String[] args) 
	{
		int len = args.length;
		int i;
		//String result;
		Student newStu = new Student();
		Book newBook = new Book();
			for(i = 0;i < len;i++)
			{
				long sid = 0;
				// sex = 1;
				String book = "";
				String result = "";
				String bookand = "";
				//try{
					//sid = 0;
					if(i==0)
						sid = Long.parseLong(args[i]);//}
					//catch(Exception io){
					else
							book = args[i];
					//}

				sid = newStu.student(sid);
				//System.out.println(sid);
				book = newStu.student(book);
				//System.out.println(book);
				bookand = newBook.bookand(book);
				System.out.print(bookand);
				//if(sid == 0)
				//    continue;
				//else 
				//	if(sid==0){
				//			tmp = result;
				//			result="";
				//			System.out.print(tmp);
				//		}		
				//	else
					if(sid==0)
						continue;
					else
						{
							//if(bookand == " and ")
							//	result = sid + " choose ";
							//else
								result = sid + " choose " + bookand ;
						}
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
		public String bookand;
		String bookand (String bookand) 
		{
			String book1;
			if(bookand == "")
			    book1 = bookand;
			else
				book1 = bookand + " and ";
			//this.bookand = bookand + "and";
			return book1;
		}
	}
