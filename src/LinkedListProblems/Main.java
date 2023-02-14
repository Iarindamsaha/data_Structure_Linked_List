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
        System.out.println("---UC3---");
        LinkedProblems<Integer> list3 = new LinkedProblems<>();
        list3.addFirst(56);
        list3.addLast(30);
        list3.addLast(70);
        list3.displayAll();
        System.out.println("---UC4---");
        LinkedProblems<Integer> list4 = new LinkedProblems<>();
        list4.addFirst(56);
        list4.addLast(70);
        list4.displayAll();
        list4.insert(30,1);
        list4.displayAll();

    }
}
