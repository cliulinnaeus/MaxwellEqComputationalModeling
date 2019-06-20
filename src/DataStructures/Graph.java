package DataStructures;

import java.util.HashSet;
import java.util.List;

public interface Graph<V> {

    HashSet<Vertex<V>> neighbors(Vertex<V> vertex);
    boolean areNeighbors (Vertex<V> v1, Vertex<V> v2);



}
