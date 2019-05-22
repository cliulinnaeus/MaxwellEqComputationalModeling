package Physics;

import MathUtils.Function;
import MathUtils.Vector;
import MathUtils.VectorField;

public class BField extends VectorField {

    public BField(Function f) {
        super(f);
    }

    @Override
    public Vector vectorAt(Vector v) {
        double mag = func.apply(v);
        return new Vector(mag * v.x(), mag * v.y(), mag * v.z());
    }


}
