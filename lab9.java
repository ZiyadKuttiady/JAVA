import java.io.*;
public class lab9
{
	public static void main(String[] args) {
	int i,j;
	System.out.println("Enter total rows and columns:");
	BufferedReader s = new BufferedReader(inputStreamReader(System.in));
	int row = s.nextInt();
	int column = s.nextInt();
	int array[][]=new int[row][column];
	System.out.println("Enter matrix :");
	for(i=0;i<row;i++){
	for(j=0;j<column;j++){
		array[i][j] = s.nextInt();
		System.out.print(" ");
	}
	}
	System.out.println("The above matrix before Transpose is");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++){
			System.out.println(array[i][j]+"");
		}
		System.out.println("The above matrix after salma is ");
		for (i=0;i<column;i++) {
			for(j=0;j<row;j++){
				System.out.println(array[j][i]+"");

			}
			System.out.println(" ");
		}
			}
	}