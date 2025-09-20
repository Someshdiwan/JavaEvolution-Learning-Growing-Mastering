public class UniCode {
    public static void main(String args[]) {
        char x = 0x03c8;

        for(char c = 0x0370; c <= 0x03FF; c++)
            System.out.print(c + " ");
        for(char b = 0x0900; b <= 0x970; b++)
            System.out.println(b);
    }
}

/*
1. Unicode Basics:
   - Java internally `char` ko Unicode (16-bit) ke form me store karta hai.
   - Iska matlab hai ki Java directly **multi-language support** deta hai (Greek, Hindi, Chinese… sab).

2. Code Explanation:
   - `char x = 0x03c8;`
     → Unicode hexadecimal `0x03c8` ek Greek letter (ψ) ko represent karta hai.
   - `for (char c = 0x0370; c <= 0x03FF; c++)`
     → Loop karega **Greek Unicode block (U+0370 to U+03FF)** ke saare characters print karne ke liye.
   - `for (char b = 0x0900; b <= 0x0970; b++)`
     → Loop karega Devanagari Unicode block (U+0900 to U+0970)
     ke saare characters print karne ke liye (jaise: अ, आ, क, ख…).

3. Output Samajhne Layak:
   - Pehle loop Greek alphabets dikhayega.
   - Dusre loop Hindi/Devanagari script ke letters print karega.

4. Quick Recap:
   ✔ Java ka `char` = Unicode support → ek character = 16-bit code point.
   ✔ Unicode hexadecimal values likh ke alag-alag scripts print kar sakte ho.
   ✔ Is program se tum Greek + Hindi alphabets console pe dekh paoge.
*/
