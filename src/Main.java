import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        while (true)
        {

            System.out.println("LZ77 Compression and Decompression , What do you want to do ?  ");
            System.out.println("1-Compression");
            System.out.println("2-Decompression");
            System.out.println("3-Exit");
            Scanner in = new Scanner(System.in);
            int choice=in.nextInt();
            boolean abdo=false;

            if (choice ==1 )  {
                 abdo=true;
                System.out.println("Enter Text:");
                String Text;
                Scanner TextTemp = new Scanner (System.in);
                Text = TextTemp.nextLine();
                Compression CompressionObj= new Compression();
                CompressionObj.Compress(Text); }

            if (choice ==2)  {
                if(abdo){
                    System.out.println("Decompression");
                    Decompression decompression =new Decompression();
                    decompression.decompress(Compression.myTags);
                    Compression.myTags.clear();
                }
                else System.out.println("Error");

            }
            if (choice ==3 )  {
                System.out.println("Thank you");
                System.exit(0);
            }
        }




    }

}