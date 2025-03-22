import java.util.Scanner;

public class Dog extends Animal{

    private String breed;


    public Dog(String name, int age, String species, String color, String breed) {
        super(name, age, species, color);
        this.breed = breed;
    }

    public Dog() {

    }

    @Override
    public void makeSound () {
        System.out.println("Woof! Woof!");
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
