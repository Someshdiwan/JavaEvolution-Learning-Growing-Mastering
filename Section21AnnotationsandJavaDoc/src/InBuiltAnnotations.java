import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Change from CLASS to RUNTIME
@Documented
@Target(ElementType.TYPE)
@Inherited

@interface MyAnno1 {
    String name();
    String project();
    String date();
    String version() default "13";
}

@MyAnno1(name = "Tim", project = "Bank", date = "2025-02-13")
public class InBuiltAnnotations {
    public static void main(String[] args) {
        // Accessing annotation using reflection
        MyAnno1 annotation = InBuiltAnnotations.class.getAnnotation(MyAnno1.class);

        if (annotation != null) {
            System.out.println("Name: " + annotation.name());
            System.out.println("Project: " + annotation.project());
            System.out.println("Date: " + annotation.date());
            System.out.println("Version: " + annotation.version());
        } else {
            System.out.println("Annotation not found.");
        }
    }
}

/*
InBuilt Annotations:
  1.Retention.
  2.Documented
  3.Target
  4.Inherited
  5.Repeatable.

After One annotations to another annotations. Defining Own annotation That affect the another annotations.

1. @interface
   - Java me custom annotation banane ke liye `@interface` use karte hain.
   - Annotation ek metadata hai jo class/method/field ke upar extra info provide karta hai.

2. Built-in meta-annotations:
   - @Retention → batata hai annotation runtime pe available rahega ya sirf compile-time tak.
     * RetentionPolicy.CLASS (default): compile hone ke baad bhi .class file me hota hai, lekin runtime pe accessible nahi.
     * RetentionPolicy.RUNTIME: runtime pe reflection ke zariye access kar sakte ho. (yahan use kiya gaya hai)
   - @Target → annotation kahan lag sakta hai (class, method, field, etc.)
   - @Inherited → agar ek class pe annotation hai, to uske subclass ko bhi inherit ho jata hai.
   - @Documented → annotation javadoc me include hoga.

3. Annotation definition (MyAnno1)
   - Tumne 4 elements define kiye:
     * name (required)
     * project (required)
     * date (required)
     * version (optional, default = "13")

   Example usage:
   @MyAnno1(name="Tim", project="Bank", date="2025-02-13")

4. Accessing annotation at runtime
   - Reflection ke through `.getAnnotation(MyAnno1.class)` se class pe lage annotation ki values fetch ki ja sakti hain.
   - Example output:
     Name: Tim
     Project: Bank
     Date: 2025-02-13
     Version: 13

5. Why annotations are useful?
   - Metadata for frameworks (Spring, Hibernate).
   - Code generation, validations, dependency injection.
   - Custom runtime processing (logging, auditing, etc.)

1. Define annotation → `@interface MyAnno1`
2. Configure meta-annotations → `@Retention(RUNTIME)`, `@Target(TYPE)`
3. Apply annotation → `@MyAnno1(...)` on class
4. Use Reflection → `class.getAnnotation(...)` to read values
*/
