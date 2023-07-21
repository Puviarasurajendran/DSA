import java.util.*;
import java.lang.*;
class CountSort{
      public static void main(String args[]){
	     int arr[]={6,12,33,6,10,12,6,10,33,10,6,12};
		 countFrequency(arr);
	  
	  }
	  public static void countFrequency(int arr[]){
	        HashMap<Integer,Integer> hsm=new HashMap<>();
			for(int i:arr){
				if(hsm.containsKey(i)){
					hsm.put(i,hsm.get(i)+1);
				}
				else hsm.put(i,1);
			} 
        System.out.println(hsm.getvalues());

}
}