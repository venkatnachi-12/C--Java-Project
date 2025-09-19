// Pair class that represents a key-value pair with generic types K and V
public class Pair<K, V> {
    // Private fields to store the key and value
    private K key;
    private V value;

    //Decalring Constructor and initializing the key and value
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    //public getter method to retrieve the key
    public K getKey() {
        return key;
    }

    //public getter method to retrieve the value
    public V getValue() {
        return value;
    }

    //public setter method to update the key
    public void setKey(K key) {
        this.key = key;
    }

    //public setter method to update the value
    public void setValue(V value) {
        this.value = value;
    }
}