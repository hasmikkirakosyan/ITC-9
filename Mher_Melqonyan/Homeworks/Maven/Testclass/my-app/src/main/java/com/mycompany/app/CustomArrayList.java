package com.mycompany.app;
class CustomArrayList<T extends Number> {

    private int size = 16;
    private Number[] arr = null;
    private float loadFactor = 0.75f;
    private int tail = 0;

    public CustomArrayList() {
        arr = new Number[size];
    }

    public CustomArrayList(int size, float loadFactor) {
        this.size = size;
        this.loadFactor = loadFactor;
        arr = new Number[size];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T value) {
        ++tail;
        int lastIndex = (int)(size*loadFactor);
        if (tail >= lastIndex) {
            resizeArray();
        }
        arr[tail] = value;
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T)(arr[index]);
        }
        return null;
    }

    public void insert(int index, T value) {
        if (index >= size) {
            resizeArray();
        }
        if (tail < index) {
            tail = index;
        }
        if (tail >= (int)(size*loadFactor)) {
            resizeArray();
        }
        shiftRight(index);
        arr[index] = value;
    }

    public boolean removeByIndex(int index) {
        if (index > size) {
            return false;
        }
        if (tail < size / 2) {
            cropArray();
        }
        shiftLeft(index);
        tail();
        return true;
    }

    public boolean removeByValue(T value) {
        int index = -1;
        tail();
        for (int i = 0; i < tail; ++i) {
            if ((T)(arr[i]) == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        shiftLeft(index);
        if (tail < size / 2) {
            cropArray();
        }
        return true;
    }

    public void replace(int index, int value) {
        if (index >= 0 && index < size) {
            arr[index] = value;
        }
    }

    public void printArray() {
        tail();
        for (int i = 0; i <= tail; ++i) {
            if (arr[i] == null) {
                System.out.print(0 + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private void shiftLeft(int index) {
        for (int i = index; i < size - 1; ++i) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
    }

    private void shiftRight(int index) {
        for (int i = size - 1; i > index; --i) {
            arr[i] = arr[i - 1];
        }
    }

    public void resizeArray() {
        size *= 2;
        Number[] tmpArr = new Number[size];
        for (int i = 0; i < size; ++i) {
            if (i < size/2) {
                tmpArr[i] = arr[i];
            } else {
                tmpArr[i] = null;
            }
        }
        arr = tmpArr;
    }

    private void cropArray() {
        size /= 2;
        size += size * (1 - loadFactor);
        Number[] tmpArr = new Number[size];
        for (int i = 0; i < size; ++i) {
            if (i < size/2) {
                tmpArr[i] = arr[i];
            }
        }
        arr = tmpArr;
    }

    private void tail() {
        for (int i = size - 1; i > 0; --i) {
            if ((T)(arr[i]) != null) {
                tail = i;
                return;
            }
        }
    }
}
