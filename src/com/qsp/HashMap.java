package com.qsp;

import java.util.LinkedList;

class Node {
    int key;
    String value;

    Node(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {

    LinkedList<Node>[] table = new LinkedList[5];

    MyHashMap() {
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    void put(int key, String value) {

        int index = key % table.length;

        table[index].add(new Node(key, value));
    }

    String get(int key) {

        int index = key % table.length;

        for (Node n : table[index]) {
            if (n.key == key) {
                return n.value;
            }
        }

        return null;
    }

    void display() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Bucket " + i + " : ");
            for (Node n : table[i]) {
                System.out.print("(" + n.key + "," + n.value + ") ");
            }
            System.out.println();
        }
    }
}

public class HashMap {

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        map.put(1, "Apple");
        map.put(6, "Banana");
        map.put(11, "Orange");
        map.put(2, "Mango");

        map.display();

        System.out.println("Value = " + map.get(6));
    }
}