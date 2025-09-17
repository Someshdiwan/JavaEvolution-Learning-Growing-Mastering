import java.io.ByteArrayInputStream;

public class ByteStreamExample {
    public static void main(String[] args) throws Exception  {
        byte b[]={'a', 'b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        int x;

        //Reading byte bye byte. one at a time.
        while((x = bis.read())!=-1) {
            System.out.print((char)x);
        }
        bis.close();
    }
}
