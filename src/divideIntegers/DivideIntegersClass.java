package divideIntegers;

/**
 * divideIntegers.DivideIntegersClass
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 06.06.2023.
 */
public class DivideIntegersClass {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot be divided by 0");
        }
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MIN_VALUE;
        }

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int quotient = 0;
        while (absDividend >= absDivisor) {
            int shift = 0;
            while (absDividend >=(absDivisor << shift)) {
                shift++;
            }
            shift--;
            quotient += 1 << shift;
            absDividend -= absDivisor << shift;
        }
        return quotient * sign;
    }
}
