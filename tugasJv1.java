// SOAL: BUATLAH PROGRAM UNTUK MENDETEKSI BILANGAN GANJIL ATAU GENAP

package tugasPercabangan;
import java.util.Scanner;


public class tugasJv1 {
    public static void main(String[] args) {
     Scanner ganjilGenap = new Scanner(System.in);

        System.out.println("masukan angka: ");
        int angka = ganjilGenap.nextInt();

        if ( angka % 2 == 0){
            System.out.println( angka + " YAITU GENAP ");
        }

        else{
            System.out.println( angka + " YAITU GANJIL ");
        }


        ganjilGenap.close();

        // CONTOH OUTPUT: 33 YAITU GANJIL

    }
}
