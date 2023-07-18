package Arrays;

import java.util.Scanner;

public class Secondlargestelement {
	public static int[] print(int arr[]) {
		int start=0;
		int end = arr.length -1;
		int j = 1;
		while(j != 3)
		{
			for(int i=0;i<end;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			end = end - 1;
			j=j+1;
		}
		return arr;
}
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		System.out.print("Enter the "+ N + " elements: ");
		for(int i=0;i<N;i++)
		{
			arr[i] = scanner.nextInt();
		}	
		int result[] =print(arr);
		System.out.println("Second largest element is " +result[result.length - 2]);
	}
}


