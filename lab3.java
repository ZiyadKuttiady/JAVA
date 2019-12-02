// 3.	Write java program to display Armstrong numbers within a range.

import java.io.*;

public class lab3{
	public static void main(String [] Args) throws IOException{
		int num,sum,r,t,temp,stno,enno;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Starting Range:");
		stno = Integer.parseInt(br.readLine());
		System.out.println("Enter the Ending Range:");
		enno = Integer.parseInt(br.readLine());

		for (num = stno;num<enno;num++){
			temp = num;
			sum = 0;
			while(temp!=0){
				r = temp%10;
				temp = temp/10;
				sum =sum +(r*r*r);
			}
			if(sum == num){
				System.out.println(num);
			}
		}

	}
}