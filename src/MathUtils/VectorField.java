package MathUtils;

public class VectorField {

//    protected Function xFunc;
//    protected Function yFunc;
//    protected Function zFunc;
    protected Function func;
    public static final VectorField ZERO_FIELD = new VectorField(new ZeroFunction());


    private class AddedFunction implements Function {
        private Function f1;
        private Function f2;
        AddedFunction(Function f1, Function f2) {
            this.f1 = f1;
            this.f2 = f2;
        }
        @Override
        // TODO: v is generally not the same for f1 and f2
        public Vector apply(Vector v) {
            return f1.apply(v).add(f2.apply(v));
        }
    }

    private class NegatedFunction implements Function {
        private Function f;
        NegatedFunction(Function f) {
            this.f = f;
        }

        @Override
        public Vector apply(Vector v) {
            return f.apply(v).negate();
        }
    }



//    public VectorField(Function x, Function y, Function z) {
//        xFunc = x;
//        yFunc = y;
//        zFunc = z;
//    }

    public VectorField(Function f) {
        func = f;
    }

    // Return the vector at position v
    public Vector vectorAt(Vector v) {
        return func.apply(v);
    }

    public VectorField add(VectorField vf) {
        AddedFunction addedXFunc = new AddedFunction(func, vf.func);
        return new VectorField(addedXFunc);
    }

    public VectorField negate() {
        NegatedFunction nf = new NegatedFunction(func);
        return new VectorField(nf);
    }

    public VectorField sub(VectorField vf) {
        return add(vf.negate());
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
