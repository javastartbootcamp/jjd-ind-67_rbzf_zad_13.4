package pl.javastart.task;

// Uzupełnij klasę. Możesz ją dowolnie modyfikować.
// Celem jest, żeby przechodziły testy w src/test/java/[...]/CustomListTest
import java.util.Arrays;

public class CustomList<T> {

    private int size = 0;
    private static final int INITIAL_CAPACITY = 2;
    private Object[] elements;

    public CustomList() {
        elements = new Object[INITIAL_CAPACITY];
    }

    public void add(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size] = element;
        size++;
    }

    public void add(int index, T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        if (index >= 0 && index < size) {
            int numberOfElementsToBeCopied = elements.length - (index + 1);
            System.arraycopy(elements, index, elements, index + 1, numberOfElementsToBeCopied);
            elements[index] = element;
            size++;
        } else if (index == size) {
            add(element);
        } else {
            throw new ArrayIndexOutOfBoundsException("niewlasciwy index elementu");
        }
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= 0 && index <= size) {
            return (T) elements[index];
        }
        throw new ArrayIndexOutOfBoundsException("niewlasciwy index elementu");
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            int numberOfElementsToBeCopied = elements.length - (index + 1);
            System.arraycopy(elements, index + 1, elements, index, numberOfElementsToBeCopied);
            size--;
        } else {
            throw new ArrayIndexOutOfBoundsException("niewlasciwy index elementu");
        }
    }

    private void ensureCapacity() {
        elements = Arrays.copyOf(elements, size * 2);
    }

    @Override
    public String toString() {
        elements = Arrays.copyOf(elements, size);
        return Arrays.toString(elements);
    }
}

