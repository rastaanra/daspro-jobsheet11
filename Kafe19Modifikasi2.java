import java.util.Scanner;
public class Kafe19Modifikasi2 {
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
    public static void kodePromo (String kode){
        if (kode=="DISKON50") {
            System.out.println("Anda mendapatkan diskon 50%");
        } else if (kode=="DISKON30") {
            System.out.println("Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Maaf kode tidak valid");
        }
    }
    public static void main (String[] args) {
        Menu ("Andi", true);
        kodePromo("DISKON50");
    }
}