package linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next; 

        private Node(int value){
            this.value = value;
        }
        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insert(int val, int index){
        if(tail == null){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;

        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        //Important, use the constructor and then execute it

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }
    
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        System.out.println(value + " "+ "has been removed");
    }

    public void deleteLast(){
        if(size <= 1){
            deleteFirst();
            return;
        }

        Node temp = head;
        for(int i = 1; i<size-1; i++){
            temp = temp.next;
        }
        int val = tail.value;
        tail = temp;
        tail.next = null;
        size--;
        System.out.println(val+ " has been removed");
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void delete(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size - 1){
            deleteLast();
        }

        Node prev = get(index-1);
        int value = prev.next.value;
        //To skip one node
        prev.next = prev.next.next;
        System.out.println(value+ " has been deleted");
    }
    
    public Node find(int val){
        Node node = head;

        while(node!= null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
