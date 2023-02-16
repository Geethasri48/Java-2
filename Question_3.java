class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    int s;

    LinkedList() {
        this.head = null;
        this.s = 0;
    }

    boolean isEmpty() {
        if (this.s == 0)
            return true;
        else
            return false;
    }

    Node getHead() {
        return this.head;
    }

    int getSize() {
        return this.s;
    }
     void add(int data) {
        Node presentNode = new Node(data);

        if(isEmpty() == true){
            this.head = presentNode;
        }else{
            Node before= this.head;
            while( before.next != null){
                before = before.next;    
            }
            before.next = presentNode;
        }
        this.s++;
    }

    void remove(){
        Node presentNode=this.head;
        Node index=null;
        Node t1=null;
        if(this.head==null){
            return;
        }
        while(presentNode!=null){
            t1=presentNode;
            index=presentNode.next;
            while(index!=null){
                if(presentNode.data==index.data){
                    t1.next=index.next;
                }
                else{
                    t1=index;
                }
                index=index.next;
            }
            presentNode=presentNode.next;
        }
    }

    void print() {
        if (this.isEmpty()) {
            System.out.println("list is empty");
        } else {
            Node presentNode = this.head;
            while (presentNode != null) {
                System.out.print(presentNode.data+" ");
                presentNode = presentNode.next;
            }
        }
    }

}
public class Question_3 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(2);
        list1.add(5);
        list1.add(12);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(5);
        list1.add(5);
        

        // LinkedList list3=new LinkedList();
        // list3.addAll(list1);
        // list3.addAll(list2);

        // list1.printData();
        // list2.printData();
        list1.remove();
        list1.print();
    }
}