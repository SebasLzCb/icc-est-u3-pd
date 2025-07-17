import java.util.Arrays;
import java.util.List;
import controllers.EjerciciosPD;
import controllers.MazeSolver;
import controllers.MazeSolverRecursivo;
import controllers.MazeSolverRecursivoCompleto;
import controllers.MazeSolverBFS;
import controllers.MazeSolverDFS;
import models.Cell;
import models.Maze;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---Programa En Funcionamiento---");
        System.out.println("Nombre: Sebastian Loza");
        //runEjercicosPD();
        runMaze();
    }

    private static void runMaze(){
        boolean[][] predefinedMaze = {
            {true,true,true,true},
            {false,true,true,true},
            {true,true,false,false},
            {true,true,true,true}
        };

        Maze maze = new Maze(predefinedMaze);
        System.out.println("Laberinto cargado");
        maze.printMaze();

        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);
        List<MazeSolver> solvers = Arrays.asList(
            new MazeSolverRecursivo(),
            new MazeSolverRecursivoCompleto(),
            new MazeSolverBFS(),
            new MazeSolverDFS()
            );
        String[] nombres = {
            "Recursivo",
            "Recursivo Completo",
            "BFS",
            "DFS"
        };

        for (int i = 0; i < solvers.size(); i++) {
            MazeSolver solver = solvers.get(i);
            String nombre = nombres[i];

            System.out.println("\nCamino con " + nombre + ":");
            List<Cell> path = solver.getPath(maze.getMatriz(), start, end);

            if (path.isEmpty()) {
                System.out.println("No se encontró camino.");
            } else {
                for (Cell cell : path) {
                    System.out.println(cell);
                }
            }
        }

    }

    //private static void runEjercicosPD(){
        //EjerciciosPD ePD = new EjerciciosPD();

//        System.out.println("Fibonacci recursivo");

  //      long start = System.nanoTime();
    //    System.out.println("Valor= 100");
      //  long resultado = ePD.getFibonaci(100);
        //long end = System.nanoTime();
        //long tiempo = end - start;

      //  System.out.println("Resultado: " + resultado + ", tiempo: " + tiempo);

       // System.out.println("Fibonacci recursivo con caching");

    //    start = System.nanoTime();
      //  System.out.println("Valor= 100");
      //  resultado = ePD.getFibonaciPD(100);
        //end = System.nanoTime();
        //tiempo = end - start;

      //  System.out.println("Resultado: " + resultado + ", tiempo: " + tiempo);
//-----------------------------------------------------------------------------
}
