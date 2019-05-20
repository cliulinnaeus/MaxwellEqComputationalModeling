package MathUtils;

public class Vector {

    protected double x;
    protected double y;
    protected double z;

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Vector negate() {
        return new Vector(-x, -y, -z);
    }

    double length() {
        return Math.sqrt(dot(this));
    }

    Vector add(Vector v) {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }

    Vector sub(Vector v) {
        return add(v.negate());
    }

    double dot(Vector v) {
        return x * v.x + y * v.y + z * v.z;
    }

    Vector cross(Vector v) {
        double resultX = y * v.z - z * v.y;
        double resultY = z * v.x - x * v.z;
        double resultZ = x * v.y - y * v.x;
        return new Vector(resultX, resultY, resultZ);
    }

    boolean isOrthogonalTo(Vector v) {
        return dot(v) == 0;
    }


}
