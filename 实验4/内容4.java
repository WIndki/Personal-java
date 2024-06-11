package 实验4;

public class 内容4 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[0].setName("Dog");
        animals[1].setName("Cat");
        simulatior sim = new simulatior();
        for (Animal animal : animals) {
            sim.showAnimalName(animal);
            sim.playSound(animal);
        }

    }
}

abstract class Animal {
    protected String name;
    public abstract void cry();
    public void setName(String name) {
        this.name = name;
    }
    public abstract String getAnimalName();
}

class Dog extends Animal {
    
    public void cry() {
        System.out.println("Wang,Wang…");
    }
    public String getAnimalName() {
        return name;
    }
}

class Cat extends Animal {
    public void cry() {
        System.out.println("Miao,Miao…");
    }
    public String getAnimalName() {
        return name;
    }
}

class simulatior {
    public void playSound(Animal animal) {
        animal.cry();
    }
    public void showAnimalName(Animal animal) {
        System.out.print(animal.getAnimalName()+":");
    }
}
