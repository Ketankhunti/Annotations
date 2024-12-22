//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


/*
Predefined Annotation type in java.lang are:
1) Deprecated
2) Override
3) SuppressWarnings
*/

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Mer(
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        // Note array notation
        reviewers = {"Alice", "Bob", "Cindy"}
)
public class Main {
    /**
    @deprecated
    This method has been deprecated and will be obsolete in future versions
     */
    @Deprecated
    public static void deprecatedMethod() {

    }

    /*@Override
    public void overriddenMethod(){

    }*/
    //@SuppressWarnings({"unchecked", "deprecation"})

    /*
    @SafeVarargs @SafeVarargs annotation, when applied to a method or constructor, asserts that the code does not perform potentially unsafe operations on its varargs parameter. When this annotation type is used, unchecked warnings relating to varargs usage are suppressed.

@FunctionalInterface @FunctionalInterface annotation, introduced in Java SE 8, indicates that the type declaration is intended to be a functional interface, as defined by the Java Language Specification.
     */
    public static void main(String[] args) {

    }
}

@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
@interface Mer {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    //Note: use of array
    String[] reviewers() default {};

}
