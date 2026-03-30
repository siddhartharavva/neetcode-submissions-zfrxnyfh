class LRUCache {
    LinkedList<Integer> lru = new LinkedList<>();
    HashMap<Integer, Integer> retrieval = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!retrieval.containsKey(key)) return -1;
        lru.remove(Integer.valueOf(key));
        lru.addLast(key);
        return retrieval.get(key);
    }

    public void put(int key, int value) {

        if (retrieval.containsKey(key)) {
            lru.remove(Integer.valueOf(key));
        } 
        else if (retrieval.size() >= capacity) {
            int oldest = lru.removeFirst();
            retrieval.remove(oldest);
        }

        lru.addLast(key);
        retrieval.put(key, value);
    }
}