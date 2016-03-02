public class LinkedList<I> implements MyIterator {
    ListNode<I> head;
    int size;
    private int iteratorIndex;

    public LinkedList() {
        this.head = null;
        this.size = 0;
        this.iteratorIndex = 0;
    }

    public void add(I data) {
        addFirst(data);
    }

    public void add(int index, I data) {
        if (index == 0)
            addFirst(data);
        ListNode<I> x = head;
        for (int i = 0; i < index - 1; i++)
            x = x.next;
        x.next = new ListNode<>(data, x.next);
        size++;
    }

    public void addFirst(I data) {
        ListNode<I> e = new ListNode<>(data);
        e.next = head;
        head = e;
        size++;
    }

    public int size() {
        return size;
    }

    public I get(int index) {
        ListNode<I> x = head;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x.data;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean hasNext() {
        return iteratorIndex < size;
    }

    @Override
    public I next() {
        return get(iteratorIndex++);
    }

    public MyIterator iterator() {
        return this;
    }
}
