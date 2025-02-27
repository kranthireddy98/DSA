public class Tree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.inOrder();
    }
}
//IN order Traversal
//pre order Traversal
//post order Traversal


class BinaryTree{
    Node root;
    public void insert(int i) {
           root = insertRec(root,i);
    }

    public Node insertRec(Node root,int data){
        System.out.println("Rec");
        if (root==null)
        {
            System.out.println("root");
            root = new Node(data);
        }
        else if(data< root.data){
            root.left = insertRec(root.left,data);
            System.out.println("left");
        }else if (data >  root.data){
            System.out.println("right");
            root.right = insertRec(root.right,data);
        }
        return root;
    }

    public void inOrder(){
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if(root!=null){

            System.out.print(root.data+ " ");
            inorderRec(root.left);

            inorderRec(root.right);

        }
    }
}

class  Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;

    }
}

