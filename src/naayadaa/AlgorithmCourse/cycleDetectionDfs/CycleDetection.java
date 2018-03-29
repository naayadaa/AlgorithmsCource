package naayadaa.AlgorithmCourse.cycleDetectionDfs;

import java.util.List;

/**
 * Created by AnastasiiaDepenchuk on 27-Mar-18.
 */
public class CycleDetection {

    public void detectCycle(List<Vertex> vertexList){
        for (Vertex v : vertexList){
            if(!v.isVisited()){
                cycleDetectionDfs(v);
            }
        }
    }

    private void cycleDetectionDfs(Vertex root){

        System.out.println("Vertex " + root.getName());
        root.setBeingVisited(true);

        for(Vertex v : root.getAdjacencies()){

            System.out.println("Visiting the neighbours of vertex " + root.getName());

            if (v.isBeingVisited()){
                System.out.println("There is a backward edge: there is a cycle!");
                return;
                //throw new RuntimeException("Cycle detected");
            }
            if (!v.isVisited()){
                System.out.println("Visiting vertex " + root.getName() + " recursively");
                v.setVisited(true);
                cycleDetectionDfs(v);
            }
        }

        System.out.println("Set vertex " + root.getName() + " setBeingVisited(false) and setVisited(true)");
        root.setVisited(true);
        root.setBeingVisited(false);

    }
}
