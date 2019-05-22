package MathUtils;

public class VectorField {

    protected Function xFunc;
    protected Function yFunc;
    protected Function zFunc;
    protected Function func;
    public static final VectorField ZERO_FIELD = new VectorField(new ZeroFunction(),
            new ZeroFunction(), new ZeroFunction());

    public VectorField(Function x, Function y, Function z) {
        xFunc = x;
        yFunc = y;
        zFunc = z;
    }

    public VectorField(Function f) {
        func = f;
    }

    // Return the vector at position v
    public Vector vectorAt(Vector v) {
        return new Vector(xFunc.apply(v), yFunc.apply(v), zFunc.apply(v));
    }

    public VectorField add(VectorField vf) {
        AddedFunction addedXFunc = new AddedFunction(this.xFunc, vf.xFunc);
        AddedFunction addedYFunc = new AddedFunction(this.yFunc, vf.yFunc);
        AddedFunction addedZFunc = new AddedFunction(this.zFunc, vf.zFunc);
        return new VectorField(addedXFunc, addedYFunc, addedZFunc);
    }


    /*
    operators for vector calculus:

     */
    // a function that maps position vectors to vectors
    VectorField curl() {
        return null;
    }

    double div() {
        return 0;
    }


}
