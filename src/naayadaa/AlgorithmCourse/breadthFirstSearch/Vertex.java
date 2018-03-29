package naayadaa.AlgorithmCourse.breadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnastasiiaDepenchuk on 15-Nov-17.
 */
public class Vertex {
    private int data;

    private boolean visited;

    private List<Vertex> neighbours = new ArrayList<>();

    public Vertex(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
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

    public void addNighbour(Vertex vertex){
        neighbours.add(vertex);
    }

    @Override
    public String toString() {
        return " " + this.data;
    }
}
