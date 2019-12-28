package HasanOnm;

public class RootFunc {

    public static void main(String [] args){

        LinkedListV v = new LinkedListV();

        v.insertLast(55);
        v.insertLast(4);
        v.insertLast(55);
        v.insertLast(54);
        v.insertLast(4);
        v.insertLast(3);
        v.insertLast(4);
        v.insertLast(100);
        v.insertLast(55);
        //v.showAll();
        //v.insertAtIndex(5,2);
        //v.showAll();
       // v.deleteIndex(1);
        //v.deleteData(17);
        v.showAll();

       v.removeDupUnSorted();

        System.out.println("");
        v.showAll();

    }
}
