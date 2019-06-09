package Simulator;

import MathUtils.Vector;
import MathUtils.VectorField;
import Physics.PointCharge;
import Solver.*;
import com.sun.javafx.scene.paint.GradientUtils;

public class StaticEFieldSimulator {

    private VectorField externalEField;
    private VectorField totalEField;
    private PointCharge[] charges;
    private double timeStep;
    private Solver solver;


    public StaticEFieldSimulator(VectorField e, PointCharge[] pc, Solver s, double dt) {
        externalEField = e;
        charges = pc;
        solver = s;
        timeStep = dt;
    }


    // use a charge distribution to find out static electric field


    public static void main(String[] args) {
        PointCharge[] pointCharges = new PointCharge[2];
        PointCharge pc1 = new PointCharge(1, 1,
                new Vector(0, 0, 0), new Vector(1, 1, 0));
        PointCharge pc2 = new PointCharge(-1, 1,
                new Vector(-10, 10, 0), new Vector(-1, -1, 0));
        pointCharges[0] = pc1;
        pointCharges[1] = pc2;

        EulerSolver solver = new EulerSolver(VectorField.ZERO_FIELD, VectorField.ZERO_FIELD, pointCharges, 0.01);

        for (int i = 0; i < 10000; i++) {

            System.out.println(pc1.velo.x() + " " + pc1.velo.y() + " " + pc1.velo.z());


            solver.stepForward();

        }
        System.out.println();
        System.out.println("Simulation completed");


    }

}
