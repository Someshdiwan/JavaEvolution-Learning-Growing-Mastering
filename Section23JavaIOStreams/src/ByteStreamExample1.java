import java.io.ByteArrayInputStream;

public class ByteStreamExample1 {
    public static void main(String[] args)throws Exception {
        byte b[]={'a', 'b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        //Reading all bytes together.
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();
    }
}