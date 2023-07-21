class DoublyLinkedList{
    private Node head;
	private Node tail;
	int length;
	
	class Node{
	   int value;
	   Node next;
	   Node prev;
	   
	   Node(int value){
	       this.value=value;
	   }
	}
    public DoublyLinkedList(int value){
	        Node n=new Node(value);
			head=n;
			tail=n;
			length++;
	}
 	public void getHead(){
	    System.out.println("Head :"+head.value);
		}
	public void getTail(){
	    System.out.println("Tail :"+tail.value);
		}
	public void getlength(){
	    System.out.println("Length :"+length);
		}
	public void printList(){
		if(length==0){
			System.out.println("empty list");
		}
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
			n.prev=tail;
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
			head.prev=n;
			n.next=head;
			head=n;
		}
		length++;
	}
    public Node removeFirst(){
            if(length==0) return null;
			Node temp=head;
			if(length==1){
				head=null;
				tail=null;
			}
			else{
		
            head=head.next;
            head.prev=null;
            temp.next=null;
			}
            length--;
            return temp;			
	}
	public Node removeLast(){
            if(length==0) return null;
			Node temp=tail;
			if(length==1){
				head=null;
				temp=null;
			}
			else{
			
			tail=tail.prev;
			tail.next=null;
			temp.prev=null;
			}
			length--;
			return temp;
	}
	public Node get(int index){
		if(index < 0||length-1< index) return null;
		  Node temp=head;
		if(index <= length/2){
			for(int i=0;i<index;i++){
				temp=temp.next;
				
			}
		}
		else{
			temp=tail;
		for(int i=length-1;i>index;i--){
			temp=temp.prev;	
		}
	}
	return temp;
	}
	public boolean set(int index,int value){
		if(index<0||index>length-1) return false;
		Node temp=get(index);
		if(temp!=null){
			temp.value=value;
			return true;
		}
		return false;
	}
	public boolean insert(int index,int value){
		Node n=new Node(value);
		if(index<0||index>length-1)return false;
			
		if(index==0){
			prepand(value);
			return true;
		}
		if(length==index){
			append(value);
			return true;
		}
		else{
		Node temp=get(index-1);
		Node after=temp.next;
		n.prev=temp;
		n.next=after;
		temp.next=n;
		after.prev=n;
		length++;
		}
		return true;
	}
	public boolean remove(int index){
		if(index<0||index >length-1) return false;
		if(index==0){
		   removeFirst();
		   return true;
		}
		if(index==length-1){
			removeLast();
			return true;
		}
		else{
			Node temp=get(index);
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
			temp.next=null;
			temp.prev=null;
			
		}
		length--;
		return true;
	}
    public static void main(String args[]){
	    DoublyLinkedList dll=new DoublyLinkedList(2);
		  dll.append(3);
		  dll.append(4);
		  dll.prepand(1);
		  //dll.removeFirst();
		  //dll.removeLast();
		  //dll.removeLast();
		  //dll.removeFirst();
		  //dll.prepand(5);
		  dll.append(6);
		  //dll.removeLast();
		  //dll.removeLast();
		  dll.set(4,5);
	    
		 //System.out.println(dll.get(4).value);
		 dll.insert(4,6);
		 dll.insert(0,12);
		 dll.remove(0);
		 dll.remove(4);
		 dll.remove(3);
		 dll.remove(3);
		  dll.getHead();
		 dll.getTail();
		 dll.getlength();
		 dll.printList();
	
	
	}
}	
			
	