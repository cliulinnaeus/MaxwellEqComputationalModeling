package MathUtils;

public class Vector {

    protected double x;
    protected double y;
    protected double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector negate() {
        return new Vector(-x, -y, -z);
    }

    public Vector normalize() {
        double length = length();
        return scalarMul(1 / length);
    }


    public double length() {
        return Math.sqrt(dot(this));
    }

    public Vector add(Vector v) {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }

    public Vector scalarMul(double c) {
        return new Vector(x * c, y * c, z * c);
    }

    public Vector sub(Vector v) {
        return add(v.negate());
    }

    public double dot(Vector v) {
        return x * v.x + y * v.y + z * v.z;
    }

    public Vector cross(Vector v) {
        double resultX = y * v.z - z * v.y;
        double resultY = z * v.x - x * v.z;
        double resultZ = x * v.y - y * v.x;
        return new Vector(resultX, resultY, resultZ);
    }

    public boolean isOrthogonalTo(Vector v) {
        return dot(v) == 0;
    }

    public double x() {return x;}
    public double y() {return y;}
    public double z() {return z;}


    @Override
    public boolean equals(Object v) {
        Vector vector = (Vector) v;
        return x == vector.x && y == vector.y && z == vector.z;
    }


}
