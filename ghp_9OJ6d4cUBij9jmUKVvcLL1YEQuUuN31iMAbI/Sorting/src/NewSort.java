import java.util.*;
public class NewSort {
public static void Main(String[] args) {
	int arr[]=new int[5];
	Scanner s=new Scanner(System.in);
    int temp,i=0,id;
    int tp;
    for(int x=0;x<5;x++)
    {
        tp=s.nextInt();
    	arr[x]=tp;
    }
    while(arr[i]!=arr[4])
    {    temp=arr[i];
        for(int x=i+1;x<5-i;x++)
        {
            if(arr[i]>arr[x] && temp>arr[x]){
                temp=arr[x];
                id=x;
            }
        }
        if(temp!=arr[i])
        {
            arr[id]=arr[i];
            arr[i]=temp;
        }
        i++;
        System.out.print("\niteration");
        System.out.print("\narray:\t\n");
        for(int k=0;k<5;k++)
        {
            System.out.println(arr[k]);
        }
}
}}

