package naayadaa.AlgorithmCourse.dijkstraAlgorithm;

/**
 * Created by AnastasiiaDepenchuk on 28-Mar-18.
 */
public class App {

    public static void main(String[] args) {

        Vertex vertex0 = new Vertex("A");
        Vertex vertex1 = new Vertex("B");
        Vertex vertex2 = new Vertex("C");

        vertex0.addAdjacency(new Edge(vertex0, vertex1, 1));
        vertex0.addAdjacency(new Edge(vertex0, vertex2, 3));
        vertex1.addAdjacency(new Edge(vertex1, vertex2, 1));

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        dijkstraAlgorithm.computePath(vertex0);

        System.out.println(dijkstraAlgorithm.getShortestPeth(vertex2));

    }
}
