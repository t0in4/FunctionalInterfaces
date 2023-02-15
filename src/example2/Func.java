package example2;

@FunctionalInterface
public interface Func <T, R>{
    R apply(T val);
    static void doNothingStatic() {
        System.out.println("Hello");
    }
    default void doNothingDefault() {
        System.out.println("World!");
    }


}
