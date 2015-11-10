import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Thalita on 10/11/2015.
 */
public class Apple {
    private String colour;
    private Integer weight;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Apple(String colour, Integer weight) {
        super();
        this.colour = colour;
        this.weight = weight;
    }
}
