import java.util.*;
public class Graph{
    
    private HashMap<String,ArrayList<String>> grpl=new HashMap<>();
	public  boolean addVertex(String vertex){
	    if(grpl.get(vertex)==null){
	    grpl.put(vertex,new ArrayList<String>());
        return true;
	    }
	   return false;	
	}
	public boolean addEdges(String vertex1,String vertex2){
		if(grpl.get(vertex1)!=null&&grpl.get(vertex2)!=null){
		grpl.get(vertex1).add(vertex2);
		grpl.get(vertex2).add(vertex1);
		return true;
		}
		return false;
	}
	public boolean removeEdges(String vertex1,String vertex2){
		if(grpl.get(vertex1)!=null&&grpl.get(vertex2)!=null){
			grpl.get(vertex1).remove(vertex2);
			grpl.get(vertex2).remove(vertex1);
			return true;
		}
		return false;
		
	}
	public boolean removeVertex(String vertex){
		if(grpl.get(vertex)==null) return false;
		for(String s:grpl.get(vertex)){
			grpl.get(s).remove(vertex);
		}
		grpl.remove(vertex);
		return true;
	}
   public static void main(String[] args){
       Graph myGraph= new Graph();
	   myGraph.addVertex("A");
	   myGraph.addVertex("B");
	   myGraph.addVertex("C");
	   myGraph.addEdges("A","C");
	   myGraph.addEdges("A","B");
	   myGraph.addEdges("C","B");
	   //myGraph.removeEdges("A","C");
	   myGraph.removeVertex("C");
	   System.out.println(myGraph.grpl);
	   
	   
	   }
  
}