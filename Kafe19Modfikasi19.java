import java.util.Scanner;
public class Kafe19Modfikasi19 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHarga = 0;
        Menu ("Andi", true);
        System.out.print("Masukkan kode prmo (jika ada): ");
        String kodePromo = sc.nextLine();
        System.out.print("Banyak item yang ingin Anda pesan: ");
        int jumlahPesanan = sc.nextInt();
        for (int i = 1; i<= jumlahPesanan; i++) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            totalHarga += hitungTotalHarga19(pilihanMenu, banyakItem);
        }
        totalHarga = hitungDiskon(totalHarga, kodePromo);
        System.out.println("Total harga pesanan Anda: Rp" + totalHarga);
    }
    public static int hitungTotalHarga19(int pilihanMenu, int banyakItem) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }
    public static int hitungDiskon(int totalHarga, String kodePromo) {
        if (kodePromo.equals("DISKON50")) {
            System.out.println("\nAnda mendapatkan diskon 50%");
            totalHarga *= 0.5; 
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%");
            totalHarga *= 0.7;  
        } else {
            System.out.println("Kode promo tidak valid.");
        }
        return totalHarga;
    }
}