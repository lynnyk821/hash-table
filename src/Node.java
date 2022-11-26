public class Node {
    public final double value;
    public final Key key;
    public Node next;
    public Node(double v, Key k, Node n){
        value = v;
        key = k;
        next = n;
    }
}
