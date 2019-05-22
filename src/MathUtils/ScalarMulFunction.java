package MathUtils;

public class ScalarMulFunction implements Function {
    private double s;
    public ScalarMulFunction(double s) {
        this.s = s;
    }

    @Override
    public double apply(Vector v) {
        return 0;
    }


}
