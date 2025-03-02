import java.io.File;
import java.io.FileOutputStream;

public class FileClassExample {
    public static void main(String[] args)throws Exception {
        //Accessing properties of file.

        File f=new File("C://Users\\somes\\Downloads\\JAVA SE\\Section23JavaIOStreams\\src\\MyJAVA");

       /*

       f.setReadOnly();
       f.setWritable(true);
       FileOutputStream fos = new FileOutputStream("C://Users\\\\somes\\\\Downloads\\\\JAVA SE\\\\Section23JavaIOStreams\\\\src\\\\MyJAVA");

       f.setLastModified();
       f.isFile();
       f.isDirectory();
       f.isHidden();

       */


        System.out.println(f.isDirectory());

        /*
        String list[]=f.list();

        for(String x:list)
        {
            System.out.println(x);
        }
        */

        File list[]=f.listFiles();
        for(File x:list)
        {
            System.out.println(x.getName()+" ");
            System.out.println(x.getPath());
        }
    }
}