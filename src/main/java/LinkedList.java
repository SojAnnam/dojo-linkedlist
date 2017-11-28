


public class LinkedList {

    public Link first;
    public Link last;
    public int length;


    public void addElement(double element){
        Link newLink = new Link (null,element);
        if (first == null){
            first = newLink;
            last = newLink;

        }else{
            last.nextLink = newLink;
            last = newLink;

        }
        length = length+1;
    }

    public void insertElement(int index, double element){
        indexValidation(index);
        Link currentLink = first;
        if (index == 0){
            first = new Link(currentLink, element);
        }
        else{
            for (int i = 0; i <=index-1 ; i++) {

                if(i==index-1) {
                    Link insertLink = new Link(currentLink.nextLink, element);
                    currentLink.nextLink = insertLink;

                }
                currentLink =currentLink.nextLink;
            }
        }
        length = length+1;

    }
    public double getElement(int index){
        indexValidation(index);
        Link currentLink = first;
        for (int i = 0; i <=length-1 ; i++) {
            if(i==index) {
                return currentLink.element;
            }
            currentLink =currentLink.nextLink;
        }
        return first.element;
    }
    public void removeElement(int index){
        indexValidation(index);
        Link currentLink = first;
        if (index == 0){
            first = first.nextLink;
        } else{
            for (int i = 0; i <=index-1 ; i++) {
                if(i==index-1) {
                    Link removedLink = currentLink.nextLink;
                    currentLink.nextLink = removedLink.nextLink;
                    length= length-1;
                }
                currentLink =currentLink.nextLink;
            }
        }
    }
    public void indexValidation(int index){
        if(index>length-1) {
            System.out.println("Invalid index");
            throw new IndexOutOfBoundsException("Invalid index, index greater than list length");}
        if (index < 0){
            System.out.println("Invalid index");
            throw new IndexOutOfBoundsException("Invalid index, index less than list length");}
        }
    
    public StringBuilder printLinkedList() {
        Link link = first;
        StringBuilder printLinkedList = new StringBuilder();
        while(link.nextLink != null){
            printLinkedList.append(link.element).append(", ");
            link = link.nextLink;
            if(link.nextLink==null){
                printLinkedList.append(link.element);
            }

        }
        return printLinkedList;
    }
}
