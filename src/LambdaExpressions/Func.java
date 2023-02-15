package LambdaExpressions;

@FunctionalInterface // аннотация позволяет нам
        // ловить не соответствие требованиям функциональных
        // интерфейсов во время компиляции, а не рантайма
interface Func<T, R> {
    R apply(T val); // single abstract method
    // одиночный абстрактный метод
}
