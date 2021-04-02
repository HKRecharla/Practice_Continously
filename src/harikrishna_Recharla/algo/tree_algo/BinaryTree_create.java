package harikrishna_Recharla.algo.tree_algo;

public class BinaryTree_create {
    Node root;
     static class Node{
         Node left, right;
         int data;
         Node(int data){
             this.data=data;
             left=right=null;
         }
     }


    BinaryTree_create(int data){
        root = new Node(data);
    }

    BinaryTree_create(){
         root=null;
    }

    public static void main(String[] args) {

        BinaryTree_create bt =new BinaryTree_create();
        bt.root =new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);


    }

}
