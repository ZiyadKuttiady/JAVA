import java.io.*;
public class lab8
{
	public static void main(String args[])throws IOException
	{
		int a,b,x,y,t,hcf,lcm;
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two number : ");
		x=Integer.parseInt(scan.readLine());
		y=Integer.parseInt(scan.readLine());
		a=x;
		b=y;
		 while(b !=0)
		 {
		 	t=b;
		 	b=a%b;
		 	a=t;
		 }
		 hcf=a;
		 lcm=(x*y)/hcf;

		 System.out.println("HCF = " +hcf);
		 System.out.println("LCM = " +lcm);
	}
}
