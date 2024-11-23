import java.util.Scanner;
public class Kubus19 {
    
    static int hitungVolume (int s) {
        int Volume=s*s*s;
        return Volume;
    }
    static int hitungLP (int s) {
        int LP = 6*s*s;
        return LP;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s,Volume,LP;
        System.out.print("Masukkan sisi: ");
        s=input.nextInt();

        Volume=hitungVolume(s);
        System.out.println("Volume Kubus Adalah: "+Volume);
        LP=hitungLP(s);
        System.out.println("Luas Permukaan Kubus adalah: "+LP);
    }
}
    
