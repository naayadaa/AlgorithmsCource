package naayadaa.AlgorithmCourse.topological;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnastasiiaDepenchuk on 21-Mar-18.
 */
public class Vertex {

    private String data;
    private boolean visited;
    private boolean beingVisited;
    private List<Vertex> neighbours;

    public Vertex(String data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex){
        this.neighbours.add(vertex);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex> neighbours) {
        this.neighbours = neighbours;
    }

    @Override
    public String toString() {
        return data;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }
}
