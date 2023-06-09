package recursion;

/**
 * RecursionClass
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 08.06.2023.
 */
public class RecursionClass {
    private int count;

    public int sum(int start, int end) {
        if (end > start) {
            count++;
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public int getRecursiveCalls() {
        return count;
    }
}
