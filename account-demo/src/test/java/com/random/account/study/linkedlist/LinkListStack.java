package com.random.account.study.linkedlist;

import com.random.account.study.array_stack_queue.Stack;

public class LinkListStack<E> implements Stack<E> {

    private LinkedList<E> list;
    public LinkListStack(){
        list = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.deleteFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }


}
