import java.util.*;

public class Maze {
    public static void main(String[] args){
        // System.out.println(count(3, 3));
        // path("", 3, 3);
        // System.out.println(pathRet("", 3, 3));
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };
        // pathRestriction("", board, 0, 0);
        // allPaths("", board, 0, 0);

        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);

    }

    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p + 'V', r - 1, c);
        }

        if(c > 1){
            path(p + 'H', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
           list.addAll(pathRet(p + 'D', r - 1, c - 1));
        }
        if(r > 1){
           list.addAll(pathRet(p + 'V', r - 1, c));
        }
        if(c > 1){
          list.addAll(pathRet(p + 'H', r, c - 1));
        }

        return list;
    }

    static void pathRestriction(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        if(r < maze.length - 1){
            
            pathRestriction(p + 'D', maze, r + 1, c);
        }

        if(c < maze[0].length - 1){
            
            pathRestriction(p + 'R', maze, r, c + 1);
        }
    }

    static void allPaths(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r > 0){
            
            allPaths(p + 'U', maze, r - 1, c);
        }

        if(c > 0){
            
            allPaths(p + 'L', maze, r, c - 1);
        }

        if(r < maze.length - 1){
            
            allPaths(p + 'D', maze, r + 1, c);
        }

        if(c < maze[0].length - 1){
            
            allPaths(p + 'R', maze, r, c + 1);
        }

        maze[r][c] = true; //****** for backtraking ******
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r > 0){
            
            allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }

        if(c > 0){
            
            allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        if(r < maze.length - 1){
            
            allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }

        if(c < maze[0].length - 1){
            
            allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        maze[r][c] = true; //****** for backtraking ******
        path[r][c] = 0;
    }
}
