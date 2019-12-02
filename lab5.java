// 5.	Read an array of 10 or more numbers and write a program to find the
// a) Smallest element in the array
// b) Largest element in the array
// c) Second largest element in the array


import java.io.*;

public class lab5{
	public static void main(String []Args)throws IOException{
		int [] a = new int [10];
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0;i<10;i++){
			System.out.println("Enter the "+i+" Element");
			a[i]= Integer.parseInt(br.readLine());
		}
		int small = a[0];
		for(int i = 0;i<10;i++){
			if(a[i]>small){

			}
			else{
				small = a[i];
			}
		}
		System.out.println("Smallest is "+small);
		int large = a[0];
		for(int i = 0;i<10;i++){
			if(a[i]<large){

			}
			else{
				large = a[i];
			}
		}
		System.out.println("Largest is "+large);

		int largetwo = large;
		for(int i = 0;i<10;i++){
			if(a[i]<large){

			}
			else{
				large = a[i];
			}
		}
		System.out.println("Second Largest is "+large);
	}
}