package naayadaa.AlgorithmCourse.dijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnastasiiaDepenchuk on 28-Mar-18.
 */
public class Vertex implements Comparable<Vertex>{

    private String name;
    private List<Edge> adjacencies;
    private boolean visited;
    private Vertex predecessor;
    private double distance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.adjacencies = new ArrayList<>();
    }

    @Override
    public int compareTo(Vertex v) {
        return Double.compare(this.distance, v.getDistance());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacencies() {
        return adjacencies;
    }

    public void setAdjacencies(List<Edge> adjacencies) {
        this.adjacencies = adjacencies;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void addAdjacency(Edge edge){
        this.adjacencies.add(edge);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
