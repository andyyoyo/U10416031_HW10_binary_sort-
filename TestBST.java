import java.util.Scanner;

public class TestBTS {
	
	public static void main(String[] args){
		
		//create the object
		binarySort number = new binarySort();
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter the number
		System.out.println("Enter the amount of the numbers");
		int a = input.nextInt();
		
		int[] n = new int[a];
		
		for(int i=0;i<a;i++){
			System.out.println("Enter");
			n[i] = input.nextInt();
			number.addNode(n[i]);
		}
		//print the result
		number.inOrder(number.root);
	}	
}
	
