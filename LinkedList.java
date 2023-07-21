import java.util.*;
class LinkedList{
      private Node head;
	  private Node tail;
	  private int length;
	  
	  class Node{
	      int value;
		  Node next;
		  Node(int value){
		    this.value=value;
			}
		}
    public LinkedList(int value){
        Node n=new Node(value);
            head=n;
            tail=n;
            length=1;
		}
		public void getHead(){
			System.out.println("Head :"+head.value);
		}
		public void getTail(){
			System.out.println("Tail :"+tail.value);
		}
		public void getLength(){
			System.out.println("Length :"+length);
		}
		
    public void printList(){
	    Node temp=head;
		while(temp!=null){
		    System.out.print(temp.value+" ");
			temp=temp.next;
	    }
		}
	public void append(int value){
		Node n=new Node(value);
	    if(length==0){
		    head=n;
			tail=n;
			}
	    else{
		    tail.next=n;
			tail=n;
		}
            length++;
    }
	public void prepand(int value){
		Node n=new Node(value);
		if(length==0){
			head=n;
			tail=n;
		}
		else{
			n.next=head;
			head=n;
		}
		length++;
	}
	public Node removeLast(){
		if(length==0) return null;
		    Node temp=head;
			Node pre=head;
			while(temp.next!=null){
				pre=temp;
				temp=temp.next;
			}
			tail=pre;
			tail.next=null;
			length--;
			if(length==0){
				head=null;
				tail=null;
			}
		return temp;	
	}
	public Node removeFirst(){
		if(length==0) return null;
			Node temp= head;
			head=head.next;
		    temp.next=null;
		length--;
		if(length==0){
			head=null;
			tail=null;
			
	    }
		return temp;
	}
	public Node get(int index){
		if(index<0 || index >= length){
			return null;
		}
		Node temp=head;
		for(int i=0;i<index;i++){
			temp=temp.next;
		}
		return temp;
	}
	public boolean set(int index,int value){
		Node temp=get(index);
		if(temp!=null){
			temp.value=value;
            return true;			
		}
		return false;
	}
	public Node remove(int index){
		if(index<0 || index >=length){
			return null;
	    }
		if(index==1){
			return removeFirst();
		}
		if(index==length-1){
			return removeLast();
		}
		 Node pre=get(index-1);
		 Node temp=pre.next;
		 pre.next=temp.next;
		 temp.next=null;
		 length--;
	     return temp;
	}   
	public boolean insert(int index,int value){
		Node n=new Node(value);
		if(index<0 || index > length){
			return false;
	    }
		if(index==0){
			prepand(value);
			return true;
		}
		if(index==length){
			append(value);
			return true;
		}
		Node temp=get(index-1);
		n.next=temp.next;
		temp.next=n;
		length++;
		return true;
	}
	public void reverse(){
		Node temp=head;
		head=tail;
		tail=temp;
		Node after=temp.next;
		Node before=null;
	for(int i=0;i<length;i++){
		after=temp.next;
		temp.next=before;
		before=temp;
		temp=after;
	}
  }
	
	public static void main(String args[]){
		LinkedList myLinkedList=new LinkedList(4);
		  myLinkedList.append(6);
		  myLinkedList.append(10);
		  //myLinkedList.getHead();
		  //myLinkedList.getTail();
		  //myLinkedList.getLength();
		  myLinkedList.prepand(2);
		  myLinkedList.prepand(1);
		  System.out.println(myLinkedList.get(2).value);
		  myLinkedList.set(2,3);
		  myLinkedList.insert(3,4);
		  myLinkedList.remove(4);
		  myLinkedList.set(4,9);
		  myLinkedList.reverse();
		  
		  myLinkedList.printList();
	}
}
	
	  