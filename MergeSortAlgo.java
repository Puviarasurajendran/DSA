import java.util.*;
public class MergeSortAlgo{
   public static void main(String args[]){
            int arr[]={5,3,4,6,2,9,1,8,7};
			SortAlgo sorting=new SortAlgo();
			int aes[]=sorting.mergeSort(arr);
			System.out.println(Arrays.toString(aes));
			}

}

  class SortAlgo{
    public static int[] merge(int arr1[],int arr2[]){
	    int i=0,j=0,index=0;
		int[] combined=new int[arr1.length+arr2.length];
		while(i<arr1.length && j < arr2.length){
		    if(arr1[i]<arr2[j]){
			   combined[index]=arr1[i];
			   index++;
			   i++;
			}   
			else{
			     combined[index]=arr2[j];
				 j++;
				 index++;
			    }
			}
		    while(i<arr1.length){
			    combined[index]=arr1[i];
				i++;
				index++;
			}
			while(j<arr2.length){
			    combined[index]=arr2[j];
				j++;
				index++;
			
			}
		
		return combined;
	}
	

   public static int[] mergeSort(int arr[]){
            if(arr.length==1) return arr;
			int mid=arr.length/2;
			int left[]=Arrays.copyOfRange(arr,0,mid);
			int right[]=Arrays.copyOfRange(arr,mid,arr.length);
        return merge(mergeSort(left),mergeSort(right));  
   }


}