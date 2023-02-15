package example1;

public class Example1 {
    public static void main(String[] args) {
        Func<Integer, Integer> mul10 = n -> n * 10;
        System.out.println(mul10.apply(5)); // 50
    }
}
