package pathfinding;

import dynamicarray.DynamicArray;

public class Main {

        public static void main(String[] args) {
                int[][] grid = new int[3][3];
                grid[0][1] = -1;
                Pathfinding pathfinder = new Pathfinding();
                pathfinder.existsAPath(grid, new Point(0,0), new Point(0,2));
        }
}
