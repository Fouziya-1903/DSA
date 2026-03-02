package linkedList;

public class CL {
    private Node head;
    private Node tail; 
    private int size;
    public CL(){
        this.size = 0;
    }
    private class Node {
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    
    public void insertTail(int val){
        Node node = new Node(val);
        if(head == null){
            node.next = node;
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void insertIndex(int val, int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        if(index == size){
            insertTail(val);
            return;
        }

        if(index == 0){
            Node node = new Node(val);
            if(head == null){
                node.next = node;
                head = node;
                tail = node;
            }else{
                node.next = head;
                head = node;
                tail.next = head;
            }

            size++;
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for(int i = 0; i<index-1; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteFirst(){
        if(head == null){
            throw new NullPointerException();
        }
        if(size == 1){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        head = head.next;
        tail.next = head;
        size--;
    }

    public void deleteLast(){
        if(head == null){
            throw new NullPointerException();
        }
        if(size == 1){
            deleteFirst();
            return;
        }
        
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
        size--;
    }

    public void delete(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLast();
            return;
        }

        Node temp = head;
        for(int i = 0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void display(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.val+"->");
            temp = temp.next;
        }while(temp != head);
        System.out.print("head");
    }

}