public class Tag {

    private int position;
    private int length;
    private char next;

    public Tag()
    {
        position = length = 0;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public char getNext() {
        return next;
    }

    public void setNext(char next) {
        this.next = next;
    }
}
