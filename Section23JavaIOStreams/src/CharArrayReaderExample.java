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

/*
1. CharArrayReader:
   - Ye ek subclass hai Reader ka (java.io.Reader).
   - Ek `char[]` ko input stream ke tarah treat karta hai.
   - Matlab file ke jagah directly ek array se read kar sakte ho.

2. Constructor:
   - `CharArrayReader(char[] buf)` → poora character array ko Reader banata hai.
   - `CharArrayReader(char[] buf, int offset, int length)` → sirf ek portion ko Reader banata hai.

3. Code Flow:
   -  Ek char array `{'a','b',...,'z'}` banaya.
   - `CharArrayReader car = new CharArrayReader(c);` → ab car stream jaisa behave karega.
   - `car.read()` ek ek karke characters deta hai (int return hota hai, isliye typecast `(char)x` kiya).
   - Jab saare characters read ho jaye → `read()` -1 return karega.

4. Use Cases:
   - Jab tumhare paas already memory me `char[]` data ho aur tum usko stream ke tarah process karna chahte ho.
   - FileReader jaisa hi use hota hai, par source file ke bajay in-memory array hota hai.
   - Useful testing ke liye (jaise parsers, scanners, etc.).


✔ CharArrayReader ek char[] ko Reader banata hai.
✔ read() ek ek char deta hai jab tak array khatam na ho.
✔ FileReader ka in-memory alternative.
*/
