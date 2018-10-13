package com.random.account.Map;

public interface Map<K, V> {

    void add(K key, V value);

    V remove(K key);

    boolean contains(K key);

    V getKey(K key);

    void set(K key, V value);

    int getSize();

    boolean isEmpty();

}
