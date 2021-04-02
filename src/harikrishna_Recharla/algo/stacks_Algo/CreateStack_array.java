package harikrishna_Recharla.algo.stacks_Algo;

public class CreateStack_array {

    static int MAX = 10000;
    int[] a = new int[10000];
    int top;
    CreateStack_array(){
        top=-1;
    }


    boolean isEmpty(){
        if(top<0){
            return true;
        }else{
            return false;
        }
    }

    boolean isMax(){
        if(top >= (MAX-1)){
            return true;
        }else{
            return false;
        }
    }

    boolean push(int x){
        if(top >= (MAX-1)){
            return false;
        }else{
            a[++top] = x;
            System.out.println("Pushed :: "+x);
            return true;
        }
    }

    int pop(){

        boolean flag = isEmpty();
        if(!flag){
            int x = a[top--];
            System.out.println("Popped :: "+x);
            return x;
        }else{
            return 0;
        }
    }

    int peek(){
        boolean flag = isEmpty();
        if(!flag){
            int x = a[top];
            System.out.println(x);
            return x;
        }else{
            return 0;
        }
    }


    public static void main(String[] args) {


        CreateStack_array stack = new CreateStack_array();
        stack.push(10);
        stack.push(20);
        stack.push(15);
        stack.peek();
    }


}
