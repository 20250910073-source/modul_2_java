/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod_2a;

/**
 *
 * @author AbitCom.Store
 */
import java.util.Scanner;
public class post_test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nim, nama, prodi, fakultas, universitas;

        System.out.println("=== INPUT IDENTITAS MAHASISWA ===");

        System.out.print("Masukkan NIM       : ");
        nim = input.nextLine();

        System.out.print("Masukkan Nama      : ");
        nama = input.nextLine();

        System.out.print("Masukkan Prodi     : ");
        prodi = input.nextLine();

        System.out.print("Masukkan Fakultas  : ");
        fakultas = input.nextLine();

        System.out.print("Masukkan Universitas : ");
        universitas = input.nextLine();

        System.out.println();
        System.out.println("=== DATA IDENTITAS MAHASISWA ===");

        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Prodi      : " + prodi);
        System.out.println("Fakultas   : " + fakultas);
        System.out.println("Universitas: " + universitas);

        input.close();
    }
}
