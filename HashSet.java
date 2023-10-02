public class HashSet<T> {
    private HashTableOpenAddressing<T> table;

    public HashSet() {
        table = new HashTableOpenAddressing<>(16);
    }

    public void insert(T element) {
        table.insert(element);
    }

    public void remove(T element) {
        table.remove(element);
    }

    public boolean contains(T element) {
        return table.contains(element);
    }

    public int size() {
        return table.size();
    }

    public HashSet<T> union(HashSet<T> otherSet) {
        HashSet<T> resultSet = new HashSet<>();
        for (T element : this.table.keys) {
            if (element != null) {
                resultSet.insert(element);
            }
        }
        for (T element : otherSet.table.keys) {
            if (element != null) {
                resultSet.insert(element);
            }
        }
        return resultSet;
    }

    public HashSet<T> intersection(HashSet<T> otherSet) {
        HashSet<T> resultSet = new HashSet<>();
        for (T element : this.table.keys) {
            if (element != null && otherSet.contains(element)) {
                resultSet.insert(element);
            }
        }
        return resultSet;
    }

    public HashSet<T> difference(HashSet<T> otherSet) {
        HashSet<T> resultSet = new HashSet<>();
        for (T element : this.table.keys) {
            if (element != null && !otherSet.contains(element)) {
                resultSet.insert(element);
            }
        }
        return resultSet;
    }
}
