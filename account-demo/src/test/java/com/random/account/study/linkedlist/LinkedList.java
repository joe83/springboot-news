package com.random.account.study.linkedlist;

public class LinkedList<E> {

    private Node dummyHead;

    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {

        public E e;

        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    //  在链表的index处添加新元素
    public void add(int index, E e) {
        if (index < 0 || index > size) {

        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;

    }

    //  在链表头部添加元素
    public void addFirst(E e) {
        add(0, e);
    }

    //  在末尾加元素
    public void addLast(E e) {
        add(size, e);
    }

    //  获得某个索引的元素
    public E get(int index) {
        if (index < 0 || index > size) {

        }
        Node current = dummyHead.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.e;
    }

    //  获得链表的第一个方法
    public E getFirst() {
        return get(0);
    }

    //  修改某个索引的元素
    public void set(int index, E e) {
        if (index < 0 || index > size) {

        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    //  查看链表是否包含某个元素
    public boolean contanis(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //  删除某个索引处的元素
    public E delete(int index){
        Node prev = dummyHead;
        for(int i = 0 ; i < index; i++){
            prev = prev.next;
        }
        Node cur = prev.next;
        prev.next = cur.next;
        cur.next = null;
        size --;
        return cur.e;
    }

    public E deleteFirst(){
       return delete(0);
    }



    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(Node cur = dummyHead.next; cur != null; cur = cur.next ){
            builder.append(cur + "->");
        }
        builder.append("NULL");
        return builder.toString();
    }

}
