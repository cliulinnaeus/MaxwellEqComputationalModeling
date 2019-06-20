package DataStructures;

import MathUtils.Vector;
import io.github.jdiemke.triangulation.DelaunayTriangulator;
import io.github.jdiemke.triangulation.NotEnoughPointsException;
import io.github.jdiemke.triangulation.Vector2D;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Vertex<V> {
    double x;
    double y;
    double z;
    V value;
    boolean visited = false;
    HashSet<Edge> neighborVertices;


    public Vertex(double x, double y, double z, V value) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.value = value;
        neighborVertices = new HashSet<>();
    }

    public Vertex(Vector vector, V value) {
        x = vector.x();
        y = vector.y();
        z = vector.z();
        this.value = value;
    }


    @Override
    public boolean equals(Object obj) {
        Vertex<V> vertex = (Vertex<V>) obj;

        return x == vertex.x && y == vertex.y && z == vertex.z;

    }

    @Override
    public int hashCode() {
        int xHashCode = Double.hashCode(x);
        int yHashCode = Double.hashCode(y);
        int zHashCode = Double.hashCode(z);
        return xHashCode * 256 * 256 + yHashCode * 256 + zHashCode;

    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;

    }
}
