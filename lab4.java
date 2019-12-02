// 4.	Given the sides of a triangle, write a program to check whether the triangle is equilateral, isosceles or scalene and find its area.

import java.io.*;

public class lab4{
	public static void main(String [] Args) throws IOException{
		int a,b,c;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter the First Side Value");
		a = Integer.parseInt(br.readLine());

		System.out.println("Enter the Second Side Value");
		b = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the Third Side Value");
		c = Integer.parseInt(br.readLine());
		
		if (a==b&&a==c){
			System.out.println("This is a Equilateral Triangle");
		}
		else if(a==b||a==c||b==c){
			System.out.println("This is a Isosceles Triangle");
		}
		else{
			System.out.println("This is a Scalene  Triangle");
		}
	}
}