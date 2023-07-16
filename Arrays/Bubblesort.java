package Arrays;

public class Bubblesort
{
    public static int[] print(int arr[])
    {
		int start=0;
		int end = arr.length -1;
		while(start<end)
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
		}
		return arr;
    }

	public static void main(String[] args)
    {
		int arr[]= {6,9,5,1,3,8,7};
		int result[] =print(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
}
