/**
 * Java 1. Lesson 2
 * 
 * @author Ruslan
 * @version 14.11.2021
 */


class Lesson2 {
    //fields
    //methods
    public static void main(String[] args) {

        /**
         * ZADANIE1
         */

        int a = 5;
        int b = 10;
        boolean i = a + b >=10 && a + b <= 20;
        System.out.println(i);

        /**
         * ZADANIE3
         */

        int d = 15;
        boolean k = d < 0;
        System.out.println(k);
        ZADANIE2();
        ZADANIE4();
        }
    static void ZADANIE2() {
        int a = 5;
        System.out.println(a >= 0? "Positive" : "Negative");
    }
    static void ZADANIE4() {
        for (int i = 16; i <= 25 ; i += 3) {
            System.out.println(i);
        }
    }
}