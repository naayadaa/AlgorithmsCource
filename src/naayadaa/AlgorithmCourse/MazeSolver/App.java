package naayadaa.AlgorithmCourse.MazeSolver;

/**
 * Created by AnastasiiaDepenchuk on 27-Mar-18.
 */
public class App {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader("files/map.txt", 7, 7);
        fileReader.parseFile();

        MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(), fileReader.getStartPositionRow(), fileReader.getStartPositionCol());
        mazeSolver.findWayOut();
    }
}
