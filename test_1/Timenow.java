import javax.swing.JOptionPane;
class Timenow 
{
	public static void main(String[] args) 
	{
		long timenow=System.currentTimeMillis();
		//GMT Gelingnizhi 1970.1.1.0:0:0 to now 's millis
		long totalsecond=timenow /1000;
		int currentsecond=(int)(totalsecond%60);
		long totalmin=totalsecond/60;
		int currentmin=(int )(totalmin%60);
		long totalhour=totalmin/60;
		int currenthour=(int )(totalhour % 24);

		String output=" NOW is " + currenthour +":"+ currentmin +":" + currentsecond +" GMT";
		JOptionPane.showMessageDialog(null,output);
		//with beijing shi cha 8 hours

		int currenthour1=currenthour+8; //xiuzheng shi cha
		String output1=" NOW is " + currenthour1 +":"+ currentmin +":" + currentsecond +" BeiJing";
		JOptionPane.showMessageDialog(null,output1);

		//System.out.println(timenow);
	}
}
