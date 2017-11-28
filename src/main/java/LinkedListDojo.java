


public class LinkedListDojo {




    public static void main(String[] args) {
        LinkedList  LinkedList = new LinkedList();
        LinkedList.addElement(2);
        System.out.println(LinkedList.printLinkedList());
        LinkedList.addElement(5);
        LinkedList.addElement(7);
        System.out.println(LinkedList.printLinkedList());
        System.out.println(LinkedList.printLinkedList());
        LinkedList.insertElement(2,10);
        System.out.println(LinkedList.printLinkedList());
        System.out.println(LinkedList.getElement(1));
        LinkedList.removeElement(1);
        System.out.println(LinkedList.printLinkedList());


    }





}
