public class Tree {

    private TreeNode root;


    public void insert(int data){

        if(root==null){ //if the tree is empty, root will hold the new data itself

            root = new TreeNode(data);


        }

        else { //if the tree is not empty

            root.insert(data);
        }
    }

    public TreeNode getNode(int value){

        if(root!=null){ //has data

            return root.getNode(value);

        }

        return null; //root is null
    }

    public void delete(int value){

        root = delete(root,value); //root will be updated in case we want to delete the root data
    }

    private TreeNode delete(TreeNode subtreeRoot, int value){

        if(subtreeRoot==null){ //actually root is null

            return subtreeRoot;
        }

        if(value<subtreeRoot.getData()){

            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),value));
        }

        else if(value>subtreeRoot.getData()){

            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),value));
        }

        else{

            //Node has either 0 or 1 child.
            if(subtreeRoot.getLeftChild()==null){
                return subtreeRoot.getRightChild();

            }

            else if(subtreeRoot.getRightChild()== null){

                return subtreeRoot.getLeftChild();
            }

            //case 3: node to delete has already 2 children
            //Replace the value in the subtreeRoot node with the smallest value
            //from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            //delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),subtreeRoot.getData()));
        }

        return subtreeRoot;

    }

    public void traverseInOrder(){

        if(root!=null){ //if the root is not null means tree has data
            root.traverseInOrder();
        }
    }

    public void traversePreOrder(){

        if(root!=null){ //if the root is not null means tree has data

            root.traversePreOrder();
        }


    }

    public void traversePostOrder(){

        if(root!=null){ //if the root is not null means tree has data

            root.traversePostOrder();
        }


    }



    public int min(){

        if(root==null){

            return Integer.MIN_VALUE; //Null root means no data, so returning smallest integer value
        }

        else {
            return root.min(); //root not null, so calling min function from TreeNode
        }
    }

    public int max(){

        if(root==null){

            return Integer.MAX_VALUE; //Null root means no data, so returning maximum value possible in integer
        }

        else {
            return root.max(); //root not null, so calling max function from TreeNode
        }
    }

}
