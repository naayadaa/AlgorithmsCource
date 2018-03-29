package naayadaa.AlgorithmCourse.topological;

import java.util.Stack;

/**
 * Created by AnastasiiaDepenchuk on 21-Mar-18.
 */
public class TopologicalOrdering {

    Stack<Vertex> stack;

    public TopologicalOrdering() {
        stack = new Stack<>();
    }

    public void dfs(Vertex vertex){

        vertex.setVisited(true);

        for(Vertex v : vertex.getNeighbours()){
            if(!v.isVisited()){
                dfs(v);
            }
        }

        stack.push(vertex);
    }

    public Stack<Vertex> getStack(){
        return this.stack;
    }
}
