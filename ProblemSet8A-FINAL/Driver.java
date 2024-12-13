
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
                player = "X";
            }else{
                player = "O";
            }
            System.out.println("Round " + round);

            TicTacToe.CreateBoard(grid);

            System.out.println(player+", make your move (row, col): ");

            String coordinate = input.nextLine();
            while(!(TicTacToe.checkValidForm(coordinate))){
                System.out.println("Invalid form. Please try again: ");
                coordinate = input.nextLine();
            }

            int row= TicTacToe.findRow(coordinate);
            int col = TicTacToe.findCol(coordinate);

            while(!(TicTacToe.checkValidNum(grid, coordinate, row,  col))){
                System.out.println("Invalid num. Please try again: ");
                coordinate = input.nextLine();
                while(!(TicTacToe.checkValidForm(coordinate))){
                    System.out.println("Invalid form. Please try again: ");
                    coordinate = input.nextLine();
                }
                row= TicTacToe.findRow(coordinate);
                col = TicTacToe.findCol(coordinate);
            }

            TicTacToe.Game(grid, row, col, player);
            if(TicTacToe.checkRow(grid, player)==true || TicTacToe.checkCol(grid, player)==true || TicTacToe.checkDiag(grid, player)==true){
                TicTacToe.CreateBoard(grid);
                System.out.println(player+" won! Play again? Enter Y/N: ");
                playing = false;
                String response = input.nextLine();
                if(TicTacToe.playAgain(response)==true){
                    TicTacToe.InitializeBoard(grid);
                    playing = true;
                    round = 0;
                }
            }
            
            if(TicTacToe.checkFull(grid)){
                System.out.println("Draw! Play again? Enter Y/N: ");
                String response = input.nextLine();
                if(TicTacToe.playAgain(response)==true){
                    TicTacToe.InitializeBoard(grid);
                    playing = true;
                    round = 0;
                }
            }
            round++;
            System.out.println(" ");
            System.out.println(" ");

        }

    }
}
