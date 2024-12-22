import java.lang.annotation.Repeatable;

@Mer(

        author = "ketan", date = "22-12-2024")
public class AnnotationTest {

    public @interface MealContainer{
        Meal[] value();
    }

    @Repeatable(MealContainer.class)
    public @interface Meal{
        String value();
        String mainDish();
    }

    @Meal(value="breakfast", mainDish="cereal")
    @Meal(value="lunch", mainDish="pizza")
    @Meal(value="dinner", mainDish="salad")
    public void evaluateDiet() {

    }

}

