/*
Imagine we have an image. We'll represent this image as a simple 2D array where every pixel is a 1 or a 0. The image you get is known to have a single rectangle of 0s on a background of 1s.

Write a function that takes in the image and returns one of the following representations of the rectangle of 0's: top-left coordinate and bottom-right coordinate OR top-left coordinate, width, and height.

image1 = [
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 0, 0, 0, 1],
  [1, 1, 1, 0, 0, 0, 1],
  [1, 1, 1, 1, 1, 1, 1],
]

Sample output variations (only one is necessary):

findRectangle(image1) =>
  row: 2, column: 3, width: 3, height: 2
  2,3 3,5 -- row,column of the top-left and bottom-right corners

Other test cases:

image2 = [
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 0],
]

findRectangle(image2) =>
  row: 4, column: 6, width: 1, height: 1
  4,6 4,6

image3 = [
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 0, 0],
  [1, 1, 1, 1, 1, 0, 0],
]

findRectangle(image3) =>
  row: 3, column: 5, width: 2, height: 2
  3,5 4,6

image4 = [
  [0, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
]

findRectangle(image4) =>
  row: 0, column: 0, width: 1, height: 1
  0,0 0,0

image5 = [
  [0],
]

findRectangle(image5) =>
  row: 0, column: 0, width: 1, height: 1
  0,0 0,0

n: number of rows in the input image
m: number of columns in the input image

*/
import java.io.*;
import java.util.*;

class Mode2 {
    public static void main(String[] argv) {


        int[][] image2 = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0}
        };

        int[][] image3 = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 0, 0}
        };

        int[][] image4 = {
                {0, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };

        int[][] image5 = {
                {0}
        };
        int[][] image1 = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };

        int[][] image = image2;

        int[][] result = findRectangle(image2);
        System.out.println("Result : "+ Arrays.toString(result[0])+ Arrays.toString(result[1]));
        System.out.println("Hello, world!");
        System.out.println("This is a fully functioning Java environment.");
    }


    static public int[][] findRectangle(int[][] image){

        int[] topLeft = new int[2];
        boolean topLeftFound = false;
        int[] bottonRight = new int[2];
        boolean bottonRightFound = false;
        int bottonZeroCount  = 0;
        int bottomRow =0;

        int bottonFirstZeroindex =0;
        for(int row =0 ; row< image.length; row++ ){
            int[] column = image[row];
            if(!topLeftFound){
                for(int index=0; index< column.length; index++){
                    if(column[index] == 0){
                        topLeft = new int[] {row, index};
                        topLeftFound =true;
                        break;
                    }
                }

            }else{
                for(int index=0; index< column.length; index++){
                    if(column[index] == 0  && bottonFirstZeroindex ==0){
                        bottomRow = row;
                        bottonFirstZeroindex = index;
                    }else if(column[index] == 0 ){
                        bottonZeroCount = bottonZeroCount +1;
                    }
                }
            }
        }
        bottonRight = new int[] {bottomRow, bottonFirstZeroindex+bottonZeroCount};
        System.out.println("top left" + Arrays.toString(topLeft) + "bottom Right" + Arrays.toString(bottonRight));
        int[][] result = {topLeft, bottonRight};
        return result;
    }
}

