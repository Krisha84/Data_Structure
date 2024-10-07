class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data = data;
        left = null; 
        right = null;
    }
}

public class Binary_From_Pre_Post{
    public Node constructTree(int[] pre,int[] post,int preStart,int preEnd,int postStart,int postEnd){
        if(preStart>preEnd || postStart>postEnd){
            return null;
        }

        Node root = new Node(pre[preStart]);

        if(preStart==preEnd){
            return root;
        }

        int value = pre[preStart+1];

        int index = postStart;
        while(post[index] != value){
            index++;
        }

        int leftSubTreeSize = index - postStart + 1;

        root.left = constructTree(pre,post,preStart+1,preStart+leftSubTreeSize,postStart,leftSubTreeRootIndex);
        root.right = constructTree(pre,post,preStart+leftSubTreeSize+1,preEnd,leftSubTreeRootIndex+1,postEnd-1);

        return root;
    }

    public void printInOrder(Node node){
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        Binary_From_Pre_Post tree = new Binary_From_Pre_Post();

        int[] pre = {1, 2, 4, 5, 3, 6, 7}; 
        int[] post = {4, 5, 2, 6, 7, 3, 1}; 

        Node root = tree.constructTree(pre, post, 0, pre.length - 1, 0, post.length - 1);

        System.out.println("Inorder traversal of the constructed tree:");
        tree.printInOrder(root);
    }
}
