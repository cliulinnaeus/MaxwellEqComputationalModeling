package DataStructures;

import java.util.*;

public class MyGraph<V> implements Graph<V>{

    /**
     *
     * array of edges
     * array of nodes
     * disjoint set
     *
     *
     *
     *
     */
    private HashSet<Vertex> vertices;
    private HashSet<Edge> edges;
    private int numOfVertices;
    private int numOfEdges;

    public MyGraph() {
        numOfVertices = 0;
        numOfEdges = 0;
        vertices = new HashSet<>();
        edges = new HashSet<>();
    }


    @Override
    public HashSet<Vertex<V>> neighbors(Vertex vertex) {
        if (!containsVertex(vertex)) {
            System.out.println("doesn't contain vertex");
            return null;
        }


        return vertex.neighborVertices;
    }

    @Override
    public boolean areNeighbors(Vertex<V> v1, Vertex<V> v2) {
        if (!containsVertex(v1) || !containsVertex(v2)) {
            return false;
        }

        return v1.neighborVertices.contains(v2);
    }


    public void connect(Vertex v1, Vertex v2) {
        if (!containsVertex(v1) || ! containsVertex(v2)) {
            System.out.println("v1 or v2 is not in the graph");
            return;
        }

        if (v1.equals(v2)) {
            System.out.println("v1 equals v2");
            return;
        }

        Edge edge = new Edge(v1, v2);
        if (!edges.contains(edge)) {
            edges.add(edge);
            v1.neighborVertices.add(v2);
            v2.neighborVertices.add(v1);
            numOfEdges += 1;
        }
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
        numOfVertices += 1;
    }

    public boolean containsVertex(Vertex v) {
        return vertices.contains(v);
    }

    public int numOfVertices() {
        return numOfVertices;
    }

    public int numOfEdges() {
        return numOfEdges;
    }

    public List<Vertex<V>> listOfVertices() {
        List<Vertex<V>> lst = new ArrayList<>();
        for (Vertex<V> v : vertices) {
            lst.add(v);
        }
        return lst;
    }

    public List<Edge> listOfEdges() {
        List<Edge> lst = new ArrayList<>();
        for (Edge e : edges) {
            lst.add(e);
        }
        return lst;
    }
}
