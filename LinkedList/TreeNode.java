import java.sql.SQLOutput;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data){

        this.data=data;
    }

    public void insert(int value){

        if(data==value){

            return;
        }

       if(data>value){

           if(leftChild==null){

               leftChild=new TreeNode(value);
           }
           else {
               leftChild.insert(value);
           }
       }

       else {

           if(rightChild==null){

               rightChild = new TreeNode(value);
           }
           else {
               rightChild.insert(value);
           }
       }
    }

    public void traverseInOrder(){

        if(leftChild!=null){

            leftChild.traverseInOrder();
        }

        System.out.print(data+", ");

        if(rightChild!=null){

            rightChild.traverseInOrder();
        }

    }

    public void traversePreOrder(){

        System.out.print(data+", ");
        if(leftChild!=null){

            leftChild.traversePreOrder();
        }



        if(rightChild!=null){

            rightChild.traversePreOrder();
        }



    }

    public void traversePostOrder(){


        if(leftChild!=null){

            leftChild.traversePostOrder();
        }


        if(rightChild!=null){

            rightChild.traversePostOrder();
        }

        System.out.print(data+", ");


    }

    public TreeNode getNode(int value){

        if(data==value){

            return this;
        }

        System.out.println();


        if(value<data){

            if(leftChild!=null){

                return leftChild.getNode(value);
            }

        }

        else {
            if(rightChild!=null){

                return rightChild.getNode(value);
            }
        }

        return null;

    }

    public int min(){

        if(leftChild==null){

            return data;
        }

        else{

            return leftChild.min();
        }
    }

    public int max(){
        if(rightChild==null){

            return data;
        }

        else{

            return rightChild.max();
        }
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public String toString (){

        return "Data is: "+ data;
    }
}
