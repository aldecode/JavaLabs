package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;


public class ArrayList<T> implements Iterable<T>{
    private T[] data;
    private int count = 0;
    private int FIXED_SIZE = 10;

    public ArrayList() {
        data = (T[]) new Object[this.FIXED_SIZE];
    }

    public Object get(int index) {
        if (index < count) {
            return data[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(T obj) {
        if (data.length - count <= data.length / 2) {
            this.reSizeArray();
        }

        data[count++] = obj;
    }

    public Object remove(int index) {
        if (index < count) {
            Object obj = data[index];
            int temp = index;
            data[index] = null;

            while (temp < count) {
                data[temp] = data[temp + 1];
                data[temp + 1] = null;
                temp++;
            }

            count--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void reSizeArray() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public int size() {
        return count;
    }

    public boolean contains(T element) {
        for (int i = 0; i < count; i++) {
            if (Objects.equals(element, data[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator<T> {

        int i = 0;

        @Override
        public boolean hasNext() {
            return i < count;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return data[i++];
        }

    }
}
