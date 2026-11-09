package praktikorkom;
import java.util.Scanner;
public class kalkulatoraritmatika{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, pilihan, hasil;
        double hasilBagi;

        System.out.println("===== KALKULATOR ARITMATIKA =====");
        System.out.print("Masukkan bilangan pertama : ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua   : ");
        bil2 = input.nextInt();
      

       
           do {
            System.out.println("bilangan 1 = "+bil1+" bilangan 2 = "+bil2);
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulus");
            System.out.println("6. keluar");
            System.out.println("7. ganti angka");
            System.out.print("pilihan");
            pilihan = input.nextInt();
            if(pilihan == 1){
                hasil = bil1 + bil2;
                System.out.println("Hasil: " + hasil);
                
            }
            else if(pilihan == 2){
                hasil = bil1 - bil2;
                System.out.println("Hasil: " + hasil);
                
            }
            else if(pilihan == 3){
                hasil = bil1 * bil2;
                System.out.println("Hasil: " + hasil);
                
             }
            else if(pilihan == 4){
                if (bil2 != 0) {
                    hasilBagi = (double) bil1 / bil2;
                    System.out.println("Hasil: " + hasilBagi);
                } else {
                    System.out.println("pembagian tidak boleh dengan nol!");
                }
               
            }
            else if(pilihan == 5){
                if (bil2 != 0) {
                    hasil = bil1 % bil2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Modulus tidak boleh dengan nol!");
                }
               
            }
           else if(pilihan == 6){
            break;
           }
            else if(pilihan == 7){
             System.out.print("Masukkan bilangan pertama : ");
            bil1 = input.nextInt();
            System.out.print("Masukkan bilangan kedua   : ");
            bil2 = input.nextInt();
           }
            else{
                  System.out.println("Pilihan tidak valid!");
            }
        }while(true);
        input.close();
    }
}
