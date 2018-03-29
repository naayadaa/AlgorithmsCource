package naayadaa.AlgorithmCourse.depthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnastasiiaDepenchuk on 15-Mar-18.
 */
public class Vertex {

    private String name;

    private boolean visited;

    private List<Vertex> neighbours;

    public Vertex(String name) {
        this.name = name;
        this.neighbours = new ArrayList<>();
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

    public void addNeigbour(Vertex vertex){
        this.neighbours.add(vertex);
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex> neighbours) {
        this.neighbours = neighbours;
    }
}
