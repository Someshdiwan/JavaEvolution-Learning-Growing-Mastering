/*
InBuilt Annonations:
  1.Retention.
  2.Documented
  3.Target
  4.Inherited
  5.Repeatable.
*/

//After One annotaions to another annotaions.
//Defining Own annontation That affect the another annontaions.
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
