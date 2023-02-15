package MethodReference;

public class MethodReference {

    public static void main(String[] args) {
        Func<Long, Long> square = Functions :: square;
        long val = square.apply(10L); // 100L

        Functions.square(10L);
    }
}
