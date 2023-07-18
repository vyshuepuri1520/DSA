

public class selectionsort {
    public static int[] print(int arr[])
	{
		int n=arr.length;//6
		for(int i=0;i<n;i++)
		{
            int temp=i;
            for(int j=i;j<n;j++)
            {
                if(arr[temp]>arr[j])
                {
                    temp=j;
                }
            }
            int sm=arr[temp];
            arr[temp]=arr[i];
            arr[i]=sm;
	    }
		return arr;
   }
	public static void main(String[] args)
    {
		int arr[]= {6,5,2,7,3,4};
		int res[]=print(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}

}
