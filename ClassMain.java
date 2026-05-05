import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi objek (Contoh menggunakan Toshiba)
        Laptop toshibaPortege = new Toshiba();
        LaptopUser budi = new LaptopUser(toshibaPortege);
        
        Scanner input = new Scanner(System.in);
        String action;
        boolean loop = true;

        System.out.println("=== APLIKASI KONTROL LAPTOP ===");
        
        while (loop) {
            System.out.println("\n[ON] Nyalakan | [OFF] Matikan | [UP] Vol Up | [DOWN] Vol Down | [EXIT] Keluar");
            System.out.print("Pilih aksi: ");
            action = input.nextLine().toUpperCase();

            switch (action) {
                case "ON":
                    budi.turnOnLaptop();
                    break;
                case "OFF":
                    budi.turnOffLaptop();
                    break;
                case "UP":
                    budi.makeLaptopLouder();
                    break;
                case "DOWN":
                    budi.makeLaptopSilent();
                    break;
                case "EXIT":
                    loop = false;
                    break;
                default:
                    System.out.println("Input salah!");
            }
        }
        System.out.println("Program selesai.");
    }
}