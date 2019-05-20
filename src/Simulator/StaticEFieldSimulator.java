package Simulator;

import MathUtils.VectorField;
import Physics.BField;
import Physics.EField;
import Physics.PointCharge;
import Solver.Solver;
import javafx.scene.effect.Effect;

public class StaticEFieldSimulator {

    private EField eField;
    private PointCharge[] charges;
    private double timeStep;
    private Solver solver;


    public StaticEFieldSimulator(EField e, PointCharge[] pc, Solver s, double dt) {
        eField = e;
        charges = pc;
        solver = s;
        timeStep = dt;
    }


    public void simulate(int rounds) {
        for (int i = 0; i < rounds; i++) {
            // should not mutate charges
            solver.stepForward(eField, BField.ZERO_FIELD, charges, timeStep);
        }

        System.out.println("Computation completed.");
    }

    // use a charge distribution to find out static electric field


    /*
    Takes in an electric field and a bunch of free charges
    compute the motion of the charges



     */
    public static void main(String[] args) {




    }

}
