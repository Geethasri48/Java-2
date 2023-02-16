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

    void sorting(){
        Node presentNode=this.head;
        Node index=null;
        int temp;
        if(presentNode==null){
            return;
        }
        while(presentNode!=null){
            index=presentNode.next;
            while(index!=null){
                if(presentNode.data>index.data){
                    temp=presentNode.data;
                    presentNode.data=index.data;
                    index.data=temp;
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
public class Question_2 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(25);
        list1.add(35);
        list1.add(12);
        list1.add(4);
        list1.add(36);
        list1.add(48);

        LinkedList list2= new LinkedList();
        list1.add(8);
        list1.add(32);
        list1.add(22);
        list1.add(45);
        list1.add(63);
        list1.add(49);

        // LinkedList list3=new LinkedList();
        // list3.addAll(list1);
        // list3.addAll(list2);

        // list1.printData();
        // list2.printData();
        list1.sorting();
        // list2.sorting();
        list1.print();
        // list2.printData();
    }
}