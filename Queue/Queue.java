package QueueStack;

public class Queue {
    int arrayLen=4;
    int queue[] =new int[arrayLen];
    int size=0;
    int front;
    int rear;

    public void enQ(int data){

        if(isFull()){

            System.out.println("Queue is full");
        }
        else {

            queue[rear]=data;
            rear=(rear+1)%arrayLen;
            size++;
            System.out.println("Inserted successfully: " +data);

        }

    }

    public void deQ(){

        int data;
        if(isEmpty()){

            System.out.println("Queue is empty");

        }

        else {

            data=queue[front];
            front=(front+1)%arrayLen;
            size--;
            System.out.println("Dequeue successful: "+ data);

        }


    }

    public boolean isFull(){

        return size==arrayLen;

    }

    public boolean isEmpty(){

        return size==0;

    }

    public void showAll(){

        for(int i=0;i<size;i++){

            System.out.println(queue[(front+i)%arrayLen]);
        }
    }
}
