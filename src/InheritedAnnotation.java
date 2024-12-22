import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define an @Inherited annotation
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyInheritedAnnotation {
    String value() default "Inherited Annotation";
    String name() default "N/A";
}

@MyInheritedAnnotation(value = "Annotation from Superclass",name = "Ketan Mer")
class Superclass {
}

class Subclass extends Superclass {
}

public class InheritedAnnotation {
    public static void main(String[] args) {
        if (Subclass.class.isAnnotationPresent(MyInheritedAnnotation.class)) {
            MyInheritedAnnotation annotation = Subclass.class.getAnnotation(MyInheritedAnnotation.class);
            System.out.println("Annotation value: " + annotation.value());
            System.out.println("Annotation value: " + annotation.name());
        } else {
            System.out.println("No annotation found on Subclass.");
        }

        Subclass s1 = new Subclass();

        Class<?> s2 = s1.getClass();

        Class<?> subclassClass = Subclass.class;
        System.out.println(subclassClass.getName());

        printClassName("Hello, World!"); // Prints: Class name: java.lang.String
        printClassName(42);
    }

    public static void printClassName(Object obj) {
        Class<?> clazz = obj.getClass(); // Get the runtime class of the object
        System.out.println("Class name: " + clazz.getName());
    }


}