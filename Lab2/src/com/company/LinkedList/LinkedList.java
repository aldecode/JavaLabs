package com.company.LinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedList<T> implements Iterable<T> {

    private Item<T> head;
    private Item<T> tail;
    private int size = 0;

    public void add(T item){
        Item<T> newItem = new Item<>(item);
        size++;

        if (head == null){
            head = newItem;
        }
        else {
            Item<T> current = head;

            while (current.Next != null){
                current = current.Next;
            }
            current.Next = newItem;
        }
    }

    public boolean remove(T item){
        if (head == null){
            return false;
        }
        if (Objects.equals(item, head.Data)){
            head = head.Next;
            size--;
            return true;
        }

        var current = head.Next;
        var previous = head;

        while (current != null){
         if (Objects.equals(item, current.Data)){
             previous.Next = current.Next;
             size--;
             return true;
         }

         previous = current;
         current = current.Next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean contains(T element) {
        if (size != 0) {
            for (Item<T> i = head; i != null; i = i.Next) {
                if (Objects.equals(element, i.Data)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new Iterator();
    }

    private class Iterator implements java.util.Iterator<T> {

        Item<T> i = head;

        @Override
        public boolean hasNext() {
            return i != null;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item<T> temp = i;
            i = temp.Next;
            return temp.Data;
        }
    }

}
