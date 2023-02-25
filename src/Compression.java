import java.util.ArrayList;
public class Compression {

    public static ArrayList<Tag> myTags = new ArrayList<Tag>(); //to save all tags in it

    public static void Compress(String TextToCompress) {
        String searchWindow="";
        Tag T = new Tag();
        int lastSeen = 0;
        T.setPosition(0);
        T.setLength(0);
        T.setNext(TextToCompress.charAt(0));
        myTags.add(T);
        searchWindow += TextToCompress.charAt(0);
        for(int i = 1; i < TextToCompress.length(); i++)
        {
            String temp = TextToCompress.charAt(i)+"";
            int lastPosition = i;
            while(true)
            {
                boolean exist = searchWindow.contains(temp);
                if(exist==true)
                {
                    i++;
                    if(i==TextToCompress.length())
                    {
                        lastSeen = searchWindow.indexOf(temp);
                        Tag T1 = new Tag();
                        T1.setNext(TextToCompress.charAt(i - 1));
                        T1.setLength(temp.length() - 1);
                        T1.setPosition(lastSeen);
                        myTags.add(T1);
                        break;
                    }
                    lastSeen = searchWindow.indexOf(temp);
                    temp+=TextToCompress.charAt(i);

                }
                else
                {
                    if(temp.length()==1)
                    {
                        Tag T1 = new Tag();
                        T1.setPosition(0);
                        T1.setLength(0);
                        T1.setNext(TextToCompress.charAt(i));
                        myTags.add(T1);
                    }
                    else
                    {
                        Tag T1 = new Tag();
                        T1.setPosition(lastPosition - lastSeen);
                        T1.setLength(temp.length() - 1);
                        T1.setNext(TextToCompress.charAt(i));


                        myTags.add(T1);
                    }
                    searchWindow+=temp;
                    break;
                }
            }
        }
        for(int i = 0; i < myTags.size(); i++)
        {
            System.out.println("<" + myTags.get(i).getPosition() + " , " + myTags.get(i).getLength() + " , " + myTags.get(i).getNext() + ">");
        }
    }
}
