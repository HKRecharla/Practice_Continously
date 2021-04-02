package harikrishna_Recharla.algo.stacks_Algo;

public class CreateStack_linkedList {
    StackNode root;
    static class StackNode{
        StackNode next;
        int data;
        StackNode(int data){
            this.data =data;
        }
    }

    boolean isEmpty(){
        if(root==null){
            return true;
        }else{
            return false;
        }
    }

    void push(int data){
        StackNode node = new StackNode(data);
       boolean flag =  isEmpty();

       if(flag){
           root = node;
       }else{
           StackNode temp = root;
           root = node;
           node.next = temp;

       }
        System.out.println(data + " pushed to stack");
    }

    void pop(){
        boolean flag =  isEmpty();
        if(!flag){
            int popped = root.data;
            root = root.next;
        }
    }


    public static void main(String[] args) {
        CreateStack_linkedList createStack_linkedList = new CreateStack_linkedList();

        createStack_linkedList.push(10);
        createStack_linkedList.push(20);
        createStack_linkedList.push(30);

    }


}
