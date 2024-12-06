
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
    public static String[][] InitializeBoard(String [][] grid){
        
        
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print (grid[row][col] = "[" + " " + "]");
            }
            System.out.println();
        }

        return grid;
    }

    public static String[][] Game(String [][] grid, int row, int col, String player){
         for (int row1 = 0; row1 < grid.length; row1++) {
            for (int col1 = 0; col1 < grid[0].length; col1++) {
                if(col1==col && row1==row){
                    System.out.print (grid[row][col] = "[" + player+ "]");
                }else{
                    System.out.print (grid[row][col] = "[" + " " + "]");
                }
                
            }
            System.out.println();
        }
        
        return grid;

    }

}
