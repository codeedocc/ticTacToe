class HelloWorld {
    // fields
    // mehtods
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        printThreeWords();
        checkSumSign();
        compareNumbers();
        printColor();
    }
    static void printThreeWords() {
        System.out.println("orange, banana, apple");
    }
    static void checkSumSign() {
        int a = 5, b = 10;
        if (a+b>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void compareNumbers() {
        int a = 10, b = 20;
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
    static void printColor() {
        int value = 101;
        if (value<=0) {
            System.out.println("Красный");
        } if (value>1 && value<100) {
            System.out.println("Жёлтый");
        } if (value>100) {
            System.out.println("Зеленый");
        }
    }
}