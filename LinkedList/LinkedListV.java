package HasanOnm;

public class LinkedListV {

    Node head;

    public void insertLast(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {

            head = node;

        } else {

            Node n = head;
            while (n.next != null) {

                n = n.next;
            }
            n.next = node;
        }


    }

    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {

            head = node;
        } else {

            Node n = head;

            node.next = n;
            head = node;

        }
    }


    public void insertAtIndex(int index, int data) { //assuming linked list is not empty
        Node node = new Node();
        node.data = data;
        Node n = head;

        if (index == 0) { //inserting at first...
            insertFirst(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next; //finding the desired index position
            }

            Node temp1 = n.next; //keep the previous link
            n.next = node; //inserting the new value
            node.next = temp1;
        } //linking the previous linked value to the new inserted value


    }


    public void deleteIndex(int index) {

        Node tempHead = head;
        if (index == 0) {

            head = tempHead.next;
        } else {

            for (int i = 0; i < index - 1; i++) {

                tempHead = tempHead.next;
            }

            Node tempNext = tempHead.next.next;
            tempHead.next = tempNext;

        }


    }

    public void deleteData(int data) {

        Node tempHead = head;

        if (tempHead.data == data) {

            head = tempHead.next;
        } else {

            while (tempHead.next != null) {

                Node tempPrev = tempHead;
                tempHead = tempHead.next;
                if (tempHead.data == data) {

                    tempPrev.next = tempHead.next;

                }
            }
        }


    }

    public void showAll() {

        Node show = head;

        while (show.next != null) {

            System.out.print(show.data + " ");
            show = show.next;
        }

        System.out.print(show.data + " ");

    }

    public void removeDupSorted() {


        Node temp = head;
        while (temp.next != null) {

            if (temp.data == temp.next.data)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }

    }

    public void removeDupUnSorted() {

        Node currentNode = head;

        if(currentNode==null || currentNode.next==null){


        }

        else {

            while (currentNode!=null){

                Node runner = currentNode;

                while (runner.next!=null){

                    if(runner.next.data==currentNode.data){

                        runner.next=runner.next.next;
                    }
                    else {
                        runner=runner.next;
                    }


                }
                currentNode=currentNode.next;
            }
        }
    }






}




