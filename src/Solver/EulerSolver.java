package Solver;

import MathUtils.Vector;
import MathUtils.VectorField;
import Physics.PointCharge;
import javafx.scene.effect.Light;

public class EulerSolver implements Solver {
    private VectorField externalEField;
    private VectorField externalBField;
    private PointCharge[] charges;
    private double timeStep;
    private VectorField totalEField = VectorField.ZERO_FIELD;
    private VectorField totalBField = VectorField.ZERO_FIELD;

    public EulerSolver(VectorField eField, VectorField bField, PointCharge[] charges, double timeStep) {
        externalEField = eField;
        externalBField = bField;
        this.charges = charges;
        this.timeStep = timeStep;

        // Construct totalEField and totalBField.
        for (PointCharge c : charges) {
            totalEField = totalEField.add(c.eField);
            totalBField = totalBField.add(c.bField);
        }
        totalEField = totalEField.add(externalEField);
        totalBField = totalBField.add(externalBField);
    }

    // may not need it??
    private void updateFields() {
        totalEField = VectorField.ZERO_FIELD;
        totalBField = VectorField.ZERO_FIELD;


    }


    @Override
    public void stepForward() {

        for (PointCharge pc : charges) {
            // find total force:
            Vector totalForce = getNetLorentzForce(pc);

            Vector accel = totalForce.scalarMul(1 / pc.mass);
            Vector velo = accel.scalarMul(timeStep).add(pc.velo);
            Vector pos = velo.scalarMul(timeStep).add(pc.pos);
            pc.velo = velo;
            pc.pos = pos;
        }
    }

    private Vector getNetLorentzForce(PointCharge pc) {

        // find total force:
        Vector eFieldVector = totalEField.sub(pc.eField).vectorAt(pc.pos);
        //Vector bFieldVector = totalBField.sub(pc.bField).vectorAt(pc.pos);
        Vector bFieldVector = new Vector(0, 0, 0);
        // f = q(E + v X B)
        Vector eForce = eFieldVector.scalarMul(pc.q);
        Vector bForce = pc.velo.cross(bFieldVector).scalarMul(pc.q);
        Vector totForce = eForce.add(bForce);

        return totForce;

    }

}
