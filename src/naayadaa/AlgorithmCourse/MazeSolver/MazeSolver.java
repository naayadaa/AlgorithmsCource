package naayadaa.AlgorithmCourse.MazeSolver;

/**
 * Created by AnastasiiaDepenchuk on 27-Mar-18.
 */
public class MazeSolver {

    private int[][] mazeMap;
    private boolean[][] visited;
    private int startPositionRow;
    private int startPositionCol;

    public MazeSolver(int[][] mazeMap, int startPositionRow, int startPositionCol) {
        this.mazeMap = mazeMap;
        this.visited = new boolean[mazeMap.length][mazeMap.length];
        this.startPositionRow = startPositionRow;
        this.startPositionCol = startPositionCol;
    }

    public void findWayOut(){

        try{

            dfs(startPositionRow, startPositionCol);

        }catch (RuntimeException e){
            System.out.println("Route found!");
        }

    }

    private void dfs(int rowIndex, int colIndex){
        System.out.println("Visiting (i,j): (" + rowIndex + "," + colIndex + ")");

        if(mazeMap[rowIndex][colIndex] == 3){
            throw new RuntimeException();
        }

        int endMap = mazeMap.length - 1;

        if (visited[rowIndex][colIndex]){
            return;
        }
        else if(rowIndex < 0 || rowIndex >= endMap){
            return;
        }
        else if(colIndex < 0 || colIndex >= endMap){
            return;
        }
        else if (mazeMap[rowIndex][colIndex] == 1){
            return;
        }
        else {
            visited[rowIndex][colIndex] = true;

            dfs(rowIndex+1, colIndex);
            dfs(rowIndex, colIndex+1);
            dfs(rowIndex-1, colIndex);
            dfs(rowIndex, colIndex-1);
        }
    }
}
