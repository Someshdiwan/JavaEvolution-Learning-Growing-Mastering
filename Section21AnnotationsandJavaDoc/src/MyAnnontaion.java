import java.lang.annotation.Annotation;
@interface MyAnno
{
    String name();
    /*Have return type but not able to add parameter here. */

    /*
    User deined Annontaions. You must befine the metadata. useful in application development.
    String project();
    String date();
    float version();

    String date() default "today";
    String version() default "13";

    So On. Data About the class And it is called meta data.
    We learn here how to define meta data inside the Annontaions.
    Once you define the elements inside the annontaions then
    it become mandetory to provides the all elements values in the  @MyAnno(name="Somesh", so on like this).

    @MyAnno(name="Ajay",project="Bank")

    Meta is given using elements and it just like methods will not have body and they not have throw class. not use throw exception.
    */
}
@MyAnno(name="Somesh")
class MyAnnontaion
{
    @MyAnno(name="Somesh")
    int data;

    @MyAnno(name="Somesh")
    public static void main(@MyAnno(name="Somesh") String[] args)
    {
        @MyAnno(name="Somesh") //Tis is nothing but the metadata about Annontaions.
        int x;
    }
}

//Inside Annon we can define members and elements.
//Elements of annon also called abstract method.