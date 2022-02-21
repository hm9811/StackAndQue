package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stacks {
    private Object root[];
    private int top;
    private int capacity;

    public Stacks(int size) {
        root = new Object[size];
        capacity = size;
        top = -1;
    }

    public void push(Object item) {
        if(isFull()){
            System.out.println("Array is full");
        }else {
            System.out.println("Inserting " + item);
            root[++top] = item;
        }
    }

    public Object pop() {
        if(empty()){
            return null;
        }
        System.out.println("Removing " + peek());
        return root[top--];
    }

    public Object peek() {
        if (!empty()) {
            return root[top];
        }
        else {
            System.out.println("Nothing is included in array");
        }

        return -1;
    }

    public boolean empty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
