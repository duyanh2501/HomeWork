import java.util.Scanner;

public class Cat extends Animal{

    private String breed;

    public Cat(String name, int age, String species, String color, String breed) {
        super(name, age, species, color);
        this.breed = breed;
    }

    public Cat(){

    }

    @Override
    public void makeSound () {
        System.out.println("Meow! Meow!.");
    }

    @Override
    public void inPutInFor() {
        super.inPutInFor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breed : " );
        this.breed = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }

}
