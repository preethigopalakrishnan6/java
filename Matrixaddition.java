package prees;
import java.util.Scanner;
public class Matrixaddition {
	public static void main (String args[]){
		int rows=2, columns=3;
		int[][] firstMatrix={{10,10,10},{28,28,28}};
		int [][]secondMatrix={{28,28,28},{10,10,10}};
		//adding two matrices
		int[][] sum =new int [rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){		
				sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
			}
			}
//displaying the result
		System.out.println("Sum of two matrices is: ");
		for(int[]row : sum){
			for (int column:row){
				System.out.println(column+"   ");
			}
			System.out.println();	
			}
		}
	}
