package fan;

import java.util.Scanner;

public class FanApp {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        Dynamo dynamo = new Dynamo("Tembaga", 50);
        DeskFan myFan = new DeskFan("Miyako", 30, dynamo, true);

        int choice;

        do {
            System.out.println("1. Lihat informasi & Spesifikasi Kipas");
            System.out.println("2. Nyalakan Kipas");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu 1-3: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myFan.displayFanCategory();
                    break;
                case 2:
                    System.out.println("Status: " + myFan.turnOnPower());
                    break;
                case 3:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, pilih 1-3");
            }
        } while (choice != 3);
    }
}
