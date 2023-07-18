import java.util.Scanner;

public class Rotatearray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.print("Enter the " + n + " elements of the array: ");
		int arr[] = new int[n];
		for(int i = 0 ;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the no.of times array to be rotated: ");
		int k = sc.nextInt();
		int s = k;
		int end = n;
		int e = n;
		for(int i = 0;i < (end/2);i++)
		{
			int temp = arr[i];
			arr[i] = arr[n-1];
			arr[n-1] = temp;
			n = n - 1;
		}
		for(int i=0;i<(k/2);i++)
		{
			int temp = arr[i];
			arr[i] = arr[k-1];
			arr[k-1] = temp;
			k = k - 1;
		}
		int q = s;
		while(q < e) 
		{
			int temp = arr[q];
			arr[q] = arr[e-1];
			arr[e-1] = temp;
			q++;
			e--;
		}
		for(int j = 0;j < end;j++)
		{
			System.out.print(arr[j]+ " ");
		}
	}

}