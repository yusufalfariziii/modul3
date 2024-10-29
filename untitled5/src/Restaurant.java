import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> menu = new ArrayList<>();
        List<Double> harga = new ArrayList<>();
        List<Double> pesanan = new ArrayList<>();

        menu.add("Nasi Goreng");
        harga.add(20000.0);
        menu.add("Mie Goreng");
        harga.add(18000.0);
        menu.add("Ayam Panggang");
        harga.add(25000.0);

        System.out.println("Selamat datang di restoran!");
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i) + " - " + harga.get(i));
        }

        while (true) {
            System.out.print("Pilih menu (1-3) atau 0 untuk selesai: ");
            int pilihan = scanner.nextInt();
            if (pilihan == 0) {
                break;
            }
            if (pilihan >= 1 && pilihan <= menu.size()) {
                pesanan.add(harga.get(pilihan - 1));
                System.out.println("Anda memesan: " + menu.get(pilihan - 1));
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        double total = 0.0;
        System.out.println("Rincian Pesanan:");
        for (double hargaPesanan : pesanan) {
            total += hargaPesanan;
        }
        System.out.printf("Total: %.2f%n", total);
        scanner.close();
    }
}
