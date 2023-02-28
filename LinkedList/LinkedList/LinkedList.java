package LinkedList;

import javax.lang.model.element.Element;

public class LinkedList<T> implements List<T> {
    private Node<T> first;
    private Node<T> last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        int count = 0;
        Node<T> current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public String toString() {
        String out = " ";
        Node<T> p = first;
        while (p != null) {
            out = out + p.element + ", ";
            p = p.next;
        }
        return out;
    }

    public void add(int index, T element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            first = new Node<T>(element, first);
            if (last == null) {
                last = first;
            }
        } else {
            Node<T> pred = first;
            for (int i = 1; i <= index - 1; i++) {
                pred = pred.next;
            }
            pred.next = new Node<T>(element, pred.next);
            if (pred.next.next == null) {
                last = pred.next;
            }
        }
    }

    public void add(T element) {
        if (isEmpty()) {
            first = new Node<T>(element);
            last = first;
        } else {
            last.next = new Node<T>(element);
            last = last.next;
        }
    }

    public boolean contains(T target) {
        boolean found = false;
        Node<T> current = first;
        while (current != null) {
            if (current.element == target) {
                found = true;
            }
            current = current.next;
        }
        return found;
    }

    public void addBefore(T target, T element) {
        if (isEmpty()) {
            return;
        }
        Node<T> current = first;
        int index = 0;
        while (current != null && !current.element.equals(target)) {
            index++;
            current = current.next;
        }
        System.out.println("index=" + index);
        System.out.println("current=" + current);
        if (current != null & current.element.equals(target)) {
            add(index, element);
        }
    }

    public void addAfter(T target, T element) {
        if (isEmpty()) {
            return;
        }
        Node<T> current = first;
        int index = 0;
        while (current != null && !current.element.equals(target)) {
            index++;
            current = current.next;
        }
        System.out.println("index=" + index);
        System.out.println("current=" + current);
        if (current != null & current.element.equals(target)) {
            add(index + 1, element);
        }
    }

    public T remove(T target) {
        T found = target;
        if (contains(target)) {
            if (first.element == target) {
                if (size() == 1) {
                    found = first.element;
                    first = null;
                    last = first;
                } else {
                    first = first.next;
                }
                return found;
            }
        }

        Node<T> current = first;
        Node<T> pred = current;
        while (current != null) {
            if (current.next.element == target) {
                pred = current;
                break;
            }
            current = current.next;
        }
        found = pred.next.element;
        pred.next = pred.next.next;
        if (pred.next == null) {
            last = pred.next;
        }
        return found;
    }

    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("apple");
        linked.add("Orange");
        linked.add("Banana");
        linked.add("Pear");
        linked.add("Kiwi");
        System.out.println("The size of the linked list is :: " + linked.size());
        System.out.println(linked);
        System.out.println("---------------------------");
        linked.remove("Kiwi");
        System.out.println(linked);
        System.out.println("---------------------------");
    }
}
