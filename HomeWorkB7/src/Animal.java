import java.util.Scanner;

abstract class Animal {
    protected String name ;
    protected int age;
    protected String species;
    protected String color;

    public Animal(String name, int age, String species, String color) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }
    public Animal() {
    }

    public abstract void makeSound();

    public void inPutInFor () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter age: ");
        this.age = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter species: ");
        this.species = sc.nextLine();
        System.out.print("Enter color: ");
        this.color = sc.nextLine();
    }
    public void displayInfo() {
        System.out.println(" Name : " + name);
        System.out.println(" Age : " + age);
        System.out.println(" Species : " + species);
        System.out.println(" Color : " + color);
    }
}
