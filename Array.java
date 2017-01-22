// 1.5 points
public class Array {

    /*--------------------------------------------------------------------------
    return the following 2D ragged array created based on the given n value:
    n    n-1  n-2 ... 4 3 2 1
    n-1  n-2  n-3 ... 3 2 1
    ...
    3    2    1
    2    1
    1
    If n is 4, the array would be as follows:
    4 3 2 1
    3 2 1
    2 1
    1
    --------------------------------------------------------------------------*/
    // 0.5 point
   
    public static int[][] create2DRaggedArray(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < n; j++) {
                    array[j][i]=n;
            }
            n--; 
        }
          return array;           
    }

    //-------------------------------------------------------------
    //return true if the array is a square (the size of each row 
    //is equal to the row size of the array), false otherwise
    //-------------------------------------------------------------
    // 0.5 point
    public static boolean isSquare(int[][] array) {
        int sizeOfCol = array.length;
        for (int i = 0; i < sizeOfCol; i++) {
              if (sizeOfCol == array[i].length) {
                  return true;
                }
        }
        return false;
    }

    //---------------------------------------------------
    //print the contents of the array, neatly formatted
    //---------------------------------------------------
    // 0.5 point
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }  
    }

}
