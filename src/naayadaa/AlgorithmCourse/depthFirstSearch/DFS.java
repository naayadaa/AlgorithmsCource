package naayadaa.AlgorithmCourse.depthFirstSearch;

import java.util.List;
import java.util.Stack;

/**
 * Created by AnastasiiaDepenchuk on 15-Mar-18.
 */
public class DFS {

    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList){

        for(Vertex v : vertexList){
            if( !v.isVisited()){
                v.setVisited(true);
                dfsWithRecursion(v);
            }
        }
    }

    // at the operating system level stack is used to run recursion
    private void dfsWithRecursion(Vertex rootVertex) {

        System.out.print(rootVertex.getName() + " ");
        for(Vertex v : rootVertex.getNeighbours()){
            if(!v.isVisited()){
                v.setVisited(true);
               dfsWithRecursion(v);
            }
        }
    }


    private void dfsWithStack(Vertex rootVertex) {

        this.stack.add(rootVertex);
        rootVertex.setVisited(true);

        while ( !stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.print(" " + actualVertex.getName());

            for(Vertex v : actualVertex.getNeighbours()){
                if(!v.isVisited()) {
                    v.setVisited(true);
                    stack.push(v);
                }
            }

        }
    }
}
