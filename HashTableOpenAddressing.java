import java.util.BitSet;

public class HashTableOpenAddressing<K> {
    private int capacity;
    public K[] keys;
    private BitSet occupied;
    private int size;

    public HashTableOpenAddressing(int capacity) {
        this.capacity = capacity;
        keys = (K[]) new Object[capacity];
        occupied = new BitSet(capacity);
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void insert(K key) {
        reHash();

        int index = hash(key);

        while (occupied.get(index)) {
            if (keys[index] != null && keys[index].equals(key)) {
                return;
            }
            index = (index + 1) % capacity;
        }

        keys[index] = key;
        occupied.set(index);
        size++;
    }

    private void reHash() {
        if (size == capacity) {
            capacity = capacity * 2;
            var auxK = keys;

            keys = (K[]) new Object[capacity];


            for (K k : auxK) {
                insert(k);
            }
            System.out.println("Tabela hash foi dobrada de capacidade");
        }
    }

    public boolean contains(K key) {
        int index = hash(key);

        while (occupied.get(index)) {
            if (keys[index] != null && keys[index].equals(key)) {
                return true;
            }
            index = (index + 1) % capacity;
        }

        return false;
    }

    public void remove(K key) {
        int index = hash(key);

        while (occupied.get(index)) {
            if (keys[index] != null && keys[index].equals(key)) {
                keys[index] = null;
                occupied.clear(index);
                size--;
                return;
            }
            index = (index + 1) % capacity;
        }
    }

    public int size() {
        return size;
    }
}
