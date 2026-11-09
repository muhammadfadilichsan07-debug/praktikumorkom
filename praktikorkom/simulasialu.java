package praktikorkom;

import java.util.Scanner;

public class simulasialu {
   public static String keBiner8Bit(int angka) {
        String biner = Integer.toBinaryString(angka & 0xFF);
        return String.format("%8s", biner).replace(' ', '0');
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, pilihan, hasil;

        System.out.println("===== SIMULASI ALU Sederhana (8-Bit) =====");
        System.out.print("Masukkan bilangan pertama : ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        bil2 = input.nextInt();

        do {
            System.out.println("\n------------------------------------------");
            System.out.println("bilangan 1 " + bil1 + " (" + keBiner8Bit(bil1) + ")");
            System.out.println("bilangan 2 = " + bil2 + " (" + keBiner8Bit(bil2) + ")");
            System.out.println("Pilih Operasi ALU:");
            System.out.println("1. ADD (Penjumlahan)");
            System.out.println("2. SUB (Pengurangan)");
            System.out.println("3. AND");
            System.out.println("4. OR");
            System.out.println("5. XOR");
            System.out.println("6. keluar");
            System.out.println("7. ganti angka");
            System.out.print("pilihan: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                hasil = bil1 + bil2;
                System.out.println("Hasil Desimal: " + hasil + " | Biner: " + keBiner8Bit(hasil));
            }
            else if (pilihan == 2) {
                hasil = bil1 - bil2;
                System.out.println("Hasil Desimal: " + hasil + " | Biner: " + keBiner8Bit(hasil));
            }
            else if (pilihan == 3) {
                hasil = bil1 & bil2;
                System.out.println("Hasil Desimal: " + hasil + " | Biner: " + keBiner8Bit(hasil));
            }
            else if (pilihan == 4) {
                hasil = bil1 | bil2;
                System.out.println("Hasil Desimal: " + hasil + " | Biner: " + keBiner8Bit(hasil));
            }
            else if (pilihan == 5) {
                hasil = bil1 ^ bil2;
                System.out.println("Hasil Desimal: " + hasil + " | Biner: " + keBiner8Bit(hasil));
            }
            else if (pilihan == 6) {
                System.out.println("Keluar dari simulasi ALU.");
                break;
            }
            else if (pilihan == 7) {
                System.out.print("Masukkan bilangan pertama  : ");
                bil1 = input.nextInt();
                System.out.print("Masukkan bilangan kedua    : ");
                bil2 = input.nextInt();
            }
            else {
                System.out.println("Pilihan tidak valid!");
            }
        } while (true);
        input.close();
    }
}