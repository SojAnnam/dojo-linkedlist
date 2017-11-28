


public class LinkedList {

    public Link first;
    public Link last;
    public Link length;


    public void addElement(double element){
        Link newLink = new Link (null,element);
        if (first == null){
            first = newLink;
            last = newLink;
        }else{
            last.nextLink = newLink;
            last = newLink;
        }
    }
}
