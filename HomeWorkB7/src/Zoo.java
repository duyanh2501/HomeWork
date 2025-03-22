public class Zoo {

    private Animal[] animals;
    int count = 0;

    public Zoo(int size ) {
        animals = new Animal[size];
    }

    public void addAnimal(Animal animal){
        if(count < animals.length){
            count ++;
            animals[count] = animal;
        }else {
            System.out.println("Vườn thú đã đầy, không thể thêm động vật mới!");
        }
    }

    public void makeALlSound(){
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }

    public void displayAllInfor(){
        for (int i = 0; i < count; i++) {
            animals[i].displayInfo();
            System.out.println("-----------------");

        }
    }

    public void makeBirdsFly() {
        for (int i = 0; i < count; i++) {
            if (animals[i] instanceof Bird) {
                ((Bird) animals[i]).fly();
            }
        }
    }
}
