/**
 * Java 1. Lesson 7
 * 
 * @author Ruslan Sharifullin
 * @version 20.11.2021
 */


class Lesson7 {
    public static void main(String[] args) {
        Kotik[] kotiki = {
            new Kotik("Alex", 30), new Kotik("Vusya", 40), new Kotik("Shanya", 30)
        };

        Plate plate = new Plate(100,30);
        System.out.println(plate);

        for (Kotik kotik : kotiki) {
            kotik.eat(plate);
            System.out.println(kotik);
        }

        System.out.println(plate);
        plate.add(100);
        System.out.println(plate);

        for (Kotik kotik : kotiki) {
            kotik.setFullness(false);
            kotik.eat(plate);
            System.out.println(kotik);
        }
        System.out.println(plate);
    }
}

class Kotik {
    private String name;
    private int appetite;
    private boolean fullness;

    Kotik (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "Kotik " + name + ", appetite=" + appetite + ", fullness=" + fullness;
    }
}

class Plate {
    private int volume;
    private int food;

    Plate (int volume, int food) {
        this.volume = volume;
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
