package AnonymousClasses;

public class AnonymousClasses {

    public static void main(String[] args) {
        Func<Long, Long> square = new Func<Long, Long>() {
            @Override
            public Long apply(Long val) {
                return val * val;
            }
        };
        long val = square.apply(10L); // 100L
    }
}
