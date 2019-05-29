package MathUtils;

public class ZeroFunction implements Function{


    @Override
    public Vector apply(Vector v) {
        return Vector.ZERO_VECTOR;
    }
}
