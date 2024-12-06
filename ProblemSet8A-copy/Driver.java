
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
        while(playing){
            if(round%2==1){
                System.out.println("Round " + round);
                player = "X";
                System.out.println(player+" , make your move (row, col): ");
                int row = input.nextInt();
                int col = input.nextInt();
                TicTacToe.Game(grid, row, col, player);
                round++;
                
                System.out.println(" ");
                System.out.println(" ");
            }else{
                System.out.println("Round " + round);
                player = "O";
                System.out.println(player+" , make your move (row, col): ");
                int row = input.nextInt();
                int col = input.nextInt();
                TicTacToe.Game(grid, row, col, player);
                round++;
                
                System.out.println(" ");
                System.out.println(" ");
            }
        }

    }
}
