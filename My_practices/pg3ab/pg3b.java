import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
class odd extends Thread
{
	String name;
	int n=0;
	odd(String Name,int N)
	{
		name=Name;
		n=N;
	}
public void run()
{
	System.out.println(name+"is starrted");
	int sum=0;
	for(int i=1;i<n;i+=2)
	{
		sum+=i;
		System.out.println(name+"\t i="+i+"\todd sum="+sum);
		try
		{
			sleep(1000);
			
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
	System.out.println(name+"\tFinal odd sum="+sum);
		}
	}
class even extends Thread
{
	String name;
	int n=0;
	even(String Name,int N)
	{
		name=Name;
		n=N;
	}
	public void run()
	{
		System.out.println(name+"is starrted");
		int sum=0;
		for(int i=0;i<n;i+=2)
		{
			sum+=i;
			System.out.println(name+"\t i="+i+"\todd sum="+sum);
			try
			{
				sleep(1000);
				
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
		System.out.println(name+"\tFinal even sum="+sum);
			}
		}
public class pg3b
	{
	public static void main(String[] args) throws IOException
	{
		int n=0;
		String s=" ";
		BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter n value for threads");
		try
		{
			s=dataIn.readLine();
			n=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		odd oddobj=new odd("oddThread",n);
		even evenobj=new even("evenThread",n);
		System.out.println("odd Thread is alive:"+oddobj.isAlive());
		System.out.println("even Thread is alive:"+evenobj.isAlive());
		oddobj.start();
		evenobj.start();
		}

	}

