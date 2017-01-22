

import java.util.Scanner;

// 1.5 points
public class ArrayTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("*** PART 1 ***");
        System.out.print("Enter n: ");
        int n = scan.nextInt();  //size of ragged array

        // create a 2D ragged array by calling the method create2DRaggedArray 
        // 0.1 point
        
        int[][] createdArray = Array.create2DRaggedArray(n);
          
        System.out.println("*** Ragged Array ***");
        //print the ra array by calling the method printArray 
        // 0.1 point
        for (int i = 0; i < createdArray.length; i++) {
            for (int j = 0; j < createdArray[i].length; j++) {
                System.out.print(" " + createdArray[i][j] + " ");
            }
           System.out.println(" "); 
        }
        //determine and print whether it is a square by using the method isSquare
        // 0.2 point
        Array.isSquare(createdArray);
        System.out.println("\n*** PART 2 ***");
        Square magicSquare;
        System.out.print("Enter square size: ");
        int size = scan.nextInt();  //size of next square

        //Expecting -1 at bottom of input file
        while (size != -1) {
            //create a new Square of the given size
            // 0.1 point
            Square mySquare = new Square(size);
            
            //call its read method to read the values of the square
            // 0.1 point
            mySquare.readSquare(scan);
            
            System.out.println("\n*** Square " + Square.getCount() + " ***");
            //print the square by calling the method printArray 
            // 0.1 point
            Array.printArray(mySquare.getSquare());
            //print the sums of its rows
            // 0.2 point
            for (int i = 0; i < mySquare.getSquare().length; i++) {
                System.out.println("Sum of row " + i +" : " + mySquare.sumRow(i));
            }
            
            //print the sums of its columns
            // 0.2 point
            for (int i = 0; i < mySquare.getSquare().length; i++) {
                System.out.println("Sum of column " + i +" : " + mySquare.sumCol(i));
            }
            //print the sum of the main diagonal
            // 0.1 point
            System.out.println("Sum of the main diagonal : " +mySquare.sumMainDiag());
            //print the sum of the other diagonal
            // 0.1 point
            System.out.println("Sum of the other diagonal : " + mySquare.sumOtherDiag()); 
            //determine and print whether it is a magic square
            // 0.2 point
            if (mySquare.magic()) 
                System.out.println("It's a magic square!");
            else
                System.out.println("It's not a magic square!");
            
            //get size of next square
            System.out.print("\nEnter square size: ");
            size = scan.nextInt();
        }
        System.out.println("\nGame over!");
    }
}
