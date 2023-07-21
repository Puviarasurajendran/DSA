import java.lang.*;
import java.util.*;
class BubbleSort7{
      public static void main(String args[]){
	     int arr[]={6,12,3,2,1,33,1};
		 for(int i=1;i<arr.length;i++){
		  for(int j=0;j<arr.length-i;j++){
		    if(arr[j]>arr[j+1]){
			    int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}	
}	