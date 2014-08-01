import java.io.*;
class pg3a {
	void check(int a,int b)
	{
		try
		{
			if(b==0)throw new ArithmeticException("divide_by_zero");
			System.out.println("result\t="+a/(float)b);
		}
		catch(ArithmeticException ae)
		{System.out.println(ae);}
	}
	public static void main(String args[])throws IOException
	{
		pg3a obj=new pg3a();
		String s1=" ";int a=0,b=0,f=0;
		BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
		while(f==0)
		{
			try
			{
				if(f==1)break;
				System.out.println("enter two integer");
				try
				{
					s1=dataIn.readLine();
					a=Integer.parseInt(s1);
					s1=dataIn.readLine();
					b=Integer.parseInt(s1);
					obj.check(a,b);
				}
				catch(NumberFormatException io)
				{
					f=1;
					System.out.println(io);
				}
			}
		finally
		{
			if(f==0)
				System.out.println("Processed");
			else
				System.out.println("Terminated");
		}
		}
	}
}
