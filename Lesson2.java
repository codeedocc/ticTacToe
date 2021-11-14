/**
 * Java 1. Lesson 2
 * 
 * @author Ruslan Sharifullin
 * @version 14.11.2021
 */

class Lesson2 {
    //fields
    //methods
    public static void main(String[] args) {
        
        //ZADANIE1
        System.out.println(ZADANIE1(10, -1));
        System.out.println(ZADANIE1(15, 10));
        System.out.println(ZADANIE1(10, 5));

        //ZADANIE2
        ZADANIE2(1);
        ZADANIE2(-1);
        ZADANIE2(0);
        
        //ZADANIE3
        System.out.println(ZADANIE3(1));
        System.out.println(ZADANIE3(-1));
        System.out.println(ZADANIE3(0));
        
        //ZADANIE4
        ZADANIE4("HOMEWORK", 7);
    
    }
    static boolean ZADANIE1(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    static void ZADANIE2(int a) {
        System.out.println(a >= 0? "Yes" : "No");
    }
    static boolean ZADANIE3(int a) {
        return a < 0;
    }
    static void ZADANIE4(String a, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(a);
        }
    }
}