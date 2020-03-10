public class Node {
    private String key;
    private Integer value;
    private Node next;

    public Node(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
