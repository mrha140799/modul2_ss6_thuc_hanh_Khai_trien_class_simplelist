package SimpleList;

import java.util.Arrays;

public class Mylist<E> {
    int size = 0;
    static final int  DEFAULT_CAPACITI = 10;
    Object[] data;
    public Mylist() {
        data = new Object[DEFAULT_CAPACITI];
    }

    public void ensureCapa() {
            int newSize = data.length *2;
            data = Arrays.copyOf(data , newSize);
    }
    public void add(E e) {
        if (size == data.length) {
            ensureCapa();
        }
            data[size++] = e;
    }
    public Object get(int index) {
        if (index <0 || index >= size) {
            return null;
        }else {
            return data[index];
        }
    }
}
