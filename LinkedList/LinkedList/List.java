package LinkedList;

public interface List<T> {
    public boolean isEmpty();

    public int size();

    public String  toString();

    public void add(int index, T element);

    public boolean contains(T target);

    public void addBefore(T target, T element);

    public void addAfter(T target, T element);

    public T remove(T target);
}
