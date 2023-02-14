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
