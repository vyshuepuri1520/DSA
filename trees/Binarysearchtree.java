class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data=data;
		left=right=null;
	}
}
public class Binarysearchtree {
	Node root;
	public Binarysearchtree() {
		root=null;
	}
	void insert(int data) {
		root=insertRecursive(root,data);	
	}
	Node insertRecursive(Node root,int data ) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		if(data<root.data) {
			root.left=insertRecursive(root.left,data);
		}
		else if(data>root.data) {
			root.right=insertRecursive(root.right,data);
		}
		return root;
	}
	void preorder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	void inorder(Node root)
	{
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	void postorder(Node root)
	{
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" "+"\n");
		}
	}
	public static void main(String[] args) {
		Binarysearchtree bst=new Binarysearchtree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(8);
		bst.insert(2);
		bst.insert(4);
		bst.insert(7);
		bst.insert(9);
		bst.preorder(bst.root);
		bst.inorder(bst.root);
		bst.preorder(bst.root);
	}
}