public class Node {
	int key;
	
	Node leftNode;
	Node rightNode;
	
	//the constructor can return the value
	Node(int key){
		this.key=key;
	}
	
	//print the number
	public String toString(){
		return " "+key;
	}
}
