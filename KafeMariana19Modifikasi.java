import java.util.Scanner;
public class KafeMariana19Modifikasi {
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Tawar", "Gorengan"};
    static int [][] penjualan = new int[menu.length][7];
    static int[] totalMenu = new int[menu.length];
    public static void data() {
        Scanner scanner = new Scanner(System.in);
        int jumlahMenu = scanner.nextInt();
        menu = new String[jumlahMenu];
        totalMenu = new int[jumlahMenu];
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();
        penjualan = new int[jumlahMenu][jumlahHari];
        scanner.nextLine();
        System.out.println("\n=====Input Nama Menu=====");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i+1) + ": ");
            menu[i] = scanner.nextLine();
        }
        System.out.println("\n=====Input Data Harian=====");
        for (int i = 0; i < jumlahMenu; i++) {
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Masukkan penjualan " + menu[i] + " hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }
    public static void jumlahHarian(){
        int[] totalHarian = new int[penjualan[0].length];
        System.out.println("\n=== Total penjualan Harian===");
        for (int j = 0; j < penjualan[0].length; j++) {
            for (int i = 0; i < menu.length; i++) {
                totalHarian[j] += penjualan[i][j];
            }
            System.out.println("Total penjualan hari ke-" + (j + 1) + ": " + totalHarian[j]);
        }
    }
    public static void penjualan(){
        System.out.println("Total Penjualan Setiap Menu");
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < penjualan[0].length; j++) {
                totalMenu[i] += penjualan[i][j];
            }
            System.out.println("Total penjualan " + menu[i] + ": " + totalMenu[i]);
        }
    }
    public static void tertinggi(){
        int maxPenjualan = totalMenu[0], menuTertinggi = 0;
        for (int i = 1; i < menu.length; i++) {
            if (totalMenu[i] > maxPenjualan) {
                maxPenjualan = totalMenu[i];
                menuTertinggi = i;
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah " + menu[menuTertinggi] + 
                           " dengan total penjualan " + maxPenjualan);
    }
    public static void rata(){
        System.out.println("\n=====Rata-rata Penjualan Setiap Menu=====");
        for (int i = 0; i < menu.length; i++) {
            int rataRata = (int) totalMenu[i] / penjualan[i].length;
            System.out.println("Rata-rata Penjualan " + menu[i] + ": " + rataRata);
        }
    }
    public static void main(String[] args) {
        data();
        jumlahHarian();
        penjualan();
        tertinggi();
        rata();
    }
}
        