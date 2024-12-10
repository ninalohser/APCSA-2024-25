
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
    public static String[][] InitializeBoard(String [][] grid){ //sets all values to " "
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = "[ ]";
            }
        }

        return grid;
    }

    public static String[][] CreateBoard(String [][] grid){ // prints grid
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print (grid[row][col]);
            }
            System.out.println();
        }

        return grid;
    }

    public static int findRow(String coordinate){ // prints grid
        String Row1 = coordinate.substring(0, 1);
        int row = Integer.parseInt(Row1);

        return row;
    }

    public static int findCol(String coordinate){ // prints grid
        String Col1 = coordinate.substring(2);
        int col = Integer.parseInt(Col1);

        return col;
    }

    public static void Game(String [][] grid, int row, int col, String player){ // adds X or O to board
        grid[row][col] = "[" + player+ "]";
    }

    public static boolean checkRow (String[][] grid, String player){
        for(int r = 0; r<3; r++){
            if( grid[r][0].equals("["+ player +"]") &&  grid[r][1].equals("["+ player +"]") &&  grid[r][2].equals("["+ player +"]")){
                return true;
            }
        }
        return false;
    }

    public static boolean checkCol (String[][] grid, String player){
        for(int c = 0; c<3; c++){
            if( grid[0][c].equals("["+ player +"]") &&  grid[1][c].equals("["+ player +"]") &&  grid[2][c].equals("["+ player +"]")){
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiag (String[][] grid, String player){
        if( grid[0][0].equals("["+ player +"]") &&  grid[1][1].equals("["+ player +"]") &&  grid[2][2].equals("["+ player +"]")){
            return true;
        }
        if(grid[0][2].equals("["+ player +"]") &&  grid[1][1].equals("["+ player +"]") &&  grid[2][0].equals("["+ player +"]")){
            return true;
        }
        return false;
    }
    
    public static boolean playAgain (String response){
        if(response.equals("Y")){
            return true;
        }
        return false;
        
    }
    
     public static boolean checkValid(String coordinate, int row, int col){
        boolean answer = false;
        if(row>=0 && row<=2 && col>=0 && col<=2){
            answer = true;
        }else{
            return false;
        }
        if(coordinate.length()==3 && coordinate.substring(1,2)==","){
            answer = true;
        }else{
            return false;
        }

        return answer;
    }
}
