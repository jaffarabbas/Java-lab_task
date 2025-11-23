public class linkedlist {
    public static Node head;
    public static class Node {
        public Node next;
        public int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static int insertAtStart(int number){
        Node node = new Node(number);
        node.next = head;
        head = node;
        return node.data;
    }
    public static int insertAtEnd(int number){
        Node newNode = new Node(number);
        if (head == null) {
            head = newNode;
            return newNode.data;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return newNode.data;
    }
    public static void main(String[] args) {
        linkedlist.insertAtStart(1);
        linkedlist.insertAtStart(2);
        linkedlist.insertAtStart(2);
        linkedlist.insertAtStart(5);
        linkedlist.insertAtEnd(2);
        linkedlist.Node temp = linkedlist.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
