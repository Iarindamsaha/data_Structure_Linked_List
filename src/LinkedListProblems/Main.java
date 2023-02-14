package LinkedListProblems;

public class Main {
    public static void main(String[] args) {

        LinkedProblems<Integer> list = new LinkedProblems<>();
        System.out.println("---Welcome To Linked List Problems---");
        System.out.println("---UC1---");
        list.addFirst(56);
        list.addFirst(30);
        list.addFirst(70);
        list.displayAll();
        System.out.println("---UC2---");
        LinkedProblems<Integer> list2 = new LinkedProblems<>();
        list2.addFirst(70);
        list2.addFirst(30);
        list2.addFirst(56);
        list2.displayAll();

    }
}
