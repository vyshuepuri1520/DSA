

public class linearseach {
    public static void main(String[] args)
    {
		int arr[] = {1,8,2,10,15,5};
		int search = 10;
		int temp = 0;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == search)
			{
				temp = -1;
				System.out.println("Find  "+arr[i]);
			}
		}
		if(temp!=-1)	
		System.out.println("Did not find the value");
	}
}
