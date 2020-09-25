package BinaryTree;

public class BinarySearchTree {

	
	Node root;
	
	public BinarySearchTree()
	{
		this.root=null;
	}
	
	
	
	Node lookup( int lookupValue)
	{
		if(this.root == null)
		{
			return null;						
		}
		
		Node CurrentNode = root;
		
		while (CurrentNode.nodeLeft != null || CurrentNode.nodeRight != null)
		{
			if(lookupValue < CurrentNode.nodeValue)
			{
				CurrentNode = CurrentNode.nodeLeft	;	
			}
			else if(lookupValue > CurrentNode.nodeValue)
			{
				CurrentNode = CurrentNode.nodeRight	;	
			}
			else if(lookupValue == CurrentNode.nodeValue)
			{
				return 	CurrentNode;
			}
		}
		
		return null;
		
	}
	
	
	boolean insert(int insertValueToBe)
	{
		Node newNodeToBeInsert = new Node(insertValueToBe);
		var whileBreak = true;
		
		if(this.root==null)	//1st node to be inserted
		{
			this.root = newNodeToBeInsert;
			return true;
		}
		else //this is not the 1st node
		{
			Node currentNode = root;			
			while(whileBreak)
			{
				if(insertValueToBe < currentNode.nodeValue)
				{
					if(currentNode.nodeLeft==null)
					{
						currentNode.nodeLeft = newNodeToBeInsert;
						whileBreak = false;
						return true;
					}
					else
					{
						currentNode = currentNode.nodeLeft;
					}
				}
				else //if(insertValueToBe > currentNode.nodeValue)						
				{
					if(currentNode.nodeRight==null)
					{
						currentNode.nodeRight = newNodeToBeInsert;
						whileBreak = false;
						return true;
					}
					else
					{
						currentNode = currentNode.nodeRight;
					}
				}			

			}	
			return true;
		}			
	}


	void inorder() 
	{
		inorderRec(root); 
	} 

	void inorderRec(Node root) 
	{ 
		if (root != null) { 
			inorderRec(root.nodeLeft); 
			System.out.println(root.nodeValue); 
			inorderRec(root.nodeRight); 
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//         9
		//   4            20
		// 1   6      13     170
		*/

		BinarySearchTree tree = new BinarySearchTree(); 
		tree.insert(9); 
		tree.insert(4); 
		tree.insert(1); 
		tree.insert(6); 
		tree.insert(20); 
		tree.insert(13); 
		tree.insert(170); 		
		tree.inorder(); 
		
		
		
		
	}

}
