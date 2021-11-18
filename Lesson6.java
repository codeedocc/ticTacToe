/**
 * Java 1. Lesson 6
 * 
 * @author Ruslan Sharifullin
 * @version 18.11.2021
 */

class Lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200, -10,"Barsik");
        Dog dog = new Dog(500, 10, "Sharik");

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(500));
            System.out.println(animal.run(750));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
    }
}

class Cat extends Animal {
    Cat (int runLimit, int swimLimit, String name) {
        super (runLimit, swimLimit, name);
    }
}

class Dog extends Animal {
    Dog (int runLimit, int swimLimit, String name) {
        super (runLimit, swimLimit, name);
    }
}

interface IAnimal {
    String run(int space);
    String swim(int space);
}

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String name;

    Animal (int runLimit, int swimLimit, String name) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public String run(int space) {
        if (space > runLimit) {
            return name + " cant run " + space;
        } else {
            return name + " able to run " + space;
        }
    }

    @Override
    public String swim(int space) {
        if (space > swimLimit) {
            return name + " cant swim " + space;
        } else {
            return name + " able to swim " + space;
        }
    }

    @Override
    public String toString() {
        return name + " runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }
}