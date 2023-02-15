package LinkedListProblems;

public class LinkedProblems<Integer> {

    private Node head;
    private Node tail;
    private int size;

    public LinkedProblems() {

        this.size = 0;
    }

    public void addFirst(Integer val){

        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){

            tail = head;

        }

        size++;
    }

    public void addLast(Integer val){

        if (tail == null){
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(Integer val, int index){

        if ( index == 0){
        addFirst(val);
        return;
        }
        if ( index == size){
            addLast(val);
            return;
        }
        Node temp =head;

        for (int i = 1 ; i < index; i++){
        temp =temp.next;
        }

        Node node = new Node <>(val, temp.next);
        temp.next = node;
        size++;

    }

    public Integer pop(){
        Integer value = (Integer) head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size --;
        return value;
    }

    public Integer popLast(){
        if (size < 1){
        return pop();
        }
        Node secondLast =get(size-2);
        Integer value = (Integer) tail.value;
        tail =secondLast;
        tail.next = null;
        return value;
    }



    public void displayAll(){

        Node temp;
        temp = head;
        if (temp == null){
            System.out.println("The List is Empty");
        }
        else {
            while(temp != null){

                System.out.print(temp.value + " ---> ");
                temp = temp.next;
            }
            System.out.println("End of the List");
        }
    }

    public int search(Integer value){
        Node node = head;
        int index = 0;

        while (node != null){

            if ( node.value == value){
                return index;
            }
            node = node.next;
            index++;
        }
        return 0;

    }


    //Adding a get method to get a reference pointer to that particular index
    public Node get (int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }







    private class Node<Integer>{
        private Integer value;
        private Node next;

        public Node(Integer value){
            this.value = value;
        }

        public Node(Integer value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}
