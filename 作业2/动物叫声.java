package 作业2;
import java.util.Scanner;
public class 动物叫声 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int type = sc.nextInt();
            String name = sc.next();
            Animal animal = null;
            if(type == 1){
                animal = new Dog();
            }else if(type == 0){
                animal = new Cat();
            }
            animal.setName(name);
            simulatior sim = new simulatior();
            sim.showAnimalName(animal);
            sim.playSound(animal);
        }
        sc.close();

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
        System.out.println("Wang,Wang...");
    }
    public String getAnimalName() {
        return name;
    }
}

class Cat extends Animal {
    public void cry() {
        System.out.println("Miao,Miao...");
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
