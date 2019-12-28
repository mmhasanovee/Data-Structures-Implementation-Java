public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {

        heap = new int[capacity]; //parameterized constructor.
    }

    public void insert(int value) {

        if (isFUll()) {

            throw new IndexOutOfBoundsException("Heap is full la hee!");
        }

        heap[size] = value;


        fixHeapAbove(size);
        size++;

    }


    public int delete(int index) {

        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1]; //right most value of the heap will replace in the index; Index is desired deleted position..

        if (index == 0 || heap[index] < heap[parent]) {

            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }
        size--;
        return deletedValue;

    }

    public void sort(){

        int lastHeapIndex = size-1;
        for(int i=0;i<lastHeapIndex;i++){

            int tmp = heap[0]; //keeping the root
            heap[0]=heap[lastHeapIndex-i]; //putting last item of the heap to there
            heap[lastHeapIndex-i] = tmp; //putting root to last heap index

            fixHeapBelow(0,lastHeapIndex-i-1); //0=start at the root, -1 because we gonna exclude the place we put the root


        }
    }
    private void fixHeapAbove(int index) { //passing inserted index value

        int newValue = heap[index]; //inserted new value

        while (index > 0 && newValue > heap[getParent(index)]) { //new value is not node and greater then it's root node.

            heap[index] = heap[getParent(index)]; //assigning newValue's parent to the newValue's index

            index = getParent(index); //getting the newValue's parent index


        }

        heap[index] = newValue; //inserting new value
    }


    private void fixHeapBelow(int index, int lastHeapIndex) {

        int childToSwap;

        while (index <= lastHeapIndex) {

            int leftChild = getChild(index, true);
            int righChild = getChild(index, false);

            if (leftChild <= lastHeapIndex) {

                if (righChild > lastHeapIndex) {

                    childToSwap = leftChild;
                } else {

                    childToSwap = (heap[leftChild] > heap[righChild] ? leftChild : righChild);
                }


                if (heap[index] < heap[childToSwap]) {

                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;

                } else {

                    break;
                }

                index = childToSwap;

            } else {

                break;
            }
        }

    }


    public void printHeap() {

        for (int i = 0; i < size; i++) {

            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    public int peek(){

        if(isEmpty()){

            throw new IndexOutOfBoundsException("Heap is empty");
        }

        return heap[0];
    }

    public boolean isFUll() {

        return size == heap.length;
    }

    public int getParent(int index) { //fetch parent of a node

        return (index - 1) / 2; //no need to use floor, because int is rounded down automatically.
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public int getChild(int index, boolean left) {

        return 2 * index + (left ? 1 : 2);
    }
}
