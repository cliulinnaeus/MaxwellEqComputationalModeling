package DataStructures;

import MathUtils.Vector;

public class Edge {
    private Vertex v1;
    private Vertex v2;

    public Edge(Vertex v1, Vertex v2) {
        this.v1 = v1;
        this.v2 = v2;
    }



    @Override
    public boolean equals(Object obj) {
        Edge e = (Edge) obj;
        return e.v1().equals(v1) && e.v2().equals(v2);
    }

    @Override
    public int hashCode() {
        return v1.hashCode() + v2.hashCode();
    }

    @Override
    public String toString() {
        return "v1: " + v1.toString() + "; v2: " + v2.toString();
    }

    // getters:
    public Vertex v1() {
        return v1;
    }

    public Vertex v2() {
        return v2;
    }
}
