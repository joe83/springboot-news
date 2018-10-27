package com.random.account.Map;

public class BSTMap<K extends Comparable<K>, V> implements Map<K, V> {

    private class Node {
        private K key;
        private V value;
        private Node left, right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    private Node add(Node node, K key, V value) {
        if (node == null) {
            size++;
            return new Node(key, value);
        } else {
            if (key.compareTo(node.key) < 0) {
                add(node.left, key, value);
            } else if (key.compareTo(node.key) > 0) {
                add(node.right, key, value);
            } else if (key.compareTo(node.key) == 0) {
                node.value = value;


            }
        }
        return node;
    }

    private Node getNode(Node node, K key) {
        if (node == null) {
            return null;
        } else {
            if (key.compareTo(node.key) == 0) {
                return node;
            } else if (key.compareTo(node.key) < 0) {
                return getNode(node.left, key);
            } else {
                return getNode(node.right, key);
            }
        }
    }


    @Override
    public void add(K key, V value) {
        add(root, key, value);
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public boolean contains(K key) {
        return getNode(root, key) == null;
    }

    @Override
    public V getKey(K key) {
        Node node = getNode(root, key);
        return node == null ? null : node.value;
    }

    @Override
    public void set(K key, V value) {
        Node node = getNode(root, key);
        if (node == null) {



























        } else {






















        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
