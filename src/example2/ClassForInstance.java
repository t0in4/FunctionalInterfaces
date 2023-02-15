package example2;

public class ClassForInstance implements Func{

    @Override
    public Object apply(Object val) {
        return null;
    }

    @Override
    public void doNothingDefault() {
        Func.super.doNothingDefault();
    }
}
