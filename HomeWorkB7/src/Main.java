import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước vườn thú: ");
        int size = scanner.nextInt();
        Zoo zoo = new Zoo(size);

        while(true) {
            System.out.println("1. Thêm chó");
            System.out.println("2. Thêm mèo");
            System.out.println("3. Thêm chim");
            System.out.println("4. Hiển thị thông tin tất cả động vật");
            System.out.println("5. Phát âm thanh của tất cả động vật");
            System.out.println("6. Cho chim bay");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");

            int choice = new Scanner(System.in).nextInt();

            switch (choice){
                case 1 :
                    Dog dog = new Dog();
                    dog.inPutInFor();
                    zoo.addAnimal(dog);
                    break;

                case 2 :
                    Cat cat = new Cat();
                    cat.inPutInFor();
                    zoo.addAnimal(cat);
                    break;

                case 3 :
                    Bird bird = new Bird();
                    bird.inPutInFor();
                    zoo.addAnimal(bird);
                    break;

                case 4:
                    zoo.displayAllInfor();
                    break;
                case 5:
                    zoo.makeALlSound();
                    break;
                case 6:
                    zoo.makeBirdsFly();
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}

