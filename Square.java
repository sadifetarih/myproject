
// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a column, either diagonal, and whether it is magic.
//          
// ****************************************************************
import java.util.Scanner;

// 2 points
public class Square {

    private int[][] square;
    private static int count;

    //----------------------------------------------------
    //create new square of given size and update the count 
    //----------------------------------------------------
    // 0.2 point
    public Square(int size) {
        square = new int[size][size];
        count++;
    }

    //--------------------------------------
    //return the address of square
    //--------------------------------------
    // 0.1 point
    public int[][] getSquare() {
        return square;
    }

    //--------------------------------------
    //return the count
    //--------------------------------------
    // 0.1 point
    public static int getCount() {
        return count;
    }

    //-----------------------------------------------
    //return the sum of the values in the given row
    //-----------------------------------------------
    // 0.2 point
    public int sumRow(int row) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[row][i];
        }
        return sum;
    }

    //-------------------------------------------------
    //return the sum of the values in the given column
    //-------------------------------------------------
    // 0.2 point
    public int sumCol(int col) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][col];
        }
        return sum;

    }

    //---------------------------------------------------
    //return the sum of the values in the main diagonal
    //---------------------------------------------------
    // 0.2 point
    public int sumMainDiag() {
        int diagonal = 0;
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {
                if (i == j) {
                    diagonal += square[i][j];
                }
            }
        }
        return diagonal;
    }

    //---------------------------------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //---------------------------------------------------------------
    // 0.2 point
    public int sumOtherDiag() {
        int sum = 0;
        for (int row = 0; row < square.length; ++row) {
            sum += square[row][square[row].length - row - 1];
        }
        return sum;
    }

    //-------------------------------------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //-------------------------------------------------------------------
    // 0.5 point
    public boolean magic() {
        int sumRow = 0;
        for (int i = 0; i < square.length; i++) {
            if (i == 0) {
                sumRow = sumRow(i);
            }
            if (sumRow != sumRow(i)) {
                return false;
            }

        }
        return true;
        //for (int i = 0; i < square[0].length; i++) {
        //    sumCol(i);
        //}
    }

    //----------------------------------------------------
    //read info into the square from the standard input.
    //----------------------------------------------------
    // 0.3 point
    public void readSquare(Scanner scan) {
        System.out.println("Enter " + square.length * square.length + " values: ");
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                square[i][j] = scan.nextInt();
            }
        }
    }
}
