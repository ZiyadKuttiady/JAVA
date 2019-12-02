// 7.	Write a program to merge two arrays.

import java.io.*;

public class lab7{
	public static void main (String [] Args) throws IOException{
			int [] a = new int[10];
			int [] b = new int[10];
			int [] c = new int[20];

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Elements In First Array:");
			for(int i = 0;i<10;i++){
				System.out.println("Enter "+i+" Element In First Array:");
				a[i]=Integer.parseInt(br.readLine());
			}
			System.out.println("Enter Elements In Second Array:");
			for(int i = 0;i<10;i++){
				System.out.println("Enter "+i+" Element In Second Array:");
				b[i]=Integer.parseInt(br.readLine());
			}
			for(int i = 0;i<10;i++){
					c[i] = a[i];
			}
			for(int i = 0;i<10;i++){
					c[10+i] = b[i];
			}
				System.out.println("Array After Merging is...");
			for(int i=0;i<20;i++){
				System.out.println("Element in "+i+" is "+c[i]);
			}
	}
}