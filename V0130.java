//NAMA : Vara dilla
// NIM : 13020210130

import java.util.Scanner;

public class V0130 {
    public static void main(String[] args) {
        final double Rp = 1;
        final int Dollar = 14.840;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah Dollar: ");
        double mil = scanner.nextDouble();

        double rp = Rp * Dollar;
        double dollar = Rp * Dollar;

        System.out.println(rp + " rp = " + dollar + " dollar.");
    }
}