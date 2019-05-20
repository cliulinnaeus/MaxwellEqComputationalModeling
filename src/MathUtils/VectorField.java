package MathUtils;

public class VectorField {

    Function xFunc;     // maps a vector to a number in x
    Function yFunc;
    Function zFunc;



    public static final VectorField ZERO_FIELD = new VectorField(
            (Vector xv) -> 0,
            (Vector yv) -> 0,
            (Vector zv) -> 0
    );

    public VectorField(Function x, Function y, Function z) {
        xFunc = x;
        yFunc = y;
        zFunc = z;
    }

    public VectorField() {

    }

    // Return the vector at position v
    Vector vectorAt(Vector v) {
        return new Vector(xFunc.apply(v), yFunc.apply(v), zFunc.apply(v));
    }


    // a function that maps position vectors to vectors
    VectorField curl() {
        return null;
    }

    double div() {
        return 0;
    }




}
