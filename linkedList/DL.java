package linkedList;
public class DL {
    private Node head;
    private Node tail;
    private int size;

    public DL(){
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        node.prev = tail;
        node.next = null;//not neccessarily required as java defaults object references to null
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 0; i<index -1; i++){
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        if(node.next != null){
            node.next.prev = node;
        }
        temp.next = node;
        size++;
    }

    public void deleteFirst(){
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        head.next = head;
        head.prev = null;
        size--;
    }

    public void deleteLast(){
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        tail.prev = tail;
        tail.next = null;
        size--;
    }

    public void delete(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index"+ " "+ index);
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
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev; 
        size--;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+ "->");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public void displayRev(){
        
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        
        public Node(int val){
            this.value = val;
        }

        public Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
