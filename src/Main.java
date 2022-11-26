import java.nio.file.ClosedWatchServiceException;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(3);

        hashTable.put(new Key("1211", 121), 121);
        hashTable.put(new Key("1212", 122), 122);
        hashTable.put(new Key("1213", 123), 123);
        hashTable.put(new Key("1214", 124), 124);
        hashTable.put(new Key("1214", 127), 125);

        hashTable.print();

        System.out.println(hashTable.contains(new Key("1212", 122)));
        System.out.println(hashTable.get(new Key("1212", 122)));
        System.out.println(hashTable.remove(new Key("1211", 121)));
        System.out.println();

        hashTable.print();
    }
}