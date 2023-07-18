

import java.util.Scanner;

public class Additionof2matrix
{
    public int[][] Matrix(int rows,int col)
    {
        int arr[][] = new int[rows][col];
        System.out.print("Enter the "+rows*col+" Elements: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < rows;i++)
        {
            for(int j = 0;j < col;j++)
            {
                
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public int[][] result(int[][] m1,int[][] m2,int r,int c)
    {
        int rm[][] = new int[r][c];
        for(int i = 0;i < r;i++ )
        {
            for(int j = 0;j < c;j++)
            {
                rm[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return rm;
    }
    public void printMatrix(int matr[][],int r,int c)
    {
        for(int i = 0;i < r;i++ )
        {
            for(int j = 0;j < c;j++)
            {
                System.out.print(matr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Additionof2matrix mat = new Additionof2matrix();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the columns: ");
        int c = sc.nextInt();
        int matrix1[][] = mat.Matrix(r,c);
        System.out.println("Matrix1 is : " );
        mat.printMatrix(matrix1, r, c);
        int matrix2[][] = mat.Matrix(r,c);
        System.out.println("Matrix2 is : ");
        mat.printMatrix(matrix2, r, c);
        int res[][] = mat.result(matrix1,matrix2,r,c);
        System.out.println("Result matrix is");
        mat.printMatrix(res, r, c);
    }
}