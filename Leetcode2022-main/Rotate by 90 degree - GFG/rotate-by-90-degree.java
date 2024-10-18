// { Driver Code Starts
//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class DriverClass
{
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            
            GFG g = new GFG();
            g.rotate(arr);
            printMatrix (arr);
        }
	} 
	
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG
{
    static void transpose(int mat[][]){
        int n =  mat.length;
        int m =   mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int t = mat[i][j];
                mat[i][j] =  mat[j][i];
                mat[j][i] =  t;
            }
        }
    }
    
    static void reverseColumn(int mat[][]){
        int n  =  mat.length;
        int m =  mat[0].length;
        
        // iteratae number of column times 
        for(int j=0;j<m;j++){
            int a =  0, b =  n-1;
            while(a<b){
                int t =  mat[a][j];
                mat[a][j] =  mat[b][j];
                mat[b][j] =  t;
                a++;
                b--;
            }
        }
        
    }
    
    
    
    static void rotate(int matrix[][]) 
    {
        transpose(matrix);
        reverseColumn(matrix);
        
        
    }
}