package ls07.list;

public class MyListSoln<T> implements List<T> {
    private Object[] _elements;
    private int _size;
    private static final int INIT_ARRAY_SIZE = 10;

    public MyListSoln() {
        _elements = new Object[INIT_ARRAY_SIZE];
        _size = 0;
    }
    @Override
    public int size() {
        return _size;
    }
    @Override
    public boolean isEmpty() {
        return (size() == 0);

    }
    @Override
    public void clear() {
        _elements = new Object[INIT_ARRAY_SIZE];
        _size = 0;
    }
    @Override
    public boolean contains(T element) {
        return (find(element) != -1);
    }
    @Override
    public int find(T element) {
        for (int i=0; i<size(); i++) {
            if (get(i).equals(element)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void add(T element) {
        add(size(), element);
    }
    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index out of bounds");
        }
        if (size() == _elements.length) {
// Need to resize the elements array to make room.
            resize_elements_array();
        }

        for (int i = size(); i > index; i--) {
            _elements[i] = _elements[i-1];
        }
        _elements[index] = element;
        _size++;
    }

    @Override
    public boolean remove(T element) {
        int index = find(element);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }
    @Override
    public T remove(int index) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index out of bounds");
        }
        T element_removed = get(index);
        for (int i=index; i<size()-1; i++) {
            _elements[i] = _elements[i+1];
        }
        _size--;
        return element_removed;
    }
    @Override
    public T get(int index) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index out of bounds");
        }
        return (T) _elements[index];
    }
    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size()) {
            throw new RuntimeException("index is out of bounds");
        }
        T existing_element = remove(index);
        add(index, element);
        return existing_element;
    }
    private void resize_elements_array() {
        Object[] resized_elements_array = new

                Object[_elements.length*2];

        for (int i=0; i<_elements.length; i++) {
            resized_elements_array[i] = _elements[i];
        }
        _elements = resized_elements_array;

    }
}
