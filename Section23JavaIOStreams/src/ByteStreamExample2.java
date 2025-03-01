import java.io.ByteArrayInputStream;

public class ByteStreamExample2 {
    public static void main(String[] args)throws Exception {
        byte b[]={'a', 'b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        //Mark&Rest() method checking.

        String str = new String(bis.readAllBytes());
        System.out.println(bis.markSupported());
        bis.close();
    }
}
