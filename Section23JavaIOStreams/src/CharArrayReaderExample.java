import java.io.CharArrayReader;
public class CharArrayReaderExample {
    public static void main(String[] args)throws Exception {
        char c[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        CharArrayReader car=new CharArrayReader(c); //Change reader into-writer.
        int x;
        while((x=car.read())!=-1){
            System.out.print(" "+(char)x);
        }
    }
}