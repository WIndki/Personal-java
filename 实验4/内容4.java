package 实验4;

public class 内容4 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        simulatior sim = new simulatior();
        for (Animal animal : animals) {
            sim.showAnimalName(animal);
            sim.playSound(animal);
        }

    }
}

abstract class Animal {
    public abstract void cry();
    public abstract String getAnimalName();
}

class Dog extends Animal {
    public void cry() {
        System.out.println("汪汪汪");
    }
    public String getAnimalName() {
        return "狗";
    }
}

class Cat extends Animal {
    public void cry() {
        System.out.println("喵喵喵");
    }
    public String getAnimalName() {
        return "猫";
    }
}

class simulatior {
    public void playSound(Animal animal) {
        animal.cry();
    }
    public void showAnimalName(Animal animal) {
        System.out.print(animal.getAnimalName());
    }
}
