import java.util.Scanner;

public class Bird extends Animal{

    private String wingSpan;


    public Bird(String name, int age, String species, String color, String wingSpan) {
        super(name, age, species, color);
        this.wingSpan = wingSpan;
    }

    public Bird(){}

    @Override
    public void makeSound(){
        System.out.println("Tweet! Tweet!");
    }

    @Override
    public void inPutInFor(){
        super.inPutInFor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wing span :");
        this.wingSpan = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wing Span " + wingSpan);
    }

    public void fly (){
        System.out.println(name + " is flying with a wingspan of " + wingSpan + " meters!");
    }
}
