/**
 * Created by Thalita on 10/11/2015.
 */
public class HeavyApplePredicate implements ApplePredicate {
    @Override
    public boolean testApple(Apple apple) {
        return 150 < apple.getWeight();
    }
}
