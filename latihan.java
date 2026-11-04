
package mod_2a;

import java.util.Scanner;

/**
 *
 * @author AbitCom.Store
 */
public class latihan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mp, uts, uas, na;

        System.out.println("=== PROGRAM NILAI AKHIR ===");

        System.out.print("Masukkan Nilai MP  : ");
        mp = input.nextDouble();

        System.out.print("Masukkan Nilai UTS : ");
        uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS : ");
        uas = input.nextDouble();

        // Menghitung nilai akhir
        na = (6 * mp + 2 * uts + 2 * uas) / 10;

        System.out.println();
        System.out.println("=== HASIL NILAI AKHIR ===");

        System.out.println("Nilai MP    : " + mp);
        System.out.println("Nilai UTS   : " + uts);
        System.out.println("Nilai UAS   : " + uas);
        System.out.println("Nilai Akhir : " + na);

        input.close();
    }
}
