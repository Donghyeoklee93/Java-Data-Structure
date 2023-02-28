package LinkedList;
public class Node<T> {
    T element;
    Node<T> next;

    public Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }

    public Node(T element){
        this.element = element;
        this.next = null;
    }

    public String toString(){
        return "<Element : " + element +">";
    }

    public static void main(String[] args) {
        Node<Integer> node = new Node<Integer>(100);
        node.next = new Node<Integer>(10001);

        System.out.println(node);
        System.out.println(node.next);
        System.out.println(node.next.next);
    }
}
