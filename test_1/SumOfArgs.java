/*this programe is doing that:
		----	a class named SumOfArgs that will print out 
		----    the sum of all integer arguments found on the command line. 
	@author 吕学民 14130110061 mouron@qq.com
*/

class SumOfArgs 
{
	public static void main(String[] args)   //参数 是一个字符串数组
	{
		int len=args.length;
		int i,sum=0;
		for(i=0;i<len;i++)
			{
				int tmp;
				//int ival=Integer.parseInt(args[i]);  作用域 cannot
				try{
					tmp=Integer.parseInt(args[i]);}
					catch(Exception i1){
						tmp=0;		//get the Exception when String[i] integer.parseInt failed
									// (int) 强制转换会出错 ?
									//no , eg .int num2 = (int) System.currentTimeMillis() * 7 % 10 ;
									// use GET millis get random number
					}
				sum+=tmp;
			}	
		System.out.println(sum);
	}
}
