public class DashaMapOne implements HashMapX {
    private Node[] nodeArray;
    private Integer size;

    public DashaMapOne() {
        this.size = 0;
        this.nodeArray = new Node[26];
    }

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return (String.valueOf(input.charAt(0))).toLowerCase();
        }
        return null;
    }

    public Integer returnIndex(String input) {
        
    }

    public void set(String key, String value) {

    }

    public String delete(String key) {
        return null;
    }

    public String get(String key) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public long size() {
        return 0;
    }

    public Integer bucketSize(String key) {
        return null;
    }
}
