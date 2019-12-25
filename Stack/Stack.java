package StackQueue;

public class Stack {

    int top=0;

    int len=10;
    int [] stack = new int [len];


    public  void push(int data){

        if(top==9){
            System.out.println("Stack Overflow....");
        }
        else {
        stack[top]=data;
        top++;}

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

            return popValue;
        }
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
