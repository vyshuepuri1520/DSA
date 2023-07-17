package Arrays;

import java.util.Scanner;

public class binarysearch {
    public int[] sorting(int[] arr)
    {
        int start1 = 0;
        int len = arr.length-1;
        while(start1 < len)
        {
            for(int j = 0;j < len;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
                }
            }
            len = len-1;
        }
        return arr;
    }
    public void bsearch(int[] arr,int s)
    {
        int start = 0;
        int end = arr.length - 1;
        int value = 0;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(arr[mid] == s)
            {
                value = -1;
                System.out.println("Found the element: "+s);
                break;
            }
            if(arr[mid] < s)
            {
                end = mid - 1;
            }
            else if(arr[mid] > s)
            {
                start = mid + 1;
            }
        }
        if(value == 0)
        {
            System.out.println("Element is not found: "+s);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the "+n+" elements: ");
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        binarysearch bs = new binarysearch();
        int[] sort = bs.sorting(arr);
        System.out.print("\nEnter the element to be searched: ");
        int search = sc.nextInt();
        bs.bsearch(sort,search);
    }   
}
