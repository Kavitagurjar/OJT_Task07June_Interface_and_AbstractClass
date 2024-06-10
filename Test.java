abstract class Animal {
    Animal() { // constructor
        System.out.println("All animals ....!");
    }
    public abstract void run();
}

class Horse extends Animal {
    public void run() {
        System.out.println("Horse is running");
    }

    public void sound() {
        System.out.println("Horse is neighing");
    }
}

class Lion extends Animal {
    public void run() {
        System.out.println("Lion is running");
    }

    public void sound() {
        System.out.println("Lion is roaring");
    }
}

class Test {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Lion lion = new Lion();
        horse.run();
        horse.sound();
        lion.run();
        lion.sound();
    }
}
