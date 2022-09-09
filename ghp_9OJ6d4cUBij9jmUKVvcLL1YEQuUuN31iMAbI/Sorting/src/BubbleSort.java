import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5]  ;
	    int temp;
	    int tp; 
	    for(int i=0;i<5;i++)
	    {
	        tp=s.nextInt();
	        arr[i]=tp;
	    }
	    for(int i=0;i<4;i++)
	    {
	        for(int j=0;j<4;j++)
	        {
	            if(arr[j]>arr[j+1])
	            {
	                temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        System.out.print("\niteration: ");
	        System.out.print(i+1);System.out.print("\nArray: ");
	        for(int x=0;x<5;x++)
	        {
	            System.out.println(arr[x]);
	        }
	        
	}

}
