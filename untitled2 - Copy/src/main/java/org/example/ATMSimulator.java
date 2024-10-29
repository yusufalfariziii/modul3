import java.util.Scanner;

/**
 * Kelas ini merepresentasikan simulator ATM.
 * Menyediakan fungsi untuk setoran, penarikan, dan cek saldo.
 *
 * @author Nama Anda
 * @version 1.0
 */
public class ATMSimulator {
    private double saldo;
    private String pin;

    /**
     * Konstruktor yang menginisialisasi saldo awal.
     */
    public ATMSimulator() {
        this.saldo = 0.0; // Saldo awal
    }

    /**
     * Memverifikasi PIN yang diberikan dengan PIN yang disimpan.
     *
     * @param pin PIN yang akan diverifikasi.
     * @return true jika PIN valid, false jika tidak.
     */
    boolean verifikasiPin(String pin) {
        return this.pin.equals(pin); // Verifikasi PIN
    }

    /**
     * Melakukan setoran tunai ke dalam saldo.
     *
     * @param jumlah Jumlah uang yang akan disetor.
     */
    public void setoran(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor tunai berhasil: " + jumlah);
        } else {
            System.out.println("Jumlah yang tidak valid atau coba lagi.");
        }
    }

    /**
     * Melakukan penarikan tunai dari saldo.
     *
     * @param jumlah Jumlah uang yang akan ditarik.
     */
    public void penarikan(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil: " + jumlah);
        } else if (jumlah > saldo) {
            System.out.println("Error: Saldo anda tidak cukup untuk penarikan.");
        } else {
            System.out.println("Jumlah penarikan tidak valid atau coba lagi.");
        }
    }

    /**
     * Menampilkan saldo saat ini.
     */
    public void cekSaldo() {
        System.out.println("Saldo Anda saat ini: " + saldo);
    }

    /**
     * Metode utama yang menjalankan simulator ATM.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        ATMSimulator atm = new ATMSimulator();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.print("Sugeng rawuh ing ATM");
            System.out.println("\n--- Menu ATM ---");
            System.out.println("1. Nyetor tunai");
            System.out.println("2. Penarikan tunai");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Keluar");
            System.out.print("Monggo milih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Pinten seng ajeng disetor: ");
                    double jumlahSetoran = scanner.nextDouble();
                    atm.setoran(jumlahSetoran);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah penarikan: ");
                    double jumlahPenarikan = scanner.nextDouble();
                    atm.penarikan(jumlahPenarikan);
                    break;
                case 3:
                    atm.cekSaldo();
                    break;
                case 4:
                    System.out.println("Matur sembah nuwun MONGGO PINARAK MALEH.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
