import java.util.ArrayList;
import java.util.List;

public class MazeSolverRecursivo implements MazeSolver {

    @Override
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
        if (grid == null || grid.length == 0) {
            return new ArrayList<>();
        }

        List<Cell> path = new ArrayList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        if (findPath(grid, start, end, path, visited)) {
            return path;
        }
        return null; // No se encontró camino
    }


private boolean findPath(boolean[][] grid, Cell current, Cell end, List<Cell> path, boolean[][] visited) {
    int row = current.row;
    int col = current.col;

    if (row >= grid.length || col >= grid[0].length || !grid[row][col]) {
        return false;
    }

    path.add(current);
    visited[row][col] = true;

    if (current.equals(end)) {
        return true;
    }

    if (findPath(grid, new Cell(row + 1, col), end, path)){
        path.add(start)
        return true;

    }
}
}