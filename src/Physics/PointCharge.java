package Physics;

import MathUtils.Function;
import MathUtils.ScalarField;
import MathUtils.Vector;
import MathUtils.VectorField;

public class PointCharge {
    public double q;
    public Vector pos;
    public Vector velo;
    public VectorField eField;
    public VectorField bField;
    public ScalarField ePotential;
    public double mass;

    private class PointChargeEFunc implements Function {
        @Override
        public Vector apply(Vector v) {
            Vector dV = v.sub(pos);
            double length = dV.length();
            double eMag = Constants.K * q / (length * length * length);
            return new Vector(dV.x() * eMag, dV.y() * eMag, dV.z() * eMag);
        }
    }

    private class PointChargeBFunc implements Function {
        @Override
        public Vector apply(Vector v) {
            Vector dV = v.sub(pos);
            /*
            What's the formula for B of point charge?

             */
            return null;
        }
    }


    public PointCharge(double q, double mass, Vector pos, Vector velo) {
        this.q = q;
        this.pos = pos;
        this.velo = velo;
        this.mass = mass;

        PointChargeEFunc eFunc = new PointChargeEFunc();
        PointChargeBFunc bFunc = new PointChargeBFunc();
        eField = new VectorField(eFunc);
        bField = new VectorField(bFunc);

        /*
        r ^ 3 = (x^2 + y^2 + z^2) ^ 3/2
        r = xx^ + yy^ + zz^

         */

        /*
        electric field: k * q / r^3 * r
        b field:



         */
    }





}
