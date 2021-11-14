/**
 * Java 1. Lesson 3
 * 
 * @author Ruslan Sharifullin
 * @version 14.11.2021
 */
import java.util.Arrays;
import java.util.Random;

class Lesson3 {
    //fields
    //methods
    public static void main(String[] args) {

        //ZADANIE1
        int[] arrOne = ZADANIE1();
        System.out.println(Arrays.toString(arrOne));

        //ZADANIE2
        int[] arrTwo = ZADANIE2();
        System.out.println(Arrays.toString(arrTwo));

        //ZADANIE3
        int[] arrThree = ZADANIE3();
        System.out.println(Arrays.toString(arrThree));

        //ZADANIE4
        int[][] matrix = ZADANIE4();
        System.out.println(matrix[1][0]);
        
        //ZADANIE5
        int[] arrFive = ZADANIE5(2, 7);
        System.out.println(Arrays.toString(arrFive));

    }  
    static int[] ZADANIE1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    } 
    static int[] ZADANIE2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
    static int[] ZADANIE3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }
    static int[][] ZADANIE4() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
    static int[] ZADANIE5(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}
