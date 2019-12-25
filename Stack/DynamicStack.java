package StackQueue;

public class DynamicStack {
    
        int top=0;

        int len=10;
        int [] stack = new int [len];


        public  void push(int data){

            if(top==9){
                expand();
            }
            else {
                stack[top]=data;
                top++;}

        }

    private void expand() {
            int length=len;
            int [] expandedStack = new int[length*2];
            System.arraycopy(stack,0,expandedStack,0,len);
            stack=expandedStack;
            len=len*2;
    }

    public int  pop(){

            if(top<=0){
                System.out.println("Stack UnderFlow");
                return 0;
            }
            else {
                top--;
                int popValue = stack[top];
                stack[top] = 0;
                shrink();
                return popValue;
            }
        }

    private void shrink() {

            int length = len;
            if(length<=(len/2)/2)
                len=len/2;

            int shrinkStack[] = new int[len];
            System.arraycopy(stack,0,shrinkStack,0,len);
    }

    public int peek(){

            int peekValue = stack[top-1];
            return peekValue;
        }

        public void showAll(){

            for(int i : stack){
                System.out.print(i+" ");
            }
        }
    }


