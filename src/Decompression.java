import java.util.ArrayList;

public class Decompression {

    public void decompress(ArrayList<Tag> tags) {
        Tag tag;
        int length, position;
        char nextSymbol;
        String phrase = "";
        for (int j = 0; j < tags.size(); j++) {
            tag = tags.get(j);
            length = tag.getLength();
            position = tag.getPosition();
            nextSymbol = tag.getNext();
            if (position == 0) {
                phrase += nextSymbol;
            } else {
                int start = phrase.length() - position;
                for (int i = 0; i < length; i++) {
                    phrase += phrase.charAt(start);
                    start++;
                }
                phrase += nextSymbol;

            }
        }

        System.out.println(phrase);

    }
}
