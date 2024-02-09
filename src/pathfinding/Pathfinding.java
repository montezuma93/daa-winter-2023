package pathfinding;

import java.util.LinkedList;
import java.util.Queue;

public class Pathfinding {

    void existsAPath(int[][] grid, Point start, Point end){
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];
        Queue<Point> queue = new LinkedList<>();
        queue.offer(start);
        visited[start.x][start.y] = true;

                            // oben,    unten, links, rechts
        int[][] directions = {{-1, 0}, {1, 0}, {0,-1}, {0,1}};

        while(!queue.isEmpty()) {
            Point current = queue.poll();
            int row = current.x;
            int col = current.y;
            if(current.x == end.x && current.y == end.y) {
                System.out.println("Pfad gefunden");
                return;
            }
            for(int[] direction: directions){
                int newRow = row + direction[0];
                int newCol = col + direction[1];
                // Ist die Zelle noch im Board und nicht blockiert UND noch nicht bereits angeschaut
                if(newRow >=0 && newCol >=0 && newRow <rows && newCol < cols && grid[newRow][newCol] != -1
                && visited[newRow][newCol] != true ) {
                    System.out.print("Now look at row");
                    System.out.print(newRow);
                    System.out.print("Now look at col");
                    System.out.print(newCol);
                    System.out.println(" ");
                    queue.offer(new Point(newRow, newCol));
                    visited[newRow][newCol] = true;
                }
            }
        }
    }
}
