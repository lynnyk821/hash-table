public class HashTable {
    private final Node[] hashTable;
    public HashTable(int len){
        hashTable = new Node[len];
    }
    public void put(Key k, double v){
        int index = Math.abs(k.hash() % hashTable.length);
        if(hashTable[index] == null) hashTable[index] = new Node(v, k, null); else {
            for(Node node = hashTable[index]; node != null; node = node.next) if(node.key.eq(k)) return;
            hashTable[index] = new Node(v, k, hashTable[index]);
        }
    }
    public boolean contains(Key k){
        int index = Math.abs(k.hash() % hashTable.length);
        for(Node node = hashTable[index]; node != null; node = node.next)
            if(node.key.eq(k)) return true;
        return false;
    }
    public double get(Key k){
        int index = Math.abs(k.hash() % hashTable.length);
        for(Node node = hashTable[index]; node != null; node = node.next)
            if(node.key.eq(k)) return node.value;
        return 0;
    }
    public double remove(Key k){
        int index = Math.abs(k.hash() % hashTable.length);
        for(Node node = hashTable[index]; node != null; node = node.next){
            if(node.key.eq(k)) {
                hashTable[index] = node.next;
                return node.value;
            }
        }
        return 0;
    }
    public int size(){
        return hashTable.length;
    }
    public void print(){
        for(int i = 0; i < hashTable.length; i++){
            System.out.print("Index [" + i + "]: ");
            for(Node node = hashTable[i]; node != null; node = node.next)
                System.out.print(node.value + " ");
            System.out.println();
        }
        System.out.println();
    }
}
