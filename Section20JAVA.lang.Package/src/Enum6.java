enum Color1 {
    RED,
    GREEN,
    BLUE,
    YELLOW;

    // Enum constructor called separately for each constant.
    private Color1() {
        System.out.println("Constructor called for: " + this);
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

// Demonstrating Enum with Switch Statement.
public class Enum6 {
    public static void main(String[] args) {
        Color1 var_1 = Color1.YELLOW;

        // Switch case with Enum
        switch (var_1) {
            case RED:
                System.out.println("Red color observed");
                break;
            case GREEN:
                System.out.println("Green color observed");
                break;
            case BLUE:
                System.out.println("Blue color observed");
                break;
            default:
                System.out.println("Other color observed");
        }
    }
}

// Demonstrating Enum with Constructor and Methods.
class Enum5 {
    public static void main(String[] args) {
        Color1 c1 = Color1.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}

/*
1️⃣ Enum ek special class hai jisme fixed constants hote hain
   (jaise RED, GREEN, BLUE, YELLOW).

2️⃣ Enum constructor:
   - Har constant ke liye ek baar call hota hai automatically.
   - Constructor hamesha private hota hai (new keyword se object nahi bana sakte).

3️⃣ Methods inside enum:
   - Enum ke andar normal methods bhi define kar sakte ho.
   - Abstract methods bhi allow hote hain (fir har constant ko override karna padega).

4️⃣ Switch ke saath enum:
   - Enum values ko directly switch-case me use kar sakte ho.
   - Readability aur maintainability badh jaati hai.

5️⃣ Useful built-in methods:
   - `values()` → saare enum constants ek array me return karta hai.
     Example: `for(Color1 c : Color1.values()) { ... }`
   - `valueOf("RED")` → string ko enum constant me convert karta hai.
   - `ordinal()` → har constant ka index (0-based) deta hai.
   - `toString()` → by default constant ka name deta hai,
     but override karke custom string bhi return kar sakte ho.

FAQs Recap:
❓ new keyword se enum ka instance bana sakte ho?
👉 Nahi, kyunki constructor private hota hai.

❓ Enum me abstract method rakh sakte ho?
👉 Haan, aur har constant ko implement karna hoga.

❓ values() ka use?
👉 Saare constants ek array me mil jaate hain.

❓ valueOf() ka use?
👉 String ko enum constant me convert karta hai.

❓ ordinal() ka use?
👉 Enum constant ka index nikalne ke liye.
*/
