package Solver;

import MathUtils.VectorField;
import Physics.BField;
import Physics.EField;
import Physics.PointCharge;

public interface Solver {
    // write into a text file
    void stepForward(VectorField eField, VectorField bField, PointCharge[] charges, double timeStep);


}
