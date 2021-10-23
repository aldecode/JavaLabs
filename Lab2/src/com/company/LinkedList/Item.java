package com.company.LinkedList;

public class Item<T> {
    public T Data;
    public Item<T> Next;

    Item(T data){
        Data = data;
        Next = null;
    }
}
