/*this programe is doing that:
		----	a class named SumOfArgs that will print out 
		----    the sum of all integer arguments found on the command line. 
	@author ��ѧ�� 14130110061 mouron@qq.com
*/

class SumOfArgs 
{
	public static void main(String[] args)   //���� ��һ���ַ�������
	{
		int len=args.length;
		int i,sum=0;
		for(i=0;i<len;i++)
			{
				int tmp;
				//int ival=Integer.parseInt(args[i]);  ������ cannot
				try{
					tmp=Integer.parseInt(args[i]);}
					catch(Exception i1){
						tmp=0;		//get the Exception when String[i] integer.parseInt failed
									// (int) ǿ��ת������� ?
									//no , eg .int num2 = (int) System.currentTimeMillis() * 7 % 10 ;
									// use GET millis get random number
					}
				sum+=tmp;
			}	
		System.out.println(sum);
	}
}
