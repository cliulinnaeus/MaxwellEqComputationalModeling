package MathUtils;

public class AddedFunction implements Function {
    private Function f1;
    private Function f2;

    public AddedFunction(Function f1, Function f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public double apply(Vector v) {
        return f1.apply(v) + f2.apply(v);
    }
}
