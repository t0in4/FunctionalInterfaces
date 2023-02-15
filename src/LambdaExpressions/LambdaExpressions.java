package LambdaExpressions;

import example2.Func;

public class LambdaExpressions {

    public static void main(String[] args) {
        Func<Long, Long> square = val -> val * val;
        long val = square.apply(10L); // 100L
    }
}
