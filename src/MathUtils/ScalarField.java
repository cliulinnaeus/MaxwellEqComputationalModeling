package MathUtils;


public class ScalarField {

    protected Function func;

    public ScalarField(Function func) {
        this.func = func;
    }

    public double scalarAt(Vector v) {
        return func.apply(v);
    }

    public ScalarField add(ScalarField sf) {
        AddedFunction addedFunction = new AddedFunction(func, sf.func);
        return new ScalarField(addedFunction);
    }

    // vector calculus:
    public VectorField grad() {
        return null;
    }


}
