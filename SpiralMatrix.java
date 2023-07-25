import java.util.*;
public class SpiralMatrix{
    public static void main(String args[]){
	    Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
        int [][]arr=spiralPattern(n);
		for(int[] x:arr){
			for(int i:x){
				System.out.print(i+" ");
			}
			System.out.println();
		}
       			
	}
	public static int[][] spiralPattern(int n){
	    int [][]arr=new int[n][n];
		int top=0;
		int bottom=n-1;
		int left=0;
		int right=n-1;
		int k=01;
		while(top<=bottom && left<=right){
		    for(int i=left;i<=right;i++){
			    arr[top][i]=k++;	
			}
			top++;
			for(int i=top;i<=bottom;i++){
			    arr[i][right]=k++;
			}
			right--;
			
		       for(int i=right;i>=left;i--){
			      arr[bottom][i]=k++;
			    }
			    bottom--;
			
			
		    for(int i=bottom;i>=top;i--){
			    arr[i][left]=k++;
			}
		    left++;
		   	
		}	
		return arr;
	}
	
}
