import java.util.*;
class QuickSort{
   public static void swap(int arr[],int first,int last){
        int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
		}
   public static int pivot(int arr[],int pivotIndex,int endIndex){
               int swapIndex=pivotIndex;
		for(int i=pivotIndex+1;i<=endIndex;i++){
		     if(arr[pivotIndex]>arr[i]){
				  swapIndex++;
				  swap(arr,swapIndex,i);
			   }
		}	   
                swap(arr,pivotIndex,swapIndex);
	        return swapIndex;
		}		
	public static void quickSortHelper(int arr[],int start,int end){
	        if(start<end){
			int pivotIndex=pivot(arr,start,end);
			quickSortHelper(arr,start,pivotIndex-1);
			quickSortHelper(arr,pivotIndex+1,end);
			}
        }
    public static void quickSort(int arr[]){
            quickSortHelper(arr,0,arr.length-1);
        }
     public static void main(String args[]){
            int arr[]={5,3,4,6,2,9,1,8,7};
			quickSort(arr);
			System.out.println(Arrays.toString(arr));
	}
	
}
