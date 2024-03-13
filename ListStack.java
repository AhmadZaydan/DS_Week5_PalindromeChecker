import java.util.*;
public class ListStack<E> implements StackInt<E> {
    private List<E> theData;
    public ListStack() {
        theData = new ArrayList<>();
    }

    public E push(E obj) {
        theData.add(obj);
        return obj;
    }

    @Override
    public E peek() {
        if (isEmpty()) { throw new NoSuchElementException("Stack is empty");}
        return theData.get(theData.size()-1);
    }

    @Override
    public E pop() {
        if (isEmpty()) { throw new NoSuchElementException("Stack is empty");}
        return theData.remove(theData.size()-1);
    }

    public boolean isEmpty() {
        return theData.isEmpty();
    }

    @Override
    public String toString() {
        return theData.toString();
    }

    public List<E> popAll() {
        List<E> result = new ArrayList<>();
        while (!isEmpty()) {
            result.add(pop());
        }
        return result;
    }
}
