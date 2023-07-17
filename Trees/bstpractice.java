class Node{
    int value;
    Node right;
    Node left;
    Node root;
    public Node(int value)
    {
        this.value = value;
        right = null;
        left = null;
    }
}
public class bstpractice {
    public Node root;
    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = new Node(value);
                    break;
                } else {
                    current = current.left;
                }
            } else if (value > current.value) {
                if (current.right == null) {
                    current.right = new Node(value);
                    break;
                } else {
                    current = current.right;
                }
            } else {
                       return;
            }
        }
    }
    public int max(){
        Node maxele = root;
        while(maxele.right != null)
        {
            maxele = maxele.right;
        }
        return maxele.value;
    }
    public int min(){
        Node minele = root;
        while(minele.left != null)
        {
            minele = minele.left;
        }
        return minele.value;
    }
    public int getHeight(Node n){
        if(n==null){
            return 0;
        }
        int leftHeight = getHeight(n.left);
        int rigthHeight = getHeight(n.right);
        return Math.max(leftHeight,rigthHeight)+1;

    }
    public boolean isBalanced(Node n1){
        if(n1 == null)
        {
            return true;
        }
        else{
            int lheight = getHeight(n1.left);
            int rheight  = getHeight(n1.right);
            if(Math.abs(lheight - rheight) > 1)
            {
                return false;
            } 
        }
        return isBalanced(n1.left)&& isBalanced(n1.right);
    }
    public Node minValueNode(Node n1)
    {
        Node current = n1;
        while(current.left != null){
            current = current.left;
        }
        return current;
    }
    public Node deleteNode(int key,Node root){
        if(root == null){
            return root;
        }
        else{
            if(key<root.value){
                root.left = deleteNode(key,root.left);
            }
            else if(key > root.value){
                root.right = deleteNode(key,root.right);
            }
            else{
                if(root.left == null){
                    return root.right;
                }
                else if(root.right == null){
                    return root.left;
                }
                Node tmp=minValueNode(root.right);
                root.value=tmp.value;
                root.right=deleteNode(tmp.value,root.right);
            }
        }
        return root;            
    }

}

