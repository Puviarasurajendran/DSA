public class BinearyTree{
        Node root;
	class Node{
        int value;
        Node right;
        Node left;
        Node(int value){
            this.value=value;		
			}
		}
    public boolean insert(int value){
		Node n=new Node(value);
		if(root==null){
			root=n;
			return true;
		}
		Node temp=root;
		while(true){
			if(temp.value==n.value) return false;
			if(temp.value>n.value){
				if(temp.left==null){
					temp.left=n;
					return true;
				}
				temp=temp.left;
			}
			else{
				if(temp.right==null){
					temp.right=n;
					return true;
				}
				temp=temp.right;
			}
		}
		
	}
	public boolean contains(int value){
		Node temp=root;
		while(temp!=null){
			if(value<temp.value){
				temp=temp.left;
			}
			else if(temp.value<value){
				temp=temp.right;
			}
			else {
				return true;
			}
		}
		return false;	
			
	}
			
	public static void main(String args[]){
	    BinearyTree bst=new BinearyTree();
		bst.insert(23);
		bst.insert(56);
		bst.insert(25);
		bst.insert(12);
		bst.insert(34);
		bst.insert(47);
		System.out.println(bst.contains(25));
		System.out.println(bst.root.value);
	}
}	