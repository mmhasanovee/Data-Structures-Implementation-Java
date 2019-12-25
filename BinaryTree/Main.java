public class Main {

    public static void main(String[] args){


        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);

        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);



        //tree.traverseInOrder();



       /* System.out.print(tree.getNode(500));
        System.out.print( tree.getNode(600));
        System.out.println( tree.getNode(2141));*/

        /*System.out.println(tree.min());
        System.out.println(tree.max());*/

        /*System.out.println();
        tree.delete(8888);*/
        tree.traverseInOrder();
        System.out.println();
        tree.traversePreOrder();
        System.out.println();
        tree.traversePostOrder();




    }
}
