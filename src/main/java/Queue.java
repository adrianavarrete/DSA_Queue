public interface Queue<E>{

    void push(E e);
    E pop();
    int size();
}
