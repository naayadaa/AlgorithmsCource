package naayadaa.AlgorithmCourse.cycleDetectionDfs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnastasiiaDepenchuk on 15-Mar-18.
 */
public class Vertex {

    private String name;

    private boolean visited;

    private boolean beingVisited;

    private List<Vertex> adjacencies;

    public Vertex(String name) {
        this.name = name;
        this.adjacencies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addAdjacency(Vertex vertex){
        this.adjacencies.add(vertex);
    }

    public List<Vertex> getAdjacencies() {
        return adjacencies;
    }

    public void setAdjacencies(List<Vertex> adjacencies) {
        this.adjacencies = adjacencies;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }
}
