
/**
 * AP Computer Science
 * Nina Lohser
 * December 6th, 2024
 * Problem Set 8A
 */

import java.util.Scanner;

public class Driver{
    public static void main(String[] args){
        Scanner input = new Scanner ( System.in );

        String[][] grid = new String[3][3];
        

        String player = "X";
        
        boolean playing = true;

        int round = 1;
        TicTacToe.InitializeBoard(grid);
        while(playing){
            if(round%2==1){
                System.out.println("Round " + round);
                
                TicTacToe.CreateBoard(grid);
                
                player = "X";
                System.out.println(player+" , make your move (row, col): ");
                
                String coordinate = input.nextLine();
                int row = TicTacToe.findRow(coordinate);
                int col = TicTacToe.findCol(coordinate);
                
                TicTacToe.Game(grid, row, col, player);
                
                if(TicTacToe.checkRow(grid, player)==true){
                    System.out.println(player+" won! Play again?");
                    playing = false;
                }
                if(TicTacToe.checkCol(grid, player)==true){
                    System.out.println(player+" won! Play again?");
                    playing = false;
                }
                
                round++;
                
                System.out.println(" ");
                System.out.println(" ");
            }else{
                System.out.println("Round " + round);
                
                TicTacToe.CreateBoard(grid);
                
                player = "O";
                System.out.println(player+" , make your move (row, col): ");
                
                String coordinate = input.nextLine();
                int row = TicTacToe.findRow(coordinate);
                int col = TicTacToe.findCol(coordinate);
                
                TicTacToe.Game(grid, row, col, player);
                
                if(TicTacToe.checkRow(grid, player)==true){
                    System.out.println(player+" won! Play again?");
                    playing = false;
                }
                if(TicTacToe.checkCol(grid, player)==true){
                    System.out.println(player+" won! Play again?");
                    playing = false;
                }
                
                round++;
                
                System.out.println(" ");
                System.out.println(" ");
            }
        }

    }
}
