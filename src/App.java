import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjerciciosPD();
        runLaberintoPD();
    }

    // private static void runEjerciciosPD() {
//        EjerciciosPD ejerciciosPD = new EjerciciosPD();
  //      System.out.println("Fibonacci Recursivo:");
    //    long start = System.nanoTime();                  
      //  int resultado = ejerciciosPD.getFibonacci(50);
        //long end = System.nanoTime();                       
        //long duration = end - start;
        //System.out.println("Resultado = " + resultado + " en tiempo = " + duration);
  //      System.out.println("Fibonacci Programación Caching:");
    //    start = System.nanoTime();
      //  resultado = ejerciciosPD.getFibonacciPD(50);
        //end   = System.nanoTime();
        //duration = end - start;
        //System.out.println("Resultado = " + resultado + " en tiempo = " + duration);
    //}

    // Clase maze con variable golbal predefinedMaze

    Maze maze = new Maze(predefinedMaze);
    System.out.println("Laberinto cargado");
    maze.print

    Cell start = new Cell(0, 0);
    Cell end = new Cell(3,3)

    List<MazeSolver> solvers = Arrays.asList(
        new MazeSolverRecursivo
        new MazeSoverRecursiveCompleto
        new MazeSolverBFS
        new MazeSolverDFS
    );

}

MazeSolver solver = solvers.get(3)
List<Cell> path;
path = solver.getPath(maze.getGrid(), start, end);
System.out.println(path);
    }
}
