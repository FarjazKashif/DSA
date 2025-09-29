import java.util.*;

class MyHashMap<K, V> {

    // Node to hold key-value
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Array of LinkedLists (buckets)
    private Node<K, V>[] buckets;
    private int capacity = 5; // small size to force collisions

    @SuppressWarnings("unchecked")
    MyHashMap() {
        buckets = new Node[capacity];
    }

    // Hash function
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Put key-value
    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> head = buckets[index];

        // Search in linked list
        Node<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value; // Update if same key
                return;
            }
            current = current.next;
        }

        // Insert new node at start
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    // Get value
    public V get(K key) {
        int index = hash(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // not found
    }

    // Print map for visualization
    public void printMap() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ": ");
            Node<K, V> current = buckets[i];
            while (current != null) {
                System.out.print("[" + current.key + " -> " + current.value + "] ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

// Test
public class implementation {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("FB", 100);   // hash collision example
        map.put("Ea", 200);   // "FB" and "Ea" have same hashCode
        map.put("Farjaz", 111);
        map.put("Farjaz", 222); // should update, not add new node

        map.printMap();

        System.out.println("Get Farjaz: " + map.get("Farjaz"));
        System.out.println("Get FB: " + map.get("FB"));
        System.out.println("Get Ea: " + map.get("Ea"));
    }
}
