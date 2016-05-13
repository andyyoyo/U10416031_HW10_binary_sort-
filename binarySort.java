public class binarySort {
	Node root;
	
	//create the add method 
	public void addNode(int key){
		Node newNode = new Node(key);
		
		
		if(root==null){
			root=newNode;//declare the root
		}
		else{
			Node focusNode = root;
			Node parent;
			
			while(true){
				parent = focusNode;
				
				if(key < focusNode.key){
					focusNode = focusNode.leftNode;//swap the number which is less than root to left
					
					if(focusNode==null){
						parent.leftNode = newNode;
						return;
					}
				}
				else{
					focusNode = focusNode.rightNode;//swap the number which is more than root to right
					
					if(focusNode==null){
						
						parent.rightNode = newNode;
						return;
					}
					
				}
			}
		}
	}
}	
