/**
 * Created by Thalita on 10/11/2015.
 */
public class RedApplePredicate implements ApplePredicate {
    @Override
    public boolean testApple(Apple apple) {
        return "red".equals(apple.getColour());
    }
}
