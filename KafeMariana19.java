import java.util.Scanner;

public class KafeMariana19 {
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Tawar", "Gorengan"};
    static int [][] penjualan = new int[menu.length][7];
    static int[] totalMenu = new int[menu.length];
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Data Penjualan Harian Kafe Mariana ===");
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Masukkan penjualan " + menu[i] + " hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }
    public static void jumlahHarian(){
        int[] totalHarian = new int[7];
        System.out.println("\n=== Data Hasil Penjualan Selama 7 Hari ===");
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < menu.length; i++) {
                totalHarian[j] += penjualan[i][j];
            }
            System.out.println("Total penjualan hari ke-" + (j + 1) + ": " + totalHarian[j]);
        }
    }
    public static void penjualan(){
        System.out.println("--------------------------------------------");
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < 7; j++) {
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
            int rataRata = (int) totalMenu[i] / 7;
            System.out.println("Rata-rata Penjualan " + menu[i] + ": " + rataRata);
        }
    }
        
    public static void main(String[] args) {
        menu();
        jumlahHarian();
        penjualan();
        tertinggi();
        rata();
    }
}
        