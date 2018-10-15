package com.random.account.study.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            linkedList.addFirst(i);
            System.out.println(linkedList.toString());
        }

        linkedList.set(3,555);
        System.out.println(linkedList.toString());
        Integer i = linkedList.delete(3);
        System.out.println(i + " : " + linkedList.toString());
    }
}
