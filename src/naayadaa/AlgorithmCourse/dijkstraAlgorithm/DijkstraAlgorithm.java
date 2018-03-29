package naayadaa.AlgorithmCourse.dijkstraAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by AnastasiiaDepenchuk on 28-Mar-18.
 */
public class DijkstraAlgorithm {

    public void computePath(Vertex start){

        start.setDistance(0);

        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(start);

        while (!priorityQueue.isEmpty()){

            Vertex actual = priorityQueue.poll();

            for (Edge edge : actual.getAdjacencies()){

                Vertex v = edge.getTargetVertex();
                double newDistance = actual.getDistance() + edge.getWeight();

                if(newDistance < v.getDistance()) {
                    priorityQueue.remove(v);
                    v.setDistance(newDistance);
                    v.setPredecessor(actual);
                    priorityQueue.add(v);
                }
            }
        }
    }

    public List<Vertex> getShortestPeth(Vertex targetVertex){

        List<Vertex> shortestPath = new ArrayList<>();

        for(Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()){
            shortestPath.add(vertex);
        }

        Collections.reverse(shortestPath);

        return shortestPath;
    }
}
